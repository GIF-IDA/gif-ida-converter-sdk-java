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
 * <p>Java-Klasse für UseType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
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
