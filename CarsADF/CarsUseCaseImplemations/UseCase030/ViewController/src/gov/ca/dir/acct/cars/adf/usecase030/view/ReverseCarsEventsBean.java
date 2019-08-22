package gov.ca.dir.acct.cars.adf.usecase030.view;

import gov.ca.dir.acct.cars.adf.usecase030.model.services.ReverseAMImpl;
import gov.ca.dir.acct.cars.adf.usecase030.model.view.EventViewRowImpl;

import gov.ca.dir.acct.cars.webservices.internal.proxy.CARSIntakeWebService;
import gov.ca.dir.acct.cars.webservices.internal.proxy.Execute_ptt;

import gov.ca.dir.acct.cars.webservices.internal.types.common.TEventType;

import gov.ca.dir.acct.cars.webservices.internal.types.CARS900Event;
import gov.ca.dir.acct.cars.webservices.internal.types.CARSPacket;

import gov.ca.dir.acct.cars.webservices.internal.data.CARS900EventDetails;
import gov.ca.dir.acct.cars.webservices.internal.data.CARSPacketDetails;

import gov.ca.dir.acct.cars.adf.common.code.CarsUtils;

import java.io.FileOutputStream;
import java.io.OutputStream;

import java.sql.CallableStatement;
import java.sql.SQLException;

import java.sql.Types;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import java.util.Iterator;
import java.util.List;

import javax.faces.event.ActionEvent;

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
import oracle.adf.view.rich.component.rich.data.RichTable;

import oracle.adf.view.rich.component.rich.input.RichInputText;

import oracle.adf.view.rich.component.rich.input.RichSelectBooleanCheckbox;
import oracle.adf.view.rich.component.rich.output.RichActiveOutputText;
import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.DialogEvent.Outcome;

import oracle.binding.OperationBinding;

import oracle.jbo.JboException;
import oracle.jbo.Key;

import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;

import org.apache.myfaces.trinidad.model.RowKeySet;

public class ReverseCarsEventsBean {
    
    private static ADFLogger _logger = 
                    ADFLogger.createADFLogger(ReverseCarsEventsBean.class);
    private final String SQL_CHECK_IS_CHILD_EXIST = "FUNC_CHECK_CHILD_EXIST_UI(?)";
    private final String SQL_CHECK_IS_REVERSED = "FUNC_IS_REVERSED(?)";
    private final String SQL_CHECK_IS_XMIT_FISCAL = "FUNC_IS_XMIT_TO_FISCAL(?)";
    private final String SQL_PURGE_EVENT = "PROC_TRUNC_EVENT(?)";
    
    private RichTable reverseCarsEventsTable;
    private RichInputText reversalNote;

    private boolean isAlreadyReversed;
    private boolean isChildExist;
    private boolean isXmitFiscal;
    private boolean isSelectedItem;
    private boolean isValidEventToBeReversed;
    private boolean isXmitCalstars;
    private RichActiveOutputText reversalMessage;
    private RichActiveOutputText reverseEventMessage;
    private RichSelectBooleanCheckbox appendPostfixCheckbox;

    public ReverseCarsEventsBean() {
    }
    
    public void setReversalNote(RichInputText reversalNote) {
        this.reversalNote = reversalNote;
    }

    public RichInputText getReversalNote() {
        return reversalNote;
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
    
    private void callOperationBinding(String operationBindingName){
        OperationBinding operationBinding =
            CarsUtils.getBindings().getOperationBinding(operationBindingName);
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            _logger.severe(operationBinding.getErrors().toString());
        }
    }
    
    //Get logged in user name
    private String getUserName() {
        ADFContext adfCtx = ADFContext.getCurrent();
        SecurityContext secCntx = adfCtx.getSecurityContext();
        return secCntx.getUserPrincipal().getName();
    }
    
    //Get XMLGregorianCalendar for the time right now
    public XMLGregorianCalendar getXMLGregorianCalendarNow() {
        try{
            XMLGregorianCalendar now;
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
            now = 
                datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
            return now;
            }
        catch(DatatypeConfigurationException e){
            _logger.info(e);
            }
        return null;
        }
    
    protected ReverseAMImpl getReverseAmImpl(){
        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc = bindingContext.findDataControl("ReverseAMDataControl");
        
        return (ReverseAMImpl)dc.getDataProvider();
    }
    
