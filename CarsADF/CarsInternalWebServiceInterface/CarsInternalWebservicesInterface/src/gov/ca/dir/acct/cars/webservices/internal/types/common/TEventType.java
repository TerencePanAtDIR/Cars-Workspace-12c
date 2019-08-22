
package gov.ca.dir.acct.cars.webservices.internal.types.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tEventType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tEventType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="35"/>
 *     &lt;enumeration value="CARS010Event"/>
 *     &lt;enumeration value="CARS015Event"/>
 *     &lt;enumeration value="CARS020Event"/>
 *     &lt;enumeration value="CARS110Event"/>
 *     &lt;enumeration value="CARS115Event"/>
 *     &lt;enumeration value="CARS120Event"/>
 *     &lt;enumeration value="CARS121Event"/>
 *     &lt;enumeration value="CARS122Event"/>
 *     &lt;enumeration value="CARS125Event"/>
 *     &lt;enumeration value="CARS130Event"/>
 *     &lt;enumeration value="CARS131Event"/>
 *     &lt;enumeration value="CARS135Event"/>
 *     &lt;enumeration value="CARS140Event"/>
 *     &lt;enumeration value="CARS145Event"/>
 *     &lt;enumeration value="CARS150Event"/>
 *     &lt;enumeration value="CARS160Event"/>
 *     &lt;enumeration value="CARS165Event"/>
 *     &lt;enumeration value="CARS210Event"/>
 *     &lt;enumeration value="CARS215Event"/>
 *     &lt;enumeration value="CARS220Event"/>
 *     &lt;enumeration value="CARS225Event"/>
 *     &lt;enumeration value="CARS226Event"/>
 *     &lt;enumeration value="CARS230Event"/>
 *     &lt;enumeration value="CARS235Event"/>
 *     &lt;enumeration value="CARS240Event"/>
 *     &lt;enumeration value="CARS241Event"/>
 *     &lt;enumeration value="CARS245Event"/>
 *     &lt;enumeration value="CARS255Event"/>
 *     &lt;enumeration value="CARS260Event"/>
 *     &lt;enumeration value="CARS261Event"/>
 *     &lt;enumeration value="CARS262Event"/>
 *     &lt;enumeration value="CARS265Event"/>
 *     &lt;enumeration value="CARS270Event"/>
 *     &lt;enumeration value="CARS275Event"/>
 *     &lt;enumeration value="CARS276Event"/>
 *     &lt;enumeration value="CARS310Event"/>
 *     &lt;enumeration value="CARS315Event"/>
 *     &lt;enumeration value="CARS320Event"/>
 *     &lt;enumeration value="CARS321Event"/>
 *     &lt;enumeration value="CARS322Event"/>
 *     &lt;enumeration value="CARS325Event"/>
 *     &lt;enumeration value="CARS330Event"/>
 *     &lt;enumeration value="CARS331Event"/>
 *     &lt;enumeration value="CARS340Event"/>
 *     &lt;enumeration value="CARS341Event"/>
 *     &lt;enumeration value="CARS342Event"/>
 *     &lt;enumeration value="CARS343Event"/>
 *     &lt;enumeration value="CARS344Event"/>
 *     &lt;enumeration value="CARS405Event"/>
 *     &lt;enumeration value="CARS410Event"/>
 *     &lt;enumeration value="CARS415Event"/>
 *     &lt;enumeration value="CARS420Event"/>
 *     &lt;enumeration value="CARS425Event"/>
 *     &lt;enumeration value="CARS430Event"/>
 *     &lt;enumeration value="CARS435Event"/>
 *     &lt;enumeration value="CARS436Event"/>
 *     &lt;enumeration value="CARS440Event"/>
 *     &lt;enumeration value="CARS441Event"/>
 *     &lt;enumeration value="CARS442Event"/>
 *     &lt;enumeration value="CARS443Event"/>
 *     &lt;enumeration value="CARS444Event"/>
 *     &lt;enumeration value="CARS445Event"/>
 *     &lt;enumeration value="CARS446Event"/>
 *     &lt;enumeration value="CARS510Event"/>
 *     &lt;enumeration value="CARS515Event"/>
 *     &lt;enumeration value="CARS516Event"/>
 *     &lt;enumeration value="CARS520Event"/>
 *     &lt;enumeration value="CARS525Event"/>
 *     &lt;enumeration value="CARS530Event"/>
 *     &lt;enumeration value="CARS535Event"/>
 *     &lt;enumeration value="CARS536Event"/>
 *     &lt;enumeration value="CARS537Event"/>
 *     &lt;enumeration value="CARS538Event"/>
 *     &lt;enumeration value="CARS900Event"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "tEventType")
