
package gov.ca.dir.acct.cars.webservices.internal.types.common;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tParticipant complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tParticipant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParticipantRole">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PartyNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="CustomerId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FSValidCustomer" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Party">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="Person" type="{http://www.dir.ca.gov/acct/cars/schema/common}tPerson" minOccurs="0"/>
 *                   &lt;element name="Organization" type="{http://www.dir.ca.gov/acct/cars/schema/common}tOrganization" minOccurs="0"/>
 *                 &lt;/choice>
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
@XmlType(name = "tParticipant",
         propOrder = { "participantRole", "partyNumber", "customerId",
                       "fsValidCustomer", "party" })
public class TParticipant {

    @XmlElement(name = "ParticipantRole", required = true)
    protected String participantRole;
    @XmlElement(name = "PartyNumber", required = true)
    protected BigInteger partyNumber;
    @XmlElement(name = "CustomerId")
    protected String customerId;
    @XmlElement(name = "FSValidCustomer")
    protected String fsValidCustomer;
    @XmlElement(name = "Party", required = true)
    protected TParticipant.Party party;

    /**
     * Gets the value of the participantRole property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getParticipantRole() {
        return participantRole;
    }

    /**
     * Sets the value of the participantRole property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setParticipantRole(String value) {
        this.participantRole = value;
    }

    /**
     * Gets the value of the partyNumber property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getPartyNumber() {
        return partyNumber;
    }

    /**
     * Sets the value of the partyNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setPartyNumber(BigInteger value) {
        this.partyNumber = value;
    }

    /**
     * Gets the value of the customerId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the fsValidCustomer property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFSValidCustomer() {
        return fsValidCustomer;
    }

    /**
     * Sets the value of the fsValidCustomer property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFSValidCustomer(String value) {
        this.fsValidCustomer = value;
    }

    /**
     * Gets the value of the party property.
     *
     * @return
     *     possible object is
     *     {@link TParticipant.Party }
     *
     */
    public TParticipant.Party getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     *
     * @param value
     *     allowed object is
     *     {@link TParticipant.Party }
     *
     */
    public void setParty(TParticipant.Party value) {
        this.party = value;
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
     *       &lt;choice>
     *         &lt;element name="Person" type="{http://www.dir.ca.gov/acct/cars/schema/common}tPerson" minOccurs="0"/>
     *         &lt;element name="Organization" type="{http://www.dir.ca.gov/acct/cars/schema/common}tOrganization" minOccurs="0"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "person", "organization" })
    public static class Party {

        @XmlElement(name = "Person")
        protected TPerson person;
        @XmlElement(name = "Organization")
        protected TOrganization organization;

        /**
         * Gets the value of the person property.
         *
         * @return
         *     possible object is
         *     {@link TPerson }
         *
         */
        public TPerson getPerson() {
            return person;
        }

        /**
         * Sets the value of the person property.
         *
         * @param value
         *     allowed object is
         *     {@link TPerson }
         *
         */
        public void setPerson(TPerson value) {
            this.person = value;
        }

        /**
         * Gets the value of the organization property.
         *
         * @return
         *     possible object is
         *     {@link TOrganization }
         *
         */
        public TOrganization getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         *
         * @param value
         *     allowed object is
         *     {@link TOrganization }
         *
         */
        public void setOrganization(TOrganization value) {
            this.organization = value;
        }

    }

}
