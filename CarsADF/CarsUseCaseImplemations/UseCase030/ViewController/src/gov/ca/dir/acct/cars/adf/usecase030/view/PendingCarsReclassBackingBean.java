package gov.ca.dir.acct.cars.adf.usecase030.view;

import gov.ca.dir.acct.cars.adf.common.code.CarsUtils;
import gov.ca.dir.acct.cars.adf.common.code.DateUtils;
import gov.ca.dir.acct.cars.adf.usecase030.model.services.ReclassAMImpl;
import gov.ca.dir.acct.cars.adf.usecase030.model.view.CarsRequestViewImpl;
import gov.ca.dir.acct.cars.adf.usecase030.model.view.EventEventTypeViewImpl;
import gov.ca.dir.acct.cars.adf.usecase030.model.view.PendingReclassItemsViewRowImpl;

import gov.ca.dir.acct.cars.webservices.internal.data.CARS515EventDetails;

import gov.ca.dir.acct.cars.webservices.internal.data.CARSPacketDetails;
import gov.ca.dir.acct.cars.webservices.internal.proxy.CARSIntakeWebService;
import gov.ca.dir.acct.cars.webservices.internal.proxy.Execute_ptt;
import gov.ca.dir.acct.cars.webservices.internal.types.CARS515Event;

import gov.ca.dir.acct.cars.webservices.internal.types.CARSPacket;
import gov.ca.dir.acct.cars.webservices.internal.types.common.TEventType;

import java.io.FileOutputStream;
import java.io.OutputStream;

import java.math.BigInteger;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;

import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.util.JAXBSource;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import javax.xml.transform.Source;
import javax.xml.ws.BindingProvider;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;
import oracle.adf.share.logging.ADFLogger;
import oracle.adf.share.security.SecurityContext;
import oracle.adf.view.rich.component.rich.RichDialog;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.data.RichTable;

import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.output.RichActiveOutputText;
import oracle.adf.view.rich.component.rich.output.RichProgressIndicator;

import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.jbo.Key;

import oracle.jbo.Row;

import oracle.jbo.RowSetIterator;

import oracle.jbo.VariableValueManager;

import oracle.jbo.domain.Array;

import oracle.jbo.domain.DomainContext;

import org.apache.myfaces.trinidad.event.PollEvent;
import org.apache.myfaces.trinidad.model.RowKeySet;

public class PendingCarsReclassBackingBean {
    private static ADFLogger _logger = 
                    ADFLogger.createADFLogger(PendingCarsReclassBackingBean.class);

    private RichTable pendingReclassTable;
    private RichProgressIndicator reclassProgress;
    private RichDialog reclassEventsProgressDialog;
    private RichPanelGroupLayout reclassPopupDialogPgl;
    private RichActiveOutputText pendingReclassPopupInfoText;
    private RichPopup reclassPopup;

