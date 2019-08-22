
package gov.ca.dir.acct.cars.webservices.internal.types;

import gov.ca.dir.acct.cars.webservices.internal.types.common.TDataSourceCode;
import gov.ca.dir.acct.cars.webservices.internal.types.common.TEventType;
import gov.ca.dir.acct.cars.webservices.internal.types.common.TProgramUnitCode;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
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
 *         &lt;element name="CARSPacketHeader">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PacketTransport">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="WS"/>
 *                         &lt;enumeration value="FS"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="PacketTarget" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PacketID">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ProgramUnitCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.dir.ca.gov/acct/cars/schema/common}tProgramUnitCode">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DataSourceCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.dir.ca.gov/acct/cars/schema/common}tDataSourceCode">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Environment">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="DEV"/>
 *                         &lt;enumeration value="TST"/>
 *                         &lt;enumeration value="UAT"/>
 *                         &lt;enumeration value="PRD"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="SubmitBy">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.dir.ca.gov/acct/cars/schema/common}tUserName">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="SubmitDate">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.dir.ca.gov/acct/cars/schema/common}tSystemDate">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CARSPayloadInformation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PayloadName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.dir.ca.gov/acct/cars/schema/common}tEventType">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="PayloadSchema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CARSPacketPayload" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
    "carsPacketHeader",
    "carsPayloadInformation",
    "carsPacketPayload"
})
@XmlRootElement(name = "CARSPacket", namespace = "http://www.dir.ca.gov/acct/cars/schema/common")
public class CARSPacket {

    @XmlElement(name = "SchemaVersionNumber", namespace = "http://www.dir.ca.gov/acct/cars/schema/common", required = true)
    protected String schemaVersionNumber;
    @XmlElement(name = "CARSPacketHeader", namespace = "http://www.dir.ca.gov/acct/cars/schema/common", required = true)
    protected CARSPacket.CARSPacketHeader carsPacketHeader;
    @XmlElement(name = "CARSPayloadInformation", namespace = "http://www.dir.ca.gov/acct/cars/schema/common", required = true)
    protected CARSPacket.CARSPayloadInformation carsPayloadInformation;    
    @XmlElement(name = "CARSPacketPayload", namespace = "http://www.dir.ca.gov/acct/cars/schema/common")
    protected CarsPacketPayload carsPacketPayload;

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
     * Gets the value of the carsPacketHeader property.
     * 
     * @return
     *     possible object is
     *     {@link CARSPacket.CARSPacketHeader }
     *     
     */
    public CARSPacket.CARSPacketHeader getCARSPacketHeader() {
        return carsPacketHeader;
    }

    /**
     * Sets the value of the carsPacketHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link CARSPacket.CARSPacketHeader }
     *     
     */
    public void setCARSPacketHeader(CARSPacket.CARSPacketHeader value) {
        this.carsPacketHeader = value;
    }

    /**
     * Gets the value of the carsPayloadInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CARSPacket.CARSPayloadInformation }
     *     
     */
    public CARSPacket.CARSPayloadInformation getCARSPayloadInformation() {
        return carsPayloadInformation;
    }

    /**
     * Sets the value of the carsPayloadInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CARSPacket.CARSPayloadInformation }
     *     
     */
    public void setCARSPayloadInformation(CARSPacket.CARSPayloadInformation value) {
        this.carsPayloadInformation = value;
    }

