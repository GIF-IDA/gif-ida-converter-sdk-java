//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.07.27 um 11:43:51 AM CEST 
//


package org.zgif.model;

import org.zgif.model.*;
import org.zgif.model.types.*;
import org.zgif.model.*;


import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IndexRow.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IndexRow">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="CPI"/>
 *     &lt;enumeration value="BPI"/>
 *     &lt;enumeration value="CPI_BW"/>
 *     &lt;enumeration value="CPI_BY"/>
 *     &lt;enumeration value="CPI_BE"/>
 *     &lt;enumeration value="CPI_BB"/>
 *     &lt;enumeration value="CPI_HB"/>
 *     &lt;enumeration value="CPI_HH"/>
 *     &lt;enumeration value="CPI_HE"/>
 *     &lt;enumeration value="CPI_MV"/>
 *     &lt;enumeration value="CPI_NI"/>
 *     &lt;enumeration value="CPI_NW"/>
 *     &lt;enumeration value="CPI_RP"/>
 *     &lt;enumeration value="CPI_SL"/>
 *     &lt;enumeration value="CPI_SN"/>
 *     &lt;enumeration value="CPI_ST"/>
 *     &lt;enumeration value="CPI_SH"/>
 *     &lt;enumeration value="CPI_TH"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IndexRow")
@XmlEnum
public enum IndexRow {

    CPI,
    BPI,
    CPI_BW,
    CPI_BY,
    CPI_BE,
    CPI_BB,
    CPI_HB,
    CPI_HH,
    CPI_HE,
    CPI_MV,
    CPI_NI,
    CPI_NW,
    CPI_RP,
    CPI_SL,
    CPI_SN,
    CPI_ST,
    CPI_SH,
    CPI_TH,
    OTHER;

    public String value() {
        return name();
    }

    public static IndexRow fromValue(String v) {
        return valueOf(v);
    }

}
