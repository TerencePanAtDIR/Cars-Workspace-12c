
package gov.ca.dir.acct.cars.webservices.internal.types.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ORGANIZATION is an example of a business entity, whether internal or external, to Department of Industrial Relations.
 *
 *
 * <p>Java class for tOrganization complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tOrganization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganizationName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.dir.ca.gov/acct/cars/schema/common}tOrganizationName">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DbaName" type="{http://www.dir.ca.gov/acct/cars/schema/common}tDBAName" minOccurs="0"/>
 *         &lt;element name="LegalName" type="{http://www.dir.ca.gov/acct/cars/schema/common}tLegalName"/>
 *         &lt;element name="FEIN" type="{http://www.dir.ca.gov/acct/cars/schema/common}tFEIN" minOccurs="0"/>
 *         &lt;element name="SEIN" type="{http://www.dir.ca.gov/acct/cars/schema/common}tSEIN" minOccurs="0"/>
 *         &lt;element name="NAICS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *               &lt;pattern value="[\d]*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SIC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *               &lt;pattern value="[\d]*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Address" type="{http://www.dir.ca.gov/acct/cars/schema/common}tAddress" minOccurs="0"/>
 *         &lt;element name="ContactMethod" type="{http://www.dir.ca.gov/acct/cars/schema/common}tContactMethod" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tOrganization",
         propOrder = { "organizationName", "dbaName", "legalName", "fein",
                       "sein", "naics", "sic", "address", "contactMethod" })
public class TOrganization {

    @XmlElement(name = "OrganizationName", required = true)
    protected String organizationName;
    @XmlElement(name = "DbaName")
    protected String dbaName;
    @XmlElement(name = "LegalName", required = true)
    protected String legalName;
    @XmlElement(name = "FEIN")
    protected String fein;
    @XmlElement(name = "SEIN")
    protected String sein;
    @XmlElement(name = "NAICS")
    protected String naics;
    @XmlElement(name = "SIC")
    protected String sic;
    @XmlElement(name = "Address")
    protected TAddress address;
    @XmlElement(name = "ContactMethod")
    protected TContactMethod contactMethod;

    /**
     * Gets the value of the organizationName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the dbaName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDbaName() {
        return dbaName;
    }

    /**
     * Sets the value of the dbaName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDbaName(String value) {
        this.dbaName = value;
    }

    /**
     * Gets the value of the legalName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     * Sets the value of the legalName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLegalName(String value) {
        this.legalName = value;
    }

    /**
     * Gets the value of the fein property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFEIN() {
        return fein;
    }

    /**
     * Sets the value of the fein property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFEIN(String value) {
        this.fein = value;
    }

    /**
     * Gets the value of the sein property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSEIN() {
        return sein;
    }

    /**
     * Sets the value of the sein property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSEIN(String value) {
        this.sein = value;
    }

    /**
     * Gets the value of the naics property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNAICS() {
        return naics;
    }

    /**
     * Sets the value of the naics property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNAICS(String value) {
        this.naics = value;
    }

    /**
     * Gets the value of the sic property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSIC() {
        return sic;
    }

    /**
     * Sets the value of the sic property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSIC(String value) {
        this.sic = value;
    }

    /**
     * Gets the value of the address property.
     *
     * @return
     *     possible object is
     *     {@link TAddress }
     *
     */
    public TAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     *
     * @param value
     *     allowed object is
     *     {@link TAddress }
     *
     */
    public void setAddress(TAddress value) {
        this.address = value;
    }

    /**
     * Gets the value of the contactMethod property.
     *
     * @return
     *     possible object is
     *     {@link TContactMethod }
     *
     */
    public TContactMethod getContactMethod() {
        return contactMethod;
    }

    /**
     * Sets the value of the contactMethod property.
     *
     * @param value
     *     allowed object is
     *     {@link TContactMethod }
     *
     */
    public void setContactMethod(TContactMethod value) {
        this.contactMethod = value;
    }

}
