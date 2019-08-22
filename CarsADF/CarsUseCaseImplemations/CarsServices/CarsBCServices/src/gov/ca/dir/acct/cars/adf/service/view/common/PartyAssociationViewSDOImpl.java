package gov.ca.dir.acct.cars.adf.service.view.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class PartyAssociationViewSDOImpl extends SDODataObject implements PartyAssociationViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 10;

   public PartyAssociationViewSDOImpl() {}

   public java.math.BigDecimal getPartyToId() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setPartyToId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.math.BigDecimal getPartyFromId() {
      return getBigDecimal(START_PROPERTY_INDEX + 1);
   }

   public void setPartyFromId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getPartyAssocTypeCode() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setPartyAssocTypeCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getDescription() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setDescription(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.sql.Timestamp getEffectiveStartDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 4);
   }

   public void setEffectiveStartDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.sql.Timestamp getEffectiveEndDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 5);
   }

   public void setEffectiveEndDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.lang.String getDataSourceCode() {
      return getString(START_PROPERTY_INDEX + 6);
   }

   public void setDataSourceCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.lang.String getCreatedBy() {
      return getString(START_PROPERTY_INDEX + 7);
   }

   public void setCreatedBy(java.lang.String value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.sql.Timestamp getCreatedDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 8);
   }

   public void setCreatedDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.lang.String getModifiedBy() {
      return getString(START_PROPERTY_INDEX + 9);
   }

   public void setModifiedBy(java.lang.String value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.sql.Timestamp getModifiedDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 10);
   }

   public void setModifiedDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }


}