    /**Method to call Database function
     * @param sqlReturnType (Return type of Function)
     * @param stmt (Function Name with Parameters)
     * @param bindVars (Parameter's Value)
     * @return
     */
    protected Object callStoredFunction(int sqlReturnType, String stmt,
                                        Object[] bindVars) {
        CallableStatement cst = null;
        try {
            //Creating sql statement
            cst =
                getReverseAmImpl().getDBTransaction().createCallableStatement("begin ? := " + stmt + ";end;",
                                                0);
            //Register dataType for return value
            cst.registerOutParameter(1, sqlReturnType);
            //Pass input parameters value
            if (bindVars != null) {
                for (int z = 0; z < bindVars.length; z++) {
                    cst.setObject(z + 2, bindVars[z]);
                }
            }
            cst.executeUpdate();
            //Finally get returned value
            return cst.getObject(1);
        } catch (SQLException e) {
            throw new JboException(e.getMessage());
        } finally {
            if (cst != null) {
                try {
                    cst.close();
                } catch (SQLException e) {
                    _logger.info(e);
                }
            }
        }
    }
    
    public void setReverseCarsEventsTable(RichTable reverseCarsEventsTable) {
        this.reverseCarsEventsTable = reverseCarsEventsTable;
    }

    public RichTable getReverseCarsEventsTable() {
        return reverseCarsEventsTable;
    }
    
