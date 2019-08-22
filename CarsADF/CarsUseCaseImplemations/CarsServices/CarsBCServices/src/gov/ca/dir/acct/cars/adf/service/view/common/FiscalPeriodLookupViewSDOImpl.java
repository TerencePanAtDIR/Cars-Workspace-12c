package gov.ca.dir.acct.cars.adf.service.view.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class FiscalPeriodLookupViewSDOImpl extends SDODataObject implements FiscalPeriodLookupViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 3;

   public FiscalPeriodLookupViewSDOImpl() {}

   public java.sql.Date getEffectiveEndDate() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 0);
   }

   public void setEffectiveEndDate(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.math.BigDecimal getFiscalPeriodId() {
      return getBigDecimal(START_PROPERTY_INDEX + 1);
   }

   public void setFiscalPeriodId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.sql.Date getEffectiveStartDate() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 2);
   }

   public void setEffectiveStartDate(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getFiscalYearName() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setFiscalYearName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }


}

