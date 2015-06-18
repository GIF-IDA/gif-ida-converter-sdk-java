//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.06.18 um 11:56:39 AM CEST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java-Klasse für fTYPE_PERIODS complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="fTYPE_PERIODS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="period" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="identifier" type="{}iTYPE_STRING" />
 *                 &lt;attribute name="from" use="required" type="{}iTYPE_DATE" />
 *                 &lt;attribute name="to" use="required" type="{}iTYPE_DATE" />
 *                 &lt;attribute name="periodType" use="required" type="{}iTYPE_PERIOD" />
 *                 &lt;attribute name="valueType" use="required" type="{}PeriodValueType" />
 *                 &lt;attribute name="valueTypeName" type="{}iTYPE_STRING" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fTYPE_PERIODS", propOrder = {
    "period"
})
public class FTYPEPERIODS {

    protected List<FTYPEPERIODS.Period> period;

    /**
     * Gets the value of the period property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the period property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FTYPEPERIODS.Period }
     * 
     * 
     */
    public List<FTYPEPERIODS.Period> getPeriod() {
        if (period == null) {
            period = new ArrayList<FTYPEPERIODS.Period>();
        }
        return this.period;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="identifier" type="{}iTYPE_STRING" />
     *       &lt;attribute name="from" use="required" type="{}iTYPE_DATE" />
     *       &lt;attribute name="to" use="required" type="{}iTYPE_DATE" />
     *       &lt;attribute name="periodType" use="required" type="{}iTYPE_PERIOD" />
     *       &lt;attribute name="valueType" use="required" type="{}PeriodValueType" />
     *       &lt;attribute name="valueTypeName" type="{}iTYPE_STRING" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Period {

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

}
