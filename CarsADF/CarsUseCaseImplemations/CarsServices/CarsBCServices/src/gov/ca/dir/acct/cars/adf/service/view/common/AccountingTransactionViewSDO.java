package gov.ca.dir.acct.cars.adf.service.view.common;

public interface AccountingTransactionViewSDO {

   public java.math.BigDecimal getAcctgTransactionId();

   public void setAcctgTransactionId(java.math.BigDecimal value);

   public java.math.BigDecimal getAmount();

   public void setAmount(java.math.BigDecimal value);

   public java.lang.String getComments();

   public void setComments(java.lang.String value);

   public java.lang.String getCreatedBy();

   public void setCreatedBy(java.lang.String value);

   public java.sql.Timestamp getCreatedDate();

   public void setCreatedDate(java.sql.Timestamp value);

   public java.sql.Timestamp getDailyPostingDate();

   public void setDailyPostingDate(java.sql.Timestamp value);

   public java.lang.String getDataSourceCode();

   public void setDataSourceCode(java.lang.String value);

   public java.math.BigDecimal getFiscalPeriodId();

   public void setFiscalPeriodId(java.math.BigDecimal value);

   public java.lang.String getModifiedBy();

   public void setModifiedBy(java.lang.String value);

   public java.sql.Timestamp getModifiedDate();

   public void setModifiedDate(java.sql.Timestamp value);

   public java.sql.Timestamp getTransactionDate();

   public void setTransactionDate(java.sql.Timestamp value);

   public java.util.List getReceivableView();

   public void setReceivableView(java.util.List value);

   public java.util.List getReceiptView();

   public void setReceiptView(java.util.List value);

   public java.util.List getAdjustmentView();

   public void setAdjustmentView(java.util.List value);

   public java.util.List getOtherAccountTransView();

   public void setOtherAccountTransView(java.util.List value);


}

