
package gov.ca.dir.acct.cars.webservices.internal.types.common;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CARS ERROR LOG is to record any error raised due user/system/event action.
 *
 *
 * <p>Java class for tError complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Severity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ErrorLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaultLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConversationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompositeInstanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ComponentInstanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ComponentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tError",
         propOrder = { "errorCode", "errorMessage", "errorDescription",
                       "severity", "errorLevel", "faultLocation",
                       "conversationId", "compositeInstanceId",
                       "componentInstanceId", "componentName", "requestId",
                       "faultCode" })
public class TError {

    @XmlElement(name = "ErrorCode", required = true)
    protected BigDecimal errorCode;
    @XmlElement(name = "ErrorMessage", required = true)
    protected String errorMessage;
    @XmlElement(name = "ErrorDescription", required = true)
    protected String errorDescription;
    @XmlElement(name = "Severity", required = true)
    protected String severity;
    @XmlElement(name = "ErrorLevel")
    protected String errorLevel;
    @XmlElement(name = "FaultLocation")
    protected String faultLocation;
    @XmlElement(name = "ConversationId")
    protected String conversationId;
    @XmlElement(name = "CompositeInstanceId")
    protected String compositeInstanceId;
    @XmlElement(name = "ComponentInstanceId")
    protected String componentInstanceId;
    @XmlElement(name = "ComponentName")
    protected String componentName;
    @XmlElement(name = "RequestId")
    protected String requestId;
    @XmlElement(name = "FaultCode")
    protected String faultCode;

    /**
     * Gets the value of the errorCode property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setErrorCode(BigDecimal value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorMessage property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the errorDescription property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * Sets the value of the errorDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setErrorDescription(String value) {
        this.errorDescription = value;
    }

    /**
     * Gets the value of the severity property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSeverity(String value) {
        this.severity = value;
    }

    /**
     * Gets the value of the errorLevel property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getErrorLevel() {
        return errorLevel;
    }

    /**
     * Sets the value of the errorLevel property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setErrorLevel(String value) {
        this.errorLevel = value;
    }

    /**
     * Gets the value of the faultLocation property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFaultLocation() {
        return faultLocation;
    }

    /**
     * Sets the value of the faultLocation property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFaultLocation(String value) {
        this.faultLocation = value;
    }

    /**
     * Gets the value of the conversationId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getConversationId() {
        return conversationId;
    }

    /**
     * Sets the value of the conversationId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setConversationId(String value) {
        this.conversationId = value;
    }

    /**
     * Gets the value of the compositeInstanceId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCompositeInstanceId() {
        return compositeInstanceId;
    }

    /**
     * Sets the value of the compositeInstanceId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCompositeInstanceId(String value) {
        this.compositeInstanceId = value;
    }

    /**
     * Gets the value of the componentInstanceId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getComponentInstanceId() {
        return componentInstanceId;
    }

    /**
     * Sets the value of the componentInstanceId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setComponentInstanceId(String value) {
        this.componentInstanceId = value;
    }

    /**
     * Gets the value of the componentName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getComponentName() {
        return componentName;
    }

    /**
     * Sets the value of the componentName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setComponentName(String value) {
        this.componentName = value;
    }

    /**
     * Gets the value of the requestId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the faultCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFaultCode() {
        return faultCode;
    }

    /**
     * Sets the value of the faultCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFaultCode(String value) {
        this.faultCode = value;
    }

}
