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
 * <p>Java class for LegitTerminationDeadline.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LegitTerminationDeadline">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="NOT_SPECIFIED"/>
 *     &lt;enumeration value="EVERYDAY"/>
 *     &lt;enumeration value="END_OF_MONTH"/>
 *     &lt;enumeration value="END_OF_QUARTER"/>
 *     &lt;enumeration value="END_OF_HALFYEAR"/>
 *     &lt;enumeration value="END_OF_YEAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LegitTerminationDeadline")
@XmlEnum
public enum LegitTerminationDeadline {

    NOT_SPECIFIED,
    EVERYDAY,
    END_OF_MONTH,
    END_OF_QUARTER,
    END_OF_HALFYEAR,
    END_OF_YEAR;

    public String value() {
        return name();
    }

    public static LegitTerminationDeadline fromValue(String v) {
        return valueOf(v);
    }

}
