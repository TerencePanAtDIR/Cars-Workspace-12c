package gov.ca.dir.acct.cars.adf.service.view.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class EventTypeAssocRulesLookupSDOImpl extends SDODataObject implements EventTypeAssocRulesLookupSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 5;

   public EventTypeAssocRulesLookupSDOImpl() {}

   public java.lang.String getDescription() {
      return getString(START_PROPERTY_INDEX + 0);
   }

   public void setDescription(java.lang.String value) {
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

   public java.math.BigDecimal getEventTypeAssocRuleId() {
      return getBigDecimal(START_PROPERTY_INDEX + 3);
   }

   public void setEventTypeAssocRuleId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.math.BigDecimal getEventTypeFromId() {
      return getBigDecimal(START_PROPERTY_INDEX + 4);
   }

   public void setEventTypeFromId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.math.BigDecimal getEventTypeToId() {
      return getBigDecimal(START_PROPERTY_INDEX + 5);
   }

   public void setEventTypeToId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }


}

