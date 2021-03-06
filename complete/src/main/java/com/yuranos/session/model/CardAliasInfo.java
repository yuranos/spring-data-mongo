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
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for CardAliasInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardAliasInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="aliasId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="orderId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cardBin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cardBrand" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cardHolderName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cardCvc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cardExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="aliasNCError" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="aliasNCErrorCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="aliasNCErrorCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="aliasNCErrorCardCvc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="aliasNCErrorCardExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="aliasStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="aliasStorePermanently" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAliasInfo", namespace = "http://api.thomascook.com/basket/1.0/payment")
public class CardAliasInfo
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 12345L;
    @XmlAttribute(name = "aliasId")
    protected String aliasId;
    @XmlAttribute(name = "orderId")
    protected String orderId;
    @XmlAttribute(name = "cardBin")
    protected String cardBin;
    @XmlAttribute(name = "cardBrand")
    protected String cardBrand;
    @XmlAttribute(name = "cardNumber")
    protected String cardNumber;
    @XmlAttribute(name = "cardHolderName")
    protected String cardHolderName;
    @XmlAttribute(name = "cardCvc")
    protected String cardCvc;
    @XmlAttribute(name = "cardExpiryDate")
    protected String cardExpiryDate;
    @XmlAttribute(name = "aliasNCError")
    protected String aliasNCError;
    @XmlAttribute(name = "aliasNCErrorCardNo")
    protected String aliasNCErrorCardNo;
    @XmlAttribute(name = "aliasNCErrorCardNumber")
    protected String aliasNCErrorCardNumber;
    @XmlAttribute(name = "aliasNCErrorCardCvc")
    protected String aliasNCErrorCardCvc;
    @XmlAttribute(name = "aliasNCErrorCardExpiryDate")
    protected String aliasNCErrorCardExpiryDate;
    @XmlAttribute(name = "aliasStatus")
    protected String aliasStatus;
    @XmlAttribute(name = "aliasStorePermanently")
    protected String aliasStorePermanently;

    /**
     * Gets the value of the aliasId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasId() {
        return aliasId;
    }

    /**
     * Sets the value of the aliasId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasId(String value) {
        this.aliasId = value;
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

    /**
     * Gets the value of the cardBin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardBin() {
        return cardBin;
    }

    /**
     * Sets the value of the cardBin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardBin(String value) {
        this.cardBin = value;
    }

    /**
     * Gets the value of the cardBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardBrand() {
        return cardBrand;
    }

    /**
     * Sets the value of the cardBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardBrand(String value) {
        this.cardBrand = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the cardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Sets the value of the cardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderName(String value) {
        this.cardHolderName = value;
    }

    /**
     * Gets the value of the cardCvc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCvc() {
        return cardCvc;
    }

    /**
     * Sets the value of the cardCvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCvc(String value) {
        this.cardCvc = value;
    }

    /**
     * Gets the value of the cardExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardExpiryDate() {
        return cardExpiryDate;
    }

    /**
     * Sets the value of the cardExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardExpiryDate(String value) {
        this.cardExpiryDate = value;
    }

    /**
     * Gets the value of the aliasNCError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasNCError() {
        return aliasNCError;
    }

    /**
     * Sets the value of the aliasNCError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasNCError(String value) {
        this.aliasNCError = value;
    }

    /**
     * Gets the value of the aliasNCErrorCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasNCErrorCardNo() {
        return aliasNCErrorCardNo;
    }

    /**
     * Sets the value of the aliasNCErrorCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasNCErrorCardNo(String value) {
        this.aliasNCErrorCardNo = value;
    }

    /**
     * Gets the value of the aliasNCErrorCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasNCErrorCardNumber() {
        return aliasNCErrorCardNumber;
    }

    /**
     * Sets the value of the aliasNCErrorCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasNCErrorCardNumber(String value) {
        this.aliasNCErrorCardNumber = value;
    }

    /**
     * Gets the value of the aliasNCErrorCardCvc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasNCErrorCardCvc() {
        return aliasNCErrorCardCvc;
    }

    /**
     * Sets the value of the aliasNCErrorCardCvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasNCErrorCardCvc(String value) {
        this.aliasNCErrorCardCvc = value;
    }

    /**
     * Gets the value of the aliasNCErrorCardExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasNCErrorCardExpiryDate() {
        return aliasNCErrorCardExpiryDate;
    }

    /**
     * Sets the value of the aliasNCErrorCardExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasNCErrorCardExpiryDate(String value) {
        this.aliasNCErrorCardExpiryDate = value;
    }

    /**
     * Gets the value of the aliasStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasStatus() {
        return aliasStatus;
    }

    /**
     * Sets the value of the aliasStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasStatus(String value) {
        this.aliasStatus = value;
    }

    /**
     * Gets the value of the aliasStorePermanently property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasStorePermanently() {
        return aliasStorePermanently;
    }

    /**
     * Sets the value of the aliasStorePermanently property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasStorePermanently(String value) {
        this.aliasStorePermanently = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CardAliasInfo)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CardAliasInfo that = ((CardAliasInfo) object);
        {
            String lhsAliasId;
            lhsAliasId = this.getAliasId();
            String rhsAliasId;
            rhsAliasId = that.getAliasId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aliasId", lhsAliasId), LocatorUtils.property(thatLocator, "aliasId", rhsAliasId), lhsAliasId, rhsAliasId)) {
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
        {
            String lhsCardBin;
            lhsCardBin = this.getCardBin();
            String rhsCardBin;
            rhsCardBin = that.getCardBin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cardBin", lhsCardBin), LocatorUtils.property(thatLocator, "cardBin", rhsCardBin), lhsCardBin, rhsCardBin)) {
                return false;
            }
        }
        {
            String lhsCardBrand;
            lhsCardBrand = this.getCardBrand();
            String rhsCardBrand;
            rhsCardBrand = that.getCardBrand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cardBrand", lhsCardBrand), LocatorUtils.property(thatLocator, "cardBrand", rhsCardBrand), lhsCardBrand, rhsCardBrand)) {
                return false;
            }
        }
        {
            String lhsCardNumber;
            lhsCardNumber = this.getCardNumber();
            String rhsCardNumber;
            rhsCardNumber = that.getCardNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cardNumber", lhsCardNumber), LocatorUtils.property(thatLocator, "cardNumber", rhsCardNumber), lhsCardNumber, rhsCardNumber)) {
                return false;
            }
        }
        {
            String lhsCardHolderName;
            lhsCardHolderName = this.getCardHolderName();
            String rhsCardHolderName;
            rhsCardHolderName = that.getCardHolderName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cardHolderName", lhsCardHolderName), LocatorUtils.property(thatLocator, "cardHolderName", rhsCardHolderName), lhsCardHolderName, rhsCardHolderName)) {
                return false;
            }
        }
        {
            String lhsCardCvc;
            lhsCardCvc = this.getCardCvc();
            String rhsCardCvc;
            rhsCardCvc = that.getCardCvc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cardCvc", lhsCardCvc), LocatorUtils.property(thatLocator, "cardCvc", rhsCardCvc), lhsCardCvc, rhsCardCvc)) {
                return false;
            }
        }
        {
            String lhsCardExpiryDate;
            lhsCardExpiryDate = this.getCardExpiryDate();
            String rhsCardExpiryDate;
            rhsCardExpiryDate = that.getCardExpiryDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cardExpiryDate", lhsCardExpiryDate), LocatorUtils.property(thatLocator, "cardExpiryDate", rhsCardExpiryDate), lhsCardExpiryDate, rhsCardExpiryDate)) {
                return false;
            }
        }
        {
            String lhsAliasNCError;
            lhsAliasNCError = this.getAliasNCError();
            String rhsAliasNCError;
            rhsAliasNCError = that.getAliasNCError();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aliasNCError", lhsAliasNCError), LocatorUtils.property(thatLocator, "aliasNCError", rhsAliasNCError), lhsAliasNCError, rhsAliasNCError)) {
                return false;
            }
        }
        {
            String lhsAliasNCErrorCardNo;
            lhsAliasNCErrorCardNo = this.getAliasNCErrorCardNo();
            String rhsAliasNCErrorCardNo;
            rhsAliasNCErrorCardNo = that.getAliasNCErrorCardNo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aliasNCErrorCardNo", lhsAliasNCErrorCardNo), LocatorUtils.property(thatLocator, "aliasNCErrorCardNo", rhsAliasNCErrorCardNo), lhsAliasNCErrorCardNo, rhsAliasNCErrorCardNo)) {
                return false;
            }
        }
        {
            String lhsAliasNCErrorCardNumber;
            lhsAliasNCErrorCardNumber = this.getAliasNCErrorCardNumber();
            String rhsAliasNCErrorCardNumber;
            rhsAliasNCErrorCardNumber = that.getAliasNCErrorCardNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aliasNCErrorCardNumber", lhsAliasNCErrorCardNumber), LocatorUtils.property(thatLocator, "aliasNCErrorCardNumber", rhsAliasNCErrorCardNumber), lhsAliasNCErrorCardNumber, rhsAliasNCErrorCardNumber)) {
                return false;
            }
        }
        {
            String lhsAliasNCErrorCardCvc;
            lhsAliasNCErrorCardCvc = this.getAliasNCErrorCardCvc();
            String rhsAliasNCErrorCardCvc;
            rhsAliasNCErrorCardCvc = that.getAliasNCErrorCardCvc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aliasNCErrorCardCvc", lhsAliasNCErrorCardCvc), LocatorUtils.property(thatLocator, "aliasNCErrorCardCvc", rhsAliasNCErrorCardCvc), lhsAliasNCErrorCardCvc, rhsAliasNCErrorCardCvc)) {
                return false;
            }
        }
        {
            String lhsAliasNCErrorCardExpiryDate;
            lhsAliasNCErrorCardExpiryDate = this.getAliasNCErrorCardExpiryDate();
            String rhsAliasNCErrorCardExpiryDate;
            rhsAliasNCErrorCardExpiryDate = that.getAliasNCErrorCardExpiryDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aliasNCErrorCardExpiryDate", lhsAliasNCErrorCardExpiryDate), LocatorUtils.property(thatLocator, "aliasNCErrorCardExpiryDate", rhsAliasNCErrorCardExpiryDate), lhsAliasNCErrorCardExpiryDate, rhsAliasNCErrorCardExpiryDate)) {
                return false;
            }
        }
        {
            String lhsAliasStatus;
            lhsAliasStatus = this.getAliasStatus();
            String rhsAliasStatus;
            rhsAliasStatus = that.getAliasStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aliasStatus", lhsAliasStatus), LocatorUtils.property(thatLocator, "aliasStatus", rhsAliasStatus), lhsAliasStatus, rhsAliasStatus)) {
                return false;
            }
        }
        {
            String lhsAliasStorePermanently;
            lhsAliasStorePermanently = this.getAliasStorePermanently();
            String rhsAliasStorePermanently;
            rhsAliasStorePermanently = that.getAliasStorePermanently();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aliasStorePermanently", lhsAliasStorePermanently), LocatorUtils.property(thatLocator, "aliasStorePermanently", rhsAliasStorePermanently), lhsAliasStorePermanently, rhsAliasStorePermanently)) {
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
            String theAliasId;
            theAliasId = this.getAliasId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aliasId", theAliasId), currentHashCode, theAliasId);
        }
        {
            String theOrderId;
            theOrderId = this.getOrderId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderId", theOrderId), currentHashCode, theOrderId);
        }
        {
            String theCardBin;
            theCardBin = this.getCardBin();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cardBin", theCardBin), currentHashCode, theCardBin);
        }
        {
            String theCardBrand;
            theCardBrand = this.getCardBrand();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cardBrand", theCardBrand), currentHashCode, theCardBrand);
        }
        {
            String theCardNumber;
            theCardNumber = this.getCardNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cardNumber", theCardNumber), currentHashCode, theCardNumber);
        }
        {
            String theCardHolderName;
            theCardHolderName = this.getCardHolderName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cardHolderName", theCardHolderName), currentHashCode, theCardHolderName);
        }
        {
            String theCardCvc;
            theCardCvc = this.getCardCvc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cardCvc", theCardCvc), currentHashCode, theCardCvc);
        }
        {
            String theCardExpiryDate;
            theCardExpiryDate = this.getCardExpiryDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cardExpiryDate", theCardExpiryDate), currentHashCode, theCardExpiryDate);
        }
        {
            String theAliasNCError;
            theAliasNCError = this.getAliasNCError();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aliasNCError", theAliasNCError), currentHashCode, theAliasNCError);
        }
        {
            String theAliasNCErrorCardNo;
            theAliasNCErrorCardNo = this.getAliasNCErrorCardNo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aliasNCErrorCardNo", theAliasNCErrorCardNo), currentHashCode, theAliasNCErrorCardNo);
        }
        {
            String theAliasNCErrorCardNumber;
            theAliasNCErrorCardNumber = this.getAliasNCErrorCardNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aliasNCErrorCardNumber", theAliasNCErrorCardNumber), currentHashCode, theAliasNCErrorCardNumber);
        }
        {
            String theAliasNCErrorCardCvc;
            theAliasNCErrorCardCvc = this.getAliasNCErrorCardCvc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aliasNCErrorCardCvc", theAliasNCErrorCardCvc), currentHashCode, theAliasNCErrorCardCvc);
        }
        {
            String theAliasNCErrorCardExpiryDate;
            theAliasNCErrorCardExpiryDate = this.getAliasNCErrorCardExpiryDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aliasNCErrorCardExpiryDate", theAliasNCErrorCardExpiryDate), currentHashCode, theAliasNCErrorCardExpiryDate);
        }
        {
            String theAliasStatus;
            theAliasStatus = this.getAliasStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aliasStatus", theAliasStatus), currentHashCode, theAliasStatus);
        }
        {
            String theAliasStorePermanently;
            theAliasStorePermanently = this.getAliasStorePermanently();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aliasStorePermanently", theAliasStorePermanently), currentHashCode, theAliasStorePermanently);
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
            String theAliasId;
            theAliasId = this.getAliasId();
            strategy.appendField(locator, this, "aliasId", buffer, theAliasId);
        }
        {
            String theOrderId;
            theOrderId = this.getOrderId();
            strategy.appendField(locator, this, "orderId", buffer, theOrderId);
        }
        {
            String theCardBin;
            theCardBin = this.getCardBin();
            strategy.appendField(locator, this, "cardBin", buffer, theCardBin);
        }
        {
            String theCardBrand;
            theCardBrand = this.getCardBrand();
            strategy.appendField(locator, this, "cardBrand", buffer, theCardBrand);
        }
        {
            String theCardNumber;
            theCardNumber = this.getCardNumber();
            strategy.appendField(locator, this, "cardNumber", buffer, theCardNumber);
        }
        {
            String theCardHolderName;
            theCardHolderName = this.getCardHolderName();
            strategy.appendField(locator, this, "cardHolderName", buffer, theCardHolderName);
        }
        {
            String theCardCvc;
            theCardCvc = this.getCardCvc();
            strategy.appendField(locator, this, "cardCvc", buffer, theCardCvc);
        }
        {
            String theCardExpiryDate;
            theCardExpiryDate = this.getCardExpiryDate();
            strategy.appendField(locator, this, "cardExpiryDate", buffer, theCardExpiryDate);
        }
        {
            String theAliasNCError;
            theAliasNCError = this.getAliasNCError();
            strategy.appendField(locator, this, "aliasNCError", buffer, theAliasNCError);
        }
        {
            String theAliasNCErrorCardNo;
            theAliasNCErrorCardNo = this.getAliasNCErrorCardNo();
            strategy.appendField(locator, this, "aliasNCErrorCardNo", buffer, theAliasNCErrorCardNo);
        }
        {
            String theAliasNCErrorCardNumber;
            theAliasNCErrorCardNumber = this.getAliasNCErrorCardNumber();
            strategy.appendField(locator, this, "aliasNCErrorCardNumber", buffer, theAliasNCErrorCardNumber);
        }
        {
            String theAliasNCErrorCardCvc;
            theAliasNCErrorCardCvc = this.getAliasNCErrorCardCvc();
            strategy.appendField(locator, this, "aliasNCErrorCardCvc", buffer, theAliasNCErrorCardCvc);
        }
        {
            String theAliasNCErrorCardExpiryDate;
            theAliasNCErrorCardExpiryDate = this.getAliasNCErrorCardExpiryDate();
            strategy.appendField(locator, this, "aliasNCErrorCardExpiryDate", buffer, theAliasNCErrorCardExpiryDate);
        }
        {
            String theAliasStatus;
            theAliasStatus = this.getAliasStatus();
            strategy.appendField(locator, this, "aliasStatus", buffer, theAliasStatus);
        }
        {
            String theAliasStorePermanently;
            theAliasStorePermanently = this.getAliasStorePermanently();
            strategy.appendField(locator, this, "aliasStorePermanently", buffer, theAliasStorePermanently);
        }
        return buffer;
    }

}
