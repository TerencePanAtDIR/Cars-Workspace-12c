
package gov.ca.dir.acct.cars.webservices.internal.types.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tContactMethod complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tContactMethod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Phone" type="{http://www.dir.ca.gov/acct/cars/schema/common}tPhoneNumber" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.dir.ca.gov/acct/cars/schema/common}tPhoneNumber" minOccurs="0"/>
 *         &lt;element name="Cellphone" type="{http://www.dir.ca.gov/acct/cars/schema/common}tPhoneNumber" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.dir.ca.gov/acct/cars/schema/common}tEmailAddress" minOccurs="0"/>
 *         &lt;element name="Portal" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WebSite" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="URL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
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
@XmlType(name = "tContactMethod",
         propOrder = { "phone", "fax", "cellphone", "email", "portal",
                       "webSite", "url" })
public class TContactMethod {

    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "Cellphone")
    protected String cellphone;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Portal")
    protected String portal;
    @XmlElement(name = "WebSite")
    protected String webSite;
    @XmlElement(name = "URL")
    protected String url;

    /**
     * Gets the value of the phone property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the fax property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the cellphone property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCellphone() {
        return cellphone;
    }

    /**
     * Sets the value of the cellphone property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCellphone(String value) {
        this.cellphone = value;
    }

    /**
     * Gets the value of the email property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the portal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPortal() {
        return portal;
    }

    /**
     * Sets the value of the portal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPortal(String value) {
        this.portal = value;
    }

    /**
     * Gets the value of the webSite property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWebSite() {
        return webSite;
    }

    /**
     * Sets the value of the webSite property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWebSite(String value) {
        this.webSite = value;
    }

    /**
     * Gets the value of the url property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setURL(String value) {
        this.url = value;
    }

}
