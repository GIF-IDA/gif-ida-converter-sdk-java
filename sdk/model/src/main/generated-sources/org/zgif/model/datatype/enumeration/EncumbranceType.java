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
 * <p>Java-Klasse f�r EncumbranceType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EncumbranceType">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="MORTGAGE"/>
 *     &lt;enumeration value="LAND_CHARGE"/>
 *     &lt;enumeration value="ANNUITY_CHARGE"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="NOT_SPECIFIED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EncumbranceType")
@XmlEnum
public enum EncumbranceType {

    MORTGAGE,
    LAND_CHARGE,
    ANNUITY_CHARGE,
    OTHER,
    NOT_SPECIFIED;

    public String value() {
        return name();
    }

    public static EncumbranceType fromValue(String v) {
        return valueOf(v);
    }

}
