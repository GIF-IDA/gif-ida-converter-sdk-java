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
 * <p>Java-Klasse für OwnershipType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OwnershipType">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="DIRECT_PROPERTY"/>
 *     &lt;enumeration value="LEASEHOLD"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="FREEHOLDER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OwnershipType")
@XmlEnum
public enum OwnershipType {

    DIRECT_PROPERTY,
    LEASEHOLD,
    OTHER,
    FREEHOLDER;

    public String value() {
        return name();
    }

    public static OwnershipType fromValue(String v) {
        return valueOf(v);
    }

}
