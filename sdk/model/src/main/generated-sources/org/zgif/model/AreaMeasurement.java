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
 * <p>Java class for AreaMeasurement.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AreaMeasurement">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="SQM"/>
 *     &lt;enumeration value="SQFT"/>
 *     &lt;enumeration value="NOT_SPECIFIED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AreaMeasurement")
@XmlEnum
public enum AreaMeasurement {

    SQM,
    SQFT,
    NOT_SPECIFIED;

    public String value() {
        return name();
    }

    public static AreaMeasurement fromValue(String v) {
        return valueOf(v);
    }

}