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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for Links complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Links">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Self" type="{http://api.thomascook.com/basket/1.0/common}Link"/>
 *         &lt;element name="Back" type="{http://api.thomascook.com/basket/1.0/common}Link" minOccurs="0"/>
 *         &lt;element name="Next" type="{http://api.thomascook.com/basket/1.0/common}Link" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Links", propOrder = {
    "self",
    "back",
    "next"
})
public class Links
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 12345L;
    @XmlElement(name = "Self", required = true)
    @NotNull
    @Valid
    protected Link self;
    @XmlElement(name = "Back")
    @Valid
    protected Link back;
    @XmlElement(name = "Next")
    @Valid
    protected Link next;

    /**
     * Gets the value of the self property.
     * 
     * @return
     *     possible object is
     *     {@link Link }
     *     
     */
    public Link getSelf() {
        return self;
    }

    /**
     * Sets the value of the self property.
     * 
     * @param value
     *     allowed object is
     *     {@link Link }
     *     
     */
    public void setSelf(Link value) {
        this.self = value;
    }

    /**
     * Gets the value of the back property.
     * 
     * @return
     *     possible object is
     *     {@link Link }
     *     
     */
    public Link getBack() {
        return back;
    }

    /**
     * Sets the value of the back property.
     * 
     * @param value
     *     allowed object is
     *     {@link Link }
     *     
     */
    public void setBack(Link value) {
        this.back = value;
    }

    /**
     * Gets the value of the next property.
     * 
     * @return
     *     possible object is
     *     {@link Link }
     *     
     */
    public Link getNext() {
        return next;
    }

    /**
     * Sets the value of the next property.
     * 
     * @param value
     *     allowed object is
     *     {@link Link }
     *     
     */
    public void setNext(Link value) {
        this.next = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Links)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Links that = ((Links) object);
        {
            Link lhsSelf;
            lhsSelf = this.getSelf();
            Link rhsSelf;
            rhsSelf = that.getSelf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "self", lhsSelf), LocatorUtils.property(thatLocator, "self", rhsSelf), lhsSelf, rhsSelf)) {
                return false;
            }
        }
        {
            Link lhsBack;
            lhsBack = this.getBack();
            Link rhsBack;
            rhsBack = that.getBack();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "back", lhsBack), LocatorUtils.property(thatLocator, "back", rhsBack), lhsBack, rhsBack)) {
                return false;
            }
        }
        {
            Link lhsNext;
            lhsNext = this.getNext();
            Link rhsNext;
            rhsNext = that.getNext();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "next", lhsNext), LocatorUtils.property(thatLocator, "next", rhsNext), lhsNext, rhsNext)) {
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
            Link theSelf;
            theSelf = this.getSelf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "self", theSelf), currentHashCode, theSelf);
        }
        {
            Link theBack;
            theBack = this.getBack();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "back", theBack), currentHashCode, theBack);
        }
        {
            Link theNext;
            theNext = this.getNext();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "next", theNext), currentHashCode, theNext);
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
            Link theSelf;
            theSelf = this.getSelf();
            strategy.appendField(locator, this, "self", buffer, theSelf);
        }
        {
            Link theBack;
            theBack = this.getBack();
            strategy.appendField(locator, this, "back", buffer, theBack);
        }
        {
            Link theNext;
            theNext = this.getNext();
            strategy.appendField(locator, this, "next", buffer, theNext);
        }
        return buffer;
    }

}
