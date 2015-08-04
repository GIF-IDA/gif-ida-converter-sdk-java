package org.zgif.model.datatype.enumeration;

//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.08.04 um 01:06:08 PM CEST 
//



import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für HeatingType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="HeatingType">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="CENTRAL_HEATING"/>
 *     &lt;enumeration value="SINGLE_STORY_GAS_HEATING"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HeatingType")
@XmlEnum
public enum HeatingType {

    CENTRAL_HEATING,
    SINGLE_STORY_GAS_HEATING,
    OTHER;

    public String value() {
        return name();
    }

    public static HeatingType fromValue(String v) {
        return valueOf(v);
    }

}
