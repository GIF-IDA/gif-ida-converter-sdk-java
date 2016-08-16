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
 * <p>Java class for Sector.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Sector">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="NOT_AVAILABLE"/>
 *     &lt;enumeration value="AUTOMOTIVE"/>
 *     &lt;enumeration value="CARRIYING"/>
 *     &lt;enumeration value="FINANCIAL"/>
 *     &lt;enumeration value="PHARMACEUTICAL"/>
 *     &lt;enumeration value="BUILDING"/>
 *     &lt;enumeration value="CONSUMER_GOODS"/>
 *     &lt;enumeration value="RETAIL"/>
 *     &lt;enumeration value="GASTRONOMY"/>
 *     &lt;enumeration value="INSURANCE"/>
 *     &lt;enumeration value="ENGINEERING_RESOURCES"/>
 *     &lt;enumeration value="TECHNOLOGY"/>
 *     &lt;enumeration value="UTILITIES"/>
 *     &lt;enumeration value="CONSULTING"/>
 *     &lt;enumeration value="AUTHORITIES"/>
 *     &lt;enumeration value="MEDIA"/>
 *     &lt;enumeration value="MEDICAL"/>
 *     &lt;enumeration value="OTHERS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Sector")
@XmlEnum
public enum Sector {

    NOT_AVAILABLE,
    AUTOMOTIVE,
    CARRIYING,
    FINANCIAL,
    PHARMACEUTICAL,
    BUILDING,
    CONSUMER_GOODS,
    RETAIL,
    GASTRONOMY,
    INSURANCE,
    ENGINEERING_RESOURCES,
    TECHNOLOGY,
    UTILITIES,
    CONSULTING,
    AUTHORITIES,
    MEDIA,
    MEDICAL,
    OTHERS;

    public String value() {
        return name();
    }

    public static Sector fromValue(String v) {
        return valueOf(v);
    }

}
