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
 * <p>Java class for DevelopmentState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DevelopmentState">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="DEVELOPMENT"/>
 *     &lt;enumeration value="COMPLETED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DevelopmentState")
@XmlEnum
public enum DevelopmentState {

    DEVELOPMENT,
    COMPLETED;

    public String value() {
        return name();
    }

    public static DevelopmentState fromValue(String v) {
        return valueOf(v);
    }

}
