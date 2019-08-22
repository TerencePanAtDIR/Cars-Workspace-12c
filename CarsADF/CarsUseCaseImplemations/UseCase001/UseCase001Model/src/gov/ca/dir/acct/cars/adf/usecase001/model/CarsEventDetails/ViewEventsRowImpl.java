package gov.ca.dir.acct.cars.adf.usecase001.model.CarsEventDetails;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Apr 09 17:06:23 PDT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ViewEventsRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ArRootDocument {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getArRootDocument();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setArRootDocument((String)value);
            }
        }
        ,
        LegalName {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getLegalName();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setLegalName((String)value);
            }
        }
        ,
        EventTypeCode {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getEventTypeCode();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setEventTypeCode((String)value);
            }
        }
        ,
        EventTypeName {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getEventTypeName();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setEventTypeName((String)value);
            }
        }
        ,
        EventDate {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getEventDate();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setEventDate((Date)value);
            }
        }
        ,
        CurrentDocument {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getCurrentDocument();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setCurrentDocument((String)value);
            }
        }
        ,
        ReferenceDocument {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getReferenceDocument();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setReferenceDocument((String)value);
            }
        }
        ,
        AdditionalReference {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getAdditionalReference();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setAdditionalReference((String)value);
            }
        }
        ,
        DataSourceCode {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getDataSourceCode();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setDataSourceCode((String)value);
            }
        }
        ,
        Amount {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getAmount();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setAmount((Number)value);
            }
        }
        ,
        AcctgTransactionId {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getAcctgTransactionId();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setAcctgTransactionId((Number)value);
            }
        }
        ,
        BillTypeCode {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getBillTypeCode();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setBillTypeCode((String)value);
            }
        }
        ,
        ReceiptTypeCode {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getReceiptTypeCode();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setReceiptTypeCode((String)value);
            }
        }
        ,
        DepositSlipNumber {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getDepositSlipNumber();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setDepositSlipNumber((String)value);
            }
        }
        ,
        DepositDate {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getDepositDate();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setDepositDate((Date)value);
            }
        }
        ,
        ReceiptControlNumber {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getReceiptControlNumber();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setReceiptControlNumber((String)value);
            }
        }
        ,
        ReceiptDate {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getReceiptDate();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setReceiptDate((Date)value);
            }
        }
        ,
        ReceivableEstablishDate {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getReceivableEstablishDate();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setReceivableEstablishDate((Date)value);
            }
        }
        ,
        DueDate {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getDueDate();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setDueDate((Date)value);
            }
        }
        ,
        AdjustmentTypeCode {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getAdjustmentTypeCode();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setAdjustmentTypeCode((String)value);
            }
        }
        ,
        AdjustmentDate {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getAdjustmentDate();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setAdjustmentDate((Date)value);
            }
        }
        ,
        OtherTransactTypeCode {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getOtherTransactTypeCode();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setOtherTransactTypeCode((String)value);
            }
        }
        ,
        OtherTransactionDate {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getOtherTransactionDate();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setOtherTransactionDate((Date)value);
            }
        }
        ,
        FsProcessStatus {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getFsProcessStatus();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setFsProcessStatus((String)value);
            }
        }
        ,
        FiscalBatchDt {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getFiscalBatchDt();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setFiscalBatchDt((Date)value);
            }
        }
        ,
        EventId {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getEventId();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setEventId((Number)value);
            }
        }
        ,
        ProgramUnitCode {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getProgramUnitCode();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setProgramUnitCode((String)value);
            }
        }
        ,
        OffsetPaymentCode {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getOffsetPaymentCode();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setOffsetPaymentCode((String)value);
            }
        }
        ,
        CreatedDate {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getCreatedDate();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setCreatedDate((Date)value);
            }
        }
        ,
        PartyId {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getPartyId();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setPartyId((Number)value);
            }
        }
        ,
        ViewEvents {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getViewEvents();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setViewEvents((String)value);
            }
        }
        ,
        OrgParticipantRoleAddressView {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getOrgParticipantRoleAddressView();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        EventTypeView1 {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getEventTypeView1();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ProgramUnitView1 {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getProgramUnitView1();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        FsProcessStatusView1 {
            public Object get(ViewEventsRowImpl obj) {
                return obj.getFsProcessStatusView1();
            }

            public void put(ViewEventsRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(ViewEventsRowImpl object);

        public abstract void put(ViewEventsRowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int ARROOTDOCUMENT = AttributesEnum.ArRootDocument.index();
    public static final int LEGALNAME = AttributesEnum.LegalName.index();
    public static final int EVENTTYPECODE = AttributesEnum.EventTypeCode.index();
    public static final int EVENTTYPENAME = AttributesEnum.EventTypeName.index();
    public static final int EVENTDATE = AttributesEnum.EventDate.index();
    public static final int CURRENTDOCUMENT = AttributesEnum.CurrentDocument.index();
    public static final int REFERENCEDOCUMENT = AttributesEnum.ReferenceDocument.index();
    public static final int ADDITIONALREFERENCE = AttributesEnum.AdditionalReference.index();
    public static final int DATASOURCECODE = AttributesEnum.DataSourceCode.index();
    public static final int AMOUNT = AttributesEnum.Amount.index();
    public static final int ACCTGTRANSACTIONID = AttributesEnum.AcctgTransactionId.index();
    public static final int BILLTYPECODE = AttributesEnum.BillTypeCode.index();
    public static final int RECEIPTTYPECODE = AttributesEnum.ReceiptTypeCode.index();
    public static final int DEPOSITSLIPNUMBER = AttributesEnum.DepositSlipNumber.index();
    public static final int DEPOSITDATE = AttributesEnum.DepositDate.index();
    public static final int RECEIPTCONTROLNUMBER = AttributesEnum.ReceiptControlNumber.index();
    public static final int RECEIPTDATE = AttributesEnum.ReceiptDate.index();
    public static final int RECEIVABLEESTABLISHDATE = AttributesEnum.ReceivableEstablishDate.index();
    public static final int DUEDATE = AttributesEnum.DueDate.index();
    public static final int ADJUSTMENTTYPECODE = AttributesEnum.AdjustmentTypeCode.index();
    public static final int ADJUSTMENTDATE = AttributesEnum.AdjustmentDate.index();
    public static final int OTHERTRANSACTTYPECODE = AttributesEnum.OtherTransactTypeCode.index();
    public static final int OTHERTRANSACTIONDATE = AttributesEnum.OtherTransactionDate.index();
    public static final int FSPROCESSSTATUS = AttributesEnum.FsProcessStatus.index();
    public static final int FISCALBATCHDT = AttributesEnum.FiscalBatchDt.index();
    public static final int EVENTID = AttributesEnum.EventId.index();
    public static final int PROGRAMUNITCODE = AttributesEnum.ProgramUnitCode.index();
    public static final int OFFSETPAYMENTCODE = AttributesEnum.OffsetPaymentCode.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int PARTYID = AttributesEnum.PartyId.index();
    public static final int VIEWEVENTS = AttributesEnum.ViewEvents.index();
    public static final int ORGPARTICIPANTROLEADDRESSVIEW = AttributesEnum.OrgParticipantRoleAddressView.index();
    public static final int EVENTTYPEVIEW1 = AttributesEnum.EventTypeView1.index();
    public static final int PROGRAMUNITVIEW1 = AttributesEnum.ProgramUnitView1.index();
    public static final int FSPROCESSSTATUSVIEW1 = AttributesEnum.FsProcessStatusView1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ViewEventsRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute ArRootDocument.
     * @return the ArRootDocument
     */
    public String getArRootDocument() {
        return (String) getAttributeInternal(ARROOTDOCUMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ArRootDocument.
     * @param value value to set the  ArRootDocument
     */
    public void setArRootDocument(String value) {
        setAttributeInternal(ARROOTDOCUMENT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute LegalName.
     * @return the LegalName
     */
    public String getLegalName() {
        return (String) getAttributeInternal(LEGALNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute LegalName.
     * @param value value to set the  LegalName
     */
    public void setLegalName(String value) {
        setAttributeInternal(LEGALNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EventTypeCode.
     * @return the EventTypeCode
     */
    public String getEventTypeCode() {
        return (String) getAttributeInternal(EVENTTYPECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EventTypeCode.
     * @param value value to set the  EventTypeCode
     */
    public void setEventTypeCode(String value) {
        setAttributeInternal(EVENTTYPECODE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EventTypeName.
     * @return the EventTypeName
     */
    public String getEventTypeName() {
        return (String) getAttributeInternal(EVENTTYPENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EventTypeName.
     * @param value value to set the  EventTypeName
     */
    public void setEventTypeName(String value) {
        setAttributeInternal(EVENTTYPENAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EventDate.
     * @return the EventDate
     */
    public Date getEventDate() {
        return (Date) getAttributeInternal(EVENTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EventDate.
     * @param value value to set the  EventDate
     */
    public void setEventDate(Date value) {
        setAttributeInternal(EVENTDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CurrentDocument.
     * @return the CurrentDocument
     */
    public String getCurrentDocument() {
        return (String) getAttributeInternal(CURRENTDOCUMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CurrentDocument.
     * @param value value to set the  CurrentDocument
     */
    public void setCurrentDocument(String value) {
        setAttributeInternal(CURRENTDOCUMENT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ReferenceDocument.
     * @return the ReferenceDocument
     */
    public String getReferenceDocument() {
        return (String) getAttributeInternal(REFERENCEDOCUMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ReferenceDocument.
     * @param value value to set the  ReferenceDocument
     */
    public void setReferenceDocument(String value) {
        setAttributeInternal(REFERENCEDOCUMENT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AdditionalReference.
     * @return the AdditionalReference
     */
    public String getAdditionalReference() {
        return (String) getAttributeInternal(ADDITIONALREFERENCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AdditionalReference.
     * @param value value to set the  AdditionalReference
     */
    public void setAdditionalReference(String value) {
        setAttributeInternal(ADDITIONALREFERENCE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DataSourceCode.
     * @return the DataSourceCode
     */
    public String getDataSourceCode() {
        return (String) getAttributeInternal(DATASOURCECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DataSourceCode.
     * @param value value to set the  DataSourceCode
     */
    public void setDataSourceCode(String value) {
        setAttributeInternal(DATASOURCECODE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Amount.
     * @return the Amount
     */
    public Number getAmount() {
        return (Number) getAttributeInternal(AMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Amount.
     * @param value value to set the  Amount
     */
    public void setAmount(Number value) {
        setAttributeInternal(AMOUNT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AcctgTransactionId.
     * @return the AcctgTransactionId
     */
    public Number getAcctgTransactionId() {
        return (Number) getAttributeInternal(ACCTGTRANSACTIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AcctgTransactionId.
     * @param value value to set the  AcctgTransactionId
     */
    public void setAcctgTransactionId(Number value) {
        setAttributeInternal(ACCTGTRANSACTIONID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BillTypeCode.
     * @return the BillTypeCode
     */
    public String getBillTypeCode() {
        return (String) getAttributeInternal(BILLTYPECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BillTypeCode.
     * @param value value to set the  BillTypeCode
     */
    public void setBillTypeCode(String value) {
        setAttributeInternal(BILLTYPECODE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ReceiptTypeCode.
     * @return the ReceiptTypeCode
     */
    public String getReceiptTypeCode() {
        return (String) getAttributeInternal(RECEIPTTYPECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ReceiptTypeCode.
     * @param value value to set the  ReceiptTypeCode
     */
    public void setReceiptTypeCode(String value) {
        setAttributeInternal(RECEIPTTYPECODE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DepositSlipNumber.
     * @return the DepositSlipNumber
     */
    public String getDepositSlipNumber() {
        return (String) getAttributeInternal(DEPOSITSLIPNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DepositSlipNumber.
     * @param value value to set the  DepositSlipNumber
     */
    public void setDepositSlipNumber(String value) {
        setAttributeInternal(DEPOSITSLIPNUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DepositDate.
     * @return the DepositDate
     */
    public Date getDepositDate() {
        return (Date) getAttributeInternal(DEPOSITDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DepositDate.
     * @param value value to set the  DepositDate
     */
    public void setDepositDate(Date value) {
        setAttributeInternal(DEPOSITDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ReceiptControlNumber.
     * @return the ReceiptControlNumber
     */
    public String getReceiptControlNumber() {
        return (String) getAttributeInternal(RECEIPTCONTROLNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ReceiptControlNumber.
     * @param value value to set the  ReceiptControlNumber
     */
    public void setReceiptControlNumber(String value) {
        setAttributeInternal(RECEIPTCONTROLNUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ReceiptDate.
     * @return the ReceiptDate
     */
    public Date getReceiptDate() {
        return (Date) getAttributeInternal(RECEIPTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ReceiptDate.
     * @param value value to set the  ReceiptDate
     */
    public void setReceiptDate(Date value) {
        setAttributeInternal(RECEIPTDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ReceivableEstablishDate.
     * @return the ReceivableEstablishDate
     */
    public Date getReceivableEstablishDate() {
        return (Date) getAttributeInternal(RECEIVABLEESTABLISHDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ReceivableEstablishDate.
     * @param value value to set the  ReceivableEstablishDate
     */
    public void setReceivableEstablishDate(Date value) {
        setAttributeInternal(RECEIVABLEESTABLISHDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DueDate.
     * @return the DueDate
     */
    public Date getDueDate() {
        return (Date) getAttributeInternal(DUEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DueDate.
     * @param value value to set the  DueDate
     */
    public void setDueDate(Date value) {
        setAttributeInternal(DUEDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AdjustmentTypeCode.
     * @return the AdjustmentTypeCode
     */
    public String getAdjustmentTypeCode() {
        return (String) getAttributeInternal(ADJUSTMENTTYPECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AdjustmentTypeCode.
     * @param value value to set the  AdjustmentTypeCode
     */
    public void setAdjustmentTypeCode(String value) {
        setAttributeInternal(ADJUSTMENTTYPECODE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AdjustmentDate.
     * @return the AdjustmentDate
     */
    public Date getAdjustmentDate() {
        return (Date) getAttributeInternal(ADJUSTMENTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AdjustmentDate.
     * @param value value to set the  AdjustmentDate
     */
    public void setAdjustmentDate(Date value) {
        setAttributeInternal(ADJUSTMENTDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OtherTransactTypeCode.
     * @return the OtherTransactTypeCode
     */
    public String getOtherTransactTypeCode() {
        return (String) getAttributeInternal(OTHERTRANSACTTYPECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OtherTransactTypeCode.
     * @param value value to set the  OtherTransactTypeCode
     */
    public void setOtherTransactTypeCode(String value) {
        setAttributeInternal(OTHERTRANSACTTYPECODE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OtherTransactionDate.
     * @return the OtherTransactionDate
     */
    public Date getOtherTransactionDate() {
        return (Date) getAttributeInternal(OTHERTRANSACTIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OtherTransactionDate.
     * @param value value to set the  OtherTransactionDate
     */
    public void setOtherTransactionDate(Date value) {
        setAttributeInternal(OTHERTRANSACTIONDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute FsProcessStatus.
     * @return the FsProcessStatus
     */
    public String getFsProcessStatus() {
        return (String) getAttributeInternal(FSPROCESSSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute FsProcessStatus.
     * @param value value to set the  FsProcessStatus
     */
    public void setFsProcessStatus(String value) {
        setAttributeInternal(FSPROCESSSTATUS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute FiscalBatchDt.
     * @return the FiscalBatchDt
     */
    public Date getFiscalBatchDt() {
        return (Date) getAttributeInternal(FISCALBATCHDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute FiscalBatchDt.
     * @param value value to set the  FiscalBatchDt
     */
    public void setFiscalBatchDt(Date value) {
        setAttributeInternal(FISCALBATCHDT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EventId.
     * @return the EventId
     */
    public Number getEventId() {
        return (Number) getAttributeInternal(EVENTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EventId.
     * @param value value to set the  EventId
     */
    public void setEventId(Number value) {
        setAttributeInternal(EVENTID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ProgramUnitCode.
     * @return the ProgramUnitCode
     */
    public String getProgramUnitCode() {
        return (String) getAttributeInternal(PROGRAMUNITCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ProgramUnitCode.
     * @param value value to set the  ProgramUnitCode
     */
    public void setProgramUnitCode(String value) {
        setAttributeInternal(PROGRAMUNITCODE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OffsetPaymentCode.
     * @return the OffsetPaymentCode
     */
    public String getOffsetPaymentCode() {
        return (String) getAttributeInternal(OFFSETPAYMENTCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OffsetPaymentCode.
     * @param value value to set the  OffsetPaymentCode
     */
    public void setOffsetPaymentCode(String value) {
        setAttributeInternal(OFFSETPAYMENTCODE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CreatedDate.
     * @return the CreatedDate
     */
    public Date getCreatedDate() {
        return (Date) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CreatedDate.
     * @param value value to set the  CreatedDate
     */
    public void setCreatedDate(Date value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PartyId.
     * @return the PartyId
     */
    public Number getPartyId() {
        return (Number) getAttributeInternal(PARTYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PartyId.
     * @param value value to set the  PartyId
     */
    public void setPartyId(Number value) {
        setAttributeInternal(PARTYID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ViewEvents.
     * @return the ViewEvents
     */
    public String getViewEvents() {
        return (String) getAttributeInternal(VIEWEVENTS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ViewEvents.
     * @param value value to set the  ViewEvents
     */
    public void setViewEvents(String value) {
        setAttributeInternal(VIEWEVENTS, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link OrgParticipantRoleAddressView.
     */
    public RowIterator getOrgParticipantRoleAddressView() {
        return (RowIterator)getAttributeInternal(ORGPARTICIPANTROLEADDRESSVIEW);
    }

    /**
     * Gets the view accessor <code>RowSet</code> EventTypeView1.
     */
    public RowSet getEventTypeView1() {
        return (RowSet)getAttributeInternal(EVENTTYPEVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ProgramUnitView1.
     */
    public RowSet getProgramUnitView1() {
        return (RowSet)getAttributeInternal(PROGRAMUNITVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> FsProcessStatusView1.
     */
    public RowSet getFsProcessStatusView1() {
        return (RowSet)getAttributeInternal(FSPROCESSSTATUSVIEW1);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
