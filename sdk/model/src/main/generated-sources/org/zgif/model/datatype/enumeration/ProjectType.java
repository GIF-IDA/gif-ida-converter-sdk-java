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
 * <p>Java-Klasse f�r ProjectType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ProjectType">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="MAINTENANCE"/>
 *     &lt;enumeration value="INSPECTION"/>
 *     &lt;enumeration value="REPAIR"/>
 *     &lt;enumeration value="OPTIMIZATION"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProjectType")
@XmlEnum
public enum ProjectType {

    NONE,
    MAINTENANCE,
    INSPECTION,
    REPAIR,
    OPTIMIZATION,
    OTHER;

    public String value() {
        return name();
    }

    public static ProjectType fromValue(String v) {
        return valueOf(v);
    }

}
