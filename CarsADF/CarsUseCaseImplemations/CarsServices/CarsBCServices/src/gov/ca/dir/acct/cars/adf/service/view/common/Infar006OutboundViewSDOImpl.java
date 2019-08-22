package gov.ca.dir.acct.cars.adf.service.view.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class Infar006OutboundViewSDOImpl extends SDODataObject implements Infar006OutboundViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 104;

   public Infar006OutboundViewSDOImpl() {}

   public java.math.BigDecimal getBatchId() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setBatchId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.math.BigDecimal getInfar006OutboundId() {
      return getBigDecimal(START_PROPERTY_INDEX + 1);
   }

   public void setInfar006OutboundId(java.math.BigDecimal value) {
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

   public java.lang.Integer getAddressSeqNum() {
      return new Integer(getInt(START_PROPERTY_INDEX + 6));
   }

   public void setAddressSeqNum(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.lang.String getAffiliate() {
      return getString(START_PROPERTY_INDEX + 7);
   }

   public void setAffiliate(java.lang.String value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.lang.String getAffiliateIntra1() {
      return getString(START_PROPERTY_INDEX + 8);
   }

   public void setAffiliateIntra1(java.lang.String value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.lang.String getAffiliateIntra2() {
      return getString(START_PROPERTY_INDEX + 9);
   }

   public void setAffiliateIntra2(java.lang.String value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.lang.String getAltacct() {
      return getString(START_PROPERTY_INDEX + 10);
   }

   public void setAltacct(java.lang.String value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.lang.String getAnalysisType() {
      return getString(START_PROPERTY_INDEX + 11);
   }

   public void setAnalysisType(java.lang.String value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public java.sql.Date getAsofDt() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 12);
   }

   public void setAsofDt(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }

   public java.sql.Date getBudgetDt() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 13);
   }

   public void setBudgetDt(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 13 , value);
   }

   public java.lang.String getBudgetRef() {
      return getString(START_PROPERTY_INDEX + 14);
   }

   public void setBudgetRef(java.lang.String value) {
      set(START_PROPERTY_INDEX + 14 , value);
   }

   public java.lang.String getBusinessUnitGl() {
      return getString(START_PROPERTY_INDEX + 15);
   }

   public void setBusinessUnitGl(java.lang.String value) {
      set(START_PROPERTY_INDEX + 15 , value);
   }

   public java.lang.String getBusinessUnitPc() {
      return getString(START_PROPERTY_INDEX + 16);
   }

   public void setBusinessUnitPc(java.lang.String value) {
      set(START_PROPERTY_INDEX + 16 , value);
   }

   public java.lang.String getChartfield1() {
      return getString(START_PROPERTY_INDEX + 17);
   }

   public void setChartfield1(java.lang.String value) {
      set(START_PROPERTY_INDEX + 17 , value);
   }

   public java.lang.String getChartfield2() {
      return getString(START_PROPERTY_INDEX + 18);
   }

   public void setChartfield2(java.lang.String value) {
      set(START_PROPERTY_INDEX + 18 , value);
   }

   public java.lang.String getChartfield3() {
      return getString(START_PROPERTY_INDEX + 19);
   }

   public void setChartfield3(java.lang.String value) {
      set(START_PROPERTY_INDEX + 19 , value);
   }

   public java.lang.String getClassFld() {
      return getString(START_PROPERTY_INDEX + 20);
   }

   public void setClassFld(java.lang.String value) {
      set(START_PROPERTY_INDEX + 20 , value);
   }

   public java.lang.String getCollectionChkbox() {
      return getString(START_PROPERTY_INDEX + 21);
   }

   public void setCollectionChkbox(java.lang.String value) {
      set(START_PROPERTY_INDEX + 21 , value);
   }

   public java.sql.Date getCollectionDt() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 22);
   }

   public void setCollectionDt(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 22 , value);
   }

   public java.lang.String getCollectionStatus() {
      return getString(START_PROPERTY_INDEX + 23);
   }

   public void setCollectionStatus(java.lang.String value) {
      set(START_PROPERTY_INDEX + 23 , value);
   }

   public java.lang.String getCollector() {
      return getString(START_PROPERTY_INDEX + 24);
   }

   public void setCollector(java.lang.String value) {
      set(START_PROPERTY_INDEX + 24 , value);
   }

   public java.lang.String getContractNum() {
      return getString(START_PROPERTY_INDEX + 25);
   }

   public void setContractNum(java.lang.String value) {
      set(START_PROPERTY_INDEX + 25 , value);
   }

   public java.math.BigDecimal getControlAmt() {
      return getBigDecimal(START_PROPERTY_INDEX + 26);
   }

   public void setControlAmt(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 26 , value);
   }

   public java.lang.Integer getControlCnt() {
      return new Integer(getInt(START_PROPERTY_INDEX + 27));
   }

   public void setControlCnt(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 27 , value);
   }

   public java.lang.String getCrAnalyst() {
      return getString(START_PROPERTY_INDEX + 28);
   }

   public void setCrAnalyst(java.lang.String value) {
      set(START_PROPERTY_INDEX + 28 , value);
   }

   public java.lang.String getCreatedBy() {
      return getString(START_PROPERTY_INDEX + 29);
   }

   public void setCreatedBy(java.lang.String value) {
      set(START_PROPERTY_INDEX + 29 , value);
   }

   public java.sql.Date getCreatedDate() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 30);
   }

   public void setCreatedDate(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 30 , value);
   }

   public java.lang.String getCustId() {
      return getString(START_PROPERTY_INDEX + 31);
   }

   public void setCustId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 31 , value);
   }

   public java.lang.String getDataSourceCode() {
      return getString(START_PROPERTY_INDEX + 32);
   }

   public void setDataSourceCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 32 , value);
   }

   public java.lang.String getDeptid() {
      return getString(START_PROPERTY_INDEX + 33);
   }

   public void setDeptid(java.lang.String value) {
      set(START_PROPERTY_INDEX + 33 , value);
   }

   public java.math.BigDecimal getDisputeAmount() {
      return getBigDecimal(START_PROPERTY_INDEX + 34);
   }

   public void setDisputeAmount(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 34 , value);
   }

   public java.lang.String getDisputeChkbox() {
      return getString(START_PROPERTY_INDEX + 35);
   }

   public void setDisputeChkbox(java.lang.String value) {
      set(START_PROPERTY_INDEX + 35 , value);
   }

   public java.sql.Date getDisputeDate() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 36);
   }

   public void setDisputeDate(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 36 , value);
   }

   public java.lang.String getDisputeStatus() {
      return getString(START_PROPERTY_INDEX + 37);
   }

   public void setDisputeStatus(java.lang.String value) {
      set(START_PROPERTY_INDEX + 37 , value);
   }

   public java.lang.String getDocument() {
      return getString(START_PROPERTY_INDEX + 38);
   }

   public void setDocument(java.lang.String value) {
      set(START_PROPERTY_INDEX + 38 , value);
   }

   public java.lang.Integer getDstSeqNum() {
      return new Integer(getInt(START_PROPERTY_INDEX + 39));
   }

   public void setDstSeqNum(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 39 , value);
   }

   public java.sql.Date getDueDt() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 40);
   }

   public void setDueDt(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 40 , value);
   }

   public java.math.BigDecimal getEntryAmt() {
      return getBigDecimal(START_PROPERTY_INDEX + 41);
   }

   public void setEntryAmt(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 41 , value);
   }

   public java.lang.String getEntryReason() {
      return getString(START_PROPERTY_INDEX + 42);
   }

   public void setEntryReason(java.lang.String value) {
      set(START_PROPERTY_INDEX + 42 , value);
   }

   public java.lang.String getEntryType() {
      return getString(START_PROPERTY_INDEX + 43);
   }

   public void setEntryType(java.lang.String value) {
      set(START_PROPERTY_INDEX + 43 , value);
   }

   public java.lang.String getFundCode() {
      return getString(START_PROPERTY_INDEX + 44);
   }

   public void setFundCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 44 , value);
   }

   public java.lang.String getGroupBu() {
      return getString(START_PROPERTY_INDEX + 45);
   }

   public void setGroupBu(java.lang.String value) {
      set(START_PROPERTY_INDEX + 45 , value);
   }

   public java.lang.String getGroupIdStg() {
      return getString(START_PROPERTY_INDEX + 46);
   }

   public void setGroupIdStg(java.lang.String value) {
      set(START_PROPERTY_INDEX + 46 , value);
   }

   public java.lang.Integer getGroupSeqNum() {
      return new Integer(getInt(START_PROPERTY_INDEX + 47));
   }

   public void setGroupSeqNum(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 47 , value);
   }

   public java.lang.String getGroupType() {
      return getString(START_PROPERTY_INDEX + 48);
   }

   public void setGroupType(java.lang.String value) {
      set(START_PROPERTY_INDEX + 48 , value);
   }

   public java.lang.String getItem() {
      return getString(START_PROPERTY_INDEX + 49);
   }

   public void setItem(java.lang.String value) {
      set(START_PROPERTY_INDEX + 49 , value);
   }

   public java.lang.Integer getItemLine() {
      return new Integer(getInt(START_PROPERTY_INDEX + 50));
   }

   public void setItemLine(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 50 , value);
   }

   public java.lang.String getModifiedBy() {
      return getString(START_PROPERTY_INDEX + 51);
   }

   public void setModifiedBy(java.lang.String value) {
      set(START_PROPERTY_INDEX + 51 , value);
   }

   public java.sql.Date getModifiedDate() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 52);
   }

   public void setModifiedDate(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 52 , value);
   }

   public java.math.BigDecimal getMonetaryAmount() {
      return getBigDecimal(START_PROPERTY_INDEX + 53);
   }

   public void setMonetaryAmount(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 53 , value);
   }

   public java.lang.String getNoteText() {
      return getString(START_PROPERTY_INDEX + 54);
   }

   public void setNoteText(java.lang.String value) {
      set(START_PROPERTY_INDEX + 54 , value);
   }

   public java.lang.String getOperatingUnit() {
      return getString(START_PROPERTY_INDEX + 55);
   }

   public void setOperatingUnit(java.lang.String value) {
      set(START_PROPERTY_INDEX + 55 , value);
   }

   public java.lang.String getPoRef() {
      return getString(START_PROPERTY_INDEX + 56);
   }

   public void setPoRef(java.lang.String value) {
      set(START_PROPERTY_INDEX + 56 , value);
   }

   public java.lang.String getPostAction() {
      return getString(START_PROPERTY_INDEX + 57);
   }

   public void setPostAction(java.lang.String value) {
      set(START_PROPERTY_INDEX + 57 , value);
   }

   public java.lang.String getProduct() {
      return getString(START_PROPERTY_INDEX + 58);
   }

   public void setProduct(java.lang.String value) {
      set(START_PROPERTY_INDEX + 58 , value);
   }

   public java.lang.String getProgramCode() {
      return getString(START_PROPERTY_INDEX + 59);
   }

   public void setProgramCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 59 , value);
   }

   public java.lang.String getProjectId() {
      return getString(START_PROPERTY_INDEX + 60);
   }

   public void setProjectId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 60 , value);
   }

   public java.lang.String getPymntTermsCd() {
      return getString(START_PROPERTY_INDEX + 61);
   }

   public void setPymntTermsCd(java.lang.String value) {
      set(START_PROPERTY_INDEX + 61 , value);
   }

   public java.lang.String getResourceCategory() {
      return getString(START_PROPERTY_INDEX + 62);
   }

   public void setResourceCategory(java.lang.String value) {
      set(START_PROPERTY_INDEX + 62 , value);
   }

   public java.lang.String getResourceSubCat() {
      return getString(START_PROPERTY_INDEX + 63);
   }

   public void setResourceSubCat(java.lang.String value) {
      set(START_PROPERTY_INDEX + 63 , value);
   }

   public java.lang.String getResourceType() {
      return getString(START_PROPERTY_INDEX + 64);
   }

   public void setResourceType(java.lang.String value) {
      set(START_PROPERTY_INDEX + 64 , value);
   }

   public java.lang.String getStatus() {
      return getString(START_PROPERTY_INDEX + 65);
   }

   public void setStatus(java.lang.String value) {
      set(START_PROPERTY_INDEX + 65 , value);
   }

   public java.lang.String getSystemDefined() {
      return getString(START_PROPERTY_INDEX + 66);
   }

   public void setSystemDefined(java.lang.String value) {
      set(START_PROPERTY_INDEX + 66 , value);
   }

   public java.sql.Date getUserDt1() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 67);
   }

   public void setUserDt1(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 67 , value);
   }

   public java.sql.Date getUserDt2() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 68);
   }

   public void setUserDt2(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 68 , value);
   }

   public java.sql.Date getUserDt3() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 69);
   }

   public void setUserDt3(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 69 , value);
   }

   public java.sql.Date getUserDt4() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 70);
   }

   public void setUserDt4(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 70 , value);
   }

   public java.lang.String getZzAgncyObj() {
      return getString(START_PROPERTY_INDEX + 71);
   }

   public void setZzAgncyObj(java.lang.String value) {
      set(START_PROPERTY_INDEX + 71 , value);
   }

   public java.lang.String getZzAgncySrc() {
      return getString(START_PROPERTY_INDEX + 72);
   }

   public void setZzAgncySrc(java.lang.String value) {
      set(START_PROPERTY_INDEX + 72 , value);
   }

   public java.lang.String getZzAppropSymb() {
      return getString(START_PROPERTY_INDEX + 73);
   }

   public void setZzAppropSymb(java.lang.String value) {
      set(START_PROPERTY_INDEX + 73 , value);
   }

   public java.lang.String getZzCharacter() {
      return getString(START_PROPERTY_INDEX + 74);
   }

   public void setZzCharacter(java.lang.String value) {
      set(START_PROPERTY_INDEX + 74 , value);
   }

   public java.lang.String getZzComponent() {
      return getString(START_PROPERTY_INDEX + 75);
   }

   public void setZzComponent(java.lang.String value) {
      set(START_PROPERTY_INDEX + 75 , value);
   }

   public java.lang.String getZzDeptUse1() {
      return getString(START_PROPERTY_INDEX + 76);
   }

   public void setZzDeptUse1(java.lang.String value) {
      set(START_PROPERTY_INDEX + 76 , value);
   }

   public java.lang.String getZzDeptUse2() {
      return getString(START_PROPERTY_INDEX + 77);
   }

   public void setZzDeptUse2(java.lang.String value) {
      set(START_PROPERTY_INDEX + 77 , value);
   }

   public java.lang.String getZzElement() {
      return getString(START_PROPERTY_INDEX + 78);
   }

   public void setZzElement(java.lang.String value) {
      set(START_PROPERTY_INDEX + 78 , value);
   }

   public java.lang.String getZzEnactmentYear() {
      return getString(START_PROPERTY_INDEX + 79);
   }

   public void setZzEnactmentYear(java.lang.String value) {
      set(START_PROPERTY_INDEX + 79 , value);
   }

   public java.lang.String getZzFiscalYear() {
      return getString(START_PROPERTY_INDEX + 80);
   }

   public void setZzFiscalYear(java.lang.String value) {
      set(START_PROPERTY_INDEX + 80 , value);
   }

   public java.lang.String getZzFund() {
      return getString(START_PROPERTY_INDEX + 81);
   }

   public void setZzFund(java.lang.String value) {
      set(START_PROPERTY_INDEX + 81 , value);
   }

   public java.lang.String getZzFundSrc() {
      return getString(START_PROPERTY_INDEX + 82);
   }

   public void setZzFundSrc(java.lang.String value) {
      set(START_PROPERTY_INDEX + 82 , value);
   }

   public java.lang.String getZzGlAccount() {
      return getString(START_PROPERTY_INDEX + 83);
   }

   public void setZzGlAccount(java.lang.String value) {
      set(START_PROPERTY_INDEX + 83 , value);
   }

   public java.lang.String getZzIndex() {
      return getString(START_PROPERTY_INDEX + 84);
   }

   public void setZzIndex(java.lang.String value) {
      set(START_PROPERTY_INDEX + 84 , value);
   }

   public java.lang.String getZzIntStruct1() {
      return getString(START_PROPERTY_INDEX + 85);
   }

   public void setZzIntStruct1(java.lang.String value) {
      set(START_PROPERTY_INDEX + 85 , value);
   }

   public java.lang.String getZzIntStruct2() {
      return getString(START_PROPERTY_INDEX + 86);
   }

   public void setZzIntStruct2(java.lang.String value) {
      set(START_PROPERTY_INDEX + 86 , value);
   }

   public java.lang.String getZzIntStruct3() {
      return getString(START_PROPERTY_INDEX + 87);
   }

   public void setZzIntStruct3(java.lang.String value) {
      set(START_PROPERTY_INDEX + 87 , value);
   }

   public java.lang.String getZzIntStruct4() {
      return getString(START_PROPERTY_INDEX + 88);
   }

   public void setZzIntStruct4(java.lang.String value) {
      set(START_PROPERTY_INDEX + 88 , value);
   }

   public java.lang.String getZzIntStruct5() {
      return getString(START_PROPERTY_INDEX + 89);
   }

   public void setZzIntStruct5(java.lang.String value) {
      set(START_PROPERTY_INDEX + 89 , value);
   }

   public java.lang.String getZzLocation() {
      return getString(START_PROPERTY_INDEX + 90);
   }

   public void setZzLocation(java.lang.String value) {
      set(START_PROPERTY_INDEX + 90 , value);
   }

   public java.lang.String getZzMethod() {
      return getString(START_PROPERTY_INDEX + 91);
   }

   public void setZzMethod(java.lang.String value) {
      set(START_PROPERTY_INDEX + 91 , value);
   }

   public java.lang.String getZzMultipurpose() {
      return getString(START_PROPERTY_INDEX + 92);
   }

   public void setZzMultipurpose(java.lang.String value) {
      set(START_PROPERTY_INDEX + 92 , value);
   }

   public java.lang.String getZzObjDetail() {
      return getString(START_PROPERTY_INDEX + 93);
   }

   public void setZzObjDetail(java.lang.String value) {
      set(START_PROPERTY_INDEX + 93 , value);
   }

   public java.lang.String getZzOrgCode() {
      return getString(START_PROPERTY_INDEX + 94);
   }

   public void setZzOrgCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 94 , value);
   }

   public java.lang.String getZzProgCostAcct() {
      return getString(START_PROPERTY_INDEX + 95);
   }

   public void setZzProgCostAcct(java.lang.String value) {
      set(START_PROPERTY_INDEX + 95 , value);
   }

   public java.lang.String getZzProgram() {
      return getString(START_PROPERTY_INDEX + 96);
   }

   public void setZzProgram(java.lang.String value) {
      set(START_PROPERTY_INDEX + 96 , value);
   }

   public java.lang.String getZzProject() {
      return getString(START_PROPERTY_INDEX + 97);
   }

   public void setZzProject(java.lang.String value) {
      set(START_PROPERTY_INDEX + 97 , value);
   }

   public java.lang.String getZzReference() {
      return getString(START_PROPERTY_INDEX + 98);
   }

   public void setZzReference(java.lang.String value) {
      set(START_PROPERTY_INDEX + 98 , value);
   }

   public java.lang.String getZzSource() {
      return getString(START_PROPERTY_INDEX + 99);
   }

   public void setZzSource(java.lang.String value) {
      set(START_PROPERTY_INDEX + 99 , value);
   }

   public java.lang.String getZzSubFund() {
      return getString(START_PROPERTY_INDEX + 100);
   }

   public void setZzSubFund(java.lang.String value) {
      set(START_PROPERTY_INDEX + 100 , value);
   }

   public java.lang.String getZzSubsidiary() {
      return getString(START_PROPERTY_INDEX + 101);
   }

   public void setZzSubsidiary(java.lang.String value) {
      set(START_PROPERTY_INDEX + 101 , value);
   }

   public java.lang.String getZzTask() {
      return getString(START_PROPERTY_INDEX + 102);
   }

   public void setZzTask(java.lang.String value) {
      set(START_PROPERTY_INDEX + 102 , value);
   }

   public java.lang.String getZzWorkPhase() {
      return getString(START_PROPERTY_INDEX + 103);
   }

   public void setZzWorkPhase(java.lang.String value) {
      set(START_PROPERTY_INDEX + 103 , value);
   }

   public java.lang.String getProgramUnitCode() {
      return getString(START_PROPERTY_INDEX + 104);
   }

   public void setProgramUnitCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 104 , value);
   }


}

