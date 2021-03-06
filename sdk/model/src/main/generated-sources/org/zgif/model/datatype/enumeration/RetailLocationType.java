package org.zgif.model.datatype.enumeration;

//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.08.04 um 01:06:08 PM CEST 
//



import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r RetailLocationType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
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
