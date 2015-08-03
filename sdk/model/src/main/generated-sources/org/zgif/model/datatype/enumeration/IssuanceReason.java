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
 * <p>Java-Klasse für IssuanceReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IssuanceReason">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="NEW_CONSTRUCTION"/>
 *     &lt;enumeration value="MODERNISATION"/>
 *     &lt;enumeration value="RENT_SALE"/>
 *     &lt;enumeration value="NOTICE_PUBLIC_BUILDING"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IssuanceReason")
@XmlEnum
public enum IssuanceReason {

    NEW_CONSTRUCTION,
    MODERNISATION,
    RENT_SALE,
    NOTICE_PUBLIC_BUILDING,
    OTHER;

    public String value() {
        return name();
    }

    public static IssuanceReason fromValue(String v) {
        return valueOf(v);
    }

}
