
package gov.ca.dir.acct.cars.webservices.internal.types.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tServiceMethod.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tServiceMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="35"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="M"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "tServiceMethod")
@XmlEnum
public enum TServiceMethod {

    P,
    R,
    M;

    public String value() {
        return name();
    }

    public static TServiceMethod fromValue(String v) {
        return valueOf(v);
    }

}
