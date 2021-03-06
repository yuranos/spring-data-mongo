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
 * <p>Java class for DirectDebitStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DirectDebitStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="CRON_JOB"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="IN_PROGRESS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DirectDebitStatus", namespace = "http://api.thomascook.com/basket/1.0/payment")
@XmlEnum
public enum DirectDebitStatus {


    /**
     * DD Setup Successful
     * 
     */
    OK,

    /**
     * DD Setup Cron job
     * 
     */
    CRON_JOB,

    /**
     * User Cancelled DD Setup
     * 
     */
    CANCELLED,

    /**
     * DD Setup in progress
     * 
     */
    IN_PROGRESS;

    public String value() {
        return name();
    }

    public static DirectDebitStatus fromValue(String v) {
        return valueOf(v);
    }

}
