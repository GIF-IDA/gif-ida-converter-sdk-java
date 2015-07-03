//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.07.03 um 11:52:11 AM CEST 
//


package org.zgif.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AccountingStandard.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountingStandard">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="HGB"/>
 *     &lt;enumeration value="UGB"/>
 *     &lt;enumeration value="IFRS"/>
 *     &lt;enumeration value="US_GAAP"/>
 *     &lt;enumeration value="LUX_GAAP"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountingStandard")
@XmlEnum
public enum AccountingStandard {

    HGB,
    UGB,
    IFRS,
    US_GAAP,
    LUX_GAAP,
    OTHER;

    public String value() {
        return name();
    }

    public static AccountingStandard fromValue(String v) {
        return valueOf(v);
    }

}
