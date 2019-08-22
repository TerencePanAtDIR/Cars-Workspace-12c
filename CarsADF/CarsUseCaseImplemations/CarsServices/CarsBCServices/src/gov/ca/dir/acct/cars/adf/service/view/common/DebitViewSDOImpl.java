package gov.ca.dir.acct.cars.adf.service.view.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class DebitViewSDOImpl extends SDODataObject implements DebitViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 9;

   public DebitViewSDOImpl() {}

   public java.lang.String getGlAccountNumber() {
      return getString(START_PROPERTY_INDEX + 0);
   }

   public void setGlAccountNumber(java.lang.String value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.math.BigDecimal getAcctgEntryId() {
      return getBigDecimal(START_PROPERTY_INDEX + 1);
   }

   public void setAcctgEntryId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getAccountNumber() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setAccountNumber(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.math.BigDecimal getAmount() {
      return getBigDecimal(START_PROPERTY_INDEX + 3);
   }

   public void setAmount(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.math.BigDecimal getGlAccountPairNumber() {
      return getBigDecimal(START_PROPERTY_INDEX + 4);
   }

   public void setGlAccountPairNumber(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getDataSourceCode() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setDataSourceCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.lang.String getCreatedBy() {
      return getString(START_PROPERTY_INDEX + 6);
   }

   public void setCreatedBy(java.lang.String value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.sql.Timestamp getCreatedDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 7);
   }

   public void setCreatedDate(java.sql.Timestamp value) {
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


}

