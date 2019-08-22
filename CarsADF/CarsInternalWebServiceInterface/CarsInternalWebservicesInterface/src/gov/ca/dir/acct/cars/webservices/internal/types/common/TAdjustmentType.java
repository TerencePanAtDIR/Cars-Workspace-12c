
package gov.ca.dir.acct.cars.webservices.internal.types.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tAdjustmentType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tAdjustmentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="25"/>
 *     &lt;enumeration value="DECREASE_CONTINGENT"/>
 *     &lt;enumeration value="RECLASSIFY"/>
 *     &lt;enumeration value="AR_REDUCED"/>
 *     &lt;enumeration value="WAIVED"/>
 *     &lt;enumeration value="WRITE_OFF"/>
 *     &lt;enumeration value="CONTINGENT"/>
 *     &lt;enumeration value="CREDIT_CARD_REJECT"/>
 *     &lt;enumeration value="EFT_REJECT"/>
 *     &lt;enumeration value="UNBILLED_REJECT"/>
 *     &lt;enumeration value="XFER_TO_AR_OTHERS"/>
 *     &lt;enumeration value="XFER_TO_AR"/>
 *     &lt;enumeration value="INCREASE"/>
 *     &lt;enumeration value="DECREASE"/>
 *     &lt;enumeration value="EDD_REJECT"/>
 *     &lt;enumeration value="VOID"/>
 *     &lt;enumeration value="AMENDED"/>
 *     &lt;enumeration value="INCREASE_CONTINGENT"/>
 *     &lt;enumeration value="PAYMENT_TRANSFER"/>
 *     &lt;enumeration value="PAYMENT_ENTRY_ERROR"/>
 *     &lt;enumeration value="OVERPAYMENT_REALLOCATION"/>
 *     &lt;enumeration value="BANK_PAYMENT_ADJUSTMENT"/>
 *     &lt;enumeration value="DECISION_AFTER_RECLASS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "tAdjustmentType")
@XmlEnum
public enum TAdjustmentType {

    DECREASE_CONTINGENT,
    RECLASSIFY,
    AR_REDUCED,
    WAIVED,
    WRITE_OFF,
    CONTINGENT,
    CREDIT_CARD_REJECT,
    EFT_REJECT,
    UNBILLED_REJECT,
    XFER_TO_AR_OTHERS,
    XFER_TO_AR,
    INCREASE,
    DECREASE,
    EDD_REJECT,
    VOID,
    AMENDED,
    INCREASE_CONTINGENT,
    PAYMENT_TRANSFER,
    PAYMENT_ENTRY_ERROR,
    OVERPAYMENT_REALLOCATION,
    BANK_PAYMENT_ADJUSTMENT,
    DECISION_AFTER_RECLASS;

    public String value() {
        return name();
    }

    public static TAdjustmentType fromValue(String v) {
        return valueOf(v);
    }

}
