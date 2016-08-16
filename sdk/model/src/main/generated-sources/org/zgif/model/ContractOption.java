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
 * <p>Java class for ContractOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContractOption">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="PERMANENT"/>
 *     &lt;enumeration value="TEMPORARY"/>
 *     &lt;enumeration value="TEMPORARY_REAL_OPTION"/>
 *     &lt;enumeration value="TEMPORARY_FICTIOUS_OPTION"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContractOption")
@XmlEnum
public enum ContractOption {

    PERMANENT,
    TEMPORARY,
    TEMPORARY_REAL_OPTION,
    TEMPORARY_FICTIOUS_OPTION,
    OTHER;

    public String value() {
        return name();
    }

    public static ContractOption fromValue(String v) {
        return valueOf(v);
    }

}