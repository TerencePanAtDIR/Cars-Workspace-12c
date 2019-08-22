
package gov.ca.dir.acct.cars.webservices.internal.types.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * PERSON is an example of a business related individual, whether internal or external, to Department of Industrial Relations.
 *
 *
 * <p>Java class for tPerson complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tPerson">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonName" type="{http://www.dir.ca.gov/acct/cars/schema/common}tPersonName"/>
 *         &lt;element name="SSN" type="{http://www.dir.ca.gov/acct/cars/schema/common}tSSN" minOccurs="0"/>
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
@XmlType(name = "tPerson",
         propOrder = { "personName", "ssn", "address", "contactMethod" })
public class TPerson {

    @XmlElement(name = "PersonName", required = true)
    protected TPersonName personName;
    @XmlElement(name = "SSN")
    protected String ssn;
    @XmlElement(name = "Address")
    protected TAddress address;
    @XmlElement(name = "ContactMethod")
    protected TContactMethod contactMethod;

    /**
     * Gets the value of the personName property.
     *
     * @return
     *     possible object is
     *     {@link TPersonName }
     *
     */
    public TPersonName getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     *
     * @param value
     *     allowed object is
     *     {@link TPersonName }
     *
     */
    public void setPersonName(TPersonName value) {
        this.personName = value;
    }

    /**
     * Gets the value of the ssn property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSSN() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSSN(String value) {
        this.ssn = value;
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
