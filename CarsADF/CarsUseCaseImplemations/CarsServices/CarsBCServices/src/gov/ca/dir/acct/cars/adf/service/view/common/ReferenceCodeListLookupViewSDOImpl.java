package gov.ca.dir.acct.cars.adf.service.view.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class ReferenceCodeListLookupViewSDOImpl extends SDODataObject implements ReferenceCodeListLookupViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 5;

   public ReferenceCodeListLookupViewSDOImpl() {}

   public java.lang.String getReferenceCode() {
      return getString(START_PROPERTY_INDEX + 0);
   }

   public void setReferenceCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getRowID() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setRowID(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getReferenceValue() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setReferenceValue(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getDomainName() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setDomainName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.sql.Date getEffectiveEndDate() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 4);
   }

   public void setEffectiveEndDate(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getDescription() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setDescription(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }


}

