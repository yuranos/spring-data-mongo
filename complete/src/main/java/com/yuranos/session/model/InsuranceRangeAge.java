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

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.math.BigInteger;


/**
 * <p>Java class for InsuranceRangeAge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsuranceRangeAge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="LowerAge" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="UpperAge" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceRangeAge", namespace = "http://api.thomascook.com/basket/1.0/insurance")
public class InsuranceRangeAge
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 12345L;
    @XmlAttribute(name = "LowerAge", required = true)
    @NotNull
    protected BigInteger lowerAge;
    @XmlAttribute(name = "UpperAge", required = true)
    @NotNull
    protected BigInteger upperAge;

    /**
     * Gets the value of the lowerAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLowerAge() {
        return lowerAge;
    }

    /**
     * Sets the value of the lowerAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLowerAge(BigInteger value) {
        this.lowerAge = value;
    }

    /**
     * Gets the value of the upperAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUpperAge() {
        return upperAge;
    }

    /**
     * Sets the value of the upperAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUpperAge(BigInteger value) {
        this.upperAge = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof InsuranceRangeAge)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final InsuranceRangeAge that = ((InsuranceRangeAge) object);
        {
            BigInteger lhsLowerAge;
            lhsLowerAge = this.getLowerAge();
            BigInteger rhsLowerAge;
            rhsLowerAge = that.getLowerAge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lowerAge", lhsLowerAge), LocatorUtils.property(thatLocator, "lowerAge", rhsLowerAge), lhsLowerAge, rhsLowerAge)) {
                return false;
            }
        }
        {
            BigInteger lhsUpperAge;
            lhsUpperAge = this.getUpperAge();
            BigInteger rhsUpperAge;
            rhsUpperAge = that.getUpperAge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "upperAge", lhsUpperAge), LocatorUtils.property(thatLocator, "upperAge", rhsUpperAge), lhsUpperAge, rhsUpperAge)) {
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
            BigInteger theLowerAge;
            theLowerAge = this.getLowerAge();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lowerAge", theLowerAge), currentHashCode, theLowerAge);
        }
        {
            BigInteger theUpperAge;
            theUpperAge = this.getUpperAge();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "upperAge", theUpperAge), currentHashCode, theUpperAge);
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
            BigInteger theLowerAge;
            theLowerAge = this.getLowerAge();
            strategy.appendField(locator, this, "lowerAge", buffer, theLowerAge);
        }
        {
            BigInteger theUpperAge;
            theUpperAge = this.getUpperAge();
            strategy.appendField(locator, this, "upperAge", buffer, theUpperAge);
        }
        return buffer;
    }

}