@XmlEnum
public enum TEventType {


    /**
     * Create New AR - Current/Prior
     *
     */
    @XmlEnumValue("CARS010Event")
    CARS_010_EVENT("CARS010Event"),

    /**
     * Create New AR - Prior 2 FY
     *
     */
    @XmlEnumValue("CARS015Event")
    CARS_015_EVENT("CARS015Event"),

    /**
     * Create AR - Dishonored Check
     *
     */
    @XmlEnumValue("CARS020Event")
    CARS_020_EVENT("CARS020Event"),

    /**
     * Increase AR
     *
     */
    @XmlEnumValue("CARS110Event")
    CARS_110_EVENT("CARS110Event"),

    /**
     * Decrease AR
     *
     */
    @XmlEnumValue("CARS115Event")
    CARS_115_EVENT("CARS115Event"),

    /**
     * Amend AR - Current/Prior
     *
     */
    @XmlEnumValue("CARS120Event")
    CARS_120_EVENT("CARS120Event"),

    /**
     * Amend AR - Prior 2 FY
     *
     */
    @XmlEnumValue("CARS121Event")
    CARS_121_EVENT("CARS121Event"),

    /**
     * Amend AR - Dishornored Check
     *
     */
    @XmlEnumValue("CARS122Event")
    CARS_122_EVENT("CARS122Event"),

    /**
     * AR Dismissed
     *
     */
    @XmlEnumValue("CARS125Event")
    CARS_125_EVENT("CARS125Event"),

    /**
     * AR Reduced
     *
     */
    @XmlEnumValue("CARS130Event")
    CARS_130_EVENT("CARS130Event"),

    /**
     * AR Reduced Others
     *
     */
    @XmlEnumValue("CARS131Event")
    CARS_131_EVENT("CARS131Event"),

    /**
     * Write Off AR Other
     *
     */
    @XmlEnumValue("CARS135Event")
    CARS_135_EVENT("CARS135Event"),

    /**
     * Waive AR Partial
     *
     */
    @XmlEnumValue("CARS140Event")
    CARS_140_EVENT("CARS140Event"),

    /**
     * Increase AR Others
     *
     */
    @XmlEnumValue("CARS145Event")
    CARS_145_EVENT("CARS145Event"),

    /**
     * Decrease AR Others
     *
     */
    @XmlEnumValue("CARS150Event")
    CARS_150_EVENT("CARS150Event"),

    /**
     * Write Off AR Revenue
     *
     */
    @XmlEnumValue("CARS160Event")
    CARS_160_EVENT("CARS160Event"),

    /**
     * AR Current/Prior Reversal
     *
     */
    @XmlEnumValue("CARS165Event")
    CARS_165_EVENT("CARS165Event"),

    /**
     * Prepay AR Payment
     *
     */
    @XmlEnumValue("CARS210Event")
    CARS_210_EVENT("CARS210Event"),

    /**
     * Check Payment
     *
     */
    @XmlEnumValue("CARS215Event")
    CARS_215_EVENT("CARS215Event"),

    /**
     * Credit Card Payment
     *
     */
    @XmlEnumValue("CARS220Event")
    CARS_220_EVENT("CARS220Event"),

    /**
     * EFT Payment
     *
     */
    @XmlEnumValue("CARS225Event")
    CARS_225_EVENT("CARS225Event"),

    /**
     * EDD Payment
     *
     */
    @XmlEnumValue("CARS226Event")
    CARS_226_EVENT("CARS226Event"),

