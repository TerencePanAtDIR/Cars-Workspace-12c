
package gov.ca.dir.acct.cars.webservices.internal.types.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tNoteTypeCode.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tNoteTypeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="25"/>
 *     &lt;enumeration value="PAYMENT"/>
 *     &lt;enumeration value="DOCUMENT"/>
 *     &lt;enumeration value="REFERRAL"/>
 *     &lt;enumeration value="INVOICE"/>
 *     &lt;enumeration value="PAYMENT_PLAN"/>
 *     &lt;enumeration value="GENERAL"/>
 *     &lt;enumeration value="CANCELLATION_WITH_REFUND"/>
 *     &lt;enumeration value="STOP_REFUND_PAYMENT"/>
 *     &lt;enumeration value="REMIT_PAYMENT_TO_SCO"/>
 *     &lt;enumeration value="CREATE_AR_DISHONORED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "tNoteTypeCode")
@XmlEnum
public enum TNoteTypeCode {

    PAYMENT,
    DOCUMENT,
    REFERRAL,
    INVOICE,
    PAYMENT_PLAN,
    GENERAL,
    CANCELLATION_WITH_REFUND,
    STOP_REFUND_PAYMENT,
    REMIT_PAYMENT_TO_SCO,
    CREATE_AR_DISHONORED;

    public String value() {
        return name();
    }

    public static TNoteTypeCode fromValue(String v) {
        return valueOf(v);
    }

}
