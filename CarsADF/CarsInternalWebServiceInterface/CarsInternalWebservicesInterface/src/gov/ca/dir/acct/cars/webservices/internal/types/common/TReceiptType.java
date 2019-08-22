
package gov.ca.dir.acct.cars.webservices.internal.types.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tReceiptType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tReceiptType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="25"/>
 *     &lt;enumeration value="CHECK"/>
 *     &lt;enumeration value="EDF"/>
 *     &lt;enumeration value="JPMC_LOCK_BOX"/>
 *     &lt;enumeration value="USB_LOCK_BOX"/>
 *     &lt;enumeration value="MONEY_ORDER"/>
 *     &lt;enumeration value="CASH"/>
 *     &lt;enumeration value="EFT"/>
 *     &lt;enumeration value="VISA_MASTER_CREDIT_CARD"/>
 *     &lt;enumeration value="AMEX_CREDIT_CARD"/>
 *     &lt;enumeration value="DISCOVER_CREDIT_CARD"/>
 *     &lt;enumeration value="ACCOUNT_TRANSFER"/>
 *     &lt;enumeration value="CREDIT_CARD_REJECT"/>
 *     &lt;enumeration value="EFT_REJECT"/>
 *     &lt;enumeration value="UNBILLED_REJECT"/>
 *     &lt;enumeration value="UNAPPLIED_REJECT"/>
 *     &lt;enumeration value="EDD_UNAPPLIED_REJECT"/>
 *     &lt;enumeration value="PYMT_ADJUST_REVENUE"/>
 *     &lt;enumeration value="UNBILLED_PYMT_ADJUST"/>
 *     &lt;enumeration value="PYMT_ADJUST_PRIOR"/>
 *     &lt;enumeration value="PYMT_ADJUST_REV_PRIOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "tReceiptType")
@XmlEnum
public enum TReceiptType {

    CHECK,
    EDF,
    JPMC_LOCK_BOX,
    USB_LOCK_BOX,
    MONEY_ORDER,
    CASH,
    EFT,
    VISA_MASTER_CREDIT_CARD,
    AMEX_CREDIT_CARD,
    DISCOVER_CREDIT_CARD,
    ACCOUNT_TRANSFER,
    CREDIT_CARD_REJECT,
    EFT_REJECT,
    UNBILLED_REJECT,
    UNAPPLIED_REJECT,
    EDD_UNAPPLIED_REJECT,
    PYMT_ADJUST_REVENUE,
    UNBILLED_PYMT_ADJUST,
    PYMT_ADJUST_PRIOR,
    PYMT_ADJUST_REV_PRIOR;

    public String value() {
        return name();
    }

    public static TReceiptType fromValue(String v) {
        return valueOf(v);
    }

}