    public Array getListAsJboArray(List list) {  
     Array arr = null;  
     try {  
         arr = new Array(list);  
         HashMap context = new HashMap();  
         context.put(DomainContext.ELEMENT_SQL_NAME, "CHARTABLETYPE");  
         //CHARTABLETYPE is DB object
         //CREATE OR REPLACE TYPE  "CHARTABLETYPE"  as table of varchar2(4000);
         context.put(DomainContext.ELEMENT_TYPE, String.class);  
         arr.setContext(null, null, context);  
     } catch (Exception ex) {  
         ex.printStackTrace();  
     }  
     return arr;  
    }  
    //Code used for printing out xml file
    public void testXmlPayload(CARSPacket pkt){
        try{
            JAXBContext context =
            JAXBContext.newInstance(pkt.getClass(),pkt.getClass());
            
            Unmarshaller u = context.createUnmarshaller();
            Marshaller marshaller = context.createMarshaller();
            Source source = new JAXBSource(marshaller, pkt);
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
                               Boolean.TRUE);
            OutputStream os = new FileOutputStream("c:\\tempstorage\\marshalled.xml");
            marshaller.marshal(pkt, os);
            marshaller.marshal(pkt, System.out); 
        } catch (Exception e){
            _logger.info(e);
        }
    }
    
    private ReclassAMImpl getApplicationModule(){
        BindingContext bindingContext = BindingContext.getCurrent();
        
        // Name of application module in datacontrolBinding.cpx
        DCDataControl dc  = bindingContext.findDataControl("ReclassAMDataControl");
        return (ReclassAMImpl)dc.getDataProvider();
    }
    
    private String getUserName(){
        ADFContext adfCtx = ADFContext.getCurrent();  
             SecurityContext secCntx = adfCtx.getSecurityContext();  
             return secCntx.getUserPrincipal().getName();  
    }
    
    public XMLGregorianCalendar getXMLGregorianCalendarNow() 
                throws DatatypeConfigurationException
        {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
            XMLGregorianCalendar now = 
                datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
            return now;
        }
    
    public PendingCarsReclassBackingBean() {
    }

    public void setPendingReclassTable(RichTable pendingReclassTable) {
        this.pendingReclassTable = pendingReclassTable;
    }

    public RichTable getPendingReclassTable() {
        return pendingReclassTable;
    }
    
    public String reclassSelectedCarsEvents(){
        // TODO reclassEventsProgressDialog.
        reclassPopupDialogPgl.setVisible(false);
        pendingReclassPopupInfoText.setValue("Sending CARS Events");
        pendingReclassPopupInfoText.setVisible(true);
        AdfFacesContext.getCurrentInstance().addPartialTarget(reclassPopupDialogPgl);
        
        ArrayList<String> sentReclassInspectionNumbers = new ArrayList<String>();
        
        RowKeySet selectedReclass = getPendingReclassTable().getSelectedRowKeys();
        Iterator selectedReclassIter = selectedReclass.iterator();
        Key[] keys = new Key[selectedReclass.size()];
        int i = 0;
        while(selectedReclassIter.hasNext()){
            Key key = (Key)((List)selectedReclassIter.next()).get(0);
            keys[i] = key; 
            _logger.info("Event Id Key for Reclass : " + key.getKeyValues()[0].toString());
            i++;
        }
        selectedReclass.removeAll();
        //reclassIter.getViewObject().setQueryMode(QUERY_MODE_SCAN_VIEW_ROWS);
        DCBindingContainer bindings = 
            (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();

        DCIteratorBinding reclassIter = 
            bindings.findIteratorBinding("PendingReclassItemsView1Iterator");
        if(keys.length == 0){
            CarsUtils.showInfoDialog("No Rows have been selected");
            return "";
        }
        for(Key key : keys){
            RowSetIterator reclassRSIter = reclassIter.getRowSetIterator();
            Row row = reclassRSIter.getRow(key);
            
            PendingReclassItemsViewRowImpl reclassViewRowImpl = 
                (PendingReclassItemsViewRowImpl)row;
            String currentDocument = sendCarsEvents(reclassViewRowImpl);
            sentReclassInspectionNumbers.add(currentDocument);
            reclassViewRowImpl.setViewable(false);
        }
        
        CarsRequestViewImpl carsRequestView1 = 
            getApplicationModule().getCarsRequestView1();
        
        carsRequestView1.setCurrentDocument(getListAsJboArray(sentReclassInspectionNumbers));
        
        carsRequestView1.executeQuery();
        reclassIter.getViewObject().executeEmptyRowSet();
        reclassPopupDialogPgl.setVisible(true);
        pendingReclassPopupInfoText.setVisible(false);
        AdfFacesContext.getCurrentInstance().addPartialTarget(reclassPopupDialogPgl);
        AdfFacesContext.getCurrentInstance().addPartialTarget(pendingReclassTable);
        reclassPopup.show(new RichPopup.PopupHints());
        return "SentReclass";
    }
    
    public String sendCarsEvents(PendingReclassItemsViewRowImpl row){

        //Simple Date Format
        SimpleDateFormat sd = new SimpleDateFormat("MM-dd-yyyy");
        //Simple Date Format
        SimpleDateFormat sd2 = new SimpleDateFormat("MMddyyyy");
        //Simple Date Format
        SimpleDateFormat sd3 = new SimpleDateFormat("MM/dd/yyyy");
        
        //Get Current Date
        java.util.Date currentDate = new java.util.Date(System.currentTimeMillis());
        //Get reclass note date text
        String reclassNoteDateText = "Reclassified AR on " + 
                                     sd3.format(currentDate).toString() +
                                    " to a deferred account per SAM Section 8776 and 10610.";
        
        //CARS515EventBuilder
        CARS515EventDetails.CARS515EventBuilder cars515EventBuilder = 
            new CARS515EventDetails.CARS515EventBuilder();
        
        CARS515Event cars515event = 
            cars515EventBuilder
            .setCurrentDocument(row.getArRootDocument() + "-515-" + sd2.format(currentDate))
            .setArRootDocument(row.getArRootDocument())
            .setReferenceDocument(row.getArRootDocument())
            .setEventDate(DateUtils.getXMLGregorianCalendarNow())
            .setDataSourceCode(row.getDataSourceCode())
            .setProgramUnitCode(row.getProgramUnitCode())
            .setSubmitBy(getUserName())
            .setSubmitDate(DateUtils.getXMLGregorianCalendarNow())
            .setNote(reclassNoteDateText)
            .setAmount(row.getAcct1200000Amount().getBigDecimalValue())
            .setAccountingCodeAgencySourceCode(row.getAgencySourceCode())
            .setAccountingCodeRevenueCode(row.getRevenueSourceCode())
            .setAccountingCodeIndexCode(row.getIndexCode())
            .setParticipantParticipantRole("RES_PARTY")
            .setParticipantPartyNumber(BigInteger.valueOf(1))
            .setOrgOrganizationName(row.getOrganizationName())
            .setOrgDbaName(row.getDba())
            .setOrgLegalName(row.getLegalName())
            .setAddressStreetAddress(row.getStreetAddress())
            .setAddressCity(row.getCity())
            .setAddressState(row.getStateCode())
            .setAddressZipCode(row.getZipCode())
            .createCARS515Event();
        
        //CARSPacketBuilder
        CARSPacketDetails.CARSPacketBuilder carsPacketBuilder =
            new CARSPacketDetails.CARSPacketBuilder();

        CARSPacket carsPacket =
        carsPacketBuilder.setDataSourceCode(row.getDataSourceCode())
            .setEnvironment("DEV")
            .setPacketID(row.getArRootDocument() + "-515-" + sd2.format(currentDate))
            .setPacketPayload(cars515event)
            .setPacketPayloadInformation(TEventType.CARS_515_EVENT)
            .setPacketTarget("CARS")
            .setPacketTransport("WS")
            .setProgramUnitCode(row.getProgramUnitCode())
            .setSubmitBy(getUserName())
            .setSubmitDate(DateUtils.getXMLGregorianCalendarNow())
            .createCARSPacketDetails();
        
        _logger.info("Send carsPacket with \n setCARSPacketHeader: " +
            "\n     setDataSourceCode: " + carsPacket.getCARSPacketHeader().getDataSourceCode()+
            "\n     setEnvironment: " + carsPacket.getCARSPacketHeader().getEnvironment()+
            "\n     setPacketTarget: " + carsPacket.getCARSPacketHeader().getPacketTarget()+
            "\n     setPacketTransport: " + carsPacket.getCARSPacketHeader().getPacketTransport()+
            "\n     setPacketID: " + carsPacket.getCARSPacketHeader().getPacketID()+
            "\n     setProgramUnitCode: " + carsPacket.getCARSPacketHeader().getProgramUnitCode()+
            "\n     setSubmitBy: " + carsPacket.getCARSPacketHeader().getSubmitBy()+
            "\n     setSubmitDate: "+ carsPacket.getCARSPacketHeader().getSubmitDate().toString()
                     );
        
        try {
            _logger.info("Sending 515 Event to CARS");
            
            CARSIntakeWebService carsIntakeWebService = new CARSIntakeWebService();
            Execute_ptt execute_ptt = carsIntakeWebService.getExecute_pt();
            ((BindingProvider) execute_ptt).getRequestContext();
            CARSPacket pkt = carsPacket;
            
            execute_ptt.execute(pkt);
            //debug code for xml output
            //testXmlPayload(pkt);
            
            } catch (Exception e) {
                _logger.severe(e);
            } 
        
        return row.getArRootDocument() + "-515-" + sd2.format(currentDate);
    }

    public void reclassPollExpire(PollEvent pollEvent) {
        AdfFacesContext.getCurrentInstance().addPartialTarget(reclassEventsProgressDialog);
    }

    public void setReclassProgress(RichProgressIndicator reclassProgress) {
        this.reclassProgress = reclassProgress;
    }

    public RichProgressIndicator getReclassProgress() {
        return reclassProgress;
    }

    public void setReclassEventsProgressDialog(RichDialog reclassEventsProgressDialog) {
        this.reclassEventsProgressDialog = reclassEventsProgressDialog;
    }

    public RichDialog getReclassEventsProgressDialog() {
        return reclassEventsProgressDialog;
    }

    public void setReclassPopupDialogPgl(RichPanelGroupLayout reclassPopupDialogPgl) {
        this.reclassPopupDialogPgl = reclassPopupDialogPgl;
    }

    public RichPanelGroupLayout getReclassPopupDialogPgl() {
        return reclassPopupDialogPgl;
    }

    public void setPendingReclassPopupInfoText(RichActiveOutputText pendingReclassPopupInfoText) {
        this.pendingReclassPopupInfoText = pendingReclassPopupInfoText;
    }

    public RichActiveOutputText getPendingReclassPopupInfoText() {
        return pendingReclassPopupInfoText;
    }

    public void setReclassPopup(RichPopup reclassPopup) {
        this.reclassPopup = reclassPopup;
    }

    public RichPopup getReclassPopup() {
        return reclassPopup;
    }
}
