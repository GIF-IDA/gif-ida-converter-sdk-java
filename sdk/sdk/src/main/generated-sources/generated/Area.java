//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.06.18 um 01:19:59 PM CEST 
//


package generated;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java-Klasse für Area complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Area">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>iTYPE_DOUBLE">
 *       &lt;attribute name="areaType" use="required" type="{}AreaType" />
 *       &lt;attribute name="areaMeasurement" use="required" type="{}AreaMeasurement" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Area", propOrder = {
    "value"
})
public class Area {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "areaType", required = true)
    protected AreaType areaType;
    @XmlAttribute(name = "areaMeasurement", required = true)
    protected AreaMeasurement areaMeasurement;

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der areaType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AreaType }
     *     
     */
    public AreaType getAreaType() {
        return areaType;
    }

    /**
     * Legt den Wert der areaType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaType }
     *     
     */
    public void setAreaType(AreaType value) {
        this.areaType = value;
    }

    /**
     * Ruft den Wert der areaMeasurement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AreaMeasurement }
     *     
     */
    public AreaMeasurement getAreaMeasurement() {
        return areaMeasurement;
    }

    /**
     * Legt den Wert der areaMeasurement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaMeasurement }
     *     
     */
    public void setAreaMeasurement(AreaMeasurement value) {
        this.areaMeasurement = value;
    }

}
