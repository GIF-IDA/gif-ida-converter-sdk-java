package org.zgif.model.datatype.enumeration;

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.16 at 03:29:57 PM CEST 
//



import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndexAdjustmentDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IndexAdjustmentDirection">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="BOTH_DIRECTION"/>
 *     &lt;enumeration value="POSITIVE_ONLY"/>
 *     &lt;enumeration value="NOT_SPECIFIED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IndexAdjustmentDirection")
@XmlEnum
public enum IndexAdjustmentDirection {

    BOTH_DIRECTION,
    POSITIVE_ONLY,
    NOT_SPECIFIED;

    public String value() {
        return name();
    }

    public static IndexAdjustmentDirection fromValue(String v) {
        return valueOf(v);
    }

}
