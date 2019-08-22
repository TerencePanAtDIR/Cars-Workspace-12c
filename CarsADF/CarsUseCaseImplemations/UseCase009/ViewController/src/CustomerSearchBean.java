import java.util.Map;

import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;

import oracle.adf.model.binding.DCBindingContainer;

import oracle.adf.model.binding.DCIteratorBinding;

import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;

import oracle.jbo.Row;

import oracle.binding.OperationBinding;

import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.DialogEvent.Outcome;

import oracle.jbo.ApplicationModule;


public class CustomerSearchBean {
  
  public CustomerSearchBean() {
    
  }
  private Boolean clickableButton = false;
  /**
   * get current Bindings Entry
   *
   * @return BindingContainer
   */
  public BindingContainer getBindings() {
    return BindingContext.getCurrent().getCurrentBindingsEntry();
  } //getBindings()


  public void ApproveOrResetCustomer(ActionEvent actionEvent) {
    // Add event code here...
    DCBindingContainer bindingContainer = (DCBindingContainer)getBindings();
    DCIteratorBinding customerInformationIterator = bindingContainer.findIteratorBinding("CustomerInformation1Iterator");
    Row customerRow = customerInformationIterator.getCurrentRow();
  
    ADFContext adfCtx = ADFContext.getCurrent();
    Map pageFlowScope = adfCtx.getPageFlowScope();
    Object pageFlowScopeValue = pageFlowScope.get("buttonChoice");
    String choice = "";
//    System.out.println("Debug: The page flow scope customer status is: "+pageFlowScopeValue.toString());
    
    String currentStatus = "";
    
    try{
      currentStatus = customerRow.getAttribute("FsProcessStatus").toString();
      choice = pageFlowScopeValue.toString();
      System.out.println("DEBUG: THE CHOICE IS: "+choice);
    }catch(NullPointerException e){
      System.out.println("Debug: The FsProcessStatus for this CustomerID is NULL");
      currentStatus = "";
    }
    
    printCustomerInformation(customerRow,currentStatus);
                                                                                                        
    if((currentStatus.startsWith("CONVERTED") == true || currentStatus.startsWith("TRANSMITTED") == true) && choice.startsWith("A")){
      System.out.println("DEBUG: Current Customer Status is CONVERTED/TRANSMITTED, being changed to ACTIVE");
      customerRow.setAttribute("FsProcessStatus", "ACTIVE"); //This doesn't commit, "saveCustomerStatusChange()" does
    } else if (currentStatus.startsWith("ERROR")){
      System.out.println("DEBUG: Current Customer Status is ERROR, being changed to NEW");
      customerRow.setAttribute("FsProcessStatus", "NEW"); //This doesn't commit, "saveCustomerStatusChange()" does
      customerRow.setAttribute("FsProcessDate",""); //Have to set modified date to null otherwise batch processing won't pick up the NEW
    } else if ((currentStatus.startsWith("TRANSMITTED") || currentStatus.startsWith("FAILED")) && choice.startsWith("E")){
      System.out.println("DEBUG: Current Customer Status is TRANSMITTED, being changed to ERROR");  
      customerRow.setAttribute("FsProcessStatus", "ERROR"); //This doesn't commit, "saveCustomerStatusChange()" does
    }
    
  }

  public void saveCustomerStatusChange(DialogEvent dialogEvent) {
    // Add event code here...
    DCBindingContainer bindingContainer = (DCBindingContainer)getBindings();
    ApplicationModule am = bindingContainer.getDataControl().getApplicationModule();
    if (am.getTransaction().isDirty()) { //if there are changes to be saved
      Outcome outCome = dialogEvent.getOutcome();
      if (outCome == outCome.ok) {
        //if the user says ok
        OperationBinding operationBinding =bindingContainer.getOperationBinding("Commit");
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
          System.out.println("Debug: " +operationBinding.getErrors().toString());
        }
      }
    }
  }

  public void cancelCustomerChanges(DialogEvent dialogEvent) {
    // Add event code here...
    DCBindingContainer bindingContainer = (DCBindingContainer)getBindings();
    ApplicationModule am = bindingContainer.getDataControl().getApplicationModule();
    if (am.getTransaction().isDirty()) { //if there are changes to be saved
      Outcome outCome = dialogEvent.getOutcome();
      if (outCome == outCome.ok) {
        //if the user says ok
        OperationBinding operationBinding =bindingContainer.getOperationBinding("Rollback");
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
          System.out.println("Debug: " + operationBinding.getErrors().toString());
        }
      }
    }
  }

  
  public void printCustomerInformation(Row customerRow,String currentStatus){
    String rootDocument = customerRow.getAttribute("ArRootDocument").toString();
    String customerId = customerRow.getAttribute("CustId").toString();
    System.out.println("DEBUG: Invoice "+rootDocument+" with Customer ID "+customerId+" is status "+currentStatus+".");
  }

  public Boolean getClickableButton() {
    DCBindingContainer bindingContainer = (DCBindingContainer)getBindings();
    ApplicationModule am = bindingContainer.getDataControl().getApplicationModule();
    return !am.getTransaction().isDirty();
  }
}
