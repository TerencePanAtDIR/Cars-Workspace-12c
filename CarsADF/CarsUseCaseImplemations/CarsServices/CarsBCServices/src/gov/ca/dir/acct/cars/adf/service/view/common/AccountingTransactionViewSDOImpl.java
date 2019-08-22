package gov.ca.dir.acct.cars.adf.service.view.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class AccountingTransactionViewSDOImpl extends SDODataObject implements AccountingTransactionViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 14;

   public AccountingTransactionViewSDOImpl() {}

   public java.math.BigDecimal getAcctgTransactionId() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setAcctgTransactionId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.math.BigDecimal getAmount() {
      return getBigDecimal(START_PROPERTY_INDEX + 1);
   }

   public void setAmount(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getComments() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setComments(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getCreatedBy() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setCreatedBy(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.sql.Timestamp getCreatedDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 4);
   }

   public void setCreatedDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.sql.Timestamp getDailyPostingDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 5);
   }

   public void setDailyPostingDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.lang.String getDataSourceCode() {
      return getString(START_PROPERTY_INDEX + 6);
   }

   public void setDataSourceCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.math.BigDecimal getFiscalPeriodId() {
      return getBigDecimal(START_PROPERTY_INDEX + 7);
   }

   public void setFiscalPeriodId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.lang.String getModifiedBy() {
      return getString(START_PROPERTY_INDEX + 8);
   }

   public void setModifiedBy(java.lang.String value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.sql.Timestamp getModifiedDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 9);
   }

   public void setModifiedDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.sql.Timestamp getTransactionDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 10);
   }

   public void setTransactionDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.util.List getReceivableView() {
      return getList(START_PROPERTY_INDEX + 11);
   }

   public void setReceivableView(java.util.List value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public java.util.List getReceiptView() {
      return getList(START_PROPERTY_INDEX + 12);
   }

   public void setReceiptView(java.util.List value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }

   public java.util.List getAdjustmentView() {
      return getList(START_PROPERTY_INDEX + 13);
   }

   public void setAdjustmentView(java.util.List value) {
      set(START_PROPERTY_INDEX + 13 , value);
   }

   public java.util.List getOtherAccountTransView() {
      return getList(START_PROPERTY_INDEX + 14);
   }

   public void setOtherAccountTransView(java.util.List value) {
      set(START_PROPERTY_INDEX + 14 , value);
   }


}

