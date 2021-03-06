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
 * <p>Java class for PaymentProviderTokenizationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentProviderTokenizationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardAliasInfo" type="{http://api.thomascook.com/basket/1.0/payment}CardAliasInfo"/>
 *         &lt;element name="cardError" type="{http://api.thomascook.com/basket/1.0/payment}CardError"/>
 *       &lt;/sequence>
 *       &lt;attribute name="paymentProvider" type="{http://api.thomascook.com/basket/1.0/payment}PaymentProvider" />
 *       &lt;attribute name="paymentProviderResponseValid" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="cardType" type="{http://api.thomascook.com/basket/1.0/payment}CardType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentProviderTokenizationResponse", namespace = "http://api.thomascook.com/basket/1.0/payment", propOrder = {
    "cardAliasInfo",
    "cardError"
})
public class PaymentProviderTokenizationResponse
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 12345L;
    @XmlElement(required = true)
    @NotNull
    @Valid
    protected CardAliasInfo cardAliasInfo;
    @XmlElement(required = true)
    @NotNull
    @Valid
    protected CardError cardError;
    @XmlAttribute(name = "paymentProvider")
    protected PaymentProvider paymentProvider;
    @XmlAttribute(name = "paymentProviderResponseValid")
    protected Boolean paymentProviderResponseValid;
    @XmlAttribute(name = "cardType")
    protected CardType cardType;

    /**
     * Gets the value of the cardAliasInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CardAliasInfo }
     *     
     */
    public CardAliasInfo getCardAliasInfo() {
        return cardAliasInfo;
    }

    /**
     * Sets the value of the cardAliasInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAliasInfo }
     *     
     */
    public void setCardAliasInfo(CardAliasInfo value) {
        this.cardAliasInfo = value;
    }

    /**
     * Gets the value of the cardError property.
     * 
     * @return
     *     possible object is
     *     {@link CardError }
     *     
     */
    public CardError getCardError() {
        return cardError;
    }

    /**
     * Sets the value of the cardError property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardError }
     *     
     */
    public void setCardError(CardError value) {
        this.cardError = value;
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
     * Gets the value of the paymentProviderResponseValid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPaymentProviderResponseValid() {
        return paymentProviderResponseValid;
    }

    /**
     * Sets the value of the paymentProviderResponseValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentProviderResponseValid(Boolean value) {
        this.paymentProviderResponseValid = value;
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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PaymentProviderTokenizationResponse)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PaymentProviderTokenizationResponse that = ((PaymentProviderTokenizationResponse) object);
        {
            CardAliasInfo lhsCardAliasInfo;
            lhsCardAliasInfo = this.getCardAliasInfo();
            CardAliasInfo rhsCardAliasInfo;
            rhsCardAliasInfo = that.getCardAliasInfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cardAliasInfo", lhsCardAliasInfo), LocatorUtils.property(thatLocator, "cardAliasInfo", rhsCardAliasInfo), lhsCardAliasInfo, rhsCardAliasInfo)) {
                return false;
            }
        }
        {
            CardError lhsCardError;
            lhsCardError = this.getCardError();
            CardError rhsCardError;
            rhsCardError = that.getCardError();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cardError", lhsCardError), LocatorUtils.property(thatLocator, "cardError", rhsCardError), lhsCardError, rhsCardError)) {
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
            Boolean lhsPaymentProviderResponseValid;
            lhsPaymentProviderResponseValid = this.getPaymentProviderResponseValid();
            Boolean rhsPaymentProviderResponseValid;
            rhsPaymentProviderResponseValid = that.getPaymentProviderResponseValid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentProviderResponseValid", lhsPaymentProviderResponseValid), LocatorUtils.property(thatLocator, "paymentProviderResponseValid", rhsPaymentProviderResponseValid), lhsPaymentProviderResponseValid, rhsPaymentProviderResponseValid)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            CardAliasInfo theCardAliasInfo;
            theCardAliasInfo = this.getCardAliasInfo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cardAliasInfo", theCardAliasInfo), currentHashCode, theCardAliasInfo);
        }
        {
            CardError theCardError;
            theCardError = this.getCardError();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cardError", theCardError), currentHashCode, theCardError);
        }
        {
            PaymentProvider thePaymentProvider;
            thePaymentProvider = this.getPaymentProvider();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentProvider", thePaymentProvider), currentHashCode, thePaymentProvider);
        }
        {
            Boolean thePaymentProviderResponseValid;
            thePaymentProviderResponseValid = this.getPaymentProviderResponseValid();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentProviderResponseValid", thePaymentProviderResponseValid), currentHashCode, thePaymentProviderResponseValid);
        }
        {
            CardType theCardType;
            theCardType = this.getCardType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cardType", theCardType), currentHashCode, theCardType);
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
            CardAliasInfo theCardAliasInfo;
            theCardAliasInfo = this.getCardAliasInfo();
            strategy.appendField(locator, this, "cardAliasInfo", buffer, theCardAliasInfo);
        }
        {
            CardError theCardError;
            theCardError = this.getCardError();
            strategy.appendField(locator, this, "cardError", buffer, theCardError);
        }
        {
            PaymentProvider thePaymentProvider;
            thePaymentProvider = this.getPaymentProvider();
            strategy.appendField(locator, this, "paymentProvider", buffer, thePaymentProvider);
        }
        {
            Boolean thePaymentProviderResponseValid;
            thePaymentProviderResponseValid = this.getPaymentProviderResponseValid();
            strategy.appendField(locator, this, "paymentProviderResponseValid", buffer, thePaymentProviderResponseValid);
        }
        {
            CardType theCardType;
            theCardType = this.getCardType();
            strategy.appendField(locator, this, "cardType", buffer, theCardType);
        }
        return buffer;
    }

}