    /**
     * Sets the value of the carsPacketPayload property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCARSPacketPayload(CarsPacketPayload value) {
        this.carsPacketPayload = value;
    }

    public void setPacketPayload(List<Object> payload){
        carsPacketPayload.setCARSPacketPayload(payload);
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
     *         &lt;element name="PacketTransport">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="WS"/>
     *               &lt;enumeration value="FS"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="PacketTarget" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PacketID">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ProgramUnitCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.dir.ca.gov/acct/cars/schema/common}tProgramUnitCode">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DataSourceCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.dir.ca.gov/acct/cars/schema/common}tDataSourceCode">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Environment">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="DEV"/>
     *               &lt;enumeration value="TST"/>
     *               &lt;enumeration value="UAT"/>
     *               &lt;enumeration value="PRD"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="SubmitBy">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.dir.ca.gov/acct/cars/schema/common}tUserName">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="SubmitDate">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.dir.ca.gov/acct/cars/schema/common}tSystemDate">
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "packetTransport",
        "packetTarget",
        "packetID",
        "programUnitCode",
        "dataSourceCode",
        "environment",
        "submitBy",
        "submitDate"
    })
    public static class CARSPacketHeader {

        @XmlElement(name = "PacketTransport", namespace = "http://www.dir.ca.gov/acct/cars/schema/common", required = true)
        protected String packetTransport;
        @XmlElement(name = "PacketTarget", namespace = "http://www.dir.ca.gov/acct/cars/schema/common", required = true)
        protected String packetTarget;
        @XmlElement(name = "PacketID", namespace = "http://www.dir.ca.gov/acct/cars/schema/common", required = true)
        protected String packetID;
        @XmlElement(name = "ProgramUnitCode", namespace = "http://www.dir.ca.gov/acct/cars/schema/common", required = true)
        protected TProgramUnitCode programUnitCode;
        @XmlElement(name = "DataSourceCode", namespace = "http://www.dir.ca.gov/acct/cars/schema/common", required = true)
        protected TDataSourceCode dataSourceCode;
        @XmlElement(name = "Environment", namespace = "http://www.dir.ca.gov/acct/cars/schema/common", required = true)
        protected String environment;
        @XmlElement(name = "SubmitBy", namespace = "http://www.dir.ca.gov/acct/cars/schema/common", required = true)
        protected String submitBy;
        @XmlElement(name = "SubmitDate", namespace = "http://www.dir.ca.gov/acct/cars/schema/common", required = true)
        protected XMLGregorianCalendar submitDate;

        /**
         * Gets the value of the packetTransport property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPacketTransport() {
            return packetTransport;
        }

        /**
         * Sets the value of the packetTransport property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPacketTransport(String value) {
            this.packetTransport = value;
        }

        /**
         * Gets the value of the packetTarget property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPacketTarget() {
            return packetTarget;
        }

        /**
         * Sets the value of the packetTarget property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPacketTarget(String value) {
            this.packetTarget = value;
        }

        /**
         * Gets the value of the packetID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPacketID() {
            return packetID;
        }

        /**
         * Sets the value of the packetID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPacketID(String value) {
            this.packetID = value;
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
         * Gets the value of the environment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnvironment() {
            return environment;
        }

        /**
         * Sets the value of the environment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnvironment(String value) {
            this.environment = value;
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
     *         &lt;element name="PayloadName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.dir.ca.gov/acct/cars/schema/common}tEventType">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="PayloadSchema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "payloadName",
        "payloadSchema"
    })
    
    public static class CARSPayloadInformation {

        @XmlElement(name = "PayloadName", namespace = "http://www.dir.ca.gov/acct/cars/schema/common", required = true)
        protected TEventType payloadName;
        @XmlElement(name = "PayloadSchema", namespace = "http://www.dir.ca.gov/acct/cars/schema/common")
        protected String payloadSchema;

        /**
         * Gets the value of the payloadName property.
         * 
         * @return
         *     possible object is
         *     {@link TEventType }
         *     
         */
        public TEventType getPayloadName() {
            return payloadName;
        }

        /**
         * Sets the value of the payloadName property.
         * 
         * @param value
         *     allowed object is
         *     {@link TEventType }
         *     
         */
        public void setPayloadName(TEventType value) {
            this.payloadName = value;
        }

        /**
         * Gets the value of the payloadSchema property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPayloadSchema() {
            return payloadSchema;
        }

        /**
         * Sets the value of the payloadSchema property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPayloadSchema(String value) {
            this.payloadSchema = value;
        }

    }
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "carsPacketPayload"
    })
    
    public static class CarsPacketPayload {

       // @XmlElement(name = "PayloadName", required = true)
        @XmlAnyElement(lax = true)
        protected List<Object> carsPacketPayload = new ArrayList<Object>();

        /**
         * Gets the value of the carsPacketPayload property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCARSPacketPayload() {
            return carsPacketPayload;
    }

        /**
         * Sets the value of the carsPacketPayload property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCARSPacketPayload(List<Object> value) {
            this.carsPacketPayload = value;
        }

        /**
         * Adds a value to the carsPacketPayload property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        
        public void addCARSPacketPayload(Object value){
            this.carsPacketPayload.add(value);
        }
    }
}
