//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.16 at 12:41:56 PM CEST 
//


package org.zgif.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RiskSegment.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RiskSegment">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="NOT_DEFINED"/>
 *     &lt;enumeration value="CORE"/>
 *     &lt;enumeration value="CORE_PLUS"/>
 *     &lt;enumeration value="VALUE_ADDED"/>
 *     &lt;enumeration value="OPPORTUNISTIC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RiskSegment")
@XmlEnum
public enum RiskSegment {

    NOT_DEFINED,
    CORE,
    CORE_PLUS,
    VALUE_ADDED,
    OPPORTUNISTIC;

    public String value() {
        return name();
    }

    public static RiskSegment fromValue(String v) {
        return valueOf(v);
    }

}