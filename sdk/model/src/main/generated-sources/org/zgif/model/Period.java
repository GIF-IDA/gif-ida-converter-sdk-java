//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.16 at 12:41:56 PM CEST 
//


package org.zgif.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for Period complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the identifier property.
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
     * Sets the value of the identifier property.
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
     * Gets the value of the from property.
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
     * Sets the value of the from property.
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
     * Gets the value of the to property.
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
     * Sets the value of the to property.
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
     * Gets the value of the periodType property.
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
     * Sets the value of the periodType property.
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
     * Gets the value of the valueType property.
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
     * Sets the value of the valueType property.
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
     * Gets the value of the valueTypeName property.
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
     * Sets the value of the valueTypeName property.
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