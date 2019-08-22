
package gov.ca.dir.acct.cars.webservices.internal.types.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tZip complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tZip">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZipCode" type="{http://www.dir.ca.gov/acct/cars/schema/common}tZipCode"/>
 *         &lt;element name="Zip4" type="{http://www.dir.ca.gov/acct/cars/schema/common}tZip4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tZip", propOrder = { "zipCode", "zip4" })
public class TZip {

    @XmlElement(name = "ZipCode", required = true)
    protected String zipCode;
    @XmlElement(name = "Zip4")
    protected String zip4;

    /**
     * Gets the value of the zipCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the zip4 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getZip4() {
        return zip4;
    }

    /**
     * Sets the value of the zip4 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setZip4(String value) {
        this.zip4 = value;
    }

}
