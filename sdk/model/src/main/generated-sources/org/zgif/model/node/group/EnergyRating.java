package org.zgif.model.node.group;

import org.zgif.model.datatype.enumeration.IssuanceReason;
import org.zgif.model.datatype.enumeration.EnergyEfficiencyCategory;
import org.zgif.model.datatype.enumeration.EnergyRatingType;
import org.zgif.model.node.group.AbstractGroupNode;
import org.zgif.model.datatype.enumeration.EnergyRatingCategory;
//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.08.04 um 01:06:08 PM CEST 
//



import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EnergyRating complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EnergyRating">
 *   &lt;complexContent>
 *     &lt;extension base="{}AbstractGroupNode">
 *       &lt;all>
 *         &lt;element name="date" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="reason" type="{}IssuanceReason" minOccurs="0"/>
 *         &lt;element name="ratingType" type="{}EnergyRatingType" minOccurs="0"/>
 *         &lt;element name="ratingCategory" type="{}EnergyRatingCategory" minOccurs="0"/>
 *         &lt;element name="energyEfficiencyClass" type="{}EnergyEfficiencyCategory" minOccurs="0"/>
 *         &lt;element name="energyConsumption" type="{}iTYPE_DOUBLE" minOccurs="0"/>
 *         &lt;element name="co2Emission" type="{}iTYPE_DOUBLE" minOccurs="0"/>
 *         &lt;element name="primaryEnergyDemand" type="{}iTYPE_DOUBLE" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyRating", propOrder = {
    "date",
    "reason",
    "ratingType",
    "ratingCategory",
    "energyEfficiencyClass",
    "energyConsumption",
    "co2Emission",
    "primaryEnergyDemand"
})
public class EnergyRating
    extends AbstractGroupNode
{

    protected String date;
    protected IssuanceReason reason;
    protected EnergyRatingType ratingType;
    protected EnergyRatingCategory ratingCategory;
    protected EnergyEfficiencyCategory energyEfficiencyClass;
    protected BigDecimal energyConsumption;
    protected BigDecimal co2Emission;
    protected BigDecimal primaryEnergyDemand;

    /**
     * Ruft den Wert der date-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Legt den Wert der date-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Ruft den Wert der reason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IssuanceReason }
     *     
     */
    public IssuanceReason getReason() {
        return reason;
    }

    /**
     * Legt den Wert der reason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuanceReason }
     *     
     */
    public void setReason(IssuanceReason value) {
        this.reason = value;
    }

    /**
     * Ruft den Wert der ratingType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnergyRatingType }
     *     
     */
    public EnergyRatingType getRatingType() {
        return ratingType;
    }

    /**
     * Legt den Wert der ratingType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyRatingType }
     *     
     */
    public void setRatingType(EnergyRatingType value) {
        this.ratingType = value;
    }

    /**
     * Ruft den Wert der ratingCategory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnergyRatingCategory }
     *     
     */
    public EnergyRatingCategory getRatingCategory() {
        return ratingCategory;
    }

    /**
     * Legt den Wert der ratingCategory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyRatingCategory }
     *     
     */
    public void setRatingCategory(EnergyRatingCategory value) {
        this.ratingCategory = value;
    }

    /**
     * Ruft den Wert der energyEfficiencyClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnergyEfficiencyCategory }
     *     
     */
    public EnergyEfficiencyCategory getEnergyEfficiencyClass() {
        return energyEfficiencyClass;
    }

    /**
     * Legt den Wert der energyEfficiencyClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyEfficiencyCategory }
     *     
     */
    public void setEnergyEfficiencyClass(EnergyEfficiencyCategory value) {
        this.energyEfficiencyClass = value;
    }

    /**
     * Ruft den Wert der energyConsumption-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEnergyConsumption() {
        return energyConsumption;
    }

    /**
     * Legt den Wert der energyConsumption-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEnergyConsumption(BigDecimal value) {
        this.energyConsumption = value;
    }

    /**
     * Ruft den Wert der co2Emission-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCo2Emission() {
        return co2Emission;
    }

    /**
     * Legt den Wert der co2Emission-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCo2Emission(BigDecimal value) {
        this.co2Emission = value;
    }

    /**
     * Ruft den Wert der primaryEnergyDemand-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrimaryEnergyDemand() {
        return primaryEnergyDemand;
    }

    /**
     * Legt den Wert der primaryEnergyDemand-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrimaryEnergyDemand(BigDecimal value) {
        this.primaryEnergyDemand = value;
    }

}
