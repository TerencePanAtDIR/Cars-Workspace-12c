
package gov.ca.dir.acct.cars.webservices.internal.types;

import gov.ca.dir.acct.cars.webservices.internal.types.common.TAdjustmentType;
import gov.ca.dir.acct.cars.webservices.internal.types.common.TDataSourceCode;
import gov.ca.dir.acct.cars.webservices.internal.types.common.TNote;
import gov.ca.dir.acct.cars.webservices.internal.types.common.TOffsetPaymentCode;
import gov.ca.dir.acct.cars.webservices.internal.types.common.TParticipant;
import gov.ca.dir.acct.cars.webservices.internal.types.common.TProgramUnitCode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchemaVersionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CARSEventHeader">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EventType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ProgramUnitCode" type="{http://www.dir.ca.gov/acct/cars/schema/common}tProgramUnitCode"/>
 *                   &lt;element name="DataSourceCode" type="{http://www.dir.ca.gov/acct/cars/schema/common}tDataSourceCode"/>
 *                   &lt;element name="SubmitBy" type="{http://www.dir.ca.gov/acct/cars/schema/common}tUserName"/>
 *                   &lt;element name="SubmitDate" type="{http://www.dir.ca.gov/acct/cars/schema/common}tSystemDate"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CARSEventDetail">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EventDate" type="{http://www.dir.ca.gov/acct/cars/schema/common}tBusinessDate"/>
 *                   &lt;element name="CurrentDocument" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ReferenceDocument" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="AdditionalReferenceDocument" type="{http://www.dir.ca.gov/acct/cars/schema/common}tDocumentNumber"/>
 *                   &lt;element name="Amount" type="{http://www.dir.ca.gov/acct/cars/schema/common}tAmountType"/>
 *                   &lt;element name="AccountingCode" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="IndexCode" type="{http://www.dir.ca.gov/acct/cars/schema/common}tIndexCode"/>
 *                             &lt;element name="RevenueSourceCode" type="{http://www.dir.ca.gov/acct/cars/schema/common}tRevenueSourceCode"/>
 *                             &lt;element name="AgencySourceCode" type="{http://www.dir.ca.gov/acct/cars/schema/common}tAgencySourceCode"/>
 *                             &lt;element name="Program" type="{http://www.dir.ca.gov/acct/cars/schema/common}tProgram" minOccurs="0"/>
 *                             &lt;element name="Fund" type="{http://www.dir.ca.gov/acct/cars/schema/common}tFund" minOccurs="0"/>
 *                             &lt;element name="FundSource" type="{http://www.dir.ca.gov/acct/cars/schema/common}tFundSource" minOccurs="0"/>
 *                             &lt;element name="FundDetail" type="{http://www.dir.ca.gov/acct/cars/schema/common}tFundDetail" minOccurs="0"/>
 *                             &lt;element name="Element" type="{http://www.dir.ca.gov/acct/cars/schema/common}tElement" minOccurs="0"/>
 *                             &lt;element name="Subject" type="{http://www.dir.ca.gov/acct/cars/schema/common}tSubject" minOccurs="0"/>
 *                             &lt;element name="ObjectCode" type="{http://www.dir.ca.gov/acct/cars/schema/common}tObjectCode" minOccurs="0"/>
 *                             &lt;element name="ObjectDetail" type="{http://www.dir.ca.gov/acct/cars/schema/common}tObjectDetail" minOccurs="0"/>
 *                             &lt;element name="PCACode" type="{http://www.dir.ca.gov/acct/cars/schema/common}tPCACode" minOccurs="0"/>
 *                             &lt;element name="PCAActivity" type="{http://www.dir.ca.gov/acct/cars/schema/common}tPCAActivity" minOccurs="0"/>
 *                             &lt;element name="ProjectNumber" type="{http://www.dir.ca.gov/acct/cars/schema/common}tProjectNumber" minOccurs="0"/>
 *                             &lt;element name="WorkPhase" type="{http://www.dir.ca.gov/acct/cars/schema/common}tWorkPhase" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AdjustmentTypeCode" type="{http://www.dir.ca.gov/acct/cars/schema/common}tAdjustmentType"/>
 *                   &lt;element name="Note" type="{http://www.dir.ca.gov/acct/cars/schema/common}tNote" minOccurs="0"/>
 *                   &lt;element name="Participants" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Participant" type="{http://www.dir.ca.gov/acct/cars/schema/common}tParticipant" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Deposit">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DepositLocationCode" type="{http://www.dir.ca.gov/acct/cars/schema/common}tDepositLocationCode"/>
 *                             &lt;element name="DepositSlipNumber" type="{http://www.dir.ca.gov/acct/cars/schema/common}tDepositSlipNumber"/>
 *                             &lt;element name="DepositDate" type="{http://www.dir.ca.gov/acct/cars/schema/common}tBusinessDate"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Receipt">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ReceiptType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ReceiptControlNumber" type="{http://www.dir.ca.gov/acct/cars/schema/common}tReceiptControlNumber"/>
 *                             &lt;element name="BillType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="OffsetPaymentCode" type="{http://www.dir.ca.gov/acct/cars/schema/common}tOffsetPaymentCode" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "schemaVersionNumber",
    "carsEventHeader",
    "carsEventDetail"
})
@XmlRootElement(name = "CARS331Event")
public class CARS331Event {

    @XmlElement(name = "SchemaVersionNumber", required = true)
    protected String schemaVersionNumber;
    @XmlElement(name = "CARSEventHeader", required = true)
    protected CARS331Event.CARSEventHeader carsEventHeader;
    @XmlElement(name = "CARSEventDetail", required = true)
    protected CARS331Event.CARSEventDetail carsEventDetail;

    /**
     * Gets the value of the schemaVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersionNumber() {
        return schemaVersionNumber;
    }

    /**
     * Sets the value of the schemaVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersionNumber(String value) {
        this.schemaVersionNumber = value;
    }

    /**
     * Gets the value of the carsEventHeader property.
     * 
     * @return
     *     possible object is
     *     {@link CARS331Event.CARSEventHeader }
     *     
     */
    public CARS331Event.CARSEventHeader getCARSEventHeader() {
        return carsEventHeader;
    }

    /**
     * Sets the value of the carsEventHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link CARS331Event.CARSEventHeader }
     *     
     */
    public void setCARSEventHeader(CARS331Event.CARSEventHeader value) {
        this.carsEventHeader = value;
    }

    /**
     * Gets the value of the carsEventDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CARS331Event.CARSEventDetail }
     *     
     */
    public CARS331Event.CARSEventDetail getCARSEventDetail() {
        return carsEventDetail;
    }

    /**
     * Sets the value of the carsEventDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CARS331Event.CARSEventDetail }
     *     
     */
    public void setCARSEventDetail(CARS331Event.CARSEventDetail value) {
        this.carsEventDetail = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="EventDate" type="{http://www.dir.ca.gov/acct/cars/schema/common}tBusinessDate"/>
     *         &lt;element name="CurrentDocument" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ReferenceDocument" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="AdditionalReferenceDocument" type="{http://www.dir.ca.gov/acct/cars/schema/common}tDocumentNumber"/>
     *         &lt;element name="Amount" type="{http://www.dir.ca.gov/acct/cars/schema/common}tAmountType"/>
     *         &lt;element name="AccountingCode" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="IndexCode" type="{http://www.dir.ca.gov/acct/cars/schema/common}tIndexCode"/>
     *                   &lt;element name="RevenueSourceCode" type="{http://www.dir.ca.gov/acct/cars/schema/common}tRevenueSourceCode"/>
     *                   &lt;element name="AgencySourceCode" type="{http://www.dir.ca.gov/acct/cars/schema/common}tAgencySourceCode"/>
     *                   &lt;element name="Program" type="{http://www.dir.ca.gov/acct/cars/schema/common}tProgram" minOccurs="0"/>
     *                   &lt;element name="Fund" type="{http://www.dir.ca.gov/acct/cars/schema/common}tFund" minOccurs="0"/>
     *                   &lt;element name="FundSource" type="{http://www.dir.ca.gov/acct/cars/schema/common}tFundSource" minOccurs="0"/>
     *                   &lt;element name="FundDetail" type="{http://www.dir.ca.gov/acct/cars/schema/common}tFundDetail" minOccurs="0"/>
     *                   &lt;element name="Element" type="{http://www.dir.ca.gov/acct/cars/schema/common}tElement" minOccurs="0"/>
     *                   &lt;element name="Subject" type="{http://www.dir.ca.gov/acct/cars/schema/common}tSubject" minOccurs="0"/>
     *                   &lt;element name="ObjectCode" type="{http://www.dir.ca.gov/acct/cars/schema/common}tObjectCode" minOccurs="0"/>
     *                   &lt;element name="ObjectDetail" type="{http://www.dir.ca.gov/acct/cars/schema/common}tObjectDetail" minOccurs="0"/>
     *                   &lt;element name="PCACode" type="{http://www.dir.ca.gov/acct/cars/schema/common}tPCACode" minOccurs="0"/>
     *                   &lt;element name="PCAActivity" type="{http://www.dir.ca.gov/acct/cars/schema/common}tPCAActivity" minOccurs="0"/>
     *                   &lt;element name="ProjectNumber" type="{http://www.dir.ca.gov/acct/cars/schema/common}tProjectNumber" minOccurs="0"/>
     *                   &lt;element name="WorkPhase" type="{http://www.dir.ca.gov/acct/cars/schema/common}tWorkPhase" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AdjustmentTypeCode" type="{http://www.dir.ca.gov/acct/cars/schema/common}tAdjustmentType"/>
     *         &lt;element name="Note" type="{http://www.dir.ca.gov/acct/cars/schema/common}tNote" minOccurs="0"/>
     *         &lt;element name="Participants" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Participant" type="{http://www.dir.ca.gov/acct/cars/schema/common}tParticipant" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Deposit">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DepositLocationCode" type="{http://www.dir.ca.gov/acct/cars/schema/common}tDepositLocationCode"/>
     *                   &lt;element name="DepositSlipNumber" type="{http://www.dir.ca.gov/acct/cars/schema/common}tDepositSlipNumber"/>
     *                   &lt;element name="DepositDate" type="{http://www.dir.ca.gov/acct/cars/schema/common}tBusinessDate"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Receipt">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ReceiptType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ReceiptControlNumber" type="{http://www.dir.ca.gov/acct/cars/schema/common}tReceiptControlNumber"/>
     *                   &lt;element name="BillType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="OffsetPaymentCode" type="{http://www.dir.ca.gov/acct/cars/schema/common}tOffsetPaymentCode" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "eventDate",
        "currentDocument",
        "referenceDocument",
        "additionalReferenceDocument",
        "amount",
        "accountingCode",
        "adjustmentTypeCode",
        "note",
        "participants",
        "deposit",
        "receipt"
    })
    public static class CARSEventDetail {

        @XmlElement(name = "EventDate", required = true)
        protected XMLGregorianCalendar eventDate;
        @XmlElement(name = "CurrentDocument", required = true)
        protected String currentDocument;
        @XmlElement(name = "ReferenceDocument", required = true)
        protected String referenceDocument;
        @XmlElement(name = "AdditionalReferenceDocument", required = true)
        protected String additionalReferenceDocument;
        @XmlElement(name = "Amount", required = true)
        protected BigDecimal amount;
        @XmlElement(name = "AccountingCode")
        protected CARS331Event.CARSEventDetail.AccountingCode accountingCode;
        @XmlElement(name = "AdjustmentTypeCode", required = true, defaultValue = "EDD_REJECT")
        protected TAdjustmentType adjustmentTypeCode;
        @XmlElement(name = "Note")
        protected TNote note;
        @XmlElement(name = "Participants")
        protected CARS331Event.CARSEventDetail.Participants participants;
        @XmlElement(name = "Deposit", required = true)
        protected CARS331Event.CARSEventDetail.Deposit deposit;
        @XmlElement(name = "Receipt", required = true)
        protected CARS331Event.CARSEventDetail.Receipt receipt;

        /**
         * Gets the value of the eventDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEventDate() {
            return eventDate;
        }

        /**
         * Sets the value of the eventDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEventDate(XMLGregorianCalendar value) {
            this.eventDate = value;
        }

        /**
         * Gets the value of the currentDocument property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrentDocument() {
            return currentDocument;
        }

        /**
         * Sets the value of the currentDocument property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrentDocument(String value) {
            this.currentDocument = value;
        }

        /**
         * Gets the value of the referenceDocument property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferenceDocument() {
            return referenceDocument;
        }

        /**
         * Sets the value of the referenceDocument property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferenceDocument(String value) {
            this.referenceDocument = value;
        }

        /**
         * Gets the value of the additionalReferenceDocument property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdditionalReferenceDocument() {
            return additionalReferenceDocument;
        }

        /**
         * Sets the value of the additionalReferenceDocument property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdditionalReferenceDocument(String value) {
            this.additionalReferenceDocument = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the accountingCode property.
         * 
         * @return
         *     possible object is
         *     {@link CARS331Event.CARSEventDetail.AccountingCode }
         *     
         */
        public CARS331Event.CARSEventDetail.AccountingCode getAccountingCode() {
            return accountingCode;
        }

        /**
         * Sets the value of the accountingCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link CARS331Event.CARSEventDetail.AccountingCode }
         *     
         */
        public void setAccountingCode(CARS331Event.CARSEventDetail.AccountingCode value) {
            this.accountingCode = value;
        }

        /**
         * Gets the value of the adjustmentTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link TAdjustmentType }
         *     
         */
        public TAdjustmentType getAdjustmentTypeCode() {
            return adjustmentTypeCode;
        }

        /**
         * Sets the value of the adjustmentTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link TAdjustmentType }
         *     
         */
        public void setAdjustmentTypeCode(TAdjustmentType value) {
            this.adjustmentTypeCode = value;
        }

        /**
         * Gets the value of the note property.
         * 
         * @return
         *     possible object is
         *     {@link TNote }
         *     
         */
        public TNote getNote() {
            return note;
        }

        /**
         * Sets the value of the note property.
         * 
         * @param value
         *     allowed object is
         *     {@link TNote }
         *     
         */
        public void setNote(TNote value) {
            this.note = value;
        }

        /**
         * Gets the value of the participants property.
         * 
         * @return
         *     possible object is
         *     {@link CARS331Event.CARSEventDetail.Participants }
         *     
         */
        public CARS331Event.CARSEventDetail.Participants getParticipants() {
            return participants;
        }

        /**
         * Sets the value of the participants property.
         * 
         * @param value
         *     allowed object is
         *     {@link CARS331Event.CARSEventDetail.Participants }
         *     
         */
        public void setParticipants(CARS331Event.CARSEventDetail.Participants value) {
            this.participants = value;
        }

        /**
         * Gets the value of the deposit property.
         * 
         * @return
         *     possible object is
         *     {@link CARS331Event.CARSEventDetail.Deposit }
         *     
         */
        public CARS331Event.CARSEventDetail.Deposit getDeposit() {
            return deposit;
        }

        /**
         * Sets the value of the deposit property.
         * 
         * @param value
         *     allowed object is
         *     {@link CARS331Event.CARSEventDetail.Deposit }
         *     
         */
        public void setDeposit(CARS331Event.CARSEventDetail.Deposit value) {
            this.deposit = value;
        }

        /**
         * Gets the value of the receipt property.
         * 
         * @return
         *     possible object is
         *     {@link CARS331Event.CARSEventDetail.Receipt }
         *     
         */
        public CARS331Event.CARSEventDetail.Receipt getReceipt() {
            return receipt;
        }

        /**
         * Sets the value of the receipt property.
         * 
         * @param value
         *     allowed object is
         *     {@link CARS331Event.CARSEventDetail.Receipt }
         *     
         */
        public void setReceipt(CARS331Event.CARSEventDetail.Receipt value) {
            this.receipt = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="IndexCode" type="{http://www.dir.ca.gov/acct/cars/schema/common}tIndexCode"/>
         *         &lt;element name="RevenueSourceCode" type="{http://www.dir.ca.gov/acct/cars/schema/common}tRevenueSourceCode"/>
         *         &lt;element name="AgencySourceCode" type="{http://www.dir.ca.gov/acct/cars/schema/common}tAgencySourceCode"/>
         *         &lt;element name="Program" type="{http://www.dir.ca.gov/acct/cars/schema/common}tProgram" minOccurs="0"/>
         *         &lt;element name="Fund" type="{http://www.dir.ca.gov/acct/cars/schema/common}tFund" minOccurs="0"/>
         *         &lt;element name="FundSource" type="{http://www.dir.ca.gov/acct/cars/schema/common}tFundSource" minOccurs="0"/>
         *         &lt;element name="FundDetail" type="{http://www.dir.ca.gov/acct/cars/schema/common}tFundDetail" minOccurs="0"/>
         *         &lt;element name="Element" type="{http://www.dir.ca.gov/acct/cars/schema/common}tElement" minOccurs="0"/>
         *         &lt;element name="Subject" type="{http://www.dir.ca.gov/acct/cars/schema/common}tSubject" minOccurs="0"/>
         *         &lt;element name="ObjectCode" type="{http://www.dir.ca.gov/acct/cars/schema/common}tObjectCode" minOccurs="0"/>
         *         &lt;element name="ObjectDetail" type="{http://www.dir.ca.gov/acct/cars/schema/common}tObjectDetail" minOccurs="0"/>
         *         &lt;element name="PCACode" type="{http://www.dir.ca.gov/acct/cars/schema/common}tPCACode" minOccurs="0"/>
         *         &lt;element name="PCAActivity" type="{http://www.dir.ca.gov/acct/cars/schema/common}tPCAActivity" minOccurs="0"/>
         *         &lt;element name="ProjectNumber" type="{http://www.dir.ca.gov/acct/cars/schema/common}tProjectNumber" minOccurs="0"/>
         *         &lt;element name="WorkPhase" type="{http://www.dir.ca.gov/acct/cars/schema/common}tWorkPhase" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "indexCode",
            "revenueSourceCode",
            "agencySourceCode",
            "program",
            "fund",
            "fundSource",
            "fundDetail",
            "element",
            "subject",
            "objectCode",
            "objectDetail",
            "pcaCode",
            "pcaActivity",
            "projectNumber",
            "workPhase"
        })
        public static class AccountingCode {

            @XmlElement(name = "IndexCode", required = true)
            protected String indexCode;
            @XmlElement(name = "RevenueSourceCode", required = true)
            protected String revenueSourceCode;
            @XmlElement(name = "AgencySourceCode", required = true)
            protected String agencySourceCode;
            @XmlElement(name = "Program")
            protected String program;
            @XmlElement(name = "Fund")
            protected String fund;
            @XmlElement(name = "FundSource")
            protected String fundSource;
            @XmlElement(name = "FundDetail")
            protected String fundDetail;
            @XmlElement(name = "Element")
            protected String element;
            @XmlElement(name = "Subject")
            protected String subject;
            @XmlElement(name = "ObjectCode")
            protected String objectCode;
            @XmlElement(name = "ObjectDetail")
            protected String objectDetail;
            @XmlElement(name = "PCACode")
            protected String pcaCode;
            @XmlElement(name = "PCAActivity")
            protected String pcaActivity;
            @XmlElement(name = "ProjectNumber")
            protected String projectNumber;
            @XmlElement(name = "WorkPhase")
            protected String workPhase;

            /**
             * Gets the value of the indexCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIndexCode() {
                return indexCode;
            }

            /**
             * Sets the value of the indexCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIndexCode(String value) {
                this.indexCode = value;
            }

            /**
             * Gets the value of the revenueSourceCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRevenueSourceCode() {
                return revenueSourceCode;
            }

            /**
             * Sets the value of the revenueSourceCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRevenueSourceCode(String value) {
                this.revenueSourceCode = value;
            }

            /**
             * Gets the value of the agencySourceCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgencySourceCode() {
                return agencySourceCode;
            }

            /**
             * Sets the value of the agencySourceCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgencySourceCode(String value) {
                this.agencySourceCode = value;
            }

            /**
             * Gets the value of the program property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProgram() {
                return program;
            }

            /**
             * Sets the value of the program property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProgram(String value) {
                this.program = value;
            }

            /**
             * Gets the value of the fund property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFund() {
                return fund;
            }

            /**
             * Sets the value of the fund property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFund(String value) {
                this.fund = value;
            }

            /**
             * Gets the value of the fundSource property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFundSource() {
                return fundSource;
            }

            /**
             * Sets the value of the fundSource property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFundSource(String value) {
                this.fundSource = value;
            }

            /**
             * Gets the value of the fundDetail property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFundDetail() {
                return fundDetail;
            }

            /**
             * Sets the value of the fundDetail property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFundDetail(String value) {
                this.fundDetail = value;
            }

            /**
             * Gets the value of the element property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getElement() {
                return element;
            }

            /**
             * Sets the value of the element property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setElement(String value) {
                this.element = value;
            }

            /**
             * Gets the value of the subject property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubject() {
                return subject;
            }

            /**
             * Sets the value of the subject property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubject(String value) {
                this.subject = value;
            }

            /**
             * Gets the value of the objectCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getObjectCode() {
                return objectCode;
            }

            /**
             * Sets the value of the objectCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setObjectCode(String value) {
                this.objectCode = value;
            }

            /**
             * Gets the value of the objectDetail property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getObjectDetail() {
                return objectDetail;
            }

            /**
             * Sets the value of the objectDetail property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setObjectDetail(String value) {
                this.objectDetail = value;
            }

            /**
             * Gets the value of the pcaCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPCACode() {
                return pcaCode;
            }

            /**
             * Sets the value of the pcaCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPCACode(String value) {
                this.pcaCode = value;
            }

            /**
             * Gets the value of the pcaActivity property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPCAActivity() {
                return pcaActivity;
            }

            /**
             * Sets the value of the pcaActivity property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPCAActivity(String value) {
                this.pcaActivity = value;
            }

            /**
             * Gets the value of the projectNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProjectNumber() {
                return projectNumber;
            }

            /**
             * Sets the value of the projectNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProjectNumber(String value) {
                this.projectNumber = value;
            }

            /**
             * Gets the value of the workPhase property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWorkPhase() {
                return workPhase;
            }

            /**
             * Sets the value of the workPhase property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWorkPhase(String value) {
                this.workPhase = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="DepositLocationCode" type="{http://www.dir.ca.gov/acct/cars/schema/common}tDepositLocationCode"/>
         *         &lt;element name="DepositSlipNumber" type="{http://www.dir.ca.gov/acct/cars/schema/common}tDepositSlipNumber"/>
         *         &lt;element name="DepositDate" type="{http://www.dir.ca.gov/acct/cars/schema/common}tBusinessDate"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "depositLocationCode",
            "depositSlipNumber",
            "depositDate"
        })
        public static class Deposit {

            @XmlElement(name = "DepositLocationCode", required = true)
            protected String depositLocationCode;
            @XmlElement(name = "DepositSlipNumber", required = true)
            protected String depositSlipNumber;
            @XmlElement(name = "DepositDate", required = true)
            protected XMLGregorianCalendar depositDate;

            /**
             * Gets the value of the depositLocationCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepositLocationCode() {
                return depositLocationCode;
            }

            /**
             * Sets the value of the depositLocationCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepositLocationCode(String value) {
                this.depositLocationCode = value;
            }

            /**
             * Gets the value of the depositSlipNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepositSlipNumber() {
                return depositSlipNumber;
            }

            /**
             * Sets the value of the depositSlipNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepositSlipNumber(String value) {
                this.depositSlipNumber = value;
            }

            /**
             * Gets the value of the depositDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDepositDate() {
                return depositDate;
            }

            /**
             * Sets the value of the depositDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDepositDate(XMLGregorianCalendar value) {
                this.depositDate = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Participant" type="{http://www.dir.ca.gov/acct/cars/schema/common}tParticipant" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "participant"
        })
        public static class Participants {

            @XmlElement(name = "Participant", required = true)
            protected List<TParticipant> participant;

            /**
             * Gets the value of the participant property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the participant property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getParticipant().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TParticipant }
             * 
             * 
             */
            public List<TParticipant> getParticipant() {
                if (participant == null) {
                    participant = new ArrayList<TParticipant>();
                }
                return this.participant;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ReceiptType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ReceiptControlNumber" type="{http://www.dir.ca.gov/acct/cars/schema/common}tReceiptControlNumber"/>
         *         &lt;element name="BillType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="OffsetPaymentCode" type="{http://www.dir.ca.gov/acct/cars/schema/common}tOffsetPaymentCode" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "receiptType",
            "receiptControlNumber",
            "billType",
            "offsetPaymentCode"
        })
        public static class Receipt {

            @XmlElement(name = "ReceiptType", required = true)
            protected String receiptType;
            @XmlElement(name = "ReceiptControlNumber", required = true)
            protected String receiptControlNumber;
            @XmlElement(name = "BillType", required = true)
            protected String billType;
            @XmlElement(name = "OffsetPaymentCode")
            protected TOffsetPaymentCode offsetPaymentCode;

            /**
             * Gets the value of the receiptType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReceiptType() {
                return receiptType;
            }

            /**
             * Sets the value of the receiptType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReceiptType(String value) {
                this.receiptType = value;
            }

            /**
             * Gets the value of the receiptControlNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReceiptControlNumber() {
                return receiptControlNumber;
            }

            /**
             * Sets the value of the receiptControlNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReceiptControlNumber(String value) {
                this.receiptControlNumber = value;
            }

            /**
             * Gets the value of the billType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBillType() {
                return billType;
            }

            /**
             * Sets the value of the billType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBillType(String value) {
                this.billType = value;
            }

            /**
             * Gets the value of the offsetPaymentCode property.
             * 
             * @return
             *     possible object is
             *     {@link TOffsetPaymentCode }
             *     
             */
            public TOffsetPaymentCode getOffsetPaymentCode() {
                return offsetPaymentCode;
            }

            /**
             * Sets the value of the offsetPaymentCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link TOffsetPaymentCode }
             *     
             */
            public void setOffsetPaymentCode(TOffsetPaymentCode value) {
                this.offsetPaymentCode = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="EventType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ProgramUnitCode" type="{http://www.dir.ca.gov/acct/cars/schema/common}tProgramUnitCode"/>
     *         &lt;element name="DataSourceCode" type="{http://www.dir.ca.gov/acct/cars/schema/common}tDataSourceCode"/>
     *         &lt;element name="SubmitBy" type="{http://www.dir.ca.gov/acct/cars/schema/common}tUserName"/>
     *         &lt;element name="SubmitDate" type="{http://www.dir.ca.gov/acct/cars/schema/common}tSystemDate"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "eventType",
        "programUnitCode",
        "dataSourceCode",
        "submitBy",
        "submitDate"
    })
    public static class CARSEventHeader {

        @XmlElement(name = "EventType", required = true)
        protected String eventType;
        @XmlElement(name = "ProgramUnitCode", required = true)
        protected TProgramUnitCode programUnitCode;
        @XmlElement(name = "DataSourceCode", required = true)
        protected TDataSourceCode dataSourceCode;
        @XmlElement(name = "SubmitBy", required = true)
        protected String submitBy;
        @XmlElement(name = "SubmitDate", required = true)
        protected XMLGregorianCalendar submitDate;

        /**
         * Gets the value of the eventType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEventType() {
            return eventType;
        }

        /**
         * Sets the value of the eventType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEventType(String value) {
            this.eventType = value;
        }

        /**
         * Gets the value of the programUnitCode property.
         * 
         * @return
         *     possible object is
         *     {@link TProgramUnitCode }
         *     
         */
        public TProgramUnitCode getProgramUnitCode() {
            return programUnitCode;
        }

        /**
         * Sets the value of the programUnitCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link TProgramUnitCode }
         *     
         */
        public void setProgramUnitCode(TProgramUnitCode value) {
            this.programUnitCode = value;
        }

        /**
         * Gets the value of the dataSourceCode property.
         * 
         * @return
         *     possible object is
         *     {@link TDataSourceCode }
         *     
         */
        public TDataSourceCode getDataSourceCode() {
            return dataSourceCode;
        }

        /**
         * Sets the value of the dataSourceCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link TDataSourceCode }
         *     
         */
        public void setDataSourceCode(TDataSourceCode value) {
            this.dataSourceCode = value;
        }

        /**
         * Gets the value of the submitBy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubmitBy() {
            return submitBy;
        }

        /**
         * Sets the value of the submitBy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubmitBy(String value) {
            this.submitBy = value;
        }

        /**
         * Gets the value of the submitDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSubmitDate() {
            return submitDate;
        }

        /**
         * Sets the value of the submitDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSubmitDate(XMLGregorianCalendar value) {
            this.submitDate = value;
        }

    }

}
