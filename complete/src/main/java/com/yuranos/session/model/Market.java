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
 * <p>Java class for Market.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Market">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UK"/>
 *     &lt;enumeration value="NL"/>
 *     &lt;enumeration value="DE"/>
 *     &lt;enumeration value="FR"/>
 *     &lt;enumeration value="BE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Market")
@XmlEnum
public enum Market {

    UK,
    NL,
    DE,
    FR,
    BE;

    public String value() {
        return name();
    }

    public static Market fromValue(String v) {
        return valueOf(v);
    }

}