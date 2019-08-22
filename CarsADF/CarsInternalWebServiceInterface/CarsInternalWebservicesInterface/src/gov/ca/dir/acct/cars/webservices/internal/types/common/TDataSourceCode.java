
package gov.ca.dir.acct.cars.webservices.internal.types.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tDataSourceCode.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tDataSourceCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="25"/>
 *     &lt;enumeration value="CALOSHA-AR"/>
 *     &lt;enumeration value="DLSE-AR"/>
 *     &lt;enumeration value="PVERA"/>
 *     &lt;enumeration value="SIMS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "tDataSourceCode")
@XmlEnum
public enum TDataSourceCode {

    @XmlEnumValue("CALOSHA-AR")
    CALOSHA_AR("CALOSHA-AR"),
    @XmlEnumValue("DLSE-AR")
    DLSE_AR("DLSE-AR"),
    PVERA("PVERA"),
    SIMS("SIMS");
    private final String value;

    TDataSourceCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TDataSourceCode fromValue(String v) {
        for (TDataSourceCode c : TDataSourceCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
