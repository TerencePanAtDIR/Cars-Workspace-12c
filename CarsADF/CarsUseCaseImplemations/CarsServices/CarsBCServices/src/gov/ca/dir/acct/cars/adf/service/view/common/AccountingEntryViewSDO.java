package gov.ca.dir.acct.cars.adf.service.view.common;

public interface AccountingEntryViewSDO {

   public java.math.BigDecimal getAccountingCodeId();

   public void setAccountingCodeId(java.math.BigDecimal value);

   public java.math.BigDecimal getAcctgEntryId();

   public void setAcctgEntryId(java.math.BigDecimal value);

   public java.math.BigDecimal getAcctgEntryTypeId();

   public void setAcctgEntryTypeId(java.math.BigDecimal value);

   public java.math.BigDecimal getAcctgTransactionId();

   public void setAcctgTransactionId(java.math.BigDecimal value);

   public java.math.BigDecimal getGlAccountAssocRuleId();

   public void setGlAccountAssocRuleId(java.math.BigDecimal value);

   public java.math.BigDecimal getEntryReasonId();

   public void setEntryReasonId(java.math.BigDecimal value);

   public java.sql.Timestamp getPostingDate();

   public void setPostingDate(java.sql.Timestamp value);

   public java.math.BigDecimal getAmount();

   public void setAmount(java.math.BigDecimal value);

   public java.lang.String getDataSourceCode();

   public void setDataSourceCode(java.lang.String value);

   public java.lang.String getCreatedBy();

   public void setCreatedBy(java.lang.String value);

   public java.sql.Timestamp getCreatedDate();

   public void setCreatedDate(java.sql.Timestamp value);

   public java.lang.String getModifiedBy();

   public void setModifiedBy(java.lang.String value);

   public java.sql.Timestamp getModifiedDate();

   public void setModifiedDate(java.sql.Timestamp value);

   public java.util.List getCreditView();

   public void setCreditView(java.util.List value);

   public java.util.List getDebitView();

   public void setDebitView(java.util.List value);


}