    //Check if event is valid to be reversed
    public boolean isValidEventToBeReversed(String eventTypeCode){
        if(eventTypeCode.charAt(0) == '3'
            || eventTypeCode.equals("900")
            || eventTypeCode.equals("165")){
            return false;
        }
        return true;
    }
    //Send Reversals
    public void reverseEvents() {
        RowKeySet selectedReverse = getReverseCarsEventsTable().getSelectedRowKeys();
        Iterator selectedReverseIter = selectedReverse.iterator();
        //initialize key array for reversal
        Key[] keys = new Key[selectedReverse.size()];
        int i = 0;
        //Iterate over selected reversal rows
        while(selectedReverseIter.hasNext()){
            Key key = (Key)((List)selectedReverseIter.next()).get(0);
            keys[i] = key; 
            _logger.info("Event Id Key for Reversal : " + key.getKeyValues()[0].toString());
            i++;
        }
        //get DCBindingContainer
        DCBindingContainer bindings = 
            (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        //Get dc iterator binding for event
        DCIteratorBinding reverseIter = 
            bindings.findIteratorBinding("EventView1Iterator");
        //Initialize List to store unsuccessful reversals
        List<String> unsuccessfulReversals = new ArrayList<String>();
        //Iterate over reversal event keys
        for(Key key : keys){
            
            RowSetIterator reverseRSIter = reverseIter.getRowSetIterator();
            Row row = reverseRSIter.getRow(key);
            
            //Get EventViewRowImpl
            EventViewRowImpl reverseViewRowImpl = (EventViewRowImpl)row;
            
            String currentDocument = reverseViewRowImpl.getCurrentDocument();
            
            //Check if event reversal is valid
            if (!isChildExist(currentDocument) 
                && !isAlreadyReversed(currentDocument)){
                sendCarsReverseEvent(reverseViewRowImpl);
            } else {
                unsuccessfulReversals.add(currentDocument);
            }
        }
        
        if(!unsuccessfulReversals.isEmpty()){
            StringBuilder unsuccessfulErrorMsgBuilder = new StringBuilder();
            unsuccessfulErrorMsgBuilder.append("<html><body><p><b>Unable to Reverse: </b></p>");
            
            for(String unsuccessfulReversal : unsuccessfulReversals){
                unsuccessfulErrorMsgBuilder.append("<p>" + unsuccessfulReversal + "</p>");
            }
            unsuccessfulErrorMsgBuilder.append("</body></html>");
            _logger.info("HTML for Unsuccessful Error Dialog: + \n" + unsuccessfulErrorMsgBuilder.toString());
            CarsUtils.showErrorDialog(unsuccessfulErrorMsgBuilder.toString());
        }
    }
    
    //Send an EventViewRowImpl as a cars 900 event
    public void sendCarsReverseEvent(EventViewRowImpl row){
        
        Boolean isAppendDashR = (Boolean) appendPostfixCheckbox.getValue();
        String currentDocument = row.getCurrentDocument();
        //Append if checkbox is checked
        if(isAppendDashR){
            currentDocument = currentDocument + "-R";
            row.setCurrentDocument(currentDocument);
            //Call Commit
            callOperationBinding("Commit");
        }
        
        //CARS900EventBuilder
        CARS900EventDetails.CARS900EventBuilder cars900EventBuilder = 
            new CARS900EventDetails.CARS900EventBuilder();
        
        CARS900Event cars900event =
        cars900EventBuilder.setArRootDocument(row.getArRootDocument())
            .setCurrentDocument(currentDocument + "-900")
            .setDataSourceCode(row.getDataSourceCode())
            .setEventDate(getXMLGregorianCalendarNow())
            .setProgramUnitCode(row.getProgramUnitCode())
            .setReferenceDocument(currentDocument)
            .setSubmitBy(getUserName())
            .setSubmitDate(getXMLGregorianCalendarNow())
            .setNote(reversalNote.getValue().toString())
            .createCARS900Event();
        
        //CARSPacketBuilder
        CARSPacketDetails.CARSPacketBuilder carsPacketBuilder =
            new CARSPacketDetails.CARSPacketBuilder();

        CARSPacket carsPacket =
        carsPacketBuilder.setDataSourceCode(row.getDataSourceCode())
            .setEnvironment("DEV")
            .setPacketID(row.getCurrentDocument() + "-900")
            .setPacketPayload(cars900event)
            .setPacketPayloadInformation(TEventType.CARS_900_EVENT)
            .setPacketTarget("CARS")
            .setPacketTransport("WS")
            .setProgramUnitCode(row.getProgramUnitCode())
            .setSubmitBy(getUserName())
            .setSubmitDate(getXMLGregorianCalendarNow())
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
            _logger.info("Sending 900 Event to CARS");
            
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
    }

    //Delete event reversal action listener
    public void deleteReverseEvent(ActionEvent actionEvent) {
        RowKeySet selectedDeleteReverse = getReverseCarsEventsTable().getSelectedRowKeys();
        Iterator selectedDeleteReverseIter = selectedDeleteReverse.iterator();
        //Initialize Key array with RowKeySet size as array size
        Key[] keys = new Key[selectedDeleteReverse.size()];
        int i = 0;
        //Populate Key array
        while(selectedDeleteReverseIter.hasNext()){
            Key key = (Key)((List)selectedDeleteReverseIter.next()).get(0);
            keys[i] = key; 
            _logger.info("Event Id Key for Deleting Reversals : " + key.getKeyValues()[0].toString());
            i++;
        }
        
    }
    
    //Check if the reversal event is valid
    public boolean isChildExist(String currentDocument){
        _logger.info("Calling DB function " + SQL_CHECK_IS_CHILD_EXIST + 
                     "for current document: " + currentDocument);
        int childExistInt;
        childExistInt = (Integer)callStoredFunction(Types.INTEGER, 
                                                    SQL_CHECK_IS_CHILD_EXIST, 
                                                    new Object[] { currentDocument });
        if (childExistInt == 1) {
            return true;
        } else {
            return false;
        }
    }
    
    //Check if the delete event is valid
    public boolean isAlreadyReversed(String currentDocument){
        _logger.info("Calling DB function " + SQL_CHECK_IS_REVERSED + 
                     "for current document: " + currentDocument);
        int reverseExistInt;
        reverseExistInt = (Integer)callStoredFunction(Types.INTEGER, 
                                                    SQL_CHECK_IS_REVERSED, 
                                                    new Object[] { currentDocument });
        if (reverseExistInt == 1) {
            return true;
        } else {
            return false;
        }
    }

    
    //Check if transmitted to Fiscal already
    public boolean isXmitToFiscal(String currentDocument){
        _logger.info("Calling DB function " + SQL_CHECK_IS_XMIT_FISCAL + 
                     "for current document: " + currentDocument);
        int reverseExistInt;
        reverseExistInt = (Integer)callStoredFunction(Types.INTEGER, 
                                                    SQL_CHECK_IS_XMIT_FISCAL, 
                                                    new Object[] { currentDocument });
        if (reverseExistInt == 1) {
            return true;
        } else {
            return false;
        }
    }
    
    //Action Listener to Prep validation and info messages for Reverse Event
    public void prepReverseEvent(ActionEvent actionEvent) {
        DCIteratorBinding eventIter = 
            CarsUtils.getDcBindings().findIteratorBinding("EventView1Iterator");
        
        EventViewRowImpl row = (EventViewRowImpl) eventIter.getCurrentRow();
        
        String eventTypeCode = row.getEventTypeCode();
        
        isValidEventToBeReversed = isValidEventToBeReversed(eventTypeCode);
        
        String currentDocument = "";
        
        StringBuilder reverseEventMsgBuilder = new StringBuilder();
        reversalNote.setReadOnly(false);
        if(row != null){
            isSelectedItem = true;
            currentDocument = row.getCurrentDocument();
        } else {
            isSelectedItem = false;
            reverseEventMsgBuilder.append("No Event has been selected");
            reversalNote.setValue(reverseEventMsgBuilder.toString());
            reversalNote.setReadOnly(true);
            _logger.info("Set note text as: " + reverseEventMsgBuilder.toString());
            return;
        }

        
        isAlreadyReversed = isAlreadyReversed(currentDocument);
        
        isChildExist = isChildExist(currentDocument);
        
        if(!isAlreadyReversed && !isChildExist && isValidEventToBeReversed){
            reverseEventMsgBuilder.append("Are you sure you wish to Reverse : ");
            reverseEventMsgBuilder.append(currentDocument + " ?");
        }
        
        if(isAlreadyReversed || isChildExist || !isValidEventToBeReversed){        
            reverseEventMsgBuilder.append("Unable to Reverse due to: ");
            
            if(isAlreadyReversed){
                reverseEventMsgBuilder.append("Event has already been Reversed ");
            }
            if(isChildExist){
                reverseEventMsgBuilder.append("Event has an existing Child Event");
            }
            if(!isValidEventToBeReversed){
                reverseEventMsgBuilder.append("Event Type Code " + eventTypeCode + " is not valid to be reversed");
            }
        }
        
        reverseEventMessage.setValue(reverseEventMsgBuilder.toString());
        //Simple Date Format
        SimpleDateFormat sd2 = new SimpleDateFormat("MM-dd-yyyy");
        //Get Current Date
        java.util.Date currentDate = new java.util.Date(System.currentTimeMillis());
        //Get reversal note date text
        String reversalNoteDateText = "Reversed on "+ sd2.format(currentDate).toString();
        //Set reversal note date text page binding
        reversalNote.setValue(reversalNoteDateText);
        _logger.info("Set note text as: " + reversalNoteDateText);
        
    }
    
    //Action Listener for delete event dialog listener
    public void reverseEventDialogListener(DialogEvent dialogEvent) {
        //Initialize Outcome
        Outcome outcome = dialogEvent.getOutcome();
        
        //User clicks Ok
        if(outcome == outcome.ok){
            reverseEvents();
        }
    }
    
    //Action Listener for delete event dialog listener
    public void deleteEventDialogListener(DialogEvent dialogEvent) {
        //Initialize Outcome
        Outcome outcome = dialogEvent.getOutcome();
        
        //User clicks Ok
        if (outcome == outcome.ok) {
            //Get event iterator binding
            DCIteratorBinding eventIter =
                CarsUtils.getDcBindings().findIteratorBinding("EventView1Iterator");
            
            //Get current event iterator row
            EventViewRowImpl row = (EventViewRowImpl)eventIter.getCurrentRow();
            
            //Get current document
            String currentDocument = row.getCurrentDocument();

            //Call delete event method
            deleteEvent(currentDocument);
            
            //900 Events leave a hanging Event table record to be deleted
            if (currentDocument.contains("-900")) {
                callOperationBinding("DeleteEvent");
                callOperationBinding("Commit");
            }
        }
    }
    
    //Method that takes in currentDocument to delete an event
    public void deleteEvent(String currentDocument){
        _logger.info("Calling DB procedure " + SQL_PURGE_EVENT + 
                     "for current document: " + currentDocument);
        CarsUtils.callStoredProcOut(getReverseAmImpl().getDBTransaction(), 
                                    false, 
                                    SQL_PURGE_EVENT, 
                                    new Object[] { currentDocument });
    }
    
    //Logic to determine if the ok button is available to reverse an event
    public String getReverseEventButtons(){
        if(!isSelectedItem){
            reverseEventMessage.setVisible(true);
            reversalNote.setVisible(false);
            appendPostfixCheckbox.setVisible(false);
            return "cancel";
        }
        if(!isAlreadyReversed
            && !isChildExist
            && isValidEventToBeReversed){
            reverseEventMessage.setVisible(false);
            reversalNote.setVisible(true);
            appendPostfixCheckbox.setVisible(true);
            appendPostfixCheckbox.setValue(false);
            _logger.info("Returning OK Cancel button due to isAlreadyReversed = " + isAlreadyReversed
                         + " isChildExist " + isChildExist);
            return "okCancel";
        }
        //Else condition
        appendPostfixCheckbox.setVisible(false);
        reverseEventMessage.setVisible(true);
        reversalNote.setVisible(false);
        return "cancel";
    }
    
    //Logic to determine if the ok button is available to delete an event
    public String getDeleteEventButtons(){
        if(!isSelectedItem){
            _logger.info("Returning Cancel button only due to isSelectedItem = " + isSelectedItem);
            return "cancel";
        }
        if(!isAlreadyReversed
            && !isChildExist
            && !isXmitFiscal
            && !isXmitCalstars){
            _logger.info("Returning OK Cancel button due to isAlreadyReversed = " + isAlreadyReversed
                         + " isChildExist " + isChildExist
                         + " isXmitFiscal " + isXmitFiscal);
            return "okCancel";
        }
        //Else condition
        _logger.info("Returning Cancel button only due to Else condition");
        return "cancel";
    }
    
    //Preps either a message to inform the user if the event is eligible
    //to be deleted
    public void prepDeleteEvent(ActionEvent actionEvent){
        DCIteratorBinding eventIter = 
            CarsUtils.getDcBindings().findIteratorBinding("EventView1Iterator");
        
        EventViewRowImpl row = (EventViewRowImpl) eventIter.getCurrentRow();
        
        String currentDocument = "";
        
        StringBuilder deleteEventMsgBuilder = new StringBuilder();
        
        if(row != null){
            currentDocument = row.getCurrentDocument();
            isSelectedItem = true;
        } else {
            isSelectedItem = false;
            deleteEventMsgBuilder.append("No Event has been selected");        
            reversalMessage.setValue(deleteEventMsgBuilder.toString());
            return;
        }
        
        isAlreadyReversed = isAlreadyReversed(currentDocument);
        
        isChildExist = isChildExist(currentDocument);
        
        isXmitFiscal = isXmitToFiscal(currentDocument);
        
        isXmitCalstars = row.getIsSentToCalstars().equalsIgnoreCase("Y");
        
        if(!isAlreadyReversed && !isChildExist && !isXmitFiscal && !isXmitCalstars){
            deleteEventMsgBuilder.append("Are you sure you wish to delete : ");
            deleteEventMsgBuilder.append(currentDocument + " ?");
        }
        
        if(isAlreadyReversed || isChildExist || isXmitFiscal || isXmitCalstars){        
            deleteEventMsgBuilder.append("Unable to Delete due to: ");
            
            if(isXmitFiscal){
                deleteEventMsgBuilder.append("Event has been transmitted to FI$CAL.");
            } else if(isXmitCalstars){
                deleteEventMsgBuilder.append("Event has been transmitted to CALSTARS.");
            } else if(isAlreadyReversed){
                deleteEventMsgBuilder.append("Event has already been Reversed.");
            } else if(isChildExist){
                deleteEventMsgBuilder.append("Event has an existing Child Event.");
            } 
        }
        
        reversalMessage.setValue(deleteEventMsgBuilder.toString());
        
        _logger.info("Text for Delete Event Dialog: + \n" + deleteEventMsgBuilder.toString());
        
    }

    public void setReversalMessage(RichActiveOutputText reversalMessage) {
        this.reversalMessage = reversalMessage;
    }

    public RichActiveOutputText getReversalMessage() {
        return reversalMessage;
    }

    public void setReverseEventMessage(RichActiveOutputText reverseEventMessage) {
        this.reverseEventMessage = reverseEventMessage;
    }

    public RichActiveOutputText getReverseEventMessage() {
        return reverseEventMessage;
    }

    public void setAppendPostfixCheckbox(RichSelectBooleanCheckbox appendPostfixCheckbox) {
        this.appendPostfixCheckbox = appendPostfixCheckbox;
    }

    public RichSelectBooleanCheckbox getAppendPostfixCheckbox() {
        return appendPostfixCheckbox;
    }
}
