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


/**
 * Telephone number.
 * 
 * <p>Java class for TelephoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelephoneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="PhoneNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PhoneUseType" type="{http://api.thomascook.com/basket/1.0/common}PhoneUseType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephoneType")
public class TelephoneType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 12345L;
    @XmlAttribute(name = "PhoneNumber", required = true)
    @NotNull
    protected String phoneNumber;
    @XmlAttribute(name = "PhoneUseType")
    protected PhoneUseType phoneUseType;

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the phoneUseType property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneUseType }
     *     
     */
    public PhoneUseType getPhoneUseType() {
        return phoneUseType;
    }

    /**
     * Sets the value of the phoneUseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneUseType }
     *     
     */
    public void setPhoneUseType(PhoneUseType value) {
        this.phoneUseType = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TelephoneType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TelephoneType that = ((TelephoneType) object);
        {
            String lhsPhoneNumber;
            lhsPhoneNumber = this.getPhoneNumber();
            String rhsPhoneNumber;
            rhsPhoneNumber = that.getPhoneNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phoneNumber", lhsPhoneNumber), LocatorUtils.property(thatLocator, "phoneNumber", rhsPhoneNumber), lhsPhoneNumber, rhsPhoneNumber)) {
                return false;
            }
        }
        {
            PhoneUseType lhsPhoneUseType;
            lhsPhoneUseType = this.getPhoneUseType();
            PhoneUseType rhsPhoneUseType;
            rhsPhoneUseType = that.getPhoneUseType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phoneUseType", lhsPhoneUseType), LocatorUtils.property(thatLocator, "phoneUseType", rhsPhoneUseType), lhsPhoneUseType, rhsPhoneUseType)) {
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
            String thePhoneNumber;
            thePhoneNumber = this.getPhoneNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "phoneNumber", thePhoneNumber), currentHashCode, thePhoneNumber);
        }
        {
            PhoneUseType thePhoneUseType;
            thePhoneUseType = this.getPhoneUseType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "phoneUseType", thePhoneUseType), currentHashCode, thePhoneUseType);
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
            String thePhoneNumber;
            thePhoneNumber = this.getPhoneNumber();
            strategy.appendField(locator, this, "phoneNumber", buffer, thePhoneNumber);
        }
        {
            PhoneUseType thePhoneUseType;
            thePhoneUseType = this.getPhoneUseType();
            strategy.appendField(locator, this, "phoneUseType", buffer, thePhoneUseType);
        }
        return buffer;
    }

}