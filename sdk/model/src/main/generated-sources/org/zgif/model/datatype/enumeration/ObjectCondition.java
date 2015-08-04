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
 * <p>Java-Klasse f�r ObjectCondition.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ObjectCondition">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="NOT_AVAILABLE"/>
 *     &lt;enumeration value="NEW"/>
 *     &lt;enumeration value="AGE_APPROPRIATE"/>
 *     &lt;enumeration value="IN_NEED_OF_REPAIR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObjectCondition")
@XmlEnum
public enum ObjectCondition {

    NOT_AVAILABLE,
    NEW,
    AGE_APPROPRIATE,
    IN_NEED_OF_REPAIR;

    public String value() {
        return name();
    }

    public static ObjectCondition fromValue(String v) {
        return valueOf(v);
    }

}
