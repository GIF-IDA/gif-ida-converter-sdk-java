//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.06.18 um 11:56:39 AM CEST 
//


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LegitTerminationDeadline.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LegitTerminationDeadline">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="NOT_SPECIFIED"/>
 *     &lt;enumeration value="EVERYDAY"/>
 *     &lt;enumeration value="END_OF_MONTH"/>
 *     &lt;enumeration value="END_OF_QUARTER"/>
 *     &lt;enumeration value="END_OF_HALFYEAR"/>
 *     &lt;enumeration value="END_OF_YEAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LegitTerminationDeadline")
@XmlEnum
public enum LegitTerminationDeadline {

    NOT_SPECIFIED,
    EVERYDAY,
    END_OF_MONTH,
    END_OF_QUARTER,
    END_OF_HALFYEAR,
    END_OF_YEAR;

    public String value() {
        return name();
    }

    public static LegitTerminationDeadline fromValue(String v) {
        return valueOf(v);
    }

}
