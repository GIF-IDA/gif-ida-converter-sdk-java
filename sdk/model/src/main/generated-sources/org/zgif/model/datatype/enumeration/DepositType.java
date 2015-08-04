package org.zgif.model.datatype.enumeration;

//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.08.04 um 01:06:08 PM CEST 
//



import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DepositType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DepositType">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="NOT_AVAILABLE"/>
 *     &lt;enumeration value="CASH_BOND"/>
 *     &lt;enumeration value="BONDED_SAVINGS_ACCOUNT_PASS_BOOK"/>
 *     &lt;enumeration value="ASSIGNMENT_FOR_SECURITY"/>
 *     &lt;enumeration value="GUARANTEE_OF_PAYMENT_OF_A_LOAN"/>
 *     &lt;enumeration value="GUARANTEE_PAYMENT_INSURANCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DepositType")
@XmlEnum
public enum DepositType {

    NOT_AVAILABLE,
    CASH_BOND,
    BONDED_SAVINGS_ACCOUNT_PASS_BOOK,
    ASSIGNMENT_FOR_SECURITY,
    GUARANTEE_OF_PAYMENT_OF_A_LOAN,
    GUARANTEE_PAYMENT_INSURANCE;

    public String value() {
        return name();
    }

    public static DepositType fromValue(String v) {
        return valueOf(v);
    }

}
