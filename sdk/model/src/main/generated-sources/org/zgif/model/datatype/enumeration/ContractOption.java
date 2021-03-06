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
 * <p>Java-Klasse f�r ContractOption.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ContractOption">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="PERMANENT"/>
 *     &lt;enumeration value="TEMPORARY"/>
 *     &lt;enumeration value="TEMPORARY_REAL_OPTION"/>
 *     &lt;enumeration value="TEMPORARY_FICTIOUS_OPTION"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContractOption")
@XmlEnum
public enum ContractOption {

    PERMANENT,
    TEMPORARY,
    TEMPORARY_REAL_OPTION,
    TEMPORARY_FICTIOUS_OPTION,
    OTHER;

    public String value() {
        return name();
    }

    public static ContractOption fromValue(String v) {
        return valueOf(v);
    }

}
