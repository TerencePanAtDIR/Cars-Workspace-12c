package gov.ca.dir.acct.cars.adf.usecase009.view;

import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.nav.RichCommandLink;
import oracle.adf.view.rich.component.rich.output.RichOutputText;

public class BatchSearchBean {
  private RichOutputText batchDate;
  private String formattedBatchDate;
  private RichCommandLink batchTypeCode;
  private String newInfarPageTitle = "Hello, World";

  public void setBatchDate(RichOutputText batchDate) {
    this.batchDate = batchDate;
  }

  public RichOutputText getBatchDate() {
    return batchDate;
  }

  public void setFormattedBatchDate(String formattedBatchDate) {
    this.formattedBatchDate = formattedBatchDate;
  }

  public String getFormattedBatchDate() {
    return formattedBatchDate;
  }


  public void setBatchTypeCode(RichCommandLink batchTypeCode) {
    this.batchTypeCode = batchTypeCode;
  }

  public RichCommandLink getBatchTypeCode() {
    return batchTypeCode;
  }
  

  public void setNewInfarPageTitle(String newInfarPageTitle) {
    this.newInfarPageTitle = newInfarPageTitle;
  }

  public String getNewInfarPageTitle() {
    return newInfarPageTitle;
  }
  
  public void convertDateFormat() {
    String oldDate = batchDate.getValue().toString();
    String year = oldDate.substring(0,4);
    String month = oldDate.substring(4,6);
    String day = oldDate.substring(6);
    String newDate = year + "-" + month + "-" + day;
    System.out.println("DEBUG: New formatted date: "+ newDate);
    setFormattedBatchDate(newDate);
  }

  public void formatPageTitle(ActionEvent actionEvent) {
    convertDateFormat();
    String batchTypeCodeString = batchTypeCode.getText();
    String newPageTitle = batchTypeCodeString + " " + formattedBatchDate;
    setNewInfarPageTitle(newPageTitle);
    System.out.println("DEBUG: New page title:  "+newInfarPageTitle);
  }

}
