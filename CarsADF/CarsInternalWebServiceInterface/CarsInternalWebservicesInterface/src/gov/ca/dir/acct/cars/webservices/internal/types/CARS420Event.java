
package gov.ca.dir.acct.cars.webservices.internal.types;

import gov.ca.dir.acct.cars.webservices.internal.types.common.TDataSourceCode;
import gov.ca.dir.acct.cars.webservices.internal.types.common.TNote;
import gov.ca.dir.acct.cars.webservices.internal.types.common.TParticipant;
import gov.ca.dir.acct.cars.webservices.internal.types.common.TProgramUnitCode;

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
 *                   &lt;element name="AdditionalReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlRootElement(name = "CARS420Event")
public class CARS420Event {

    @XmlElement(name = "SchemaVersionNumber", required = true)
    protected String schemaVersionNumber;
    @XmlElement(name = "CARSEventHeader", required = true)
    protected CARS420Event.CARSEventHeader carsEventHeader;
    @XmlElement(name = "CARSEventDetail", required = true)
    protected CARS420Event.CARSEventDetail carsEventDetail;

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
     *     {@link CARS420Event.CARSEventHeader }
     *     
     */
    public CARS420Event.CARSEventHeader getCARSEventHeader() {
        return carsEventHeader;
    }

    /**
     * Sets the value of the carsEventHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link CARS420Event.CARSEventHeader }
     *     
     */
    public void setCARSEventHeader(CARS420Event.CARSEventHeader value) {
        this.carsEventHeader = value;
    }

    /**
     * Gets the value of the carsEventDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CARS420Event.CARSEventDetail }
     *     
     */
    public CARS420Event.CARSEventDetail getCARSEventDetail() {
        return carsEventDetail;
    }

    /**
     * Sets the value of the carsEventDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CARS420Event.CARSEventDetail }
     *     
     */
    public void setCARSEventDetail(CARS420Event.CARSEventDetail value) {
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
     *         &lt;element name="AdditionalReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "additionalReferenceNumber",
        "note",
        "participants"
    })
    public static class CARSEventDetail {

        @XmlElement(name = "EventDate", required = true)
        protected XMLGregorianCalendar eventDate;
        @XmlElement(name = "CurrentDocument", required = true)
        protected String currentDocument;
        @XmlElement(name = "ReferenceDocument", required = true)
        protected String referenceDocument;
        @XmlElement(name = "AdditionalReferenceNumber")
        protected String additionalReferenceNumber;
        @XmlElement(name = "Note")
        protected TNote note;
        @XmlElement(name = "Participants")
        protected CARS420Event.CARSEventDetail.Participants participants;

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
         * Gets the value of the additionalReferenceNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdditionalReferenceNumber() {
            return additionalReferenceNumber;
        }

        /**
         * Sets the value of the additionalReferenceNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdditionalReferenceNumber(String value) {
            this.additionalReferenceNumber = value;
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
         *     {@link CARS420Event.CARSEventDetail.Participants }
         *     
         */
        public CARS420Event.CARSEventDetail.Participants getParticipants() {
            return participants;
        }

        /**
         * Sets the value of the participants property.
         * 
         * @param value
         *     allowed object is
         *     {@link CARS420Event.CARSEventDetail.Participants }
         *     
         */
        public void setParticipants(CARS420Event.CARSEventDetail.Participants value) {
            this.participants = value;
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
