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
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * A definition for an extra that is available for a selected package.
 * 
 * <p>Java class for AvailableExtra complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailableExtra">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Criteria" type="{http://api.thomascook.com/basket/1.0/extra}CriteriaType" minOccurs="0"/>
 *         &lt;element ref="{http://api.thomascook.com/basket/1.0/extra}Price" maxOccurs="4" minOccurs="0"/>
 *         &lt;element ref="{http://api.thomascook.com/basket/1.0/extra}Leg" maxOccurs="16" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{http://api.thomascook.com/basket/1.0/common}Context" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://api.thomascook.com/basket/1.0/common}displayAttributes"/>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="included" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Supplier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FPC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SelectionType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="QuantityAvailable" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="MaxChildAge" type="{http://www.w3.org/2001/XMLSchema}integer" default="99" />
 *       &lt;attribute name="QuantitySelected" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="AdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FullDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RelatedAvailableExtraCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailableExtra", namespace = "http://api.thomascook.com/basket/1.0/extra", propOrder = {
    "criteria",
    "price",
    "leg",
    "customFields"
})
public class AvailableExtra
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 12345L;
    @XmlElement(name = "Criteria")
    @Valid
    protected CriteriaType criteria;
    @XmlElement(name = "Price")
    @Size(min = 0, max = 4)
    @Valid
    protected List<Price> price;
    @XmlElement(name = "Leg")
    @Size(min = 0, max = 16)
    @Valid
    protected List<Leg> leg;
    @XmlElement(name = "CustomFields")
    @Valid
    protected Context customFields;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    @NotNull
    @Pattern(regexp = "[[_:A-Za-z]-[:]][[-._:A-Za-z0-9]-[:]]*")
    protected String id;
    @XmlAttribute(name = "included")
    protected Boolean included;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "Supplier")
    protected String supplier;
    @XmlAttribute(name = "FPC")
    protected String fpc;
    @XmlAttribute(name = "SelectionType", required = true)
    @NotNull
    protected String selectionType;
    @XmlAttribute(name = "QuantityAvailable")
    protected BigInteger quantityAvailable;
    @XmlAttribute(name = "MaxChildAge")
    protected BigInteger maxChildAge;
    @XmlAttribute(name = "QuantitySelected")
    protected BigInteger quantitySelected;
    @XmlAttribute(name = "AdditionalInfo")
    protected String additionalInfo;
    @XmlAttribute(name = "Title")
    protected String title;
    @XmlAttribute(name = "FullDescription")
    protected String fullDescription;
    @XmlAttribute(name = "RelatedAvailableExtraCode")
    protected String relatedAvailableExtraCode;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "DisplayText")
    protected String displayText;

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link CriteriaType }
     *     
     */
    public CriteriaType getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriteriaType }
     *     
     */
    public void setCriteria(CriteriaType value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the price property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Price }
     * 
     * 
     */
    public List<Price> getPrice() {
        if (price == null) {
            price = new ArrayList<Price>();
        }
        return this.price;
    }

    /**
     * For Tosca, all the available extras will be linked with leg Details. When the
     *                         extra applies to all journey, then only one Leg shall be filled up.
     *                     Gets the value of the leg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Leg }
     * 
     * 
     */
    public List<Leg> getLeg() {
        if (leg == null) {
            leg = new ArrayList<Leg>();
        }
        return this.leg;
    }

    /**
     * Gets the value of the customFields property.
     * 
     * @return
     *     possible object is
     *     {@link Context }
     *     
     */
    public Context getCustomFields() {
        return customFields;
    }

    /**
     * Sets the value of the customFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context }
     *     
     */
    public void setCustomFields(Context value) {
        this.customFields = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the included property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIncluded() {
        return included;
    }

    /**
     * Sets the value of the included property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncluded(Boolean value) {
        this.included = value;
    }

    /**
     * Gets the value of the rph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
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
     * Gets the value of the supplier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplier(String value) {
        this.supplier = value;
    }

    /**
     * Gets the value of the fpc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFPC() {
        return fpc;
    }

    /**
     * Sets the value of the fpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFPC(String value) {
        this.fpc = value;
    }

    /**
     * Gets the value of the selectionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectionType() {
        return selectionType;
    }

    /**
     * Sets the value of the selectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectionType(String value) {
        this.selectionType = value;
    }

    /**
     * Gets the value of the quantityAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantityAvailable() {
        return quantityAvailable;
    }

    /**
     * Sets the value of the quantityAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantityAvailable(BigInteger value) {
        this.quantityAvailable = value;
    }

    /**
     * Gets the value of the maxChildAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxChildAge() {
        if (maxChildAge == null) {
            return new BigInteger("99");
        } else {
            return maxChildAge;
        }
    }

    /**
     * Sets the value of the maxChildAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxChildAge(BigInteger value) {
        this.maxChildAge = value;
    }

    /**
     * Gets the value of the quantitySelected property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantitySelected() {
        return quantitySelected;
    }

    /**
     * Sets the value of the quantitySelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantitySelected(BigInteger value) {
        this.quantitySelected = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the fullDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullDescription() {
        return fullDescription;
    }

    /**
     * Sets the value of the fullDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullDescription(String value) {
        this.fullDescription = value;
    }

    /**
     * Gets the value of the relatedAvailableExtraCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedAvailableExtraCode() {
        return relatedAvailableExtraCode;
    }

    /**
     * Sets the value of the relatedAvailableExtraCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedAvailableExtraCode(String value) {
        this.relatedAvailableExtraCode = value;
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
        if (!(object instanceof AvailableExtra)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AvailableExtra that = ((AvailableExtra) object);
        {
            CriteriaType lhsCriteria;
            lhsCriteria = this.getCriteria();
            CriteriaType rhsCriteria;
            rhsCriteria = that.getCriteria();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "criteria", lhsCriteria), LocatorUtils.property(thatLocator, "criteria", rhsCriteria), lhsCriteria, rhsCriteria)) {
                return false;
            }
        }
        {
            List<Price> lhsPrice;
            lhsPrice = (((this.price!= null)&&(!this.price.isEmpty()))?this.getPrice():null);
            List<Price> rhsPrice;
            rhsPrice = (((that.price!= null)&&(!that.price.isEmpty()))?that.getPrice():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "price", lhsPrice), LocatorUtils.property(thatLocator, "price", rhsPrice), lhsPrice, rhsPrice)) {
                return false;
            }
        }
        {
            List<Leg> lhsLeg;
            lhsLeg = (((this.leg!= null)&&(!this.leg.isEmpty()))?this.getLeg():null);
            List<Leg> rhsLeg;
            rhsLeg = (((that.leg!= null)&&(!that.leg.isEmpty()))?that.getLeg():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leg", lhsLeg), LocatorUtils.property(thatLocator, "leg", rhsLeg), lhsLeg, rhsLeg)) {
                return false;
            }
        }
        {
            Context lhsCustomFields;
            lhsCustomFields = this.getCustomFields();
            Context rhsCustomFields;
            rhsCustomFields = that.getCustomFields();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customFields", lhsCustomFields), LocatorUtils.property(thatLocator, "customFields", rhsCustomFields), lhsCustomFields, rhsCustomFields)) {
                return false;
            }
        }
        {
            String lhsID;
            lhsID = this.getID();
            String rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID)) {
                return false;
            }
        }
        {
            Boolean lhsIncluded;
            lhsIncluded = this.getIncluded();
            Boolean rhsIncluded;
            rhsIncluded = that.getIncluded();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "included", lhsIncluded), LocatorUtils.property(thatLocator, "included", rhsIncluded), lhsIncluded, rhsIncluded)) {
                return false;
            }
        }
        {
            String lhsRPH;
            lhsRPH = this.getRPH();
            String rhsRPH;
            rhsRPH = that.getRPH();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rph", lhsRPH), LocatorUtils.property(thatLocator, "rph", rhsRPH), lhsRPH, rhsRPH)) {
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
            String lhsSupplier;
            lhsSupplier = this.getSupplier();
            String rhsSupplier;
            rhsSupplier = that.getSupplier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "supplier", lhsSupplier), LocatorUtils.property(thatLocator, "supplier", rhsSupplier), lhsSupplier, rhsSupplier)) {
                return false;
            }
        }
        {
            String lhsFPC;
            lhsFPC = this.getFPC();
            String rhsFPC;
            rhsFPC = that.getFPC();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fpc", lhsFPC), LocatorUtils.property(thatLocator, "fpc", rhsFPC), lhsFPC, rhsFPC)) {
                return false;
            }
        }
        {
            String lhsSelectionType;
            lhsSelectionType = this.getSelectionType();
            String rhsSelectionType;
            rhsSelectionType = that.getSelectionType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "selectionType", lhsSelectionType), LocatorUtils.property(thatLocator, "selectionType", rhsSelectionType), lhsSelectionType, rhsSelectionType)) {
                return false;
            }
        }
        {
            BigInteger lhsQuantityAvailable;
            lhsQuantityAvailable = this.getQuantityAvailable();
            BigInteger rhsQuantityAvailable;
            rhsQuantityAvailable = that.getQuantityAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantityAvailable", lhsQuantityAvailable), LocatorUtils.property(thatLocator, "quantityAvailable", rhsQuantityAvailable), lhsQuantityAvailable, rhsQuantityAvailable)) {
                return false;
            }
        }
        {
            BigInteger lhsMaxChildAge;
            lhsMaxChildAge = this.getMaxChildAge();
            BigInteger rhsMaxChildAge;
            rhsMaxChildAge = that.getMaxChildAge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxChildAge", lhsMaxChildAge), LocatorUtils.property(thatLocator, "maxChildAge", rhsMaxChildAge), lhsMaxChildAge, rhsMaxChildAge)) {
                return false;
            }
        }
        {
            BigInteger lhsQuantitySelected;
            lhsQuantitySelected = this.getQuantitySelected();
            BigInteger rhsQuantitySelected;
            rhsQuantitySelected = that.getQuantitySelected();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantitySelected", lhsQuantitySelected), LocatorUtils.property(thatLocator, "quantitySelected", rhsQuantitySelected), lhsQuantitySelected, rhsQuantitySelected)) {
                return false;
            }
        }
        {
            String lhsAdditionalInfo;
            lhsAdditionalInfo = this.getAdditionalInfo();
            String rhsAdditionalInfo;
            rhsAdditionalInfo = that.getAdditionalInfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalInfo", lhsAdditionalInfo), LocatorUtils.property(thatLocator, "additionalInfo", rhsAdditionalInfo), lhsAdditionalInfo, rhsAdditionalInfo)) {
                return false;
            }
        }
        {
            String lhsTitle;
            lhsTitle = this.getTitle();
            String rhsTitle;
            rhsTitle = that.getTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "title", lhsTitle), LocatorUtils.property(thatLocator, "title", rhsTitle), lhsTitle, rhsTitle)) {
                return false;
            }
        }
        {
            String lhsFullDescription;
            lhsFullDescription = this.getFullDescription();
            String rhsFullDescription;
            rhsFullDescription = that.getFullDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fullDescription", lhsFullDescription), LocatorUtils.property(thatLocator, "fullDescription", rhsFullDescription), lhsFullDescription, rhsFullDescription)) {
                return false;
            }
        }
        {
            String lhsRelatedAvailableExtraCode;
            lhsRelatedAvailableExtraCode = this.getRelatedAvailableExtraCode();
            String rhsRelatedAvailableExtraCode;
            rhsRelatedAvailableExtraCode = that.getRelatedAvailableExtraCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "relatedAvailableExtraCode", lhsRelatedAvailableExtraCode), LocatorUtils.property(thatLocator, "relatedAvailableExtraCode", rhsRelatedAvailableExtraCode), lhsRelatedAvailableExtraCode, rhsRelatedAvailableExtraCode)) {
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
            CriteriaType theCriteria;
            theCriteria = this.getCriteria();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "criteria", theCriteria), currentHashCode, theCriteria);
        }
        {
            List<Price> thePrice;
            thePrice = (((this.price!= null)&&(!this.price.isEmpty()))?this.getPrice():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "price", thePrice), currentHashCode, thePrice);
        }
        {
            List<Leg> theLeg;
            theLeg = (((this.leg!= null)&&(!this.leg.isEmpty()))?this.getLeg():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leg", theLeg), currentHashCode, theLeg);
        }
        {
            Context theCustomFields;
            theCustomFields = this.getCustomFields();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customFields", theCustomFields), currentHashCode, theCustomFields);
        }
        {
            String theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID);
        }
        {
            Boolean theIncluded;
            theIncluded = this.getIncluded();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "included", theIncluded), currentHashCode, theIncluded);
        }
        {
            String theRPH;
            theRPH = this.getRPH();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rph", theRPH), currentHashCode, theRPH);
        }
        {
            String theCode;
            theCode = this.getCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "code", theCode), currentHashCode, theCode);
        }
        {
            String theSupplier;
            theSupplier = this.getSupplier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "supplier", theSupplier), currentHashCode, theSupplier);
        }
        {
            String theFPC;
            theFPC = this.getFPC();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fpc", theFPC), currentHashCode, theFPC);
        }
        {
            String theSelectionType;
            theSelectionType = this.getSelectionType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "selectionType", theSelectionType), currentHashCode, theSelectionType);
        }
        {
            BigInteger theQuantityAvailable;
            theQuantityAvailable = this.getQuantityAvailable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantityAvailable", theQuantityAvailable), currentHashCode, theQuantityAvailable);
        }
        {
            BigInteger theMaxChildAge;
            theMaxChildAge = this.getMaxChildAge();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxChildAge", theMaxChildAge), currentHashCode, theMaxChildAge);
        }
        {
            BigInteger theQuantitySelected;
            theQuantitySelected = this.getQuantitySelected();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantitySelected", theQuantitySelected), currentHashCode, theQuantitySelected);
        }
        {
            String theAdditionalInfo;
            theAdditionalInfo = this.getAdditionalInfo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "additionalInfo", theAdditionalInfo), currentHashCode, theAdditionalInfo);
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "title", theTitle), currentHashCode, theTitle);
        }
        {
            String theFullDescription;
            theFullDescription = this.getFullDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fullDescription", theFullDescription), currentHashCode, theFullDescription);
        }
        {
            String theRelatedAvailableExtraCode;
            theRelatedAvailableExtraCode = this.getRelatedAvailableExtraCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "relatedAvailableExtraCode", theRelatedAvailableExtraCode), currentHashCode, theRelatedAvailableExtraCode);
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
            CriteriaType theCriteria;
            theCriteria = this.getCriteria();
            strategy.appendField(locator, this, "criteria", buffer, theCriteria);
        }
        {
            List<Price> thePrice;
            thePrice = (((this.price!= null)&&(!this.price.isEmpty()))?this.getPrice():null);
            strategy.appendField(locator, this, "price", buffer, thePrice);
        }
        {
            List<Leg> theLeg;
            theLeg = (((this.leg!= null)&&(!this.leg.isEmpty()))?this.getLeg():null);
            strategy.appendField(locator, this, "leg", buffer, theLeg);
        }
        {
            Context theCustomFields;
            theCustomFields = this.getCustomFields();
            strategy.appendField(locator, this, "customFields", buffer, theCustomFields);
        }
        {
            String theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID);
        }
        {
            Boolean theIncluded;
            theIncluded = this.getIncluded();
            strategy.appendField(locator, this, "included", buffer, theIncluded);
        }
        {
            String theRPH;
            theRPH = this.getRPH();
            strategy.appendField(locator, this, "rph", buffer, theRPH);
        }
        {
            String theCode;
            theCode = this.getCode();
            strategy.appendField(locator, this, "code", buffer, theCode);
        }
        {
            String theSupplier;
            theSupplier = this.getSupplier();
            strategy.appendField(locator, this, "supplier", buffer, theSupplier);
        }
        {
            String theFPC;
            theFPC = this.getFPC();
            strategy.appendField(locator, this, "fpc", buffer, theFPC);
        }
        {
            String theSelectionType;
            theSelectionType = this.getSelectionType();
            strategy.appendField(locator, this, "selectionType", buffer, theSelectionType);
        }
        {
            BigInteger theQuantityAvailable;
            theQuantityAvailable = this.getQuantityAvailable();
            strategy.appendField(locator, this, "quantityAvailable", buffer, theQuantityAvailable);
        }
        {
            BigInteger theMaxChildAge;
            theMaxChildAge = this.getMaxChildAge();
            strategy.appendField(locator, this, "maxChildAge", buffer, theMaxChildAge);
        }
        {
            BigInteger theQuantitySelected;
            theQuantitySelected = this.getQuantitySelected();
            strategy.appendField(locator, this, "quantitySelected", buffer, theQuantitySelected);
        }
        {
            String theAdditionalInfo;
            theAdditionalInfo = this.getAdditionalInfo();
            strategy.appendField(locator, this, "additionalInfo", buffer, theAdditionalInfo);
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle);
        }
        {
            String theFullDescription;
            theFullDescription = this.getFullDescription();
            strategy.appendField(locator, this, "fullDescription", buffer, theFullDescription);
        }
        {
            String theRelatedAvailableExtraCode;
            theRelatedAvailableExtraCode = this.getRelatedAvailableExtraCode();
            strategy.appendField(locator, this, "relatedAvailableExtraCode", buffer, theRelatedAvailableExtraCode);
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
     * Sets the value of the price property.
     * 
     * @param price
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setPrice(List<Price> price) {
        this.price = price;
    }

    /**
     * For Tosca, all the available extras will be linked with leg Details. When the
     *                         extra applies to all journey, then only one Leg shall be filled up.
     *                     
     * 
     * @param leg
     *     allowed object is
     *     {@link Leg }
     *     
     */
    public void setLeg(List<Leg> leg) {
        this.leg = leg;
    }

}
