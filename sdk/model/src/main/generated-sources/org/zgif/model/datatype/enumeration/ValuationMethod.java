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
 * <p>Java-Klasse für ValuationMethod.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ValuationMethod">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="DISCOUNTED_CASH_FLOW"/>
 *     &lt;enumeration value="CAPITALIZATION_OF_INCOME"/>
 *     &lt;enumeration value="REFERENCE_VALUE_METHOD"/>
 *     &lt;enumeration value="ASSET_VALUE_METHOD"/>
 *     &lt;enumeration value="INCOME_METHOD"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValuationMethod")
@XmlEnum
public enum ValuationMethod {

    DISCOUNTED_CASH_FLOW,
    CAPITALIZATION_OF_INCOME,
    REFERENCE_VALUE_METHOD,
    ASSET_VALUE_METHOD,
    INCOME_METHOD,
    OTHER;

    public String value() {
        return name();
    }

    public static ValuationMethod fromValue(String v) {
        return valueOf(v);
    }

}
