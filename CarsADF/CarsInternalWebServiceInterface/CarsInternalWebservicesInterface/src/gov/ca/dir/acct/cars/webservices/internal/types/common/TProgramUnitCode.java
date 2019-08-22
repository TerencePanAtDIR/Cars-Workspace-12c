
package gov.ca.dir.acct.cars.webservices.internal.types.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tProgramUnitCode.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tProgramUnitCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="25"/>
 *     &lt;enumeration value="CALOSHA"/>
 *     &lt;enumeration value="BOFE"/>
 *     &lt;enumeration value="PV"/>
 *     &lt;enumeration value="EV"/>
 *     &lt;enumeration value="ART"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "tProgramUnitCode")
@XmlEnum
public enum TProgramUnitCode {

    CALOSHA,
    BOFE,
    PV,
    EV,
    ART;

    public String value() {
        return name();
    }

    public static TProgramUnitCode fromValue(String v) {
        return valueOf(v);
    }

}
