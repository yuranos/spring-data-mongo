//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.07 at 03:28:23 PM EET 
//


package com.yuranos.session.model;

import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for AbstractPaymentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractPaymentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="paymentProvider" type="{http://api.thomascook.com/basket/1.0/payment}PaymentProvider" />
 *       &lt;attribute name="paymentOptionId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentMethodId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="templateName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="callback" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="callbackWebAPI" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="callbackWebAPIParams" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cancelCallback" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="callbackWebAPIExtraParams" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractPaymentDetails", namespace = "http://api.thomascook.com/basket/1.0/payment")
@XmlSeeAlso({
    CardPaymentDetails.class
})
public class AbstractPaymentDetails
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 12345L;
    @XmlAttribute(name = "paymentProvider")
    protected PaymentProvider paymentProvider;
    @XmlAttribute(name = "paymentOptionId")
    protected String paymentOptionId;
    @XmlAttribute(name = "paymentMethodId")
    protected String paymentMethodId;
    @XmlAttribute(name = "templateName")
    protected String templateName;
    @XmlAttribute(name = "callback")
    protected String callback;
    @XmlAttribute(name = "callbackWebAPI")
    protected String callbackWebAPI;
    @XmlAttribute(name = "callbackWebAPIParams")
    protected String callbackWebAPIParams;
    @XmlAttribute(name = "cancelCallback")
    protected String cancelCallback;
    @XmlAttribute(name = "callbackWebAPIExtraParams")
    protected String callbackWebAPIExtraParams;

    /**
     * Gets the value of the paymentProvider property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentProvider }
     *     
     */
    public PaymentProvider getPaymentProvider() {
        return paymentProvider;
    }

    /**
     * Sets the value of the paymentProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentProvider }
     *     
     */
    public void setPaymentProvider(PaymentProvider value) {
        this.paymentProvider = value;
    }

    /**
     * Gets the value of the paymentOptionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOptionId() {
        return paymentOptionId;
    }

    /**
     * Sets the value of the paymentOptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOptionId(String value) {
        this.paymentOptionId = value;
    }

    /**
     * Gets the value of the paymentMethodId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    /**
     * Sets the value of the paymentMethodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethodId(String value) {
        this.paymentMethodId = value;
    }

    /**
     * Gets the value of the templateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Sets the value of the templateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateName(String value) {
        this.templateName = value;
    }

    /**
     * Gets the value of the callback property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallback() {
        return callback;
    }

    /**
     * Sets the value of the callback property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallback(String value) {
        this.callback = value;
    }

    /**
     * Gets the value of the callbackWebAPI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallbackWebAPI() {
        return callbackWebAPI;
    }

    /**
     * Sets the value of the callbackWebAPI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallbackWebAPI(String value) {
        this.callbackWebAPI = value;
    }

    /**
     * Gets the value of the callbackWebAPIParams property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallbackWebAPIParams() {
        return callbackWebAPIParams;
    }

    /**
     * Sets the value of the callbackWebAPIParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallbackWebAPIParams(String value) {
        this.callbackWebAPIParams = value;
    }

    /**
     * Gets the value of the cancelCallback property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelCallback() {
        return cancelCallback;
    }

    /**
     * Sets the value of the cancelCallback property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelCallback(String value) {
        this.cancelCallback = value;
    }

    /**
     * Gets the value of the callbackWebAPIExtraParams property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallbackWebAPIExtraParams() {
        return callbackWebAPIExtraParams;
    }

    /**
     * Sets the value of the callbackWebAPIExtraParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallbackWebAPIExtraParams(String value) {
        this.callbackWebAPIExtraParams = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AbstractPaymentDetails)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AbstractPaymentDetails that = ((AbstractPaymentDetails) object);
        {
            PaymentProvider lhsPaymentProvider;
            lhsPaymentProvider = this.getPaymentProvider();
            PaymentProvider rhsPaymentProvider;
            rhsPaymentProvider = that.getPaymentProvider();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentProvider", lhsPaymentProvider), LocatorUtils.property(thatLocator, "paymentProvider", rhsPaymentProvider), lhsPaymentProvider, rhsPaymentProvider)) {
                return false;
            }
        }
        {
            String lhsPaymentOptionId;
            lhsPaymentOptionId = this.getPaymentOptionId();
            String rhsPaymentOptionId;
            rhsPaymentOptionId = that.getPaymentOptionId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentOptionId", lhsPaymentOptionId), LocatorUtils.property(thatLocator, "paymentOptionId", rhsPaymentOptionId), lhsPaymentOptionId, rhsPaymentOptionId)) {
                return false;
            }
        }
        {
            String lhsPaymentMethodId;
            lhsPaymentMethodId = this.getPaymentMethodId();
            String rhsPaymentMethodId;
            rhsPaymentMethodId = that.getPaymentMethodId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentMethodId", lhsPaymentMethodId), LocatorUtils.property(thatLocator, "paymentMethodId", rhsPaymentMethodId), lhsPaymentMethodId, rhsPaymentMethodId)) {
                return false;
            }
        }
        {
            String lhsTemplateName;
            lhsTemplateName = this.getTemplateName();
            String rhsTemplateName;
            rhsTemplateName = that.getTemplateName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "templateName", lhsTemplateName), LocatorUtils.property(thatLocator, "templateName", rhsTemplateName), lhsTemplateName, rhsTemplateName)) {
                return false;
            }
        }
        {
            String lhsCallback;
            lhsCallback = this.getCallback();
            String rhsCallback;
            rhsCallback = that.getCallback();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "callback", lhsCallback), LocatorUtils.property(thatLocator, "callback", rhsCallback), lhsCallback, rhsCallback)) {
                return false;
            }
        }
        {
            String lhsCallbackWebAPI;
            lhsCallbackWebAPI = this.getCallbackWebAPI();
            String rhsCallbackWebAPI;
            rhsCallbackWebAPI = that.getCallbackWebAPI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "callbackWebAPI", lhsCallbackWebAPI), LocatorUtils.property(thatLocator, "callbackWebAPI", rhsCallbackWebAPI), lhsCallbackWebAPI, rhsCallbackWebAPI)) {
                return false;
            }
        }
        {
            String lhsCallbackWebAPIParams;
            lhsCallbackWebAPIParams = this.getCallbackWebAPIParams();
            String rhsCallbackWebAPIParams;
            rhsCallbackWebAPIParams = that.getCallbackWebAPIParams();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "callbackWebAPIParams", lhsCallbackWebAPIParams), LocatorUtils.property(thatLocator, "callbackWebAPIParams", rhsCallbackWebAPIParams), lhsCallbackWebAPIParams, rhsCallbackWebAPIParams)) {
                return false;
            }
        }
        {
            String lhsCancelCallback;
            lhsCancelCallback = this.getCancelCallback();
            String rhsCancelCallback;
            rhsCancelCallback = that.getCancelCallback();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cancelCallback", lhsCancelCallback), LocatorUtils.property(thatLocator, "cancelCallback", rhsCancelCallback), lhsCancelCallback, rhsCancelCallback)) {
                return false;
            }
        }
        {
            String lhsCallbackWebAPIExtraParams;
            lhsCallbackWebAPIExtraParams = this.getCallbackWebAPIExtraParams();
            String rhsCallbackWebAPIExtraParams;
            rhsCallbackWebAPIExtraParams = that.getCallbackWebAPIExtraParams();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "callbackWebAPIExtraParams", lhsCallbackWebAPIExtraParams), LocatorUtils.property(thatLocator, "callbackWebAPIExtraParams", rhsCallbackWebAPIExtraParams), lhsCallbackWebAPIExtraParams, rhsCallbackWebAPIExtraParams)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            PaymentProvider thePaymentProvider;
            thePaymentProvider = this.getPaymentProvider();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentProvider", thePaymentProvider), currentHashCode, thePaymentProvider);
        }
        {
            String thePaymentOptionId;
            thePaymentOptionId = this.getPaymentOptionId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentOptionId", thePaymentOptionId), currentHashCode, thePaymentOptionId);
        }
        {
            String thePaymentMethodId;
            thePaymentMethodId = this.getPaymentMethodId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentMethodId", thePaymentMethodId), currentHashCode, thePaymentMethodId);
        }
        {
            String theTemplateName;
            theTemplateName = this.getTemplateName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "templateName", theTemplateName), currentHashCode, theTemplateName);
        }
        {
            String theCallback;
            theCallback = this.getCallback();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "callback", theCallback), currentHashCode, theCallback);
        }
        {
            String theCallbackWebAPI;
            theCallbackWebAPI = this.getCallbackWebAPI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "callbackWebAPI", theCallbackWebAPI), currentHashCode, theCallbackWebAPI);
        }
        {
            String theCallbackWebAPIParams;
            theCallbackWebAPIParams = this.getCallbackWebAPIParams();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "callbackWebAPIParams", theCallbackWebAPIParams), currentHashCode, theCallbackWebAPIParams);
        }
        {
            String theCancelCallback;
            theCancelCallback = this.getCancelCallback();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cancelCallback", theCancelCallback), currentHashCode, theCancelCallback);
        }
        {
            String theCallbackWebAPIExtraParams;
            theCallbackWebAPIExtraParams = this.getCallbackWebAPIExtraParams();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "callbackWebAPIExtraParams", theCallbackWebAPIExtraParams), currentHashCode, theCallbackWebAPIExtraParams);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            PaymentProvider thePaymentProvider;
            thePaymentProvider = this.getPaymentProvider();
            strategy.appendField(locator, this, "paymentProvider", buffer, thePaymentProvider);
        }
        {
            String thePaymentOptionId;
            thePaymentOptionId = this.getPaymentOptionId();
            strategy.appendField(locator, this, "paymentOptionId", buffer, thePaymentOptionId);
        }
        {
            String thePaymentMethodId;
            thePaymentMethodId = this.getPaymentMethodId();
            strategy.appendField(locator, this, "paymentMethodId", buffer, thePaymentMethodId);
        }
        {
            String theTemplateName;
            theTemplateName = this.getTemplateName();
            strategy.appendField(locator, this, "templateName", buffer, theTemplateName);
        }
        {
            String theCallback;
            theCallback = this.getCallback();
            strategy.appendField(locator, this, "callback", buffer, theCallback);
        }
        {
            String theCallbackWebAPI;
            theCallbackWebAPI = this.getCallbackWebAPI();
            strategy.appendField(locator, this, "callbackWebAPI", buffer, theCallbackWebAPI);
        }
        {
            String theCallbackWebAPIParams;
            theCallbackWebAPIParams = this.getCallbackWebAPIParams();
            strategy.appendField(locator, this, "callbackWebAPIParams", buffer, theCallbackWebAPIParams);
        }
        {
            String theCancelCallback;
            theCancelCallback = this.getCancelCallback();
            strategy.appendField(locator, this, "cancelCallback", buffer, theCancelCallback);
        }
        {
            String theCallbackWebAPIExtraParams;
            theCallbackWebAPIExtraParams = this.getCallbackWebAPIExtraParams();
            strategy.appendField(locator, this, "callbackWebAPIExtraParams", buffer, theCallbackWebAPIExtraParams);
        }
        return buffer;
    }

}
