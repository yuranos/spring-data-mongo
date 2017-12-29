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
 * <p>Java class for PaymentGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://api.thomascook.com/basket/1.0/common}displayAttributes"/>
 *       &lt;attribute name="groupName" type="{http://api.thomascook.com/basket/1.0/common}PaymentGroupType" />
 *       &lt;attribute name="displayOrder" type="{http://api.thomascook.com/basket/1.0/common}DisplayOrder" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentGroup")
public class PaymentGroup
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 12345L;
    @XmlAttribute(name = "groupName")
    protected PaymentGroupType groupName;
    @XmlAttribute(name = "displayOrder")
    protected Integer displayOrder;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "DisplayText")
    protected String displayText;

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentGroupType }
     *     
     */
    public PaymentGroupType getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentGroupType }
     *     
     */
    public void setGroupName(PaymentGroupType value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the displayOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * Sets the value of the displayOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplayOrder(Integer value) {
        this.displayOrder = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the displayText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayText() {
        return displayText;
    }

    /**
     * Sets the value of the displayText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayText(String value) {
        this.displayText = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PaymentGroup)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PaymentGroup that = ((PaymentGroup) object);
        {
            PaymentGroupType lhsGroupName;
            lhsGroupName = this.getGroupName();
            PaymentGroupType rhsGroupName;
            rhsGroupName = that.getGroupName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "groupName", lhsGroupName), LocatorUtils.property(thatLocator, "groupName", rhsGroupName), lhsGroupName, rhsGroupName)) {
                return false;
            }
        }
        {
            Integer lhsDisplayOrder;
            lhsDisplayOrder = this.getDisplayOrder();
            Integer rhsDisplayOrder;
            rhsDisplayOrder = that.getDisplayOrder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "displayOrder", lhsDisplayOrder), LocatorUtils.property(thatLocator, "displayOrder", rhsDisplayOrder), lhsDisplayOrder, rhsDisplayOrder)) {
                return false;
            }
        }
        {
            String lhsKey;
            lhsKey = this.getKey();
            String rhsKey;
            rhsKey = that.getKey();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "key", lhsKey), LocatorUtils.property(thatLocator, "key", rhsKey), lhsKey, rhsKey)) {
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
            PaymentGroupType theGroupName;
            theGroupName = this.getGroupName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "groupName", theGroupName), currentHashCode, theGroupName);
        }
        {
            Integer theDisplayOrder;
            theDisplayOrder = this.getDisplayOrder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "displayOrder", theDisplayOrder), currentHashCode, theDisplayOrder);
        }
        {
            String theKey;
            theKey = this.getKey();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "key", theKey), currentHashCode, theKey);
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
            PaymentGroupType theGroupName;
            theGroupName = this.getGroupName();
            strategy.appendField(locator, this, "groupName", buffer, theGroupName);
        }
        {
            Integer theDisplayOrder;
            theDisplayOrder = this.getDisplayOrder();
            strategy.appendField(locator, this, "displayOrder", buffer, theDisplayOrder);
        }
        {
            String theKey;
            theKey = this.getKey();
            strategy.appendField(locator, this, "key", buffer, theKey);
        }
        {
            String theDisplayText;
            theDisplayText = this.getDisplayText();
            strategy.appendField(locator, this, "displayText", buffer, theDisplayText);
        }
        return buffer;
    }

}
