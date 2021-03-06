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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Insurances complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Insurances">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SelectedInsuranceList" type="{http://api.thomascook.com/basket/1.0/insurance}SelectedInsurance" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="AvailableInsuranceGroupList" type="{http://api.thomascook.com/basket/1.0/insurance}AvailableInsuranceGroup" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Insurances", namespace = "http://api.thomascook.com/basket/1.0/insurance", propOrder = {
    "selectedInsuranceList",
    "availableInsuranceGroupList"
})
public class Insurances
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 12345L;
    @XmlElement(name = "SelectedInsuranceList")
    @Size(min = 0, max = 99)
    @Valid
    protected List<SelectedInsurance> selectedInsuranceList;
    @XmlElement(name = "AvailableInsuranceGroupList", nillable = true)
    @Size(min = 0, max = 99)
    @Valid
    protected List<AvailableInsuranceGroup> availableInsuranceGroupList;

    /**
     * Gets the value of the selectedInsuranceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedInsuranceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedInsuranceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectedInsurance }
     * 
     * 
     */
    public List<SelectedInsurance> getSelectedInsuranceList() {
        if (selectedInsuranceList == null) {
            selectedInsuranceList = new ArrayList<SelectedInsurance>();
        }
        return this.selectedInsuranceList;
    }

    /**
     * Gets the value of the availableInsuranceGroupList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableInsuranceGroupList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableInsuranceGroupList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AvailableInsuranceGroup }
     * 
     * 
     */
    public List<AvailableInsuranceGroup> getAvailableInsuranceGroupList() {
        if (availableInsuranceGroupList == null) {
            availableInsuranceGroupList = new ArrayList<AvailableInsuranceGroup>();
        }
        return this.availableInsuranceGroupList;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Insurances)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Insurances that = ((Insurances) object);
        {
            List<SelectedInsurance> lhsSelectedInsuranceList;
            lhsSelectedInsuranceList = (((this.selectedInsuranceList!= null)&&(!this.selectedInsuranceList.isEmpty()))?this.getSelectedInsuranceList():null);
            List<SelectedInsurance> rhsSelectedInsuranceList;
            rhsSelectedInsuranceList = (((that.selectedInsuranceList!= null)&&(!that.selectedInsuranceList.isEmpty()))?that.getSelectedInsuranceList():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "selectedInsuranceList", lhsSelectedInsuranceList), LocatorUtils.property(thatLocator, "selectedInsuranceList", rhsSelectedInsuranceList), lhsSelectedInsuranceList, rhsSelectedInsuranceList)) {
                return false;
            }
        }
        {
            List<AvailableInsuranceGroup> lhsAvailableInsuranceGroupList;
            lhsAvailableInsuranceGroupList = (((this.availableInsuranceGroupList!= null)&&(!this.availableInsuranceGroupList.isEmpty()))?this.getAvailableInsuranceGroupList():null);
            List<AvailableInsuranceGroup> rhsAvailableInsuranceGroupList;
            rhsAvailableInsuranceGroupList = (((that.availableInsuranceGroupList!= null)&&(!that.availableInsuranceGroupList.isEmpty()))?that.getAvailableInsuranceGroupList():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "availableInsuranceGroupList", lhsAvailableInsuranceGroupList), LocatorUtils.property(thatLocator, "availableInsuranceGroupList", rhsAvailableInsuranceGroupList), lhsAvailableInsuranceGroupList, rhsAvailableInsuranceGroupList)) {
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
            List<SelectedInsurance> theSelectedInsuranceList;
            theSelectedInsuranceList = (((this.selectedInsuranceList!= null)&&(!this.selectedInsuranceList.isEmpty()))?this.getSelectedInsuranceList():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "selectedInsuranceList", theSelectedInsuranceList), currentHashCode, theSelectedInsuranceList);
        }
        {
            List<AvailableInsuranceGroup> theAvailableInsuranceGroupList;
            theAvailableInsuranceGroupList = (((this.availableInsuranceGroupList!= null)&&(!this.availableInsuranceGroupList.isEmpty()))?this.getAvailableInsuranceGroupList():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "availableInsuranceGroupList", theAvailableInsuranceGroupList), currentHashCode, theAvailableInsuranceGroupList);
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
            List<SelectedInsurance> theSelectedInsuranceList;
            theSelectedInsuranceList = (((this.selectedInsuranceList!= null)&&(!this.selectedInsuranceList.isEmpty()))?this.getSelectedInsuranceList():null);
            strategy.appendField(locator, this, "selectedInsuranceList", buffer, theSelectedInsuranceList);
        }
        {
            List<AvailableInsuranceGroup> theAvailableInsuranceGroupList;
            theAvailableInsuranceGroupList = (((this.availableInsuranceGroupList!= null)&&(!this.availableInsuranceGroupList.isEmpty()))?this.getAvailableInsuranceGroupList():null);
            strategy.appendField(locator, this, "availableInsuranceGroupList", buffer, theAvailableInsuranceGroupList);
        }
        return buffer;
    }

    /**
     * Sets the value of the selectedInsuranceList property.
     * 
     * @param selectedInsuranceList
     *     allowed object is
     *     {@link SelectedInsurance }
     *     
     */
    public void setSelectedInsuranceList(List<SelectedInsurance> selectedInsuranceList) {
        this.selectedInsuranceList = selectedInsuranceList;
    }

    /**
     * Sets the value of the availableInsuranceGroupList property.
     * 
     * @param availableInsuranceGroupList
     *     allowed object is
     *     {@link AvailableInsuranceGroup }
     *     
     */
    public void setAvailableInsuranceGroupList(List<AvailableInsuranceGroup> availableInsuranceGroupList) {
        this.availableInsuranceGroupList = availableInsuranceGroupList;
    }

}
