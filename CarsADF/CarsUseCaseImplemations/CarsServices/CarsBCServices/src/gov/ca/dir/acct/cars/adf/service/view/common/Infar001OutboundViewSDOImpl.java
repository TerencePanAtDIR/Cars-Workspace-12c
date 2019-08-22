package gov.ca.dir.acct.cars.adf.service.view.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class Infar001OutboundViewSDOImpl extends SDODataObject implements Infar001OutboundViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 108;

   public Infar001OutboundViewSDOImpl() {}

   public java.math.BigDecimal getBatchId() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setBatchId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.math.BigDecimal getInfar001OutboundId() {
      return getBigDecimal(START_PROPERTY_INDEX + 1);
   }

   public void setInfar001OutboundId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getAccount() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setAccount(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.sql.Date getAccountingDt() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 3);
   }

   public void setAccountingDt(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.math.BigDecimal getAcctgEntryId() {
      return getBigDecimal(START_PROPERTY_INDEX + 4);
   }

   public void setAcctgEntryId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getActivityId() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setActivityId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.lang.String getAffiliate() {
      return getString(START_PROPERTY_INDEX + 6);
   }

   public void setAffiliate(java.lang.String value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.lang.String getAffiliateIntra1() {
      return getString(START_PROPERTY_INDEX + 7);
   }

   public void setAffiliateIntra1(java.lang.String value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.lang.String getAffiliateIntra2() {
      return getString(START_PROPERTY_INDEX + 8);
   }

   public void setAffiliateIntra2(java.lang.String value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.lang.String getAgencyObject() {
      return getString(START_PROPERTY_INDEX + 9);
   }

   public void setAgencyObject(java.lang.String value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.lang.String getAgencySource() {
      return getString(START_PROPERTY_INDEX + 10);
   }

   public void setAgencySource(java.lang.String value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.lang.String getAltacct() {
      return getString(START_PROPERTY_INDEX + 11);
   }

   public void setAltacct(java.lang.String value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public java.lang.String getAnalysisType() {
      return getString(START_PROPERTY_INDEX + 12);
   }

   public void setAnalysisType(java.lang.String value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }

   public java.lang.String getAppropriationSymbol() {
      return getString(START_PROPERTY_INDEX + 13);
   }

   public void setAppropriationSymbol(java.lang.String value) {
      set(START_PROPERTY_INDEX + 13 , value);
   }

   public java.lang.String getBankAcctKey() {
      return getString(START_PROPERTY_INDEX + 14);
   }

   public void setBankAcctKey(java.lang.String value) {
      set(START_PROPERTY_INDEX + 14 , value);
   }

   public java.lang.String getBankCd() {
      return getString(START_PROPERTY_INDEX + 15);
   }

   public void setBankCd(java.lang.String value) {
      set(START_PROPERTY_INDEX + 15 , value);
   }

   public java.sql.Date getBudgetDt() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 16);
   }

   public void setBudgetDt(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 16 , value);
   }

   public java.lang.String getBudgetRef() {
      return getString(START_PROPERTY_INDEX + 17);
   }

   public void setBudgetRef(java.lang.String value) {
      set(START_PROPERTY_INDEX + 17 , value);
   }

   public java.lang.String getBusinessUnitGl() {
      return getString(START_PROPERTY_INDEX + 18);
   }

   public void setBusinessUnitGl(java.lang.String value) {
      set(START_PROPERTY_INDEX + 18 , value);
   }

   public java.lang.String getBusinessUnitPc() {
      return getString(START_PROPERTY_INDEX + 19);
   }

   public void setBusinessUnitPc(java.lang.String value) {
      set(START_PROPERTY_INDEX + 19 , value);
   }

   public java.lang.String getCharacter() {
      return getString(START_PROPERTY_INDEX + 20);
   }

   public void setCharacter(java.lang.String value) {
      set(START_PROPERTY_INDEX + 20 , value);
   }

   public java.lang.String getChartfield1() {
      return getString(START_PROPERTY_INDEX + 21);
   }

   public void setChartfield1(java.lang.String value) {
      set(START_PROPERTY_INDEX + 21 , value);
   }

   public java.lang.String getChartfield2() {
      return getString(START_PROPERTY_INDEX + 22);
   }

   public void setChartfield2(java.lang.String value) {
      set(START_PROPERTY_INDEX + 22 , value);
   }

   public java.lang.String getChartfield3() {
      return getString(START_PROPERTY_INDEX + 23);
   }

   public void setChartfield3(java.lang.String value) {
      set(START_PROPERTY_INDEX + 23 , value);
   }

   public java.sql.Date getCheckDt() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 24);
   }

   public void setCheckDt(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 24 , value);
   }

   public java.lang.String getCity() {
      return getString(START_PROPERTY_INDEX + 25);
   }

   public void setCity(java.lang.String value) {
      set(START_PROPERTY_INDEX + 25 , value);
   }

   public java.lang.String getClassFld() {
      return getString(START_PROPERTY_INDEX + 26);
   }

   public void setClassFld(java.lang.String value) {
      set(START_PROPERTY_INDEX + 26 , value);
   }

   public java.lang.String getComponent1() {
      return getString(START_PROPERTY_INDEX + 27);
   }

   public void setComponent1(java.lang.String value) {
      set(START_PROPERTY_INDEX + 27 , value);
   }

   public java.math.BigDecimal getControlAmt() {
      return getBigDecimal(START_PROPERTY_INDEX + 28);
   }

   public void setControlAmt(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 28 , value);
   }

   public java.lang.Integer getControlCnt() {
      return new Integer(getInt(START_PROPERTY_INDEX + 29));
   }

   public void setControlCnt(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 29 , value);
   }

   public java.lang.String getControlCurrency() {
      return getString(START_PROPERTY_INDEX + 30);
   }

   public void setControlCurrency(java.lang.String value) {
      set(START_PROPERTY_INDEX + 30 , value);
   }

   public java.lang.String getCounty() {
      return getString(START_PROPERTY_INDEX + 31);
   }

   public void setCounty(java.lang.String value) {
      set(START_PROPERTY_INDEX + 31 , value);
   }

   public java.lang.String getCreatedBy() {
      return getString(START_PROPERTY_INDEX + 32);
   }

   public void setCreatedBy(java.lang.String value) {
      set(START_PROPERTY_INDEX + 32 , value);
   }

   public java.sql.Timestamp getCreatedDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 33);
   }

   public void setCreatedDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 33 , value);
   }

   public java.sql.Date getCreatedDttm() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 34);
   }

   public void setCreatedDttm(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 34 , value);
   }

   public java.lang.String getCustId() {
      return getString(START_PROPERTY_INDEX + 35);
   }

   public void setCustId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 35 , value);
   }

   public java.lang.String getDataSourceCode() {
      return getString(START_PROPERTY_INDEX + 36);
   }

   public void setDataSourceCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 36 , value);
   }

   public java.lang.String getDepositBu() {
      return getString(START_PROPERTY_INDEX + 37);
   }

   public void setDepositBu(java.lang.String value) {
      set(START_PROPERTY_INDEX + 37 , value);
   }

   public java.lang.Integer getDepositCnt() {
      return new Integer(getInt(START_PROPERTY_INDEX + 38));
   }

   public void setDepositCnt(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 38 , value);
   }

   public java.lang.String getDepositId() {
      return getString(START_PROPERTY_INDEX + 39);
   }

   public void setDepositId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 39 , value);
   }

   public java.lang.String getDepositType() {
      return getString(START_PROPERTY_INDEX + 40);
   }

   public void setDepositType(java.lang.String value) {
      set(START_PROPERTY_INDEX + 40 , value);
   }

   public java.lang.String getDeptUse1() {
      return getString(START_PROPERTY_INDEX + 41);
   }

   public void setDeptUse1(java.lang.String value) {
      set(START_PROPERTY_INDEX + 41 , value);
   }

   public java.lang.String getDeptUse2() {
      return getString(START_PROPERTY_INDEX + 42);
   }

   public void setDeptUse2(java.lang.String value) {
      set(START_PROPERTY_INDEX + 42 , value);
   }

   public java.lang.String getDeptid() {
      return getString(START_PROPERTY_INDEX + 43);
   }

   public void setDeptid(java.lang.String value) {
      set(START_PROPERTY_INDEX + 43 , value);
   }

   public java.lang.String getDescr50Mixed() {
      return getString(START_PROPERTY_INDEX + 44);
   }

   public void setDescr50Mixed(java.lang.String value) {
      set(START_PROPERTY_INDEX + 44 , value);
   }

   public java.lang.String getDocument() {
      return getString(START_PROPERTY_INDEX + 45);
   }

   public void setDocument(java.lang.String value) {
      set(START_PROPERTY_INDEX + 45 , value);
   }

   public java.lang.Integer getDstSeqNum() {
      return new Integer(getInt(START_PROPERTY_INDEX + 46));
   }

   public void setDstSeqNum(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 46 , value);
   }

   public java.lang.String getElement() {
      return getString(START_PROPERTY_INDEX + 47);
   }

   public void setElement(java.lang.String value) {
      set(START_PROPERTY_INDEX + 47 , value);
   }

   public java.lang.String getFfy() {
      return getString(START_PROPERTY_INDEX + 48);
   }

   public void setFfy(java.lang.String value) {
      set(START_PROPERTY_INDEX + 48 , value);
   }

   public java.lang.String getFund() {
      return getString(START_PROPERTY_INDEX + 49);
   }

   public void setFund(java.lang.String value) {
      set(START_PROPERTY_INDEX + 49 , value);
   }

   public java.lang.String getFundCode() {
      return getString(START_PROPERTY_INDEX + 50);
   }

   public void setFundCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 50 , value);
   }

   public java.lang.String getFundSource() {
      return getString(START_PROPERTY_INDEX + 51);
   }

   public void setFundSource(java.lang.String value) {
      set(START_PROPERTY_INDEX + 51 , value);
   }

   public java.lang.String getGlAccount() {
      return getString(START_PROPERTY_INDEX + 52);
   }

   public void setGlAccount(java.lang.String value) {
      set(START_PROPERTY_INDEX + 52 , value);
   }

   public java.lang.Integer getIdSeqNum() {
      return new Integer(getInt(START_PROPERTY_INDEX + 53));
   }

   public void setIdSeqNum(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 53 , value);
   }

   public java.lang.String getIndexCode() {
      return getString(START_PROPERTY_INDEX + 54);
   }

   public void setIndexCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 54 , value);
   }

   public java.lang.String getInternalOrgStructure1() {
      return getString(START_PROPERTY_INDEX + 55);
   }

   public void setInternalOrgStructure1(java.lang.String value) {
      set(START_PROPERTY_INDEX + 55 , value);
   }

   public java.lang.String getInternalOrgStructure2() {
      return getString(START_PROPERTY_INDEX + 56);
   }

   public void setInternalOrgStructure2(java.lang.String value) {
      set(START_PROPERTY_INDEX + 56 , value);
   }

   public java.lang.String getInternalOrgStructure3() {
      return getString(START_PROPERTY_INDEX + 57);
   }

   public void setInternalOrgStructure3(java.lang.String value) {
      set(START_PROPERTY_INDEX + 57 , value);
   }

   public java.lang.String getInternalOrgStructure4() {
      return getString(START_PROPERTY_INDEX + 58);
   }

   public void setInternalOrgStructure4(java.lang.String value) {
      set(START_PROPERTY_INDEX + 58 , value);
   }

   public java.lang.String getInternalOrgStructure5() {
      return getString(START_PROPERTY_INDEX + 59);
   }

   public void setInternalOrgStructure5(java.lang.String value) {
      set(START_PROPERTY_INDEX + 59 , value);
   }

   public java.lang.String getLineDescr() {
      return getString(START_PROPERTY_INDEX + 60);
   }

   public void setLineDescr(java.lang.String value) {
      set(START_PROPERTY_INDEX + 60 , value);
   }

   public java.lang.String getLineNoteText() {
      return getString(START_PROPERTY_INDEX + 61);
   }

   public void setLineNoteText(java.lang.String value) {
      set(START_PROPERTY_INDEX + 61 , value);
   }

   public java.lang.String getLocation() {
      return getString(START_PROPERTY_INDEX + 62);
   }

   public void setLocation(java.lang.String value) {
      set(START_PROPERTY_INDEX + 62 , value);
   }

   public java.lang.String getMethod() {
      return getString(START_PROPERTY_INDEX + 63);
   }

   public void setMethod(java.lang.String value) {
      set(START_PROPERTY_INDEX + 63 , value);
   }

   public java.lang.String getMiscPayment() {
      return getString(START_PROPERTY_INDEX + 64);
   }

   public void setMiscPayment(java.lang.String value) {
      set(START_PROPERTY_INDEX + 64 , value);
   }

   public java.lang.String getModifiedBy() {
      return getString(START_PROPERTY_INDEX + 65);
   }

   public void setModifiedBy(java.lang.String value) {
      set(START_PROPERTY_INDEX + 65 , value);
   }

   public java.sql.Timestamp getModifiedDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 66);
   }

   public void setModifiedDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 66 , value);
   }

   public java.math.BigDecimal getMonetaryAmount() {
      return getBigDecimal(START_PROPERTY_INDEX + 67);
   }

   public void setMonetaryAmount(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 67 , value);
   }

   public java.lang.String getMultipurpose() {
      return getString(START_PROPERTY_INDEX + 68);
   }

   public void setMultipurpose(java.lang.String value) {
      set(START_PROPERTY_INDEX + 68 , value);
   }

   public java.lang.String getNoteText() {
      return getString(START_PROPERTY_INDEX + 69);
   }

   public void setNoteText(java.lang.String value) {
      set(START_PROPERTY_INDEX + 69 , value);
   }

   public java.lang.String getObjectDetail() {
      return getString(START_PROPERTY_INDEX + 70);
   }

   public void setObjectDetail(java.lang.String value) {
      set(START_PROPERTY_INDEX + 70 , value);
   }

   public java.lang.String getOpenItemKey() {
      return getString(START_PROPERTY_INDEX + 71);
   }

   public void setOpenItemKey(java.lang.String value) {
      set(START_PROPERTY_INDEX + 71 , value);
   }

   public java.lang.String getOperatingUnit() {
      return getString(START_PROPERTY_INDEX + 72);
   }

   public void setOperatingUnit(java.lang.String value) {
      set(START_PROPERTY_INDEX + 72 , value);
   }

   public java.lang.String getOrgCode() {
      return getString(START_PROPERTY_INDEX + 73);
   }

   public void setOrgCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 73 , value);
   }

   public java.math.BigDecimal getPaymentAmt() {
      return getBigDecimal(START_PROPERTY_INDEX + 74);
   }

   public void setPaymentAmt(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 74 , value);
   }

   public java.lang.String getPaymentCurrency() {
      return getString(START_PROPERTY_INDEX + 75);
   }

   public void setPaymentCurrency(java.lang.String value) {
      set(START_PROPERTY_INDEX + 75 , value);
   }

   public java.lang.String getPaymentId() {
      return getString(START_PROPERTY_INDEX + 76);
   }

   public void setPaymentId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 76 , value);
   }

   public java.lang.Integer getPaymentSeqNum() {
      return new Integer(getInt(START_PROPERTY_INDEX + 77));
   }

   public void setPaymentSeqNum(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 77 , value);
   }

   public java.lang.String getPca() {
      return getString(START_PROPERTY_INDEX + 78);
   }

   public void setPca(java.lang.String value) {
      set(START_PROPERTY_INDEX + 78 , value);
   }

   public java.lang.String getPpSw() {
      return getString(START_PROPERTY_INDEX + 79);
   }

   public void setPpSw(java.lang.String value) {
      set(START_PROPERTY_INDEX + 79 , value);
   }

   public java.lang.String getProduct() {
      return getString(START_PROPERTY_INDEX + 80);
   }

   public void setProduct(java.lang.String value) {
      set(START_PROPERTY_INDEX + 80 , value);
   }

   public java.lang.String getProgram() {
      return getString(START_PROPERTY_INDEX + 81);
   }

   public void setProgram(java.lang.String value) {
      set(START_PROPERTY_INDEX + 81 , value);
   }

   public java.lang.String getProgramCode() {
      return getString(START_PROPERTY_INDEX + 82);
   }

   public void setProgramCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 82 , value);
   }

   public java.lang.String getProject() {
      return getString(START_PROPERTY_INDEX + 83);
   }

   public void setProject(java.lang.String value) {
      set(START_PROPERTY_INDEX + 83 , value);
   }

   public java.lang.String getProjectId() {
      return getString(START_PROPERTY_INDEX + 84);
   }

   public void setProjectId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 84 , value);
   }

   public java.sql.Date getReceivedDt() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 85);
   }

   public void setReceivedDt(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 85 , value);
   }

   public java.lang.String getRefQualifierCode() {
      return getString(START_PROPERTY_INDEX + 86);
   }

   public void setRefQualifierCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 86 , value);
   }

   public java.lang.String getRefValue() {
      return getString(START_PROPERTY_INDEX + 87);
   }

   public void setRefValue(java.lang.String value) {
      set(START_PROPERTY_INDEX + 87 , value);
   }

   public java.lang.String getReference() {
      return getString(START_PROPERTY_INDEX + 88);
   }

   public void setReference(java.lang.String value) {
      set(START_PROPERTY_INDEX + 88 , value);
   }

   public java.lang.String getResourceCategory() {
      return getString(START_PROPERTY_INDEX + 89);
   }

   public void setResourceCategory(java.lang.String value) {
      set(START_PROPERTY_INDEX + 89 , value);
   }

   public java.lang.String getResourceSubCat() {
      return getString(START_PROPERTY_INDEX + 90);
   }

   public void setResourceSubCat(java.lang.String value) {
      set(START_PROPERTY_INDEX + 90 , value);
   }

   public java.lang.String getResourceType() {
      return getString(START_PROPERTY_INDEX + 91);
   }

   public void setResourceType(java.lang.String value) {
      set(START_PROPERTY_INDEX + 91 , value);
   }

   public java.lang.String getSource() {
      return getString(START_PROPERTY_INDEX + 92);
   }

   public void setSource(java.lang.String value) {
      set(START_PROPERTY_INDEX + 92 , value);
   }

   public java.lang.String getSpeedchartKey() {
      return getString(START_PROPERTY_INDEX + 93);
   }

   public void setSpeedchartKey(java.lang.String value) {
      set(START_PROPERTY_INDEX + 93 , value);
   }

   public java.lang.String getStatus() {
      return getString(START_PROPERTY_INDEX + 94);
   }

   public void setStatus(java.lang.String value) {
      set(START_PROPERTY_INDEX + 94 , value);
   }

   public java.lang.String getSubfund() {
      return getString(START_PROPERTY_INDEX + 95);
   }

   public void setSubfund(java.lang.String value) {
      set(START_PROPERTY_INDEX + 95 , value);
   }

   public java.lang.String getSubsidiary() {
      return getString(START_PROPERTY_INDEX + 96);
   }

   public void setSubsidiary(java.lang.String value) {
      set(START_PROPERTY_INDEX + 96 , value);
   }

   public java.lang.String getTask() {
      return getString(START_PROPERTY_INDEX + 97);
   }

   public void setTask(java.lang.String value) {
      set(START_PROPERTY_INDEX + 97 , value);
   }

   public java.math.BigDecimal getTaxAmt() {
      return getBigDecimal(START_PROPERTY_INDEX + 98);
   }

   public void setTaxAmt(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 98 , value);
   }

   public java.math.BigDecimal getTotalAmt() {
      return getBigDecimal(START_PROPERTY_INDEX + 99);
   }

   public void setTotalAmt(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 99 , value);
   }

   public java.lang.String getWorkPhase() {
      return getString(START_PROPERTY_INDEX + 100);
   }

   public void setWorkPhase(java.lang.String value) {
      set(START_PROPERTY_INDEX + 100 , value);
   }

   public java.lang.String getYear() {
      return getString(START_PROPERTY_INDEX + 101);
   }

   public void setYear(java.lang.String value) {
      set(START_PROPERTY_INDEX + 101 , value);
   }

   public java.lang.String getZzBnkDepositNum() {
      return getString(START_PROPERTY_INDEX + 102);
   }

   public void setZzBnkDepositNum(java.lang.String value) {
      set(START_PROPERTY_INDEX + 102 , value);
   }

   public java.lang.String getZzCashType() {
      return getString(START_PROPERTY_INDEX + 103);
   }

   public void setZzCashType(java.lang.String value) {
      set(START_PROPERTY_INDEX + 103 , value);
   }

   public java.lang.String getZzIdentifier() {
      return getString(START_PROPERTY_INDEX + 104);
   }

   public void setZzIdentifier(java.lang.String value) {
      set(START_PROPERTY_INDEX + 104 , value);
   }

   public java.lang.String getZzPaymentMethod() {
      return getString(START_PROPERTY_INDEX + 105);
   }

   public void setZzPaymentMethod(java.lang.String value) {
      set(START_PROPERTY_INDEX + 105 , value);
   }

   public java.lang.String getZzReceivedBySco() {
      return getString(START_PROPERTY_INDEX + 106);
   }

   public void setZzReceivedBySco(java.lang.String value) {
      set(START_PROPERTY_INDEX + 106 , value);
   }

   public java.lang.String getProgramUnitCode() {
      return getString(START_PROPERTY_INDEX + 107);
   }

   public void setProgramUnitCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 107 , value);
   }

   public java.lang.String getFsRowId() {
      return getString(START_PROPERTY_INDEX + 108);
   }

   public void setFsRowId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 108 , value);
   }


}

