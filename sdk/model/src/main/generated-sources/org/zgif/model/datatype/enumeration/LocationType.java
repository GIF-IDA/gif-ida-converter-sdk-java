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
 * <p>Java-Klasse f�r LocationType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationType">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="NOT_SPECIFIED"/>
 *     &lt;enumeration value="WS"/>
 *     &lt;enumeration value="WR"/>
 *     &lt;enumeration value="WA"/>
 *     &lt;enumeration value="WB"/>
 *     &lt;enumeration value="MD"/>
 *     &lt;enumeration value="MI"/>
 *     &lt;enumeration value="MK"/>
 *     &lt;enumeration value="GE"/>
 *     &lt;enumeration value="GI"/>
 *     &lt;enumeration value="SO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocationType")
@XmlEnum
public enum LocationType {

    NOT_SPECIFIED,
    WS,
    WR,
    WA,
    WB,
    MD,
    MI,
    MK,
    GE,
    GI,
    SO;

    public String value() {
        return name();
    }

    public static LocationType fromValue(String v) {
        return valueOf(v);
    }

}
