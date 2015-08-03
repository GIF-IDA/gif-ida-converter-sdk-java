package org.zgif.model.datatype.enumeration;
//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.07.27 um 11:43:51 AM CEST 
//




import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RiskSegment.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RiskSegment">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="NOT_DEFINED"/>
 *     &lt;enumeration value="CORE"/>
 *     &lt;enumeration value="CORE_PLUS"/>
 *     &lt;enumeration value="VALUE_ADDED"/>
 *     &lt;enumeration value="OPPORTUNISTIC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RiskSegment")
@XmlEnum
public enum RiskSegment {

    NOT_DEFINED,
    CORE,
    CORE_PLUS,
    VALUE_ADDED,
    OPPORTUNISTIC;

    public String value() {
        return name();
    }

    public static RiskSegment fromValue(String v) {
        return valueOf(v);
    }

}
