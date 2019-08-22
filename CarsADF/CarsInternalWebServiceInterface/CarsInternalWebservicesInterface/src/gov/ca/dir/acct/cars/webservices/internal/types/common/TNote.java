
package gov.ca.dir.acct.cars.webservices.internal.types.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * NOTE is to record any text in relation to user/system/event action to provide more details about an action.
 *
 *
 * <p>Java class for tNote complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tNote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NoteTypeCode" type="{http://www.dir.ca.gov/acct/cars/schema/common}tNoteTypeCode"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tNote", propOrder = { "noteTypeCode", "note" })
public class TNote {

    @XmlElement(name = "NoteTypeCode", required = true)
    protected TNoteTypeCode noteTypeCode;
    @XmlElement(name = "Note", required = true)
    protected String note;

    /**
     * Gets the value of the noteTypeCode property.
     *
     * @return
     *     possible object is
     *     {@link TNoteTypeCode }
     *
     */
    public TNoteTypeCode getNoteTypeCode() {
        return noteTypeCode;
    }

    /**
     * Sets the value of the noteTypeCode property.
     *
     * @param value
     *     allowed object is
     *     {@link TNoteTypeCode }
     *
     */
    public void setNoteTypeCode(TNoteTypeCode value) {
        this.noteTypeCode = value;
    }

    /**
     * Gets the value of the note property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNote(String value) {
        this.note = value;
    }

}
