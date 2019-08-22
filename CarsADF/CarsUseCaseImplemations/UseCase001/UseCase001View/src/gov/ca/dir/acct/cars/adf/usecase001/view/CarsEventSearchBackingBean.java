package gov.ca.dir.acct.cars.adf.usecase001.view;

import gov.ca.dir.acct.cars.adf.common.code.CarsUtils;

import gov.ca.dir.acct.cars.adf.usecase001.model.CarsEventDetails.AccountingEntryStatusViewImpl;
import gov.ca.dir.acct.cars.adf.usecase001.model.CarsEventDetails.AccountingEntryStatusViewRowImpl;
import gov.ca.dir.acct.cars.adf.usecase001.model.CarsEventDetails.CarsSearchEventsImpl;
import gov.ca.dir.acct.cars.adf.usecase001.model.CarsEventDetails.OffsetPaymentCodeViewImpl;
import gov.ca.dir.acct.cars.adf.usecase001.model.CarsEventDetails.ReceiptViewImpl;
import gov.ca.dir.acct.cars.adf.usecase001.model.CarsEventDetails.ReceiptViewRowImpl;

import gov.ca.dir.acct.cars.adf.usecase001.model.CarsEventDetails.ViewEventsRowImpl;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import javax.faces.context.FacesContext;

import oracle.adf.view.rich.component.rich.RichDialog;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.output.RichActiveOutputText;
import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.DialogEvent.Outcome;

import oracle.jbo.domain.Number;

import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;

import oracle.adf.model.binding.DCDataControl;
import oracle.adf.share.logging.ADFLogger;

import oracle.adf.view.rich.component.UIXInputPopup;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.QueryEvent;
import oracle.adf.view.rich.model.ListOfValuesModel;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.JboException;
import oracle.jbo.Row;
import oracle.jbo.ViewCriteriaManager;
import oracle.jbo.uicli.binding.JUCtrlListBinding;

import org.apache.myfaces.trinidad.model.RowKeySet;

public class CarsEventSearchBackingBean {
    
    private static ADFLogger _logger = 
                    ADFLogger.createADFLogger(CarsEventSearchBackingBean.class);
    
    private final String SQL_CHECK_IS_XMIT_FISCAL = "FUNC_IS_XMIT_TO_FISCAL(?)";

    private String offsetPaymentCode;
    private String offsetPaymentCodePopupValue;
    private String fsProcessStatus;
    private RichSelectOneChoice offsetPaymentCodeSoc;
    private RichActiveOutputText updateOffsetPaymentDialogText;
    private RichPopup offsetPaymentCodeUpdatePopup;
    private RichTable viewEvents2Table;
    private RichDialog offsetPaymentCodeUpdateDialog;
    private RichActiveOutputText updateOffsetPaymentDialogCurrentDoc;

