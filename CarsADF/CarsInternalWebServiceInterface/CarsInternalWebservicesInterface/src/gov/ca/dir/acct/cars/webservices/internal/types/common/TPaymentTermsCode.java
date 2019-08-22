
package gov.ca.dir.acct.cars.webservices.internal.types.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tPaymentTermsCode.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tPaymentTermsCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="10"/>
 *     &lt;enumeration value="NET0"/>
 *     &lt;enumeration value="NET15"/>
 *     &lt;enumeration value="NET30"/>
 *     &lt;enumeration value="NET45"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "tPaymentTermsCode")
@XmlEnum
public enum TPaymentTermsCode {

    @XmlEnumValue("NET0")
    NET_0("NET0"),
    @XmlEnumValue("NET15")
    NET_15("NET15"),
    @XmlEnumValue("NET30")
    NET_30("NET30"),
    @XmlEnumValue("NET45")
    NET_45("NET45");
    private final String value;

    TPaymentTermsCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TPaymentTermsCode fromValue(String v) {
        for (TPaymentTermsCode c : TPaymentTermsCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
