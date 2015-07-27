//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.07.27 um 11:43:51 AM CEST 
//


package org.zgif.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SiteConstrucibleType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SiteConstrucibleType">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="CONSTRUCTIONPLAN"/>
 *     &lt;enumeration value="NEIGHBOURCONSTRUCTION"/>
 *     &lt;enumeration value="EXTERNALAREA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SiteConstrucibleType")
@XmlEnum
public enum SiteConstrucibleType {

    CONSTRUCTIONPLAN,
    NEIGHBOURCONSTRUCTION,
    EXTERNALAREA;

    public String value() {
        return name();
    }

    public static SiteConstrucibleType fromValue(String v) {
        return valueOf(v);
    }

}
