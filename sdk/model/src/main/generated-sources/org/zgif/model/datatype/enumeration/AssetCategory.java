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
 * <p>Java-Klasse f�r AssetCategory.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetCategory">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="NOT_SPECIFIED"/>
 *     &lt;enumeration value="CAPITAL"/>
 *     &lt;enumeration value="WORKING"/>
 *     &lt;enumeration value="LEASING"/>
 *     &lt;enumeration value="ADMINISTRATION"/>
 *     &lt;enumeration value="GERMAN_CONDOMINIUM_ACT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssetCategory")
@XmlEnum
public enum AssetCategory {

    NOT_SPECIFIED,
    CAPITAL,
    WORKING,
    LEASING,
    ADMINISTRATION,
    GERMAN_CONDOMINIUM_ACT;

    public String value() {
        return name();
    }

    public static AssetCategory fromValue(String v) {
        return valueOf(v);
    }

}
