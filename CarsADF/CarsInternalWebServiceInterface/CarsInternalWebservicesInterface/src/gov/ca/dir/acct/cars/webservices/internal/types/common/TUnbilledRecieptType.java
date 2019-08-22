
package gov.ca.dir.acct.cars.webservices.internal.types.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tUnbilledRecieptType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tUnbilledRecieptType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNBILLED_COURT_FEE"/>
 *     &lt;enumeration value="UNBILLED_INTEREST"/>
 *     &lt;enumeration value="UNBILLED_COLLECTION_FEE"/>
 *     &lt;enumeration value="UNBILLED_POST_JUDGMNT_INT"/>
 *     &lt;enumeration value="UNBILLED_NSF_FEE"/>
 *     &lt;enumeration value="UNBILLED_LATE_FEE"/>
 *     &lt;enumeration value="UNBILLED_NSF_AMOUNT"/>
 *     &lt;enumeration value="UNBILLED_OTHERS"/>
 *     &lt;enumeration value="UNAPPLIED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "tUnbilledRecieptType")
@XmlEnum
public enum TUnbilledRecieptType {

    UNBILLED_COURT_FEE,
    UNBILLED_INTEREST,
    UNBILLED_COLLECTION_FEE,
    UNBILLED_POST_JUDGMNT_INT,
    UNBILLED_NSF_FEE,
    UNBILLED_LATE_FEE,
    UNBILLED_NSF_AMOUNT,
    UNBILLED_OTHERS,
    UNAPPLIED;

    public String value() {
        return name();
    }

    public static TUnbilledRecieptType fromValue(String v) {
        return valueOf(v);
    }

}
