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
 * <p>Java class for DepositIncreaseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DepositIncreaseType">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="INDEX"/>
 *     &lt;enumeration value="SCALE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DepositIncreaseType")
@XmlEnum
public enum DepositIncreaseType {

    NONE,
    INDEX,
    SCALE;

    public String value() {
        return name();
    }

    public static DepositIncreaseType fromValue(String v) {
        return valueOf(v);
    }

}
