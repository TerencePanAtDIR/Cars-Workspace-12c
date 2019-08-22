package gov.ca.dir.acct.cars.adf.service.view.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class ReceiptViewSDOImpl extends SDODataObject implements ReceiptViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 16;

   public ReceiptViewSDOImpl() {}

   public java.math.BigDecimal getAcctgTransactionId() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setAcctgTransactionId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getBillTypeCode() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setBillTypeCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getReceiptTypeCode() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setReceiptTypeCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.sql.Timestamp getReceiptDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 3);
   }

   public void setReceiptDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getReceiptControlNumber() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setReceiptControlNumber(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getDepositSlipNumber() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setDepositSlipNumber(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.sql.Timestamp getDepositDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 6);
   }

   public void setDepositDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.sql.Timestamp getCheckIssueDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 7);
   }

   public void setCheckIssueDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.lang.String getLocation() {
      return getString(START_PROPERTY_INDEX + 8);
   }

   public void setLocation(java.lang.String value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.lang.String getLocationCode() {
      return getString(START_PROPERTY_INDEX + 9);
   }

   public void setLocationCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.lang.String getOffsetPaymentCode() {
      return getString(START_PROPERTY_INDEX + 10);
   }

   public void setOffsetPaymentCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.lang.String getNonSufficientFundNumber() {
      return getString(START_PROPERTY_INDEX + 11);
   }

   public void setNonSufficientFundNumber(java.lang.String value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public java.lang.String getDataSourceCode() {
      return getString(START_PROPERTY_INDEX + 12);
   }

   public void setDataSourceCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }

   public java.lang.String getCreatedBy() {
      return getString(START_PROPERTY_INDEX + 13);
   }

   public void setCreatedBy(java.lang.String value) {
      set(START_PROPERTY_INDEX + 13 , value);
   }

   public java.sql.Timestamp getCreatedDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 14);
   }

   public void setCreatedDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 14 , value);
   }

   public java.lang.String getModifiedBy() {
      return getString(START_PROPERTY_INDEX + 15);
   }

   public void setModifiedBy(java.lang.String value) {
      set(START_PROPERTY_INDEX + 15 , value);
   }

   public java.sql.Timestamp getModifiedDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 16);
   }

   public void setModifiedDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 16 , value);
   }


}

