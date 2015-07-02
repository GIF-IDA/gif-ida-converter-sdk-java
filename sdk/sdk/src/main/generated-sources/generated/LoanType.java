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
 * <p>Java-Klasse für LoanType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LoanType">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="ANNUITY"/>
 *     &lt;enumeration value="REDEEMABLE"/>
 *     &lt;enumeration value="FIXED_INTEREST"/>
 *     &lt;enumeration value="VARIABLE_INTEREST"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="NOT_SPECIFIED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LoanType")
@XmlEnum
public enum LoanType {

    ANNUITY,
    REDEEMABLE,
    FIXED_INTEREST,
    VARIABLE_INTEREST,
    OTHER,
    NOT_SPECIFIED;

    public String value() {
        return name();
    }

    public static LoanType fromValue(String v) {
        return valueOf(v);
    }

}