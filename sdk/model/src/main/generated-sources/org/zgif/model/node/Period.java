package org.zgif.model.node;

import org.zgif.model.node.AbstractNode;
import org.zgif.model.datatype.enumeration.PeriodValueType;
//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.08.04 um 01:06:08 PM CEST 
//



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java-Klasse für Period complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Period">
 *   &lt;complexContent>
 *     &lt;extension base="{}AbstractNode">
 *       &lt;attribute name="identifier" type="{}iTYPE_STRING" />
 *       &lt;attribute name="from" use="required" type="{}iTYPE_DATE" />
 *       &lt;attribute name="to" use="required" type="{}iTYPE_DATE" />
 *       &lt;attribute name="periodType" use="required" type="{}iTYPE_PERIOD" />
 *       &lt;attribute name="valueType" use="required" type="{}PeriodValueType" />
 *       &lt;attribute name="valueTypeName" type="{}iTYPE_STRING" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Period")
public class Period
    extends AbstractNode
{

    @XmlAttribute(name = "identifier")
    protected String identifier;
    @XmlAttribute(name = "from", required = true)
    protected String from;
    @XmlAttribute(name = "to", required = true)
    protected String to;
    @XmlAttribute(name = "periodType", required = true)
    protected Duration periodType;
    @XmlAttribute(name = "valueType", required = true)
    protected PeriodValueType valueType;
    @XmlAttribute(name = "valueTypeName")
    protected String valueTypeName;

    /**
     * Ruft den Wert der identifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Legt den Wert der identifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Ruft den Wert der from-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Legt den Wert der from-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Ruft den Wert der to-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Legt den Wert der to-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Ruft den Wert der periodType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPeriodType() {
        return periodType;
    }

    /**
     * Legt den Wert der periodType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPeriodType(Duration value) {
        this.periodType = value;
    }

    /**
     * Ruft den Wert der valueType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PeriodValueType }
     *     
     */
    public PeriodValueType getValueType() {
        return valueType;
    }

    /**
     * Legt den Wert der valueType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodValueType }
     *     
     */
    public void setValueType(PeriodValueType value) {
        this.valueType = value;
    }

    /**
     * Ruft den Wert der valueTypeName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueTypeName() {
        return valueTypeName;
    }

    /**
     * Legt den Wert der valueTypeName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueTypeName(String value) {
        this.valueTypeName = value;
    }

}