    /**
     * Check Overpayment
     *
     */
    @XmlEnumValue("CARS230Event")
    CARS_230_EVENT("CARS230Event"),

    /**
     * Credit Card Overpayment
     *
     */
    @XmlEnumValue("CARS235Event")
    CARS_235_EVENT("CARS235Event"),

    /**
     * EFT Overpayment
     *
     */
    @XmlEnumValue("CARS240Event")
    CARS_240_EVENT("CARS240Event"),

    /**
     * EDD Overpayment
     *
     */
    @XmlEnumValue("CARS241Event")
    CARS_241_EVENT("CARS241Event"),

    /**
     * Unbilled Payment
     *
     */
    @XmlEnumValue("CARS245Event")
    CARS_245_EVENT("CARS245Event"),

    /**
     * Apply Prepay Payment
     *
     */
    @XmlEnumValue("CARS255Event")
    CARS_255_EVENT("CARS255Event"),

    /**
     * Replacement Check
     *
     */
    @XmlEnumValue("CARS260Event")
    CARS_260_EVENT("CARS260Event"),

    /**
     * Replacement Credit Card
     *
     */
    @XmlEnumValue("CARS261Event")
    CARS_261_EVENT("CARS261Event"),

    /**
     * Replacement EFT
     *
     */
    @XmlEnumValue("CARS262Event")
    CARS_262_EVENT("CARS262Event"),

    /**
     * AR Other Check Payment
     *
     */
    @XmlEnumValue("CARS265Event")
    CARS_265_EVENT("CARS265Event"),

    /**
     * AR Others Credit Card Payment
     *
     */
    @XmlEnumValue("CARS270Event")
    CARS_270_EVENT("CARS270Event"),

    /**
     * AR Other EFT Payment
     *
     */
    @XmlEnumValue("CARS275Event")
    CARS_275_EVENT("CARS275Event"),

    /**
     * AR Other EDD Payment
     *
     */
    @XmlEnumValue("CARS276Event")
    CARS_276_EVENT("CARS276Event"),

    /**
     * NSF Notification
     *
     */
    @XmlEnumValue("CARS310Event")
    CARS_310_EVENT("CARS310Event"),

    /**
     * Credit Card Rejection
     *
     */
    @XmlEnumValue("CARS315Event")
    CARS_315_EVENT("CARS315Event"),

    /**
     * EFT Rejection
     *
     */
    @XmlEnumValue("CARS320Event")
    CARS_320_EVENT("CARS320Event"),

    /**
     * EDD Rejection
     *
     */
    @XmlEnumValue("CARS321Event")
    CARS_321_EVENT("CARS321Event"),

    /**
     * Unbilled Rejection
     *
     */
    @XmlEnumValue("CARS322Event")
    CARS_322_EVENT("CARS322Event"),

    /**
     * Credit Card Rejection AR Others
     *
     */
    @XmlEnumValue("CARS325Event")
    CARS_325_EVENT("CARS325Event"),

    /**
     * EFT Rejection AR Others
     *
     */
    @XmlEnumValue("CARS330Event")
    CARS_330_EVENT("CARS330Event"),

    /**
     * EDD Rejection AR Others
     *
     */
    @XmlEnumValue("CARS331Event")
    CARS_331_EVENT("CARS331Event"),

    /**
     * Payment Adjustment AR Revenue
     *
     */
    @XmlEnumValue("CARS340Event")
    CARS_340_EVENT("CARS340Event"),

    /**
     * Payment Adjustment AR Unbilled
     *
     */
    @XmlEnumValue("CARS341Event")
    CARS_341_EVENT("CARS341Event"),

    /**
     * Payment Adjustment AR Others
     *
     */
    @XmlEnumValue("CARS342Event")
    CARS_342_EVENT("CARS342Event"),

    /**
     * Payment Adjustment AR Others prior CARS
     *
     */
    @XmlEnumValue("CARS343Event")
    CARS_343_EVENT("CARS343Event"),

    /**
     * Payment Adjustment AR Revenue Prior CARS
     *
     */
    @XmlEnumValue("CARS344Event")
    CARS_344_EVENT("CARS344Event"),