    protected CarsSearchEventsImpl getSearchEventsAmImpl(){
        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc = bindingContext.findDataControl("CarsSearchEventsDataControl");
        
        return (CarsSearchEventsImpl)dc.getDataProvider();
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
                getSearchEventsAmImpl().getDBTransaction().createCallableStatement("begin ? := " + stmt + ";end;",
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
    
    //Set Receipt Iterator to be on the right row to update the offset code
    public void prepChangeOffsetPaymentCode(ActionEvent actionEvent) {
        AdfFacesContext adfFacesContext = AdfFacesContext.getCurrentInstance();
        
        ViewEventsRowImpl viewEventsRow = 
            (ViewEventsRowImpl) CarsUtils
                .getDcBindings()
                .findIteratorBinding("ViewEvents2Iterator")
                .getCurrentRow();
        
        if(viewEvents2Table.getSelectedRowKeys().size() == 0){
            updateOffsetPaymentDialogText.setValue("No Event has been selected.");
            offsetPaymentCodeSoc.setVisible(false);
            adfFacesContext.addPartialTarget(offsetPaymentCodeUpdateDialog);
            updateOffsetPaymentDialogCurrentDoc.setVisible(false);
            return;
        }

        updateOffsetPaymentDialogCurrentDoc.setVisible(true);
        
        //Get first character of the event type code
        String eventTypeCode = viewEventsRow.getEventTypeCode();
        String leadingNumberEventTypeCode = Character.toString(eventTypeCode.charAt(0));        
        
        //Get Accounting transaction id
        Number acctgTransactionId = viewEventsRow.getAcctgTransactionId();

        offsetPaymentCode = viewEventsRow.getOffsetPaymentCode();
        
        fsProcessStatus = viewEventsRow.getFsProcessStatus();
        
        if(offsetPaymentCode == null){
            updateOffsetPaymentDialogText.setValue("Not an Event with an Offset Payment Code.");
            offsetPaymentCodeSoc.setVisible(false);
        adfFacesContext.addPartialTarget(offsetPaymentCodeUpdateDialog);
            return;
        } else if(fsProcessStatus == null){
            updateOffsetPaymentDialogText.setValue("Event does not have an FS Process Status.");
            offsetPaymentCodeSoc.setVisible(false);
        adfFacesContext.addPartialTarget(offsetPaymentCodeUpdateDialog);
            return;
        } else if(fsProcessStatus.equals("TRANSMITTED")){
            updateOffsetPaymentDialogText.setValue("Event has currently been transmitted to Fiscal.");
            offsetPaymentCodeSoc.setVisible(false);
        adfFacesContext.addPartialTarget(offsetPaymentCodeUpdateDialog);
            return;
        } else if(fsProcessStatus.equals("SELECTED")
           || fsProcessStatus.equals("BATCHED")){
            updateOffsetPaymentDialogText.setValue("Event has currently been prepped to be sent to Fiscal.");
            offsetPaymentCodeSoc.setVisible(false);
        adfFacesContext.addPartialTarget(offsetPaymentCodeUpdateDialog);
            return;
        }
        
        //Set Receipt View row with accounting transaction id
        CarsUtils.getDcBindings()
                .findIteratorBinding("ReceiptView1Iterator")
                .setCurrentRowWithKeyValue(acctgTransactionId.toString());
        
        //Get Receipt View Iterator
        ReceiptViewRowImpl receiptViewRow = (ReceiptViewRowImpl)CarsUtils.getDcBindings()
                .findIteratorBinding("ReceiptView1Iterator")
                .getCurrentRow();
        
        //Get View Object for Offset Payment Code Iterator from Receipt View Row
        OffsetPaymentCodeViewImpl offsetPaymentCodeViewImpl = (OffsetPaymentCodeViewImpl)
            receiptViewRow.getOffsetPaymentCodeView1().getViewObject();
        
        //Get View Criteria Manager for Offset Payment Code Iterator
        ViewCriteriaManager vcManager = 
            offsetPaymentCodeViewImpl.getViewCriteriaManager();
        
        //Apply the valid payment offset code list view criteria for 200 events
        if(leadingNumberEventTypeCode.equals("2")){
            offsetPaymentCodeViewImpl
                .applyViewCriteria(vcManager.getViewCriteria("OffsetPaymentCodePaymentViewCriteria"));
            receiptViewRow.getOffsetPaymentCodeView1().executeQuery();
        //Apply the valid payment offset code list view criteria for 300 events
        } else if (leadingNumberEventTypeCode.equals("3")){
            offsetPaymentCodeViewImpl
                .applyViewCriteria(vcManager.getViewCriteria("OffsetPaymentCodeReversalViewCriteria"));
            receiptViewRow.getOffsetPaymentCodeView1().executeQuery();
            }
        
        //Update dialog text
        updateOffsetPaymentDialogText.setValue("Select Offset Payment Code below: ");
        //Make the offset payment code select one choice visible
        offsetPaymentCodeSoc.setVisible(true);
        offsetPaymentCodeSoc.setValue("1");
        _logger.info("Set Offset Payment Code editing row for accounting transaction id: "
                     + acctgTransactionId.toString());
        adfFacesContext.addPartialTarget(offsetPaymentCodeUpdateDialog);
        
        RichPopup.PopupHints hints = new RichPopup.PopupHints();
        offsetPaymentCodeUpdatePopup.show(hints);
    }

    
    //Logic to determine if the ok button is available to reverse an event
    public String getOffsetCodeUpdateButtons(){
        _logger.info("offsetPaymentCode: "
                     + offsetPaymentCode);        
        _logger.info("fsProcessStatus: "
                     + fsProcessStatus);
        
        if(fsProcessStatus == null
           || offsetPaymentCode == null
           || fsProcessStatus.equals("TRANSMITTED")
           || fsProcessStatus.equals("SELECTED")
           || fsProcessStatus.equals("BATCHED")
           || viewEvents2Table.getSelectedRowKeys() == null){
            return "cancel";
        } else {
            return "okCancel";
        }
    }
    
    //Call validation and commit for offset update
    public void updateOffsetPaymentCode(DialogEvent dialogEvent) {
        Outcome outcome = dialogEvent.getOutcome();
        
        ViewEventsRowImpl viewEventsRow = 
            (ViewEventsRowImpl) CarsUtils
                .getDcBindings()
                .findIteratorBinding("ViewEvents2Iterator").getCurrentRow();
        
        String currentDocument = viewEventsRow.getCurrentDocument();
        
        boolean isXmitToFiscal = isXmitToFiscal(currentDocument);

        _logger.info("Offset Payment Code has been updated for " + currentDocument);
        
        //Ok button has been clicked
        if(outcome == outcome.ok){
            /*  Double check if payment/reversal has been transmitted to Fiscal
             *  while user is interacting with dialog.
             */
            if(isXmitToFiscal == true){
                _logger.info("Status is pending or transmitted to Fiscal");
                CarsUtils.showErrorDialog("This has been transmitted to Fiscal already.");
                return;
            }
            
            //Get Receipt View Iterator current row
            ReceiptViewRowImpl receiptViewRow = 
            (ReceiptViewRowImpl) CarsUtils
                .getDcBindings()
                .findIteratorBinding("ReceiptView1Iterator").getCurrentRow();
            
            
            BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
            JUCtrlListBinding list = (JUCtrlListBinding) bindings.get("OffsetPaymentCode1"); 
            list.getDisplayData();
            Row selectedValue = (Row) list.getValueFromList(Integer.decode(offsetPaymentCodePopupValue));
            String offsetPaymentCodeStr = selectedValue.getAttribute("ReferenceCode").toString();
            
            receiptViewRow.setOffsetPaymentCode(offsetPaymentCodeStr);
            
            //Reset Status to NEW if changing to O
            if(receiptViewRow.getOffsetPaymentCode().equals("O")){
                Row[] accountingEntryStatusViewRows = 
                    CarsUtils
                        .getDcBindings()
                        .findIteratorBinding("AccountingEntryStatusView1Iterator")
                        .getAllRowsInRange();
                
                for(Row row: 
                    accountingEntryStatusViewRows){
                    AccountingEntryStatusViewRowImpl aesViewRow = 
                        (AccountingEntryStatusViewRowImpl) row;
                    
                    aesViewRow.setFsProcessStatus("NEW");
                }
            }
            
            BindingContext bindingctx = BindingContext.getCurrent(); 
            
            BindingContainer binding = bindingctx.getCurrentBindingsEntry();  
            
            OperationBinding operationBinding = 
                binding.getOperationBinding("Commit");  
            
            operationBinding.execute();

            _logger.info("Committing offset code update");
            
        }
        
    }

    public void setOffsetPaymentCodeSoc(RichSelectOneChoice offsetPaymentCodeSoc) {
        this.offsetPaymentCodeSoc = offsetPaymentCodeSoc;
    }

    public RichSelectOneChoice getOffsetPaymentCodeSoc() {
        return offsetPaymentCodeSoc;
    }

    public void setUpdateOffsetPaymentDialogText(RichActiveOutputText updateOffsetPaymentDialogText) {
        this.updateOffsetPaymentDialogText = updateOffsetPaymentDialogText;
    }

    public RichActiveOutputText getUpdateOffsetPaymentDialogText() {
        return updateOffsetPaymentDialogText;
    }

    public void setOffsetPaymentCodeUpdatePopup(RichPopup offsetPaymentCodeUpdatePopup) {
        this.offsetPaymentCodeUpdatePopup = offsetPaymentCodeUpdatePopup;
    }

    public RichPopup getOffsetPaymentCodeUpdatePopup() {
        return offsetPaymentCodeUpdatePopup;
    }

    public void setOffsetPaymentCodePopupValue(String offsetPaymentCodePopupValue) {
        this.offsetPaymentCodePopupValue = offsetPaymentCodePopupValue;
    }

    public String getOffsetPaymentCodePopupValue() {
        return offsetPaymentCodePopupValue;
    }

    public void setViewEvents2Table(RichTable viewEvents2Table) {
        this.viewEvents2Table = viewEvents2Table;
    }

    public RichTable getViewEvents2Table() {
        return viewEvents2Table;
    }
    
    public void viewEventsQueryListener(QueryEvent queryEvent){
        CarsUtils.invokeMethodExpression("#{bindings.ViewEventDetailsQuery1.processQuery}", 
                                         Object.class,QueryEvent.class,queryEvent);
        //RowKeySet viewEvents2rks = viewEvents2Table.getSelectedRowKeys();
        //viewEvents2rks.clear();
        
        viewEvents2Table.getSelectedRowKeys().removeAll();
        AdfFacesContext adfFacesContext = AdfFacesContext.getCurrentInstance();
        adfFacesContext.addPartialTarget(viewEvents2Table);
        //FacesContext.getCurrentInstance().renderResponse();
    }

    public void setOffsetPaymentCodeUpdateDialog(RichDialog offsetPaymentCodeUpdateDialog) {
        this.offsetPaymentCodeUpdateDialog = offsetPaymentCodeUpdateDialog;
    }

    public RichDialog getOffsetPaymentCodeUpdateDialog() {
        return offsetPaymentCodeUpdateDialog;
    }

    public void setUpdateOffsetPaymentDialogCurrentDoc(RichActiveOutputText updateOffsetPaymentDialogCurrentDoc) {
        this.updateOffsetPaymentDialogCurrentDoc = updateOffsetPaymentDialogCurrentDoc;
    }

    public RichActiveOutputText getUpdateOffsetPaymentDialogCurrentDoc() {
        return updateOffsetPaymentDialogCurrentDoc;
    }
}
