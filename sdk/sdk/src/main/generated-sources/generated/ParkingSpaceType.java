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
 * <p>Java-Klasse für ParkingSpaceType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingSpaceType">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="NOT_AVAILABLE"/>
 *     &lt;enumeration value="OUTDOOR"/>
 *     &lt;enumeration value="UNDERGROUND"/>
 *     &lt;enumeration value="CARPORT"/>
 *     &lt;enumeration value="GARAGE"/>
 *     &lt;enumeration value="CAR_PARK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParkingSpaceType")
@XmlEnum
public enum ParkingSpaceType {

    NOT_AVAILABLE,
    OUTDOOR,
    UNDERGROUND,
    CARPORT,
    GARAGE,
    CAR_PARK;

    public String value() {
        return name();
    }

    public static ParkingSpaceType fromValue(String v) {
        return valueOf(v);
    }

}