    /**
     * Delinquent
     *
     */
    @XmlEnumValue("CARS405Event")
    CARS_405_EVENT("CARS405Event"),

    /**
     * Create COE
     *
     */
    @XmlEnumValue("CARS410Event")
    CARS_410_EVENT("CARS410Event"),

    /**
     * File Judgment
     *
     */
    @XmlEnumValue("CARS415Event")
    CARS_415_EVENT("CARS415Event"),

    /**
     * Receive Judgment
     *
     */
    @XmlEnumValue("CARS420Event")
    CARS_420_EVENT("CARS420Event"),

    /**
     * Full Satisfaction
     *
     */
    @XmlEnumValue("CARS425Event")
    CARS_425_EVENT("CARS425Event"),

    /**
     * Issue Demand Letter
     *
     */
    @XmlEnumValue("CARS430Event")
    CARS_430_EVENT("CARS430Event"),

    /**
     * Refer to EDD
     *
     */
    @XmlEnumValue("CARS435Event")
    CARS_435_EVENT("CARS435Event"),

    /**
     * Payment Disbursed
     *
     */
    @XmlEnumValue("CARS436Event")
    CARS_436_EVENT("CARS436Event"),

    /**
     * Payment Plan
     *
     */
    @XmlEnumValue("CARS440Event")
    CARS_440_EVENT("CARS440Event"),

    /**
     * Write-Off Requested
     *
     */
    @XmlEnumValue("CARS441Event")
    CARS_441_EVENT("CARS441Event"),

    /**
     * Write-Off Rejected
     *
     */
    @XmlEnumValue("CARS442Event")
    CARS_442_EVENT("CARS442Event"),

    /**
     * Cancellation With Refund
     *
     */
    @XmlEnumValue("CARS443Event")
    CARS_443_EVENT("CARS443Event"),

    /**
     * Stop Refund Payment
     *
     */
    @XmlEnumValue("CARS444Event")
    CARS_444_EVENT("CARS444Event"),

    /**
     * Remit To SCO
     *
     */
    @XmlEnumValue("CARS445Event")
    CARS_445_EVENT("CARS445Event"),

    /**
     * AR Dishonored Check
     *
     */
    @XmlEnumValue("CARS446Event")
    CARS_446_EVENT("CARS446Event"),

    /**
     * AR Upheld Others
     *
     */
    @XmlEnumValue("CARS510Event")
    CARS_510_EVENT("CARS510Event"),

    /**
     * Reclassify AR
     *
     */
    @XmlEnumValue("CARS515Event")
    CARS_515_EVENT("CARS515Event"),

    /**
     * Decision After Reclass
     *
     */
    @XmlEnumValue("CARS516Event")
    CARS_516_EVENT("CARS516Event"),

    /**
     * Contingent AR
     *
     */
    @XmlEnumValue("CARS520Event")
    CARS_520_EVENT("CARS520Event"),

    /**
     * Contingent AR Others
     *
     */
    @XmlEnumValue("CARS525Event")
    CARS_525_EVENT("CARS525Event"),

    /**
     * AR Upheld
     *
     */
    @XmlEnumValue("CARS530Event")
    CARS_530_EVENT("CARS530Event"),

    /**
     * Increase Contingent AR
     *
     */
    @XmlEnumValue("CARS535Event")
    CARS_535_EVENT("CARS535Event"),

    /**
     * Decrease Contingent AR
     *
     */
    @XmlEnumValue("CARS536Event")
    CARS_536_EVENT("CARS536Event"),

    /**
     * Increase Contingent AR Others
     *
     */
    @XmlEnumValue("CARS537Event")
    CARS_537_EVENT("CARS537Event"),

    /**
     * Decrease Contingent AR Others
     *
     */
    @XmlEnumValue("CARS538Event")
    CARS_538_EVENT("CARS538Event"),

    /**
     * AR Reversal
     *
     */
    @XmlEnumValue("CARS900Event")
    CARS_900_EVENT("CARS900Event");
    private final String value;

    TEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TEventType fromValue(String v) {
        for (TEventType c : TEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
