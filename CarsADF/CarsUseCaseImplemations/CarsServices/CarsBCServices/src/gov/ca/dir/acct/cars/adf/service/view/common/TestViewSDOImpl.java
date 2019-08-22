package gov.ca.dir.acct.cars.adf.service.view.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class TestViewSDOImpl extends SDODataObject implements TestViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 23;

   public TestViewSDOImpl() {}

   public java.math.BigDecimal getAccountingCodeId() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setAccountingCodeId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getAgencySourceCode() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setAgencySourceCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getCreatedBy() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setCreatedBy(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.sql.Date getCreatedDate() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 3);
   }

   public void setCreatedDate(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getDataSourceCode() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setDataSourceCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getDescription() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setDescription(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.lang.String getDocumentType() {
      return getString(START_PROPERTY_INDEX + 6);
   }

   public void setDocumentType(java.lang.String value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.sql.Date getEffectiveEndDate() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 7);
   }

   public void setEffectiveEndDate(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.sql.Date getEffectiveStartDate() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 8);
   }

   public void setEffectiveStartDate(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.lang.String getElement() {
      return getString(START_PROPERTY_INDEX + 9);
   }

   public void setElement(java.lang.String value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.math.BigDecimal getFundAllocationId() {
      return getBigDecimal(START_PROPERTY_INDEX + 10);
   }

   public void setFundAllocationId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.lang.String getIndexCode() {
      return getString(START_PROPERTY_INDEX + 11);
   }

   public void setIndexCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public java.lang.String getModifiedBy() {
      return getString(START_PROPERTY_INDEX + 12);
   }

   public void setModifiedBy(java.lang.String value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }

   public java.sql.Date getModifiedDate() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 13);
   }

   public void setModifiedDate(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 13 , value);
   }

   public java.lang.String getObjectCode() {
      return getString(START_PROPERTY_INDEX + 14);
   }

   public void setObjectCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 14 , value);
   }

   public java.lang.String getObjectDetail() {
      return getString(START_PROPERTY_INDEX + 15);
   }

   public void setObjectDetail(java.lang.String value) {
      set(START_PROPERTY_INDEX + 15 , value);
   }

   public java.lang.String getOriginalDocument() {
      return getString(START_PROPERTY_INDEX + 16);
   }

   public void setOriginalDocument(java.lang.String value) {
      set(START_PROPERTY_INDEX + 16 , value);
   }

   public java.lang.String getPcaActivity() {
      return getString(START_PROPERTY_INDEX + 17);
   }

   public void setPcaActivity(java.lang.String value) {
      set(START_PROPERTY_INDEX + 17 , value);
   }

   public java.lang.String getProgram() {
      return getString(START_PROPERTY_INDEX + 18);
   }

   public void setProgram(java.lang.String value) {
      set(START_PROPERTY_INDEX + 18 , value);
   }

   public java.lang.String getProjectNumber() {
      return getString(START_PROPERTY_INDEX + 19);
   }

   public void setProjectNumber(java.lang.String value) {
      set(START_PROPERTY_INDEX + 19 , value);
   }

   public java.lang.String getReferenceCode() {
      return getString(START_PROPERTY_INDEX + 20);
   }

   public void setReferenceCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 20 , value);
   }

   public java.lang.String getRevenueSourceCode() {
      return getString(START_PROPERTY_INDEX + 21);
   }

   public void setRevenueSourceCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 21 , value);
   }

   public java.lang.String getSubject() {
      return getString(START_PROPERTY_INDEX + 22);
   }

   public void setSubject(java.lang.String value) {
      set(START_PROPERTY_INDEX + 22 , value);
   }

   public java.lang.String getWorkPhase() {
      return getString(START_PROPERTY_INDEX + 23);
   }

   public void setWorkPhase(java.lang.String value) {
      set(START_PROPERTY_INDEX + 23 , value);
   }


}

