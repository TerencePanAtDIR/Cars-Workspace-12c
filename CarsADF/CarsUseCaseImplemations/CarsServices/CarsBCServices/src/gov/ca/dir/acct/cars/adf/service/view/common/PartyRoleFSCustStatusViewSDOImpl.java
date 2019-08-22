package gov.ca.dir.acct.cars.adf.service.view.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class PartyRoleFSCustStatusViewSDOImpl extends SDODataObject implements PartyRoleFSCustStatusViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 5;

   public PartyRoleFSCustStatusViewSDOImpl() {}

   public java.math.BigDecimal getParticipantRoleId() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setParticipantRoleId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getFsProcessStatus() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setFsProcessStatus(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.sql.Timestamp getFsProcessDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 2);
   }

   public void setFsProcessDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getDataSourceCode() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setDataSourceCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.sql.Timestamp getCreatedDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 4);
   }

   public void setCreatedDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getCreatedBy() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setCreatedBy(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }


}

