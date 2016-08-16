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
 * <p>Java class for ValuationMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValuationMethod">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="DISCOUNTED_CASH_FLOW"/>
 *     &lt;enumeration value="CAPITALIZATION_OF_INCOME"/>
 *     &lt;enumeration value="REFERENCE_VALUE_METHOD"/>
 *     &lt;enumeration value="ASSET_VALUE_METHOD"/>
 *     &lt;enumeration value="INCOME_METHOD"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValuationMethod")
@XmlEnum
public enum ValuationMethod {

    DISCOUNTED_CASH_FLOW,
    CAPITALIZATION_OF_INCOME,
    REFERENCE_VALUE_METHOD,
    ASSET_VALUE_METHOD,
    INCOME_METHOD,
    OTHER;

    public String value() {
        return name();
    }

    public static ValuationMethod fromValue(String v) {
        return valueOf(v);
    }

}
