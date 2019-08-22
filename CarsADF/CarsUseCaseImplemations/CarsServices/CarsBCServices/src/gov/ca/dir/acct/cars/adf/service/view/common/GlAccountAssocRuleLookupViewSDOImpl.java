package gov.ca.dir.acct.cars.adf.service.view.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class GlAccountAssocRuleLookupViewSDOImpl extends SDODataObject implements GlAccountAssocRuleLookupViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 3;

   public GlAccountAssocRuleLookupViewSDOImpl() {}

   public java.math.BigDecimal getAcctgEntryTypeId() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setAcctgEntryTypeId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.sql.Date getEffectiveEndDate() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 1);
   }

   public void setEffectiveEndDate(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.sql.Date getEffectiveStartDate() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 2);
   }

   public void setEffectiveStartDate(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.math.BigDecimal getGlAccountAssocRuleId() {
      return getBigDecimal(START_PROPERTY_INDEX + 3);
   }

   public void setGlAccountAssocRuleId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }


}

