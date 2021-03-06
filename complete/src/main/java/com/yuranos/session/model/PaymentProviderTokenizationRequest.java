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

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for PaymentProviderTokenizationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentProviderTokenizationRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tokenizationParams" type="{http://api.thomascook.com/basket/1.0/common}Context"/>
 *       &lt;/sequence>
 *       &lt;attribute name="paymentProvider" type="{http://api.thomascook.com/basket/1.0/payment}PaymentProvider" />
 *       &lt;attribute name="cardType" type="{http://api.thomascook.com/basket/1.0/payment}CardType" />
 *       &lt;attribute name="orderId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentProviderTokenizationRequest", namespace = "http://api.thomascook.com/basket/1.0/payment", propOrder = {
    "tokenizationParams"
})
public class PaymentProviderTokenizationRequest
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 12345L;
    @XmlElement(required = true)
    @NotNull
    @Valid
    protected Context tokenizationParams;
    @XmlAttribute(name = "paymentProvider")
    protected PaymentProvider paymentProvider;
    @XmlAttribute(name = "cardType")
    protected CardType cardType;
    @XmlAttribute(name = "orderId")
    protected String orderId;

    /**
     * Gets the value of the tokenizationParams property.
     * 
     * @return
     *     possible object is
     *     {@link Context }
     *     
     */
    public Context getTokenizationParams() {
        return tokenizationParams;
    }

    /**
     * Sets the value of the tokenizationParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context }
     *     
     */
    public void setTokenizationParams(Context value) {
        this.tokenizationParams = value;
    }

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
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link CardType }
     *     
     */
    public CardType getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardType }
     *     
     */
    public void setCardType(CardType value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PaymentProviderTokenizationRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PaymentProviderTokenizationRequest that = ((PaymentProviderTokenizationRequest) object);
        {
            Context lhsTokenizationParams;
            lhsTokenizationParams = this.getTokenizationParams();
            Context rhsTokenizationParams;
            rhsTokenizationParams = that.getTokenizationParams();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tokenizationParams", lhsTokenizationParams), LocatorUtils.property(thatLocator, "tokenizationParams", rhsTokenizationParams), lhsTokenizationParams, rhsTokenizationParams)) {
                return false;
            }
        }
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
            CardType lhsCardType;
            lhsCardType = this.getCardType();
            CardType rhsCardType;
            rhsCardType = that.getCardType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cardType", lhsCardType), LocatorUtils.property(thatLocator, "cardType", rhsCardType), lhsCardType, rhsCardType)) {
                return false;
            }
        }
        {
            String lhsOrderId;
            lhsOrderId = this.getOrderId();
            String rhsOrderId;
            rhsOrderId = that.getOrderId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderId", lhsOrderId), LocatorUtils.property(thatLocator, "orderId", rhsOrderId), lhsOrderId, rhsOrderId)) {
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
            Context theTokenizationParams;
            theTokenizationParams = this.getTokenizationParams();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tokenizationParams", theTokenizationParams), currentHashCode, theTokenizationParams);
        }
        {
            PaymentProvider thePaymentProvider;
            thePaymentProvider = this.getPaymentProvider();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentProvider", thePaymentProvider), currentHashCode, thePaymentProvider);
        }
        {
            CardType theCardType;
            theCardType = this.getCardType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cardType", theCardType), currentHashCode, theCardType);
        }
        {
            String theOrderId;
            theOrderId = this.getOrderId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderId", theOrderId), currentHashCode, theOrderId);
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
            Context theTokenizationParams;
            theTokenizationParams = this.getTokenizationParams();
            strategy.appendField(locator, this, "tokenizationParams", buffer, theTokenizationParams);
        }
        {
            PaymentProvider thePaymentProvider;
            thePaymentProvider = this.getPaymentProvider();
            strategy.appendField(locator, this, "paymentProvider", buffer, thePaymentProvider);
        }
        {
            CardType theCardType;
            theCardType = this.getCardType();
            strategy.appendField(locator, this, "cardType", buffer, theCardType);
        }
        {
            String theOrderId;
            theOrderId = this.getOrderId();
            strategy.appendField(locator, this, "orderId", buffer, theOrderId);
        }
        return buffer;
    }

}
