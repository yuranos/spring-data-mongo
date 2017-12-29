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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for SelectedSeat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectedSeat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="seatRow" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="seatColumn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="seatTypes" type="{http://api.thomascook.com/basket/1.0/extra}SeatType"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectedSeat", namespace = "http://api.thomascook.com/basket/1.0/extra", propOrder = {
    "id",
    "seatRow",
    "seatColumn",
    "seatTypes",
    "price"
})
public class SelectedSeat
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 12345L;
    @XmlElement(required = true)
    @NotNull
    protected String id;
    @XmlElement(required = true)
    @NotNull
    protected String seatRow;
    @XmlElement(required = true)
    @NotNull
    protected String seatColumn;
    @XmlList
    @XmlElement(required = true)
    @NotNull
    protected List<String> seatTypes;
    @XmlElement(required = true)
    @NotNull
    protected BigDecimal price;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
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
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the seatRow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatRow() {
        return seatRow;
    }

    /**
     * Sets the value of the seatRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatRow(String value) {
        this.seatRow = value;
    }

    /**
     * Gets the value of the seatColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatColumn() {
        return seatColumn;
    }

    /**
     * Sets the value of the seatColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatColumn(String value) {
        this.seatColumn = value;
    }

    /**
     * Gets the value of the seatTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSeatTypes() {
        if (seatTypes == null) {
            seatTypes = new ArrayList<String>();
        }
        return this.seatTypes;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SelectedSeat)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SelectedSeat that = ((SelectedSeat) object);
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            String lhsSeatRow;
            lhsSeatRow = this.getSeatRow();
            String rhsSeatRow;
            rhsSeatRow = that.getSeatRow();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "seatRow", lhsSeatRow), LocatorUtils.property(thatLocator, "seatRow", rhsSeatRow), lhsSeatRow, rhsSeatRow)) {
                return false;
            }
        }
        {
            String lhsSeatColumn;
            lhsSeatColumn = this.getSeatColumn();
            String rhsSeatColumn;
            rhsSeatColumn = that.getSeatColumn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "seatColumn", lhsSeatColumn), LocatorUtils.property(thatLocator, "seatColumn", rhsSeatColumn), lhsSeatColumn, rhsSeatColumn)) {
                return false;
            }
        }
        {
            List<String> lhsSeatTypes;
            lhsSeatTypes = (((this.seatTypes!= null)&&(!this.seatTypes.isEmpty()))?this.getSeatTypes():null);
            List<String> rhsSeatTypes;
            rhsSeatTypes = (((that.seatTypes!= null)&&(!that.seatTypes.isEmpty()))?that.getSeatTypes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "seatTypes", lhsSeatTypes), LocatorUtils.property(thatLocator, "seatTypes", rhsSeatTypes), lhsSeatTypes, rhsSeatTypes)) {
                return false;
            }
        }
        {
            BigDecimal lhsPrice;
            lhsPrice = this.getPrice();
            BigDecimal rhsPrice;
            rhsPrice = that.getPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "price", lhsPrice), LocatorUtils.property(thatLocator, "price", rhsPrice), lhsPrice, rhsPrice)) {
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
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            String theSeatRow;
            theSeatRow = this.getSeatRow();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "seatRow", theSeatRow), currentHashCode, theSeatRow);
        }
        {
            String theSeatColumn;
            theSeatColumn = this.getSeatColumn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "seatColumn", theSeatColumn), currentHashCode, theSeatColumn);
        }
        {
            List<String> theSeatTypes;
            theSeatTypes = (((this.seatTypes!= null)&&(!this.seatTypes.isEmpty()))?this.getSeatTypes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "seatTypes", theSeatTypes), currentHashCode, theSeatTypes);
        }
        {
            BigDecimal thePrice;
            thePrice = this.getPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "price", thePrice), currentHashCode, thePrice);
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
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            String theSeatRow;
            theSeatRow = this.getSeatRow();
            strategy.appendField(locator, this, "seatRow", buffer, theSeatRow);
        }
        {
            String theSeatColumn;
            theSeatColumn = this.getSeatColumn();
            strategy.appendField(locator, this, "seatColumn", buffer, theSeatColumn);
        }
        {
            List<String> theSeatTypes;
            theSeatTypes = (((this.seatTypes!= null)&&(!this.seatTypes.isEmpty()))?this.getSeatTypes():null);
            strategy.appendField(locator, this, "seatTypes", buffer, theSeatTypes);
        }
        {
            BigDecimal thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice);
        }
        return buffer;
    }

    /**
     * Sets the value of the seatTypes property.
     * 
     * @param seatTypes
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatTypes(List<String> seatTypes) {
        this.seatTypes = seatTypes;
    }

}
