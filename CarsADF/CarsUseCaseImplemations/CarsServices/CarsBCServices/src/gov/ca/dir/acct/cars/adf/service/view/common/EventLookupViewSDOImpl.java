package gov.ca.dir.acct.cars.adf.service.view.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class EventLookupViewSDOImpl extends SDODataObject implements EventLookupViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 13;

   public EventLookupViewSDOImpl() {}

   public java.math.BigDecimal getEventId() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setEventId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.math.BigDecimal getEventTypeId() {
      return getBigDecimal(START_PROPERTY_INDEX + 1);
   }

   public void setEventTypeId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.math.BigDecimal getArStatusId() {
      return getBigDecimal(START_PROPERTY_INDEX + 2);
   }

   public void setArStatusId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.sql.Timestamp getEventDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 3);
   }

   public void setEventDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getArRootDocument() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setArRootDocument(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getCurrentDocument() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setCurrentDocument(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.lang.String getReferenceDocument() {
      return getString(START_PROPERTY_INDEX + 6);
   }

   public void setReferenceDocument(java.lang.String value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.lang.String getAdditionalReference() {
      return getString(START_PROPERTY_INDEX + 7);
   }

   public void setAdditionalReference(java.lang.String value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.lang.String getCsArRootDocument() {
      return getString(START_PROPERTY_INDEX + 8);
   }

   public void setCsArRootDocument(java.lang.String value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.lang.String getDataSourceCode() {
      return getString(START_PROPERTY_INDEX + 9);
   }

   public void setDataSourceCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.lang.String getCreatedBy() {
      return getString(START_PROPERTY_INDEX + 10);
   }

   public void setCreatedBy(java.lang.String value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.sql.Timestamp getCreatedDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 11);
   }

   public void setCreatedDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public java.lang.String getModifiedBy() {
      return getString(START_PROPERTY_INDEX + 12);
   }

   public void setModifiedBy(java.lang.String value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }

   public java.sql.Timestamp getModifiedDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 13);
   }

   public void setModifiedDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 13 , value);
   }


}

