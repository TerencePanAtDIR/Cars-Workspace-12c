package gov.ca.dir.acct.cars.adf.service.view.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class ReferenceCodeListViewSDOImpl extends SDODataObject implements ReferenceCodeListViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 13;

   public ReferenceCodeListViewSDOImpl() {}

   public java.lang.String getDomainName() {
      return getString(START_PROPERTY_INDEX + 0);
   }

   public void setDomainName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getEntityName() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setEntityName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getAttributeName() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setAttributeName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getReferenceCode() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setReferenceCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getReferenceValue() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setReferenceValue(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getDescription() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setDescription(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.sql.Date getEffectiveStartDate() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 6);
   }

   public void setEffectiveStartDate(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.sql.Date getEffectiveEndDate() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 7);
   }

   public void setEffectiveEndDate(java.sql.Date value) {
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

   public java.sql.Date getCreatedDate() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 10);
   }

   public void setCreatedDate(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.lang.String getModifiedBy() {
      return getString(START_PROPERTY_INDEX + 11);
   }

   public void setModifiedBy(java.lang.String value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public java.sql.Date getModifiedDate() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 12);
   }

   public void setModifiedDate(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }

   public java.lang.String getRowID() {
      return getString(START_PROPERTY_INDEX + 13);
   }

   public void setRowID(java.lang.String value) {
      set(START_PROPERTY_INDEX + 13 , value);
   }


}

