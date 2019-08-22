package gov.ca.dir.acct.cars.adf.service.view.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class CreditRuleLookupViewSDOImpl extends SDODataObject implements CreditRuleLookupViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 7;

   public CreditRuleLookupViewSDOImpl() {}

   public java.math.BigDecimal getAcctgEntryTypeId() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setAcctgEntryTypeId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.math.BigDecimal getGlAccountAssocRuleId() {
      return getBigDecimal(START_PROPERTY_INDEX + 1);
   }

   public void setGlAccountAssocRuleId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getGlAccountNumber() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setGlAccountNumber(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getAccountNumber() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setAccountNumber(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getSign() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setSign(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.math.BigDecimal getGlAccountPairNumber() {
      return getBigDecimal(START_PROPERTY_INDEX + 5);
   }

   public void setGlAccountPairNumber(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.sql.Timestamp getEffectiveStartDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 6);
   }

   public void setEffectiveStartDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.sql.Timestamp getEffectiveEndDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 7);
   }

   public void setEffectiveEndDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }


}

