//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.07 at 03:28:23 PM EET 
//


package com.yuranos.session.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BalanceStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="REMOTE_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BalanceStatus", namespace = "http://api.thomascook.com/basket/1.0/giftcardbalance")
@XmlEnum
public enum BalanceStatus {


    /**
     * Ok status
     * 
     */
    OK,

    /**
     * Error status
     * 
     */
    ERROR,

    /**
     * Remote error status
     * 
     */
    REMOTE_ERROR;

    public String value() {
        return name();
    }

    public static BalanceStatus fromValue(String v) {
        return valueOf(v);
    }

}
