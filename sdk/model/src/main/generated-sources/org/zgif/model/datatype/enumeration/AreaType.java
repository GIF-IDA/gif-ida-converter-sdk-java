package org.zgif.model.datatype.enumeration;

//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.08.04 um 01:06:08 PM CEST 
//



import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AreaType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AreaType">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="DIN277"/>
 *     &lt;enumeration value="MF_W"/>
 *     &lt;enumeration value="MF_V"/>
 *     &lt;enumeration value="MF_G"/>
 *     &lt;enumeration value="SEVERAL"/>
 *     &lt;enumeration value="NOT_SPECIFIED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AreaType")
@XmlEnum
public enum AreaType {

    OTHER("OTHER"),
    @XmlEnumValue("DIN277")
    DIN_277("DIN277"),
    MF_W("MF_W"),
    MF_V("MF_V"),
    MF_G("MF_G"),
    SEVERAL("SEVERAL"),
    NOT_SPECIFIED("NOT_SPECIFIED");
    private final String value;

    AreaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AreaType fromValue(String v) {
        for (AreaType c: AreaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
