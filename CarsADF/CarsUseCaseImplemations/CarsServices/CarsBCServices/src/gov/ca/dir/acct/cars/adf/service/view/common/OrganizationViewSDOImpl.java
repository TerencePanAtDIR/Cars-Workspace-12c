package gov.ca.dir.acct.cars.adf.service.view.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class OrganizationViewSDOImpl extends SDODataObject implements OrganizationViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 12;

   public OrganizationViewSDOImpl() {}

   public java.math.BigDecimal getPartyId() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setPartyId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getLegalName() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setLegalName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getOrganizationName() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setOrganizationName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getDba() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setDba(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getFein() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setFein(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.Integer getSein() {
      return new Integer(getInt(START_PROPERTY_INDEX + 5));
   }

   public void setSein(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.lang.Integer getSicCode() {
      return new Integer(getInt(START_PROPERTY_INDEX + 6));
   }

   public void setSicCode(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.lang.Integer getNaicsCode() {
      return new Integer(getInt(START_PROPERTY_INDEX + 7));
   }

   public void setNaicsCode(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.lang.String getDataSourceCode() {
      return getString(START_PROPERTY_INDEX + 8);
   }

   public void setDataSourceCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.lang.String getCreatedBy() {
      return getString(START_PROPERTY_INDEX + 9);
   }

   public void setCreatedBy(java.lang.String value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.sql.Timestamp getCreatedDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 10);
   }

   public void setCreatedDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.lang.String getModifiedBy() {
      return getString(START_PROPERTY_INDEX + 11);
   }

   public void setModifiedBy(java.lang.String value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public java.sql.Timestamp getModifiedDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 12);
   }

   public void setModifiedDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }


}

