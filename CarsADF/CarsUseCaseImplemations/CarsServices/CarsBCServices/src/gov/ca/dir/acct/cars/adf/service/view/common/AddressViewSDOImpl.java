package gov.ca.dir.acct.cars.adf.service.view.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class AddressViewSDOImpl extends SDODataObject implements AddressViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 23;

   public AddressViewSDOImpl() {}

   public java.math.BigDecimal getAddressId() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setAddressId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.math.BigDecimal getPartyId() {
      return getBigDecimal(START_PROPERTY_INDEX + 1);
   }

   public void setPartyId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getAddressType() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setAddressType(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getStreetAddress() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setStreetAddress(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getAddressLine2() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setAddressLine2(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getAddressLine3() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setAddressLine3(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.lang.String getCity() {
      return getString(START_PROPERTY_INDEX + 6);
   }

   public void setCity(java.lang.String value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.lang.String getCountry() {
      return getString(START_PROPERTY_INDEX + 7);
   }

   public void setCountry(java.lang.String value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.lang.String getCountryAbbreviation() {
      return getString(START_PROPERTY_INDEX + 8);
   }

   public void setCountryAbbreviation(java.lang.String value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.lang.String getStateCode() {
      return getString(START_PROPERTY_INDEX + 9);
   }

   public void setStateCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.lang.String getState() {
      return getString(START_PROPERTY_INDEX + 10);
   }

   public void setState(java.lang.String value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.lang.String getZipCode() {
      return getString(START_PROPERTY_INDEX + 11);
   }

   public void setZipCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public java.lang.String getZip4() {
      return getString(START_PROPERTY_INDEX + 12);
   }

   public void setZip4(java.lang.String value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }

   public java.lang.String getCountyName() {
      return getString(START_PROPERTY_INDEX + 13);
   }

   public void setCountyName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 13 , value);
   }

   public java.lang.String getTown() {
      return getString(START_PROPERTY_INDEX + 14);
   }

   public void setTown(java.lang.String value) {
      set(START_PROPERTY_INDEX + 14 , value);
   }

   public java.lang.String getLocality() {
      return getString(START_PROPERTY_INDEX + 15);
   }

   public void setLocality(java.lang.String value) {
      set(START_PROPERTY_INDEX + 15 , value);
   }

   public java.lang.String getProvince() {
      return getString(START_PROPERTY_INDEX + 16);
   }

   public void setProvince(java.lang.String value) {
      set(START_PROPERTY_INDEX + 16 , value);
   }

   public java.lang.String getPostalCode() {
      return getString(START_PROPERTY_INDEX + 17);
   }

   public void setPostalCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 17 , value);
   }

   public java.math.BigDecimal getFsSequenceNumber() {
      return getBigDecimal(START_PROPERTY_INDEX + 18);
   }

   public void setFsSequenceNumber(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 18 , value);
   }

   public java.lang.String getDataSourceCode() {
      return getString(START_PROPERTY_INDEX + 19);
   }

   public void setDataSourceCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 19 , value);
   }

   public java.lang.String getCreatedBy() {
      return getString(START_PROPERTY_INDEX + 20);
   }

   public void setCreatedBy(java.lang.String value) {
      set(START_PROPERTY_INDEX + 20 , value);
   }

   public java.sql.Timestamp getCreatedDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 21);
   }

   public void setCreatedDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 21 , value);
   }

   public java.lang.String getModifiedBy() {
      return getString(START_PROPERTY_INDEX + 22);
   }

   public void setModifiedBy(java.lang.String value) {
      set(START_PROPERTY_INDEX + 22 , value);
   }

   public java.sql.Timestamp getModifiedDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 23);
   }

   public void setModifiedDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 23 , value);
   }


}

