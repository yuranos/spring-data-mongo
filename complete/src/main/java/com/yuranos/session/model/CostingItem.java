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

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for CostingItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CostingItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://api.thomascook.com/basket/1.0/common}displayAttributes"/>
 *       &lt;attribute name="ReferenceId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UIFamily" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UnitCost" type="{http://api.thomascook.com/basket/1.0/common}Money" />
 *       &lt;attribute name="ExtendedCost" type="{http://api.thomascook.com/basket/1.0/common}Money" />
 *       &lt;attribute name="Category" type="{http://api.thomascook.com/basket/1.0/common}CostingItemCategory" />
 *       &lt;attribute name="Group" type="{http://api.thomascook.com/basket/1.0/common}CostingItemGroup" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CostingItem", propOrder = {
    "referenceIds"
})
public class CostingItem
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 12345L;
    @XmlElement(name = "ReferenceIds")
    @Size(min = 0, max = 99)
    protected List<String> referenceIds;
    @XmlAttribute(name = "ReferenceId")
    protected String referenceId;
    @XmlAttribute(name = "UIFamily")
    protected String uiFamily;
    @XmlAttribute(name = "code")
    protected String code;
    @XmlAttribute(name = "UnitCost")
    @Digits(integer = 10, fraction = 2)
    protected BigDecimal unitCost;
    @XmlAttribute(name = "ExtendedCost")
    @Digits(integer = 10, fraction = 2)
    protected BigDecimal extendedCost;
    @XmlAttribute(name = "Category")
    protected CostingItemCategory category;
    @XmlAttribute(name = "Group")
    protected CostingItemGroup group;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "Quantity", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    @NotNull
    @DecimalMin("0")
    protected BigInteger quantity;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "DisplayText")
    protected String displayText;

    /**
     * Gets the value of the referenceIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReferenceIds() {
        if (referenceIds == null) {
            referenceIds = new ArrayList<String>();
        }
        return this.referenceIds;
    }

    /**
     * Gets the value of the referenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets the value of the referenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId(String value) {
        this.referenceId = value;
    }

    /**
     * Gets the value of the uiFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUIFamily() {
        return uiFamily;
    }

    /**
     * Sets the value of the uiFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUIFamily(String value) {
        this.uiFamily = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the unitCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitCost() {
        return unitCost;
    }

    /**
     * Sets the value of the unitCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitCost(BigDecimal value) {
        this.unitCost = value;
    }

    /**
     * Gets the value of the extendedCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExtendedCost() {
        return extendedCost;
    }

    /**
     * Sets the value of the extendedCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExtendedCost(BigDecimal value) {
        this.extendedCost = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link CostingItemCategory }
     *     
     */
    public CostingItemCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostingItemCategory }
     *     
     */
    public void setCategory(CostingItemCategory value) {
        this.category = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link CostingItemGroup }
     *     
     */
    public CostingItemGroup getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostingItemGroup }
     *     
     */
    public void setGroup(CostingItemGroup value) {
        this.group = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
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
        if (!(object instanceof CostingItem)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CostingItem that = ((CostingItem) object);
        {
            List<String> lhsReferenceIds;
            lhsReferenceIds = (((this.referenceIds!= null)&&(!this.referenceIds.isEmpty()))?this.getReferenceIds():null);
            List<String> rhsReferenceIds;
            rhsReferenceIds = (((that.referenceIds!= null)&&(!that.referenceIds.isEmpty()))?that.getReferenceIds():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceIds", lhsReferenceIds), LocatorUtils.property(thatLocator, "referenceIds", rhsReferenceIds), lhsReferenceIds, rhsReferenceIds)) {
                return false;
            }
        }
        {
            String lhsReferenceId;
            lhsReferenceId = this.getReferenceId();
            String rhsReferenceId;
            rhsReferenceId = that.getReferenceId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceId", lhsReferenceId), LocatorUtils.property(thatLocator, "referenceId", rhsReferenceId), lhsReferenceId, rhsReferenceId)) {
                return false;
            }
        }
        {
            String lhsUIFamily;
            lhsUIFamily = this.getUIFamily();
            String rhsUIFamily;
            rhsUIFamily = that.getUIFamily();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uiFamily", lhsUIFamily), LocatorUtils.property(thatLocator, "uiFamily", rhsUIFamily), lhsUIFamily, rhsUIFamily)) {
                return false;
            }
        }
        {
            String lhsCode;
            lhsCode = this.getCode();
            String rhsCode;
            rhsCode = that.getCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "code", lhsCode), LocatorUtils.property(thatLocator, "code", rhsCode), lhsCode, rhsCode)) {
                return false;
            }
        }
        {
            BigDecimal lhsUnitCost;
            lhsUnitCost = this.getUnitCost();
            BigDecimal rhsUnitCost;
            rhsUnitCost = that.getUnitCost();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitCost", lhsUnitCost), LocatorUtils.property(thatLocator, "unitCost", rhsUnitCost), lhsUnitCost, rhsUnitCost)) {
                return false;
            }
        }
        {
            BigDecimal lhsExtendedCost;
            lhsExtendedCost = this.getExtendedCost();
            BigDecimal rhsExtendedCost;
            rhsExtendedCost = that.getExtendedCost();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extendedCost", lhsExtendedCost), LocatorUtils.property(thatLocator, "extendedCost", rhsExtendedCost), lhsExtendedCost, rhsExtendedCost)) {
                return false;
            }
        }
        {
            CostingItemCategory lhsCategory;
            lhsCategory = this.getCategory();
            CostingItemCategory rhsCategory;
            rhsCategory = that.getCategory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "category", lhsCategory), LocatorUtils.property(thatLocator, "category", rhsCategory), lhsCategory, rhsCategory)) {
                return false;
            }
        }
        {
            CostingItemGroup lhsGroup;
            lhsGroup = this.getGroup();
            CostingItemGroup rhsGroup;
            rhsGroup = that.getGroup();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "group", lhsGroup), LocatorUtils.property(thatLocator, "group", rhsGroup), lhsGroup, rhsGroup)) {
                return false;
            }
        }
        {
            String lhsType;
            lhsType = this.getType();
            String rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            BigInteger lhsQuantity;
            lhsQuantity = this.getQuantity();
            BigInteger rhsQuantity;
            rhsQuantity = that.getQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantity", lhsQuantity), LocatorUtils.property(thatLocator, "quantity", rhsQuantity), lhsQuantity, rhsQuantity)) {
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
            List<String> theReferenceIds;
            theReferenceIds = (((this.referenceIds!= null)&&(!this.referenceIds.isEmpty()))?this.getReferenceIds():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenceIds", theReferenceIds), currentHashCode, theReferenceIds);
        }
        {
            String theReferenceId;
            theReferenceId = this.getReferenceId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenceId", theReferenceId), currentHashCode, theReferenceId);
        }
        {
            String theUIFamily;
            theUIFamily = this.getUIFamily();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uiFamily", theUIFamily), currentHashCode, theUIFamily);
        }
        {
            String theCode;
            theCode = this.getCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "code", theCode), currentHashCode, theCode);
        }
        {
            BigDecimal theUnitCost;
            theUnitCost = this.getUnitCost();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitCost", theUnitCost), currentHashCode, theUnitCost);
        }
        {
            BigDecimal theExtendedCost;
            theExtendedCost = this.getExtendedCost();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extendedCost", theExtendedCost), currentHashCode, theExtendedCost);
        }
        {
            CostingItemCategory theCategory;
            theCategory = this.getCategory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "category", theCategory), currentHashCode, theCategory);
        }
        {
            CostingItemGroup theGroup;
            theGroup = this.getGroup();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "group", theGroup), currentHashCode, theGroup);
        }
        {
            String theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            BigInteger theQuantity;
            theQuantity = this.getQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantity", theQuantity), currentHashCode, theQuantity);
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
            List<String> theReferenceIds;
            theReferenceIds = (((this.referenceIds!= null)&&(!this.referenceIds.isEmpty()))?this.getReferenceIds():null);
            strategy.appendField(locator, this, "referenceIds", buffer, theReferenceIds);
        }
        {
            String theReferenceId;
            theReferenceId = this.getReferenceId();
            strategy.appendField(locator, this, "referenceId", buffer, theReferenceId);
        }
        {
            String theUIFamily;
            theUIFamily = this.getUIFamily();
            strategy.appendField(locator, this, "uiFamily", buffer, theUIFamily);
        }
        {
            String theCode;
            theCode = this.getCode();
            strategy.appendField(locator, this, "code", buffer, theCode);
        }
        {
            BigDecimal theUnitCost;
            theUnitCost = this.getUnitCost();
            strategy.appendField(locator, this, "unitCost", buffer, theUnitCost);
        }
        {
            BigDecimal theExtendedCost;
            theExtendedCost = this.getExtendedCost();
            strategy.appendField(locator, this, "extendedCost", buffer, theExtendedCost);
        }
        {
            CostingItemCategory theCategory;
            theCategory = this.getCategory();
            strategy.appendField(locator, this, "category", buffer, theCategory);
        }
        {
            CostingItemGroup theGroup;
            theGroup = this.getGroup();
            strategy.appendField(locator, this, "group", buffer, theGroup);
        }
        {
            String theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            BigInteger theQuantity;
            theQuantity = this.getQuantity();
            strategy.appendField(locator, this, "quantity", buffer, theQuantity);
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

    /**
     * Sets the value of the referenceIds property.
     * 
     * @param referenceIds
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceIds(List<String> referenceIds) {
        this.referenceIds = referenceIds;
    }

}
