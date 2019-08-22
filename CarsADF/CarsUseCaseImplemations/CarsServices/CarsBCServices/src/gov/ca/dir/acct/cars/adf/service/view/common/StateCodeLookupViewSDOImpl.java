package gov.ca.dir.acct.cars.adf.service.view.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class StateCodeLookupViewSDOImpl extends SDODataObject implements StateCodeLookupViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 1;

   public StateCodeLookupViewSDOImpl() {}

   public java.lang.String getStateCode() {
      return getString(START_PROPERTY_INDEX + 0);
   }

   public void setStateCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getCountryCode() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setCountryCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }


}

