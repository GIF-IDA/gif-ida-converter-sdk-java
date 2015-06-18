//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.06.18 um 01:19:59 PM CEST 
//


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für OptRate.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OptRate">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="NOT_DEFINED"/>
 *     &lt;enumeration value="FULL_TAX"/>
 *     &lt;enumeration value="REDUCED_TAX"/>
 *     &lt;enumeration value="NO_TAX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OptRate")
@XmlEnum
public enum OptRate {

    NOT_DEFINED,
    FULL_TAX,
    REDUCED_TAX,
    NO_TAX;

    public String value() {
        return name();
    }

    public static OptRate fromValue(String v) {
        return valueOf(v);
    }

}
