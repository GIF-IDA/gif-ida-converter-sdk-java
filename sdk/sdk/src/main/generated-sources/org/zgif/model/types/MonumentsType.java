//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.07.27 um 11:43:51 AM CEST 
//


package org.zgif.model.types;

import org.zgif.model.*;
import org.zgif.model.types.*;
import org.zgif.model.*;


import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MonumentsType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MonumentsType">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="NO"/>
 *     &lt;enumeration value="NOT_AVAILABLE"/>
 *     &lt;enumeration value="SINGLE"/>
 *     &lt;enumeration value="ENSEMBLE"/>
 *     &lt;enumeration value="OTHERS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MonumentsType")
@XmlEnum
public enum MonumentsType {

    NO,
    NOT_AVAILABLE,
    SINGLE,
    ENSEMBLE,
    OTHERS;

    public String value() {
        return name();
    }

    public static MonumentsType fromValue(String v) {
        return valueOf(v);
    }

}
