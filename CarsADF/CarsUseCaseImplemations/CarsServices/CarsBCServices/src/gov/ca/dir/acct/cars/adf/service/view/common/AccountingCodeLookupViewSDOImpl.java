package gov.ca.dir.acct.cars.adf.service.view.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class AccountingCodeLookupViewSDOImpl extends SDODataObject implements AccountingCodeLookupViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 18;

   public AccountingCodeLookupViewSDOImpl() {}

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

   public java.lang.String getRevenueSourceCode() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setRevenueSourceCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getIndexCode() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setIndexCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.math.BigDecimal getAccountingCodeId1() {
      return getBigDecimal(START_PROPERTY_INDEX + 4);
   }

   public void setAccountingCodeId1(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.math.BigDecimal getAcctgEntryTypeId() {
      return getBigDecimal(START_PROPERTY_INDEX + 5);
   }

   public void setAcctgEntryTypeId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.lang.String getEventTypeCode() {
      return getString(START_PROPERTY_INDEX + 6);
   }

   public void setEventTypeCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.math.BigDecimal getEventTypeId() {
      return getBigDecimal(START_PROPERTY_INDEX + 7);
   }

   public void setEventTypeId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.math.BigDecimal getEventTypeId1() {
      return getBigDecimal(START_PROPERTY_INDEX + 8);
   }

   public void setEventTypeId1(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.lang.String getProgramUnitCode() {
      return getString(START_PROPERTY_INDEX + 9);
   }

   public void setProgramUnitCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.lang.String getAcctgTransactCode() {
      return getString(START_PROPERTY_INDEX + 10);
   }

   public void setAcctgTransactCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.math.BigDecimal getAcctgEntryTypeId1() {
      return getBigDecimal(START_PROPERTY_INDEX + 11);
   }

   public void setAcctgEntryTypeId1(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public java.math.BigDecimal getTransactionCodeOrder() {
      return getBigDecimal(START_PROPERTY_INDEX + 12);
   }

   public void setTransactionCodeOrder(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }

   public java.lang.String getPcaCode1() {
      return getString(START_PROPERTY_INDEX + 13);
   }

   public void setPcaCode1(java.lang.String value) {
      set(START_PROPERTY_INDEX + 13 , value);
   }

   public java.math.BigDecimal getFundAllocationId() {
      return getBigDecimal(START_PROPERTY_INDEX + 14);
   }

   public void setFundAllocationId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 14 , value);
   }

   public java.lang.String getFund1() {
      return getString(START_PROPERTY_INDEX + 15);
   }

   public void setFund1(java.lang.String value) {
      set(START_PROPERTY_INDEX + 15 , value);
   }

   public java.math.BigDecimal getFundId() {
      return getBigDecimal(START_PROPERTY_INDEX + 16);
   }

   public void setFundId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 16 , value);
   }

   public java.math.BigDecimal getFiscalPeriodId1() {
      return getBigDecimal(START_PROPERTY_INDEX + 17);
   }

   public void setFiscalPeriodId1(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 17 , value);
   }

   public java.math.BigDecimal getEntryReasonId() {
      return getBigDecimal(START_PROPERTY_INDEX + 18);
   }

   public void setEntryReasonId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 18 , value);
   }


}

