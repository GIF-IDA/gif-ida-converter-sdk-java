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
 * <p>Java class for RetailLocationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RetailLocationType">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="HIGH_STREET"/>
 *     &lt;enumeration value="HIGH_STREET_BORDER_AREA"/>
 *     &lt;enumeration value="CITY_CENTRE_OTHER"/>
 *     &lt;enumeration value="SUBURBAN_CENTRE"/>
 *     &lt;enumeration value="MAJOR_ROUTE"/>
 *     &lt;enumeration value="SUBURBAN_OTHER"/>
 *     &lt;enumeration value="NON_URBAN"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RetailLocationType")
@XmlEnum
public enum RetailLocationType {

    HIGH_STREET,
    HIGH_STREET_BORDER_AREA,
    CITY_CENTRE_OTHER,
    SUBURBAN_CENTRE,
    MAJOR_ROUTE,
    SUBURBAN_OTHER,
    NON_URBAN,
    OTHER,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static RetailLocationType fromValue(String v) {
        return valueOf(v);
    }

}