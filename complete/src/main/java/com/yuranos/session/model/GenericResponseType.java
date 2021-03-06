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
import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.lang.Error;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for GenericResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Error" type="{http://api.thomascook.com/basket/1.0/common}Error" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Warning" type="{http://api.thomascook.com/basket/1.0/common}Warning" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TimeStamp" type="{http://api.thomascook.com/basket/1.0/common}DateTime" />
 *       &lt;attribute name="BasketId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Market" type="{http://api.thomascook.com/basket/1.0/common}Market" />
 *       &lt;attribute name="Provider" type="{http://api.thomascook.com/basket/1.0/common}Provider" />
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" fixed="3" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericResponseType", propOrder = {
    "error",
    "warning"
})
@XmlSeeAlso({
    Basket.class
})
public class GenericResponseType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 12345L;
    @XmlElement(name = "Error")
    @Valid
    protected List<Error> error;
    @XmlElement(name = "Warning")
    @Valid
    protected List<Warning> warning;
    @XmlAttribute(name = "TimeStamp")
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}")
    protected String timeStamp;
    @XmlAttribute(name = "BasketId")
    protected String basketId;
    @XmlAttribute(name = "Market")
    protected Market market;
    @XmlAttribute(name = "Provider")
    protected Provider provider;
    @XmlAttribute(name = "Version")
    protected String version;

    /**
     * Gets the value of the error property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Error }
     *
     *
     */
    public List<Error> getError() {
        if (error == null) {
            error = new ArrayList<Error>();
        }
        return this.error;
    }

    /**
     * Gets the value of the warning property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warning property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarning().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Warning }
     *
     *
     */
    public List<Warning> getWarning() {
        if (warning == null) {
            warning = new ArrayList<Warning>();
        }
        return this.warning;
    }

    /**
     * Gets the value of the timeStamp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTimeStamp(String value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the basketId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBasketId() {
        return basketId;
    }

    /**
     * Sets the value of the basketId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBasketId(String value) {
        this.basketId = value;
    }

    /**
     * Gets the value of the market property.
     *
     * @return
     *     possible object is
     *     {@link Market }
     *
     */
    public Market getMarket() {
        return market;
    }

    /**
     * Sets the value of the market property.
     *
     * @param value
     *     allowed object is
     *     {@link Market }
     *
     */
    public void setMarket(Market value) {
        this.market = value;
    }

    /**
     * Gets the value of the provider property.
     *
     * @return
     *     possible object is
     *     {@link Provider }
     *
     */
    public Provider getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     *
     * @param value
     *     allowed object is
     *     {@link Provider }
     *
     */
    public void setProvider(Provider value) {
        this.provider = value;
    }

    /**
     * Gets the value of the version property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVersion() {
        if (version == null) {
            return "3";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVersion(String value) {
        this.version = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GenericResponseType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GenericResponseType that = ((GenericResponseType) object);
        {
            List<Error> lhsError;
            lhsError = (((this.error!= null)&&(!this.error.isEmpty()))?this.getError():null);
            List<Error> rhsError;
            rhsError = (((that.error!= null)&&(!that.error.isEmpty()))?that.getError():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "error", lhsError), LocatorUtils.property(thatLocator, "error", rhsError), lhsError, rhsError)) {
                return false;
            }
        }
        {
            List<Warning> lhsWarning;
            lhsWarning = (((this.warning!= null)&&(!this.warning.isEmpty()))?this.getWarning():null);
            List<Warning> rhsWarning;
            rhsWarning = (((that.warning!= null)&&(!that.warning.isEmpty()))?that.getWarning():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warning", lhsWarning), LocatorUtils.property(thatLocator, "warning", rhsWarning), lhsWarning, rhsWarning)) {
                return false;
            }
        }
        {
            String lhsTimeStamp;
            lhsTimeStamp = this.getTimeStamp();
            String rhsTimeStamp;
            rhsTimeStamp = that.getTimeStamp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeStamp", lhsTimeStamp), LocatorUtils.property(thatLocator, "timeStamp", rhsTimeStamp), lhsTimeStamp, rhsTimeStamp)) {
                return false;
            }
        }
        {
            String lhsBasketId;
            lhsBasketId = this.getBasketId();
            String rhsBasketId;
            rhsBasketId = that.getBasketId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "basketId", lhsBasketId), LocatorUtils.property(thatLocator, "basketId", rhsBasketId), lhsBasketId, rhsBasketId)) {
                return false;
            }
        }
        {
            Market lhsMarket;
            lhsMarket = this.getMarket();
            Market rhsMarket;
            rhsMarket = that.getMarket();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "market", lhsMarket), LocatorUtils.property(thatLocator, "market", rhsMarket), lhsMarket, rhsMarket)) {
                return false;
            }
        }
        {
            Provider lhsProvider;
            lhsProvider = this.getProvider();
            Provider rhsProvider;
            rhsProvider = that.getProvider();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "provider", lhsProvider), LocatorUtils.property(thatLocator, "provider", rhsProvider), lhsProvider, rhsProvider)) {
                return false;
            }
        }
        {
            String lhsVersion;
            lhsVersion = this.getVersion();
            String rhsVersion;
            rhsVersion = that.getVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVersion), LocatorUtils.property(thatLocator, "version", rhsVersion), lhsVersion, rhsVersion)) {
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
            List<Error> theError;
            theError = (((this.error!= null)&&(!this.error.isEmpty()))?this.getError():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "error", theError), currentHashCode, theError);
        }
        {
            List<Warning> theWarning;
            theWarning = (((this.warning!= null)&&(!this.warning.isEmpty()))?this.getWarning():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warning", theWarning), currentHashCode, theWarning);
        }
        {
            String theTimeStamp;
            theTimeStamp = this.getTimeStamp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeStamp", theTimeStamp), currentHashCode, theTimeStamp);
        }
        {
            String theBasketId;
            theBasketId = this.getBasketId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "basketId", theBasketId), currentHashCode, theBasketId);
        }
        {
            Market theMarket;
            theMarket = this.getMarket();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "market", theMarket), currentHashCode, theMarket);
        }
        {
            Provider theProvider;
            theProvider = this.getProvider();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "provider", theProvider), currentHashCode, theProvider);
        }
        {
            String theVersion;
            theVersion = this.getVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "version", theVersion), currentHashCode, theVersion);
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
            List<Error> theError;
            theError = (((this.error!= null)&&(!this.error.isEmpty()))?this.getError():null);
            strategy.appendField(locator, this, "error", buffer, theError);
        }
        {
            List<Warning> theWarning;
            theWarning = (((this.warning!= null)&&(!this.warning.isEmpty()))?this.getWarning():null);
            strategy.appendField(locator, this, "warning", buffer, theWarning);
        }
        {
            String theTimeStamp;
            theTimeStamp = this.getTimeStamp();
            strategy.appendField(locator, this, "timeStamp", buffer, theTimeStamp);
        }
        {
            String theBasketId;
            theBasketId = this.getBasketId();
            strategy.appendField(locator, this, "basketId", buffer, theBasketId);
        }
        {
            Market theMarket;
            theMarket = this.getMarket();
            strategy.appendField(locator, this, "market", buffer, theMarket);
        }
        {
            Provider theProvider;
            theProvider = this.getProvider();
            strategy.appendField(locator, this, "provider", buffer, theProvider);
        }
        {
            String theVersion;
            theVersion = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theVersion);
        }
        return buffer;
    }

    /**
     * Sets the value of the error property.
     *
     * @param error
     *     allowed object is
     *     {@link Error }
     *     
     */
    public void setError(List<Error> error) {
        this.error = error;
    }

    /**
     * Sets the value of the warning property.
     * 
     * @param warning
     *     allowed object is
     *     {@link Warning }
     *     
     */
    public void setWarning(List<Warning> warning) {
        this.warning = warning;
    }

}
