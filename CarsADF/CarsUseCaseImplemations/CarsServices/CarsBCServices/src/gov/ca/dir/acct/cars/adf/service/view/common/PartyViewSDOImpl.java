package gov.ca.dir.acct.cars.adf.service.view.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class PartyViewSDOImpl extends SDODataObject implements PartyViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 6;

   public PartyViewSDOImpl() {}

   public java.math.BigDecimal getPartyId() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setPartyId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getPartyType() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setPartyType(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getDataSourceCode() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setDataSourceCode(java.lang.String value) {
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

   public java.lang.String getModifiedBy() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setModifiedBy(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.sql.Timestamp getModifiedDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 6);
   }

   public void setModifiedDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }


}

