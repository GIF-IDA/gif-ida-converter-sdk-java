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
 * <p>Java class for UseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UseType">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="NOT_SPECIFIED"/>
 *     &lt;enumeration value="RETAIL"/>
 *     &lt;enumeration value="GASTRONOMY"/>
 *     &lt;enumeration value="OFFICE"/>
 *     &lt;enumeration value="INDUSTRY"/>
 *     &lt;enumeration value="PRODUCTION"/>
 *     &lt;enumeration value="RESIDENTIAL"/>
 *     &lt;enumeration value="WAREHOUSES_HALLS_LOGISTICS"/>
 *     &lt;enumeration value="HOTEL"/>
 *     &lt;enumeration value="LEISURE"/>
 *     &lt;enumeration value="INDOOR_PARKING"/>
 *     &lt;enumeration value="OUTDOOR_PARKING"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UseType")
@XmlEnum
public enum UseType {

    NOT_SPECIFIED,
    RETAIL,
    GASTRONOMY,
    OFFICE,
    INDUSTRY,
    PRODUCTION,
    RESIDENTIAL,
    WAREHOUSES_HALLS_LOGISTICS,
    HOTEL,
    LEISURE,
    INDOOR_PARKING,
    OUTDOOR_PARKING,
    OTHER;

    public String value() {
        return name();
    }

    public static UseType fromValue(String v) {
        return valueOf(v);
    }

}