/*******************************************************************************
 * Copyright (c) 2015 Martin Fluegge (Berlin, Germany) and others..
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Martin Fluegge - initial API and implementation and/or initial documentation
 *  
 *******************************************************************************/
//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.07.27 um 11:43:51 AM CEST 
//


package org.zgif.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import org.zgif.model.types.ValuationMethod;


/**
 * <p>Java-Klasse für Valuation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Valuation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="buildingInDevelopmentState" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="contractRentDebit" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="currency" type="{}iTYPE_CURRENCY" minOccurs="0"/>
 *         &lt;element name="discountRate" type="{}iTYPE_DOUBLE" minOccurs="0"/>
 *         &lt;element name="effectiveArea" type="{}Area" minOccurs="0"/>
 *         &lt;element name="effectiveAreaIndustry" type="{}Area" minOccurs="0"/>
 *         &lt;element name="effectiveAreaOffice" type="{}Area" minOccurs="0"/>
 *         &lt;element name="effectiveAreaOther" type="{}Area" minOccurs="0"/>
 *         &lt;element name="effectiveAreaResidential" type="{}Area" minOccurs="0"/>
 *         &lt;element name="effectiveAreaTrade" type="{}Area" minOccurs="0"/>
 *         &lt;element name="expertName" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="fairValue" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="grossFairValue" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="internalValuation" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="lostSustainablyGrossYield" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="lostSustainablyGrossYieldIndustry" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="lostSustainablyGrossYieldOffice" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="lostSustainablyGrossYieldOther" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="lostSustainablyGrossYieldResidential" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="lostSustainablyGrossYieldTrade" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="method" type="{}ValuationMethod" minOccurs="0"/>
 *         &lt;element name="ownershipShare" type="{}iTYPE_DOUBLE" minOccurs="0"/>
 *         &lt;element name="sustainablyGrossYield" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="sustainablyGrossYieldIndustry" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="sustainablyGrossYieldOffice" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="sustainablyGrossYieldOther" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="sustainablyGrossYieldResidential" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="sustainablyGrossYieldTrade" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="vacantEffectiveAreaIndustry" type="{}Area" minOccurs="0"/>
 *         &lt;element name="vacantEffectiveAreaOffice" type="{}Area" minOccurs="0"/>
 *         &lt;element name="vacantEffectiveAreaOther" type="{}Area" minOccurs="0"/>
 *         &lt;element name="vacantEffectiveAreaResidential" type="{}Area" minOccurs="0"/>
 *         &lt;element name="vacantEffectiveAreaTrade" type="{}Area" minOccurs="0"/>
 *         &lt;element name="valuationDate" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="energyRating" type="{}EnergyRating" minOccurs="0"/>
 *         &lt;element name="extensionMap" type="{}ExtensionMap" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="objectIdSender" type="{}iTYPE_STRING" />
 *       &lt;attribute name="objectIdReceiver" type="{}iTYPE_STRING" />
 *       &lt;attribute name="validFrom" type="{}iTYPE_LOCALDATE" />
 *       &lt;attribute name="validTo" type="{}iTYPE_LOCALDATE" />
 *       &lt;attribute name="label" type="{}iTYPE_STRING" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Valuation", propOrder = {
    "buildingInDevelopmentState",
    "contractRentDebit",
    "currency",
    "discountRate",
    "effectiveArea",
    "effectiveAreaIndustry",
    "effectiveAreaOffice",
    "effectiveAreaOther",
    "effectiveAreaResidential",
    "effectiveAreaTrade",
    "expertName",
    "fairValue",
    "grossFairValue",
    "internalValuation",
    "lostSustainablyGrossYield",
    "lostSustainablyGrossYieldIndustry",
    "lostSustainablyGrossYieldOffice",
    "lostSustainablyGrossYieldOther",
    "lostSustainablyGrossYieldResidential",
    "lostSustainablyGrossYieldTrade",
    "method",
    "ownershipShare",
    "sustainablyGrossYield",
    "sustainablyGrossYieldIndustry",
    "sustainablyGrossYieldOffice",
    "sustainablyGrossYieldOther",
    "sustainablyGrossYieldResidential",
    "sustainablyGrossYieldTrade",
    "vacantEffectiveAreaIndustry",
    "vacantEffectiveAreaOffice",
    "vacantEffectiveAreaOther",
    "vacantEffectiveAreaResidential",
    "vacantEffectiveAreaTrade",
    "valuationDate",
    "energyRating",
    "extensionMap"
})
public class Valuation {

    protected Boolean buildingInDevelopmentState;
    protected Amount contractRentDebit;
    protected String currency;
    protected BigDecimal discountRate;
    protected Area effectiveArea;
    protected Area effectiveAreaIndustry;
    protected Area effectiveAreaOffice;
    protected Area effectiveAreaOther;
    protected Area effectiveAreaResidential;
    protected Area effectiveAreaTrade;
    protected String expertName;
    protected Amount fairValue;
    protected Amount grossFairValue;
    protected Boolean internalValuation;
    protected Amount lostSustainablyGrossYield;
    protected Amount lostSustainablyGrossYieldIndustry;
    protected Amount lostSustainablyGrossYieldOffice;
    protected Amount lostSustainablyGrossYieldOther;
    protected Amount lostSustainablyGrossYieldResidential;
    protected Amount lostSustainablyGrossYieldTrade;
    protected ValuationMethod method;
    protected BigDecimal ownershipShare;
    protected Amount sustainablyGrossYield;
    protected Amount sustainablyGrossYieldIndustry;
    protected Amount sustainablyGrossYieldOffice;
    protected Amount sustainablyGrossYieldOther;
    protected Amount sustainablyGrossYieldResidential;
    protected Amount sustainablyGrossYieldTrade;
    protected Area vacantEffectiveAreaIndustry;
    protected Area vacantEffectiveAreaOffice;
    protected Area vacantEffectiveAreaOther;
    protected Area vacantEffectiveAreaResidential;
    protected Area vacantEffectiveAreaTrade;
    protected String valuationDate;
    protected EnergyRating energyRating;
    protected ExtensionMap extensionMap;
    @XmlAttribute(name = "objectIdSender")
    protected String objectIdSender;
    @XmlAttribute(name = "objectIdReceiver")
    protected String objectIdReceiver;
    @XmlAttribute(name = "validFrom")
    protected String validFrom;
    @XmlAttribute(name = "validTo")
    protected String validTo;
    @XmlAttribute(name = "label")
    protected String label;

    /**
     * Ruft den Wert der buildingInDevelopmentState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuildingInDevelopmentState() {
        return buildingInDevelopmentState;
    }

    /**
     * Legt den Wert der buildingInDevelopmentState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuildingInDevelopmentState(Boolean value) {
        this.buildingInDevelopmentState = value;
    }

    /**
     * Ruft den Wert der contractRentDebit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getContractRentDebit() {
        return contractRentDebit;
    }

    /**
     * Legt den Wert der contractRentDebit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setContractRentDebit(Amount value) {
        this.contractRentDebit = value;
    }

    /**
     * Ruft den Wert der currency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Legt den Wert der currency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Ruft den Wert der discountRate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountRate() {
        return discountRate;
    }

    /**
     * Legt den Wert der discountRate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountRate(BigDecimal value) {
        this.discountRate = value;
    }

    /**
     * Ruft den Wert der effectiveArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getEffectiveArea() {
        return effectiveArea;
    }

    /**
     * Legt den Wert der effectiveArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setEffectiveArea(Area value) {
        this.effectiveArea = value;
    }

    /**
     * Ruft den Wert der effectiveAreaIndustry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getEffectiveAreaIndustry() {
        return effectiveAreaIndustry;
    }

    /**
     * Legt den Wert der effectiveAreaIndustry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setEffectiveAreaIndustry(Area value) {
        this.effectiveAreaIndustry = value;
    }

    /**
     * Ruft den Wert der effectiveAreaOffice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getEffectiveAreaOffice() {
        return effectiveAreaOffice;
    }

    /**
     * Legt den Wert der effectiveAreaOffice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setEffectiveAreaOffice(Area value) {
        this.effectiveAreaOffice = value;
    }

    /**
     * Ruft den Wert der effectiveAreaOther-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getEffectiveAreaOther() {
        return effectiveAreaOther;
    }

    /**
     * Legt den Wert der effectiveAreaOther-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setEffectiveAreaOther(Area value) {
        this.effectiveAreaOther = value;
    }

    /**
     * Ruft den Wert der effectiveAreaResidential-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getEffectiveAreaResidential() {
        return effectiveAreaResidential;
    }

    /**
     * Legt den Wert der effectiveAreaResidential-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setEffectiveAreaResidential(Area value) {
        this.effectiveAreaResidential = value;
    }

    /**
     * Ruft den Wert der effectiveAreaTrade-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getEffectiveAreaTrade() {
        return effectiveAreaTrade;
    }

    /**
     * Legt den Wert der effectiveAreaTrade-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setEffectiveAreaTrade(Area value) {
        this.effectiveAreaTrade = value;
    }

    /**
     * Ruft den Wert der expertName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpertName() {
        return expertName;
    }

    /**
     * Legt den Wert der expertName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpertName(String value) {
        this.expertName = value;
    }

    /**
     * Ruft den Wert der fairValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getFairValue() {
        return fairValue;
    }

    /**
     * Legt den Wert der fairValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setFairValue(Amount value) {
        this.fairValue = value;
    }

    /**
     * Ruft den Wert der grossFairValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getGrossFairValue() {
        return grossFairValue;
    }

    /**
     * Legt den Wert der grossFairValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setGrossFairValue(Amount value) {
        this.grossFairValue = value;
    }

    /**
     * Ruft den Wert der internalValuation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInternalValuation() {
        return internalValuation;
    }

    /**
     * Legt den Wert der internalValuation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInternalValuation(Boolean value) {
        this.internalValuation = value;
    }

    /**
     * Ruft den Wert der lostSustainablyGrossYield-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getLostSustainablyGrossYield() {
        return lostSustainablyGrossYield;
    }

    /**
     * Legt den Wert der lostSustainablyGrossYield-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setLostSustainablyGrossYield(Amount value) {
        this.lostSustainablyGrossYield = value;
    }

    /**
     * Ruft den Wert der lostSustainablyGrossYieldIndustry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getLostSustainablyGrossYieldIndustry() {
        return lostSustainablyGrossYieldIndustry;
    }

    /**
     * Legt den Wert der lostSustainablyGrossYieldIndustry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setLostSustainablyGrossYieldIndustry(Amount value) {
        this.lostSustainablyGrossYieldIndustry = value;
    }

    /**
     * Ruft den Wert der lostSustainablyGrossYieldOffice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getLostSustainablyGrossYieldOffice() {
        return lostSustainablyGrossYieldOffice;
    }

    /**
     * Legt den Wert der lostSustainablyGrossYieldOffice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setLostSustainablyGrossYieldOffice(Amount value) {
        this.lostSustainablyGrossYieldOffice = value;
    }

    /**
     * Ruft den Wert der lostSustainablyGrossYieldOther-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getLostSustainablyGrossYieldOther() {
        return lostSustainablyGrossYieldOther;
    }

    /**
     * Legt den Wert der lostSustainablyGrossYieldOther-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setLostSustainablyGrossYieldOther(Amount value) {
        this.lostSustainablyGrossYieldOther = value;
    }

    /**
     * Ruft den Wert der lostSustainablyGrossYieldResidential-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getLostSustainablyGrossYieldResidential() {
        return lostSustainablyGrossYieldResidential;
    }

    /**
     * Legt den Wert der lostSustainablyGrossYieldResidential-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setLostSustainablyGrossYieldResidential(Amount value) {
        this.lostSustainablyGrossYieldResidential = value;
    }

    /**
     * Ruft den Wert der lostSustainablyGrossYieldTrade-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getLostSustainablyGrossYieldTrade() {
        return lostSustainablyGrossYieldTrade;
    }

    /**
     * Legt den Wert der lostSustainablyGrossYieldTrade-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setLostSustainablyGrossYieldTrade(Amount value) {
        this.lostSustainablyGrossYieldTrade = value;
    }

    /**
     * Ruft den Wert der method-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValuationMethod }
     *     
     */
    public ValuationMethod getMethod() {
        return method;
    }

    /**
     * Legt den Wert der method-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationMethod }
     *     
     */
    public void setMethod(ValuationMethod value) {
        this.method = value;
    }

    /**
     * Ruft den Wert der ownershipShare-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOwnershipShare() {
        return ownershipShare;
    }

    /**
     * Legt den Wert der ownershipShare-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOwnershipShare(BigDecimal value) {
        this.ownershipShare = value;
    }

    /**
     * Ruft den Wert der sustainablyGrossYield-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getSustainablyGrossYield() {
        return sustainablyGrossYield;
    }

    /**
     * Legt den Wert der sustainablyGrossYield-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setSustainablyGrossYield(Amount value) {
        this.sustainablyGrossYield = value;
    }

    /**
     * Ruft den Wert der sustainablyGrossYieldIndustry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getSustainablyGrossYieldIndustry() {
        return sustainablyGrossYieldIndustry;
    }

    /**
     * Legt den Wert der sustainablyGrossYieldIndustry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setSustainablyGrossYieldIndustry(Amount value) {
        this.sustainablyGrossYieldIndustry = value;
    }

    /**
     * Ruft den Wert der sustainablyGrossYieldOffice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getSustainablyGrossYieldOffice() {
        return sustainablyGrossYieldOffice;
    }

    /**
     * Legt den Wert der sustainablyGrossYieldOffice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setSustainablyGrossYieldOffice(Amount value) {
        this.sustainablyGrossYieldOffice = value;
    }

    /**
     * Ruft den Wert der sustainablyGrossYieldOther-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getSustainablyGrossYieldOther() {
        return sustainablyGrossYieldOther;
    }

    /**
     * Legt den Wert der sustainablyGrossYieldOther-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setSustainablyGrossYieldOther(Amount value) {
        this.sustainablyGrossYieldOther = value;
    }

    /**
     * Ruft den Wert der sustainablyGrossYieldResidential-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getSustainablyGrossYieldResidential() {
        return sustainablyGrossYieldResidential;
    }

    /**
     * Legt den Wert der sustainablyGrossYieldResidential-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setSustainablyGrossYieldResidential(Amount value) {
        this.sustainablyGrossYieldResidential = value;
    }

    /**
     * Ruft den Wert der sustainablyGrossYieldTrade-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getSustainablyGrossYieldTrade() {
        return sustainablyGrossYieldTrade;
    }

    /**
     * Legt den Wert der sustainablyGrossYieldTrade-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setSustainablyGrossYieldTrade(Amount value) {
        this.sustainablyGrossYieldTrade = value;
    }

    /**
     * Ruft den Wert der vacantEffectiveAreaIndustry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getVacantEffectiveAreaIndustry() {
        return vacantEffectiveAreaIndustry;
    }

    /**
     * Legt den Wert der vacantEffectiveAreaIndustry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setVacantEffectiveAreaIndustry(Area value) {
        this.vacantEffectiveAreaIndustry = value;
    }

    /**
     * Ruft den Wert der vacantEffectiveAreaOffice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getVacantEffectiveAreaOffice() {
        return vacantEffectiveAreaOffice;
    }

    /**
     * Legt den Wert der vacantEffectiveAreaOffice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setVacantEffectiveAreaOffice(Area value) {
        this.vacantEffectiveAreaOffice = value;
    }

    /**
     * Ruft den Wert der vacantEffectiveAreaOther-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getVacantEffectiveAreaOther() {
        return vacantEffectiveAreaOther;
    }

    /**
     * Legt den Wert der vacantEffectiveAreaOther-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setVacantEffectiveAreaOther(Area value) {
        this.vacantEffectiveAreaOther = value;
    }

    /**
     * Ruft den Wert der vacantEffectiveAreaResidential-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getVacantEffectiveAreaResidential() {
        return vacantEffectiveAreaResidential;
    }

    /**
     * Legt den Wert der vacantEffectiveAreaResidential-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setVacantEffectiveAreaResidential(Area value) {
        this.vacantEffectiveAreaResidential = value;
    }

    /**
     * Ruft den Wert der vacantEffectiveAreaTrade-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getVacantEffectiveAreaTrade() {
        return vacantEffectiveAreaTrade;
    }

    /**
     * Legt den Wert der vacantEffectiveAreaTrade-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setVacantEffectiveAreaTrade(Area value) {
        this.vacantEffectiveAreaTrade = value;
    }

    /**
     * Ruft den Wert der valuationDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValuationDate() {
        return valuationDate;
    }

    /**
     * Legt den Wert der valuationDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValuationDate(String value) {
        this.valuationDate = value;
    }

    /**
     * Ruft den Wert der energyRating-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnergyRating }
     *     
     */
    public EnergyRating getEnergyRating() {
        return energyRating;
    }

    /**
     * Legt den Wert der energyRating-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyRating }
     *     
     */
    public void setEnergyRating(EnergyRating value) {
        this.energyRating = value;
    }

    /**
     * Ruft den Wert der extensionMap-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionMap }
     *     
     */
    public ExtensionMap getExtensionMap() {
        return extensionMap;
    }

    /**
     * Legt den Wert der extensionMap-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionMap }
     *     
     */
    public void setExtensionMap(ExtensionMap value) {
        this.extensionMap = value;
    }

    /**
     * Ruft den Wert der objectIdSender-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectIdSender() {
        return objectIdSender;
    }

    /**
     * Legt den Wert der objectIdSender-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectIdSender(String value) {
        this.objectIdSender = value;
    }

    /**
     * Ruft den Wert der objectIdReceiver-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectIdReceiver() {
        return objectIdReceiver;
    }

    /**
     * Legt den Wert der objectIdReceiver-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectIdReceiver(String value) {
        this.objectIdReceiver = value;
    }

    /**
     * Ruft den Wert der validFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidFrom() {
        return validFrom;
    }

    /**
     * Legt den Wert der validFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidFrom(String value) {
        this.validFrom = value;
    }

    /**
     * Ruft den Wert der validTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidTo() {
        return validTo;
    }

    /**
     * Legt den Wert der validTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidTo(String value) {
        this.validTo = value;
    }

    /**
     * Ruft den Wert der label-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Legt den Wert der label-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

}
