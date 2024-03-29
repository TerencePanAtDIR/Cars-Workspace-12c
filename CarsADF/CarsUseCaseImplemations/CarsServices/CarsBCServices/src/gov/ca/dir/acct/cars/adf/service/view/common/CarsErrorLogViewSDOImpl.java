package gov.ca.dir.acct.cars.adf.service.view.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class CarsErrorLogViewSDOImpl extends SDODataObject implements CarsErrorLogViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 17;

   public CarsErrorLogViewSDOImpl() {}

   public java.math.BigDecimal getErrorLogId() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setErrorLogId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getErrorLevel() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setErrorLevel(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getSeverity() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setSeverity(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getErrorDetail() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setErrorDetail(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getDataSourceCode() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setDataSourceCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getCreatedBy() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setCreatedBy(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.sql.Timestamp getCreatedDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 6);
   }

   public void setCreatedDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.lang.String getModifiedBy() {
      return getString(START_PROPERTY_INDEX + 7);
   }

   public void setModifiedBy(java.lang.String value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.sql.Timestamp getModifiedDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 8);
   }

   public void setModifiedDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.lang.String getErrorCode() {
      return getString(START_PROPERTY_INDEX + 9);
   }

   public void setErrorCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.lang.String getErrorMessage() {
      return getString(START_PROPERTY_INDEX + 10);
   }

   public void setErrorMessage(java.lang.String value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.lang.String getEcid() {
      return getString(START_PROPERTY_INDEX + 11);
   }

   public void setEcid(java.lang.String value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public java.lang.String getFaultLocation() {
      return getString(START_PROPERTY_INDEX + 12);
   }

   public void setFaultLocation(java.lang.String value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }

   public java.lang.String getConversationId() {
      return getString(START_PROPERTY_INDEX + 13);
   }

   public void setConversationId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 13 , value);
   }

   public java.lang.String getCompositeInstanceId() {
      return getString(START_PROPERTY_INDEX + 14);
   }

   public void setCompositeInstanceId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 14 , value);
   }

   public java.math.BigDecimal getComponentInstanceId() {
      return getBigDecimal(START_PROPERTY_INDEX + 15);
   }

   public void setComponentInstanceId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 15 , value);
   }

   public java.lang.String getComponentName() {
      return getString(START_PROPERTY_INDEX + 16);
   }

   public void setComponentName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 16 , value);
   }

   public java.lang.String getIsReviewed() {
      return getString(START_PROPERTY_INDEX + 17);
   }

   public void setIsReviewed(java.lang.String value) {
      set(START_PROPERTY_INDEX + 17 , value);
   }


}

