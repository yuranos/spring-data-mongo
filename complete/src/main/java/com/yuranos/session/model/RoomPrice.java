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

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 * <p>Java class for RoomPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomPrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AgeQualifyingCode" use="required" type="{http://api.thomascook.com/basket/1.0/common}AgeCode" />
 *       &lt;attribute name="Amount" type="{http://api.thomascook.com/basket/1.0/common}Money" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomPrice", namespace = "http://api.thomascook.com/basket/1.0/accommodation")
public class RoomPrice
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 12345L;
    @XmlAttribute(name = "AgeQualifyingCode", required = true)
    @NotNull
    protected AgeCode ageQualifyingCode;
    @XmlAttribute(name = "Amount")
    @Digits(integer = 10, fraction = 2)
    protected BigDecimal amount;

    /**
     * Gets the value of the ageQualifyingCode property.
     * 
     * @return
     *     possible object is
     *     {@link AgeCode }
     *     
     */
    public AgeCode getAgeQualifyingCode() {
        return ageQualifyingCode;
    }

    /**
     * Sets the value of the ageQualifyingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgeCode }
     *     
     */
    public void setAgeQualifyingCode(AgeCode value) {
        this.ageQualifyingCode = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RoomPrice)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RoomPrice that = ((RoomPrice) object);
        {
            AgeCode lhsAgeQualifyingCode;
            lhsAgeQualifyingCode = this.getAgeQualifyingCode();
            AgeCode rhsAgeQualifyingCode;
            rhsAgeQualifyingCode = that.getAgeQualifyingCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ageQualifyingCode", lhsAgeQualifyingCode), LocatorUtils.property(thatLocator, "ageQualifyingCode", rhsAgeQualifyingCode), lhsAgeQualifyingCode, rhsAgeQualifyingCode)) {
                return false;
            }
        }
        {
            BigDecimal lhsAmount;
            lhsAmount = this.getAmount();
            BigDecimal rhsAmount;
            rhsAmount = that.getAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "amount", lhsAmount), LocatorUtils.property(thatLocator, "amount", rhsAmount), lhsAmount, rhsAmount)) {
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
            AgeCode theAgeQualifyingCode;
            theAgeQualifyingCode = this.getAgeQualifyingCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ageQualifyingCode", theAgeQualifyingCode), currentHashCode, theAgeQualifyingCode);
        }
        {
            BigDecimal theAmount;
            theAmount = this.getAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "amount", theAmount), currentHashCode, theAmount);
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
            AgeCode theAgeQualifyingCode;
            theAgeQualifyingCode = this.getAgeQualifyingCode();
            strategy.appendField(locator, this, "ageQualifyingCode", buffer, theAgeQualifyingCode);
        }
        {
            BigDecimal theAmount;
            theAmount = this.getAmount();
            strategy.appendField(locator, this, "amount", buffer, theAmount);
        }
        return buffer;
    }

}
