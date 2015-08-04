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
 * <p>Java-Klasse f�r MassUnit.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MassUnit">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="TONNE"/>
 *     &lt;enumeration value="KILOGRAM"/>
 *     &lt;enumeration value="GRAM"/>
 *     &lt;enumeration value="MILLIGRAM"/>
 *     &lt;enumeration value="STONE"/>
 *     &lt;enumeration value="POUND"/>
 *     &lt;enumeration value="OUNCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MassUnit")
@XmlEnum
public enum MassUnit {

    TONNE,
    KILOGRAM,
    GRAM,
    MILLIGRAM,
    STONE,
    POUND,
    OUNCE;

    public String value() {
        return name();
    }

    public static MassUnit fromValue(String v) {
        return valueOf(v);
    }

}
