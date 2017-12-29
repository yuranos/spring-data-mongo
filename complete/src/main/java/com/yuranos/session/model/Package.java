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
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Package complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Package">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateRange" type="{http://api.thomascook.com/basket/1.0/common}DateRange" minOccurs="0"/>
 *         &lt;element name="FlightList" type="{http://api.thomascook.com/basket/1.0/flight}Flight" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AccomodationList" type="{http://api.thomascook.com/basket/1.0/accommodation}Accomodation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IncludedItems" type="{http://api.thomascook.com/basket/1.0/common}IncludedItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Preferences" type="{http://api.thomascook.com/basket/1.0/common}Preferences" minOccurs="0"/>
 *         &lt;element name="Content" type="{http://api.thomascook.com/basket/1.0/common}ContentType" minOccurs="0"/>
 *         &lt;element name="ScarcityMessage" type="{http://api.thomascook.com/basket/1.0/common}ScarcityMessageType" minOccurs="0"/>
 *         &lt;element name="TransportMeals" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PostBookingOperation" type="{http://api.thomascook.com/basket/1.0/postBookingOperation}PostBookingOperation" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://api.thomascook.com/basket/1.0/common}BookingType" default="PACKAGE" />
 *       &lt;attribute name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PackageId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SeasonCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SiteCode" type="{http://api.thomascook.com/basket/1.0/common}SiteCode" />
 *       &lt;attribute name="ContentUrl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProviderName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BrochureName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Haul" use="required" type="{http://api.thomascook.com/basket/1.0/common}HaulEnum" />
 *       &lt;attribute name="webAPIdomain" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Package", namespace = "http://api.thomascook.com/basket/1.0/package", propOrder = {
    "dateRange",
    "flightList",
    "accomodationList",
    "includedItems",
    "preferences",
    "content",
    "scarcityMessage",
    "transportMeals",
    "postBookingOperation"
})
public class Package
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 12345L;
    @XmlElement(name = "DateRange")
    @Valid
    protected DateRange dateRange;
    @XmlElement(name = "FlightList")
    @Valid
    protected List<Flight> flightList;
    @XmlElement(name = "AccomodationList")
    @Valid
    protected List<Accomodation> accomodationList;
    @XmlElement(name = "IncludedItems")
    @Valid
    protected List<IncludedItem> includedItems;
    @XmlElement(name = "Preferences")
    @Valid
    protected Preferences preferences;
    @XmlElement(name = "Content")
    @Valid
    protected ContentType content;
    @XmlElement(name = "ScarcityMessage")
    @Valid
    protected ScarcityMessageType scarcityMessage;
    @XmlElement(name = "TransportMeals")
    protected List<String> transportMeals;
    @XmlElement(name = "PostBookingOperation")
    @Valid
    protected PostBookingOperation postBookingOperation;
    @XmlAttribute(name = "Type")
    protected BookingType type;
    @XmlAttribute(name = "ProductId")
    protected String productId;
    @XmlAttribute(name = "PackageId")
    protected String packageId;
    @XmlAttribute(name = "BrandCode")
    protected String brandCode;
    @XmlAttribute(name = "SeasonCode")
    protected String seasonCode;
    @XmlAttribute(name = "SiteCode")
    protected SiteCode siteCode;
    @XmlAttribute(name = "ContentUrl")
    protected String contentUrl;
    @XmlAttribute(name = "ProviderName")
    protected String providerName;
    @XmlAttribute(name = "BrochureName")
    protected String brochureName;
    @XmlAttribute(name = "Haul", required = true)
    @NotNull
    protected HaulEnum haul;
    @XmlAttribute(name = "webAPIdomain")
    protected String webAPIdomain;

    /**
     * Gets the value of the dateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getDateRange() {
        return dateRange;
    }

    /**
     * Sets the value of the dateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setDateRange(DateRange value) {
        this.dateRange = value;
    }

    /**
     * Gets the value of the flightList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Flight }
     * 
     * 
     */
    public List<Flight> getFlightList() {
        if (flightList == null) {
            flightList = new ArrayList<Flight>();
        }
        return this.flightList;
    }

    /**
     * Gets the value of the accomodationList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accomodationList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccomodationList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Accomodation }
     * 
     * 
     */
    public List<Accomodation> getAccomodationList() {
        if (accomodationList == null) {
            accomodationList = new ArrayList<Accomodation>();
        }
        return this.accomodationList;
    }

    /**
     * Gets the value of the includedItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncludedItem }
     * 
     * 
     */
    public List<IncludedItem> getIncludedItems() {
        if (includedItems == null) {
            includedItems = new ArrayList<IncludedItem>();
        }
        return this.includedItems;
    }

    /**
     * Gets the value of the preferences property.
     * 
     * @return
     *     possible object is
     *     {@link Preferences }
     *     
     */
    public Preferences getPreferences() {
        return preferences;
    }

    /**
     * Sets the value of the preferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preferences }
     *     
     */
    public void setPreferences(Preferences value) {
        this.preferences = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link ContentType }
     *     
     */
    public ContentType getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType }
     *     
     */
    public void setContent(ContentType value) {
        this.content = value;
    }

    /**
     * Gets the value of the scarcityMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ScarcityMessageType }
     *     
     */
    public ScarcityMessageType getScarcityMessage() {
        return scarcityMessage;
    }

    /**
     * Sets the value of the scarcityMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScarcityMessageType }
     *     
     */
    public void setScarcityMessage(ScarcityMessageType value) {
        this.scarcityMessage = value;
    }

    /**
     * Gets the value of the transportMeals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportMeals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportMeals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTransportMeals() {
        if (transportMeals == null) {
            transportMeals = new ArrayList<String>();
        }
        return this.transportMeals;
    }

    /**
     * Gets the value of the postBookingOperation property.
     * 
     * @return
     *     possible object is
     *     {@link PostBookingOperation }
     *     
     */
    public PostBookingOperation getPostBookingOperation() {
        return postBookingOperation;
    }

    /**
     * Sets the value of the postBookingOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostBookingOperation }
     *     
     */
    public void setPostBookingOperation(PostBookingOperation value) {
        this.postBookingOperation = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link BookingType }
     *     
     */
    public BookingType getType() {
        if (type == null) {
            return BookingType.PACKAGE;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingType }
     *     
     */
    public void setType(BookingType value) {
        this.type = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Gets the value of the packageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageId() {
        return packageId;
    }

    /**
     * Sets the value of the packageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageId(String value) {
        this.packageId = value;
    }

    /**
     * Gets the value of the brandCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandCode() {
        return brandCode;
    }

    /**
     * Sets the value of the brandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandCode(String value) {
        this.brandCode = value;
    }

    /**
     * Gets the value of the seasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeasonCode() {
        return seasonCode;
    }

    /**
     * Sets the value of the seasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeasonCode(String value) {
        this.seasonCode = value;
    }

    /**
     * Gets the value of the siteCode property.
     * 
     * @return
     *     possible object is
     *     {@link SiteCode }
     *     
     */
    public SiteCode getSiteCode() {
        return siteCode;
    }

    /**
     * Sets the value of the siteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteCode }
     *     
     */
    public void setSiteCode(SiteCode value) {
        this.siteCode = value;
    }

    /**
     * Gets the value of the contentUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentUrl() {
        return contentUrl;
    }

    /**
     * Sets the value of the contentUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentUrl(String value) {
        this.contentUrl = value;
    }

    /**
     * Gets the value of the providerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the value of the providerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderName(String value) {
        this.providerName = value;
    }

    /**
     * Gets the value of the brochureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrochureName() {
        return brochureName;
    }

    /**
     * Sets the value of the brochureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrochureName(String value) {
        this.brochureName = value;
    }

    /**
     * Gets the value of the haul property.
     * 
     * @return
     *     possible object is
     *     {@link HaulEnum }
     *     
     */
    public HaulEnum getHaul() {
        return haul;
    }

    /**
     * Sets the value of the haul property.
     * 
     * @param value
     *     allowed object is
     *     {@link HaulEnum }
     *     
     */
    public void setHaul(HaulEnum value) {
        this.haul = value;
    }

    /**
     * Gets the value of the webAPIdomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebAPIdomain() {
        return webAPIdomain;
    }

    /**
     * Sets the value of the webAPIdomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebAPIdomain(String value) {
        this.webAPIdomain = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Package)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Package that = ((Package) object);
        {
            DateRange lhsDateRange;
            lhsDateRange = this.getDateRange();
            DateRange rhsDateRange;
            rhsDateRange = that.getDateRange();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateRange", lhsDateRange), LocatorUtils.property(thatLocator, "dateRange", rhsDateRange), lhsDateRange, rhsDateRange)) {
                return false;
            }
        }
        {
            List<Flight> lhsFlightList;
            lhsFlightList = (((this.flightList!= null)&&(!this.flightList.isEmpty()))?this.getFlightList():null);
            List<Flight> rhsFlightList;
            rhsFlightList = (((that.flightList!= null)&&(!that.flightList.isEmpty()))?that.getFlightList():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flightList", lhsFlightList), LocatorUtils.property(thatLocator, "flightList", rhsFlightList), lhsFlightList, rhsFlightList)) {
                return false;
            }
        }
        {
            List<Accomodation> lhsAccomodationList;
            lhsAccomodationList = (((this.accomodationList!= null)&&(!this.accomodationList.isEmpty()))?this.getAccomodationList():null);
            List<Accomodation> rhsAccomodationList;
            rhsAccomodationList = (((that.accomodationList!= null)&&(!that.accomodationList.isEmpty()))?that.getAccomodationList():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accomodationList", lhsAccomodationList), LocatorUtils.property(thatLocator, "accomodationList", rhsAccomodationList), lhsAccomodationList, rhsAccomodationList)) {
                return false;
            }
        }
        {
            List<IncludedItem> lhsIncludedItems;
            lhsIncludedItems = (((this.includedItems!= null)&&(!this.includedItems.isEmpty()))?this.getIncludedItems():null);
            List<IncludedItem> rhsIncludedItems;
            rhsIncludedItems = (((that.includedItems!= null)&&(!that.includedItems.isEmpty()))?that.getIncludedItems():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "includedItems", lhsIncludedItems), LocatorUtils.property(thatLocator, "includedItems", rhsIncludedItems), lhsIncludedItems, rhsIncludedItems)) {
                return false;
            }
        }
        {
            Preferences lhsPreferences;
            lhsPreferences = this.getPreferences();
            Preferences rhsPreferences;
            rhsPreferences = that.getPreferences();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preferences", lhsPreferences), LocatorUtils.property(thatLocator, "preferences", rhsPreferences), lhsPreferences, rhsPreferences)) {
                return false;
            }
        }
        {
            ContentType lhsContent;
            lhsContent = this.getContent();
            ContentType rhsContent;
            rhsContent = that.getContent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "content", lhsContent), LocatorUtils.property(thatLocator, "content", rhsContent), lhsContent, rhsContent)) {
                return false;
            }
        }
        {
            ScarcityMessageType lhsScarcityMessage;
            lhsScarcityMessage = this.getScarcityMessage();
            ScarcityMessageType rhsScarcityMessage;
            rhsScarcityMessage = that.getScarcityMessage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scarcityMessage", lhsScarcityMessage), LocatorUtils.property(thatLocator, "scarcityMessage", rhsScarcityMessage), lhsScarcityMessage, rhsScarcityMessage)) {
                return false;
            }
        }
        {
            List<String> lhsTransportMeals;
            lhsTransportMeals = (((this.transportMeals!= null)&&(!this.transportMeals.isEmpty()))?this.getTransportMeals():null);
            List<String> rhsTransportMeals;
            rhsTransportMeals = (((that.transportMeals!= null)&&(!that.transportMeals.isEmpty()))?that.getTransportMeals():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportMeals", lhsTransportMeals), LocatorUtils.property(thatLocator, "transportMeals", rhsTransportMeals), lhsTransportMeals, rhsTransportMeals)) {
                return false;
            }
        }
        {
            PostBookingOperation lhsPostBookingOperation;
            lhsPostBookingOperation = this.getPostBookingOperation();
            PostBookingOperation rhsPostBookingOperation;
            rhsPostBookingOperation = that.getPostBookingOperation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postBookingOperation", lhsPostBookingOperation), LocatorUtils.property(thatLocator, "postBookingOperation", rhsPostBookingOperation), lhsPostBookingOperation, rhsPostBookingOperation)) {
                return false;
            }
        }
        {
            BookingType lhsType;
            lhsType = this.getType();
            BookingType rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            String lhsProductId;
            lhsProductId = this.getProductId();
            String rhsProductId;
            rhsProductId = that.getProductId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productId", lhsProductId), LocatorUtils.property(thatLocator, "productId", rhsProductId), lhsProductId, rhsProductId)) {
                return false;
            }
        }
        {
            String lhsPackageId;
            lhsPackageId = this.getPackageId();
            String rhsPackageId;
            rhsPackageId = that.getPackageId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packageId", lhsPackageId), LocatorUtils.property(thatLocator, "packageId", rhsPackageId), lhsPackageId, rhsPackageId)) {
                return false;
            }
        }
        {
            String lhsBrandCode;
            lhsBrandCode = this.getBrandCode();
            String rhsBrandCode;
            rhsBrandCode = that.getBrandCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brandCode", lhsBrandCode), LocatorUtils.property(thatLocator, "brandCode", rhsBrandCode), lhsBrandCode, rhsBrandCode)) {
                return false;
            }
        }
        {
            String lhsSeasonCode;
            lhsSeasonCode = this.getSeasonCode();
            String rhsSeasonCode;
            rhsSeasonCode = that.getSeasonCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "seasonCode", lhsSeasonCode), LocatorUtils.property(thatLocator, "seasonCode", rhsSeasonCode), lhsSeasonCode, rhsSeasonCode)) {
                return false;
            }
        }
        {
            SiteCode lhsSiteCode;
            lhsSiteCode = this.getSiteCode();
            SiteCode rhsSiteCode;
            rhsSiteCode = that.getSiteCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "siteCode", lhsSiteCode), LocatorUtils.property(thatLocator, "siteCode", rhsSiteCode), lhsSiteCode, rhsSiteCode)) {
                return false;
            }
        }
        {
            String lhsContentUrl;
            lhsContentUrl = this.getContentUrl();
            String rhsContentUrl;
            rhsContentUrl = that.getContentUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contentUrl", lhsContentUrl), LocatorUtils.property(thatLocator, "contentUrl", rhsContentUrl), lhsContentUrl, rhsContentUrl)) {
                return false;
            }
        }
        {
            String lhsProviderName;
            lhsProviderName = this.getProviderName();
            String rhsProviderName;
            rhsProviderName = that.getProviderName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "providerName", lhsProviderName), LocatorUtils.property(thatLocator, "providerName", rhsProviderName), lhsProviderName, rhsProviderName)) {
                return false;
            }
        }
        {
            String lhsBrochureName;
            lhsBrochureName = this.getBrochureName();
            String rhsBrochureName;
            rhsBrochureName = that.getBrochureName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brochureName", lhsBrochureName), LocatorUtils.property(thatLocator, "brochureName", rhsBrochureName), lhsBrochureName, rhsBrochureName)) {
                return false;
            }
        }
        {
            HaulEnum lhsHaul;
            lhsHaul = this.getHaul();
            HaulEnum rhsHaul;
            rhsHaul = that.getHaul();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "haul", lhsHaul), LocatorUtils.property(thatLocator, "haul", rhsHaul), lhsHaul, rhsHaul)) {
                return false;
            }
        }
        {
            String lhsWebAPIdomain;
            lhsWebAPIdomain = this.getWebAPIdomain();
            String rhsWebAPIdomain;
            rhsWebAPIdomain = that.getWebAPIdomain();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "webAPIdomain", lhsWebAPIdomain), LocatorUtils.property(thatLocator, "webAPIdomain", rhsWebAPIdomain), lhsWebAPIdomain, rhsWebAPIdomain)) {
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
            DateRange theDateRange;
            theDateRange = this.getDateRange();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateRange", theDateRange), currentHashCode, theDateRange);
        }
        {
            List<Flight> theFlightList;
            theFlightList = (((this.flightList!= null)&&(!this.flightList.isEmpty()))?this.getFlightList():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "flightList", theFlightList), currentHashCode, theFlightList);
        }
        {
            List<Accomodation> theAccomodationList;
            theAccomodationList = (((this.accomodationList!= null)&&(!this.accomodationList.isEmpty()))?this.getAccomodationList():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accomodationList", theAccomodationList), currentHashCode, theAccomodationList);
        }
        {
            List<IncludedItem> theIncludedItems;
            theIncludedItems = (((this.includedItems!= null)&&(!this.includedItems.isEmpty()))?this.getIncludedItems():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "includedItems", theIncludedItems), currentHashCode, theIncludedItems);
        }
        {
            Preferences thePreferences;
            thePreferences = this.getPreferences();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "preferences", thePreferences), currentHashCode, thePreferences);
        }
        {
            ContentType theContent;
            theContent = this.getContent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "content", theContent), currentHashCode, theContent);
        }
        {
            ScarcityMessageType theScarcityMessage;
            theScarcityMessage = this.getScarcityMessage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scarcityMessage", theScarcityMessage), currentHashCode, theScarcityMessage);
        }
        {
            List<String> theTransportMeals;
            theTransportMeals = (((this.transportMeals!= null)&&(!this.transportMeals.isEmpty()))?this.getTransportMeals():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportMeals", theTransportMeals), currentHashCode, theTransportMeals);
        }
        {
            PostBookingOperation thePostBookingOperation;
            thePostBookingOperation = this.getPostBookingOperation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postBookingOperation", thePostBookingOperation), currentHashCode, thePostBookingOperation);
        }
        {
            BookingType theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            String theProductId;
            theProductId = this.getProductId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productId", theProductId), currentHashCode, theProductId);
        }
        {
            String thePackageId;
            thePackageId = this.getPackageId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packageId", thePackageId), currentHashCode, thePackageId);
        }
        {
            String theBrandCode;
            theBrandCode = this.getBrandCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brandCode", theBrandCode), currentHashCode, theBrandCode);
        }
        {
            String theSeasonCode;
            theSeasonCode = this.getSeasonCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "seasonCode", theSeasonCode), currentHashCode, theSeasonCode);
        }
        {
            SiteCode theSiteCode;
            theSiteCode = this.getSiteCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "siteCode", theSiteCode), currentHashCode, theSiteCode);
        }
        {
            String theContentUrl;
            theContentUrl = this.getContentUrl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contentUrl", theContentUrl), currentHashCode, theContentUrl);
        }
        {
            String theProviderName;
            theProviderName = this.getProviderName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "providerName", theProviderName), currentHashCode, theProviderName);
        }
        {
            String theBrochureName;
            theBrochureName = this.getBrochureName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brochureName", theBrochureName), currentHashCode, theBrochureName);
        }
        {
            HaulEnum theHaul;
            theHaul = this.getHaul();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "haul", theHaul), currentHashCode, theHaul);
        }
        {
            String theWebAPIdomain;
            theWebAPIdomain = this.getWebAPIdomain();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "webAPIdomain", theWebAPIdomain), currentHashCode, theWebAPIdomain);
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
            DateRange theDateRange;
            theDateRange = this.getDateRange();
            strategy.appendField(locator, this, "dateRange", buffer, theDateRange);
        }
        {
            List<Flight> theFlightList;
            theFlightList = (((this.flightList!= null)&&(!this.flightList.isEmpty()))?this.getFlightList():null);
            strategy.appendField(locator, this, "flightList", buffer, theFlightList);
        }
        {
            List<Accomodation> theAccomodationList;
            theAccomodationList = (((this.accomodationList!= null)&&(!this.accomodationList.isEmpty()))?this.getAccomodationList():null);
            strategy.appendField(locator, this, "accomodationList", buffer, theAccomodationList);
        }
        {
            List<IncludedItem> theIncludedItems;
            theIncludedItems = (((this.includedItems!= null)&&(!this.includedItems.isEmpty()))?this.getIncludedItems():null);
            strategy.appendField(locator, this, "includedItems", buffer, theIncludedItems);
        }
        {
            Preferences thePreferences;
            thePreferences = this.getPreferences();
            strategy.appendField(locator, this, "preferences", buffer, thePreferences);
        }
        {
            ContentType theContent;
            theContent = this.getContent();
            strategy.appendField(locator, this, "content", buffer, theContent);
        }
        {
            ScarcityMessageType theScarcityMessage;
            theScarcityMessage = this.getScarcityMessage();
            strategy.appendField(locator, this, "scarcityMessage", buffer, theScarcityMessage);
        }
        {
            List<String> theTransportMeals;
            theTransportMeals = (((this.transportMeals!= null)&&(!this.transportMeals.isEmpty()))?this.getTransportMeals():null);
            strategy.appendField(locator, this, "transportMeals", buffer, theTransportMeals);
        }
        {
            PostBookingOperation thePostBookingOperation;
            thePostBookingOperation = this.getPostBookingOperation();
            strategy.appendField(locator, this, "postBookingOperation", buffer, thePostBookingOperation);
        }
        {
            BookingType theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            String theProductId;
            theProductId = this.getProductId();
            strategy.appendField(locator, this, "productId", buffer, theProductId);
        }
        {
            String thePackageId;
            thePackageId = this.getPackageId();
            strategy.appendField(locator, this, "packageId", buffer, thePackageId);
        }
        {
            String theBrandCode;
            theBrandCode = this.getBrandCode();
            strategy.appendField(locator, this, "brandCode", buffer, theBrandCode);
        }
        {
            String theSeasonCode;
            theSeasonCode = this.getSeasonCode();
            strategy.appendField(locator, this, "seasonCode", buffer, theSeasonCode);
        }
        {
            SiteCode theSiteCode;
            theSiteCode = this.getSiteCode();
            strategy.appendField(locator, this, "siteCode", buffer, theSiteCode);
        }
        {
            String theContentUrl;
            theContentUrl = this.getContentUrl();
            strategy.appendField(locator, this, "contentUrl", buffer, theContentUrl);
        }
        {
            String theProviderName;
            theProviderName = this.getProviderName();
            strategy.appendField(locator, this, "providerName", buffer, theProviderName);
        }
        {
            String theBrochureName;
            theBrochureName = this.getBrochureName();
            strategy.appendField(locator, this, "brochureName", buffer, theBrochureName);
        }
        {
            HaulEnum theHaul;
            theHaul = this.getHaul();
            strategy.appendField(locator, this, "haul", buffer, theHaul);
        }
        {
            String theWebAPIdomain;
            theWebAPIdomain = this.getWebAPIdomain();
            strategy.appendField(locator, this, "webAPIdomain", buffer, theWebAPIdomain);
        }
        return buffer;
    }

    /**
     * Sets the value of the flightList property.
     * 
     * @param flightList
     *     allowed object is
     *     {@link Flight }
     *     
     */
    public void setFlightList(List<Flight> flightList) {
        this.flightList = flightList;
    }

    /**
     * Sets the value of the accomodationList property.
     * 
     * @param accomodationList
     *     allowed object is
     *     {@link Accomodation }
     *     
     */
    public void setAccomodationList(List<Accomodation> accomodationList) {
        this.accomodationList = accomodationList;
    }

    /**
     * Sets the value of the includedItems property.
     * 
     * @param includedItems
     *     allowed object is
     *     {@link IncludedItem }
     *     
     */
    public void setIncludedItems(List<IncludedItem> includedItems) {
        this.includedItems = includedItems;
    }

    /**
     * Sets the value of the transportMeals property.
     * 
     * @param transportMeals
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportMeals(List<String> transportMeals) {
        this.transportMeals = transportMeals;
    }

}