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
import javax.xml.datatype.Duration;


/**
 * <p>Java-Klasse für Term complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Term">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baseIndex" type="{}iTYPE_DOUBLE" minOccurs="0"/>
 *         &lt;element name="beginningRentConsession" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="breakOption" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="conditionAmount" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="conditionType" type="{}ConditionType" minOccurs="0"/>
 *         &lt;element name="contractCompletionDate" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="contractOption" type="{}ContractOption" minOccurs="0"/>
 *         &lt;element name="currency" type="{}iTYPE_CURRENCY" minOccurs="0"/>
 *         &lt;element name="deltaGraduatedRent" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="depositAgreed" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="depositAmount" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="depositIncreaseType" type="{}DepositIncreaseType" minOccurs="0"/>
 *         &lt;element name="depositPayed" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="depositType" type="{}DepositType" minOccurs="0"/>
 *         &lt;element name="dmiendOption" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="endRentConcession" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="freeFrom" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="graduateRentBegin" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="heatingCosts" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="heatingCostsInServiceCharge" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="incomeLoss" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="indexAdjustmentBegin" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="indexAdjustmentDirection" type="{}IndexAdjustmentDirection" minOccurs="0"/>
 *         &lt;element name="indexAdjustmentValueType" type="{}NumberType" minOccurs="0"/>
 *         &lt;element name="indexBaseYear" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="indexCountry" type="{}Country" minOccurs="0"/>
 *         &lt;element name="indexMinimumAdjustmentInPercent" type="{}iTYPE_DOUBLE" minOccurs="0"/>
 *         &lt;element name="indexMinimumAdjustmentInPoints" type="{}iTYPE_DOUBLE" minOccurs="0"/>
 *         &lt;element name="indexModificationMethod" type="{}IndexationMethod" minOccurs="0"/>
 *         &lt;element name="indexPassthrough" type="{}iTYPE_DOUBLE" minOccurs="0"/>
 *         &lt;element name="indexRow" type="{}IndexRow" minOccurs="0"/>
 *         &lt;element name="interiorQuality" type="{}InteriorQuality" minOccurs="0"/>
 *         &lt;element name="lastRentAdjustmentDate" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="leasedArea" type="{}Area" minOccurs="0"/>
 *         &lt;element name="occupancyState" type="{}OccupancyState" minOccurs="0"/>
 *         &lt;element name="optRate" type="{}OptRate" minOccurs="0"/>
 *         &lt;element name="parkingSpaceCosts" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="payment" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="rentAdjustmentDate" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="rentAdjustmentDelay" type="{}iTYPE_PERIOD" minOccurs="0"/>
 *         &lt;element name="rentAdjustmentFrequence" type="{}iTYPE_PERIOD" minOccurs="0"/>
 *         &lt;element name="rentConcession" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="rentIncreasePercentage" type="{}iTYPE_DOUBLE" minOccurs="0"/>
 *         &lt;element name="rentIncreaseType" type="{}RentIncreaseType" minOccurs="0"/>
 *         &lt;element name="terminated" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="terminationDuration" type="{}iTYPE_PERIOD" minOccurs="0"/>
 *         &lt;element name="terminationReceiptDate" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="turnoverAdjType" type="{}NumberType" minOccurs="0"/>
 *         &lt;element name="turnoverCertificate" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="turnoverMinimum" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="turnoverRentCap" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="turnoverReportingInterval" type="{}iTYPE_PERIOD" minOccurs="0"/>
 *         &lt;element name="turnoverSortiment" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="useType" type="{}UseType" minOccurs="0"/>
 *         &lt;element name="vacancyDuration" type="{}iTYPE_PERIOD" minOccurs="0"/>
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
@XmlType(name = "Term", propOrder = {
    "baseIndex",
    "beginningRentConsession",
    "breakOption",
    "conditionAmount",
    "conditionType",
    "contractCompletionDate",
    "contractOption",
    "currency",
    "deltaGraduatedRent",
    "depositAgreed",
    "depositAmount",
    "depositIncreaseType",
    "depositPayed",
    "depositType",
    "dmiendOption",
    "endRentConcession",
    "freeFrom",
    "graduateRentBegin",
    "heatingCosts",
    "heatingCostsInServiceCharge",
    "incomeLoss",
    "indexAdjustmentBegin",
    "indexAdjustmentDirection",
    "indexAdjustmentValueType",
    "indexBaseYear",
    "indexCountry",
    "indexMinimumAdjustmentInPercent",
    "indexMinimumAdjustmentInPoints",
    "indexModificationMethod",
    "indexPassthrough",
    "indexRow",
    "interiorQuality",
    "lastRentAdjustmentDate",
    "leasedArea",
    "occupancyState",
    "optRate",
    "parkingSpaceCosts",
    "payment",
    "rentAdjustmentDate",
    "rentAdjustmentDelay",
    "rentAdjustmentFrequence",
    "rentConcession",
    "rentIncreasePercentage",
    "rentIncreaseType",
    "terminated",
    "terminationDuration",
    "terminationReceiptDate",
    "turnoverAdjType",
    "turnoverCertificate",
    "turnoverMinimum",
    "turnoverRentCap",
    "turnoverReportingInterval",
    "turnoverSortiment",
    "useType",
    "vacancyDuration",
    "extensionMap"
})
public class Term {

    protected BigDecimal baseIndex;
    protected String beginningRentConsession;
    protected String breakOption;
    protected Amount conditionAmount;
    protected ConditionType conditionType;
    protected String contractCompletionDate;
    protected ContractOption contractOption;
    protected String currency;
    protected Amount deltaGraduatedRent;
    protected Boolean depositAgreed;
    protected Amount depositAmount;
    protected DepositIncreaseType depositIncreaseType;
    protected Boolean depositPayed;
    protected DepositType depositType;
    protected String dmiendOption;
    protected String endRentConcession;
    protected String freeFrom;
    protected String graduateRentBegin;
    protected Amount heatingCosts;
    protected Boolean heatingCostsInServiceCharge;
    protected Amount incomeLoss;
    protected String indexAdjustmentBegin;
    protected IndexAdjustmentDirection indexAdjustmentDirection;
    protected NumberType indexAdjustmentValueType;
    protected String indexBaseYear;
    protected Country indexCountry;
    protected BigDecimal indexMinimumAdjustmentInPercent;
    protected BigDecimal indexMinimumAdjustmentInPoints;
    protected IndexationMethod indexModificationMethod;
    protected BigDecimal indexPassthrough;
    protected IndexRow indexRow;
    protected InteriorQuality interiorQuality;
    protected String lastRentAdjustmentDate;
    protected Area leasedArea;
    protected OccupancyState occupancyState;
    protected OptRate optRate;
    protected Amount parkingSpaceCosts;
    protected Amount payment;
    protected String rentAdjustmentDate;
    protected Duration rentAdjustmentDelay;
    protected Duration rentAdjustmentFrequence;
    protected Amount rentConcession;
    protected BigDecimal rentIncreasePercentage;
    protected RentIncreaseType rentIncreaseType;
    protected Boolean terminated;
    protected Duration terminationDuration;
    protected String terminationReceiptDate;
    protected NumberType turnoverAdjType;
    protected Boolean turnoverCertificate;
    protected Amount turnoverMinimum;
    protected Amount turnoverRentCap;
    protected Duration turnoverReportingInterval;
    protected String turnoverSortiment;
    protected UseType useType;
    protected Duration vacancyDuration;
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
     * Ruft den Wert der baseIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseIndex() {
        return baseIndex;
    }

    /**
     * Legt den Wert der baseIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseIndex(BigDecimal value) {
        this.baseIndex = value;
    }

    /**
     * Ruft den Wert der beginningRentConsession-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginningRentConsession() {
        return beginningRentConsession;
    }

    /**
     * Legt den Wert der beginningRentConsession-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginningRentConsession(String value) {
        this.beginningRentConsession = value;
    }

    /**
     * Ruft den Wert der breakOption-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreakOption() {
        return breakOption;
    }

    /**
     * Legt den Wert der breakOption-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreakOption(String value) {
        this.breakOption = value;
    }

    /**
     * Ruft den Wert der conditionAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getConditionAmount() {
        return conditionAmount;
    }

    /**
     * Legt den Wert der conditionAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setConditionAmount(Amount value) {
        this.conditionAmount = value;
    }

    /**
     * Ruft den Wert der conditionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConditionType }
     *     
     */
    public ConditionType getConditionType() {
        return conditionType;
    }

    /**
     * Legt den Wert der conditionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionType }
     *     
     */
    public void setConditionType(ConditionType value) {
        this.conditionType = value;
    }

    /**
     * Ruft den Wert der contractCompletionDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractCompletionDate() {
        return contractCompletionDate;
    }

    /**
     * Legt den Wert der contractCompletionDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractCompletionDate(String value) {
        this.contractCompletionDate = value;
    }

    /**
     * Ruft den Wert der contractOption-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContractOption }
     *     
     */
    public ContractOption getContractOption() {
        return contractOption;
    }

    /**
     * Legt den Wert der contractOption-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractOption }
     *     
     */
    public void setContractOption(ContractOption value) {
        this.contractOption = value;
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
     * Ruft den Wert der deltaGraduatedRent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getDeltaGraduatedRent() {
        return deltaGraduatedRent;
    }

    /**
     * Legt den Wert der deltaGraduatedRent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setDeltaGraduatedRent(Amount value) {
        this.deltaGraduatedRent = value;
    }

    /**
     * Ruft den Wert der depositAgreed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepositAgreed() {
        return depositAgreed;
    }

    /**
     * Legt den Wert der depositAgreed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepositAgreed(Boolean value) {
        this.depositAgreed = value;
    }

    /**
     * Ruft den Wert der depositAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getDepositAmount() {
        return depositAmount;
    }

    /**
     * Legt den Wert der depositAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setDepositAmount(Amount value) {
        this.depositAmount = value;
    }

    /**
     * Ruft den Wert der depositIncreaseType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DepositIncreaseType }
     *     
     */
    public DepositIncreaseType getDepositIncreaseType() {
        return depositIncreaseType;
    }

    /**
     * Legt den Wert der depositIncreaseType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositIncreaseType }
     *     
     */
    public void setDepositIncreaseType(DepositIncreaseType value) {
        this.depositIncreaseType = value;
    }

    /**
     * Ruft den Wert der depositPayed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepositPayed() {
        return depositPayed;
    }

    /**
     * Legt den Wert der depositPayed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepositPayed(Boolean value) {
        this.depositPayed = value;
    }

    /**
     * Ruft den Wert der depositType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DepositType }
     *     
     */
    public DepositType getDepositType() {
        return depositType;
    }

    /**
     * Legt den Wert der depositType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositType }
     *     
     */
    public void setDepositType(DepositType value) {
        this.depositType = value;
    }

    /**
     * Ruft den Wert der dmiendOption-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmiendOption() {
        return dmiendOption;
    }

    /**
     * Legt den Wert der dmiendOption-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmiendOption(String value) {
        this.dmiendOption = value;
    }

    /**
     * Ruft den Wert der endRentConcession-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndRentConcession() {
        return endRentConcession;
    }

    /**
     * Legt den Wert der endRentConcession-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndRentConcession(String value) {
        this.endRentConcession = value;
    }

    /**
     * Ruft den Wert der freeFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeFrom() {
        return freeFrom;
    }

    /**
     * Legt den Wert der freeFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeFrom(String value) {
        this.freeFrom = value;
    }

    /**
     * Ruft den Wert der graduateRentBegin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraduateRentBegin() {
        return graduateRentBegin;
    }

    /**
     * Legt den Wert der graduateRentBegin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraduateRentBegin(String value) {
        this.graduateRentBegin = value;
    }

    /**
     * Ruft den Wert der heatingCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getHeatingCosts() {
        return heatingCosts;
    }

    /**
     * Legt den Wert der heatingCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setHeatingCosts(Amount value) {
        this.heatingCosts = value;
    }

    /**
     * Ruft den Wert der heatingCostsInServiceCharge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeatingCostsInServiceCharge() {
        return heatingCostsInServiceCharge;
    }

    /**
     * Legt den Wert der heatingCostsInServiceCharge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeatingCostsInServiceCharge(Boolean value) {
        this.heatingCostsInServiceCharge = value;
    }

    /**
     * Ruft den Wert der incomeLoss-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getIncomeLoss() {
        return incomeLoss;
    }

    /**
     * Legt den Wert der incomeLoss-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setIncomeLoss(Amount value) {
        this.incomeLoss = value;
    }

    /**
     * Ruft den Wert der indexAdjustmentBegin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexAdjustmentBegin() {
        return indexAdjustmentBegin;
    }

    /**
     * Legt den Wert der indexAdjustmentBegin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexAdjustmentBegin(String value) {
        this.indexAdjustmentBegin = value;
    }

    /**
     * Ruft den Wert der indexAdjustmentDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IndexAdjustmentDirection }
     *     
     */
    public IndexAdjustmentDirection getIndexAdjustmentDirection() {
        return indexAdjustmentDirection;
    }

    /**
     * Legt den Wert der indexAdjustmentDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexAdjustmentDirection }
     *     
     */
    public void setIndexAdjustmentDirection(IndexAdjustmentDirection value) {
        this.indexAdjustmentDirection = value;
    }

    /**
     * Ruft den Wert der indexAdjustmentValueType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NumberType }
     *     
     */
    public NumberType getIndexAdjustmentValueType() {
        return indexAdjustmentValueType;
    }

    /**
     * Legt den Wert der indexAdjustmentValueType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberType }
     *     
     */
    public void setIndexAdjustmentValueType(NumberType value) {
        this.indexAdjustmentValueType = value;
    }

    /**
     * Ruft den Wert der indexBaseYear-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexBaseYear() {
        return indexBaseYear;
    }

    /**
     * Legt den Wert der indexBaseYear-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexBaseYear(String value) {
        this.indexBaseYear = value;
    }

    /**
     * Ruft den Wert der indexCountry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getIndexCountry() {
        return indexCountry;
    }

    /**
     * Legt den Wert der indexCountry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setIndexCountry(Country value) {
        this.indexCountry = value;
    }

    /**
     * Ruft den Wert der indexMinimumAdjustmentInPercent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndexMinimumAdjustmentInPercent() {
        return indexMinimumAdjustmentInPercent;
    }

    /**
     * Legt den Wert der indexMinimumAdjustmentInPercent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndexMinimumAdjustmentInPercent(BigDecimal value) {
        this.indexMinimumAdjustmentInPercent = value;
    }

    /**
     * Ruft den Wert der indexMinimumAdjustmentInPoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndexMinimumAdjustmentInPoints() {
        return indexMinimumAdjustmentInPoints;
    }

    /**
     * Legt den Wert der indexMinimumAdjustmentInPoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndexMinimumAdjustmentInPoints(BigDecimal value) {
        this.indexMinimumAdjustmentInPoints = value;
    }

    /**
     * Ruft den Wert der indexModificationMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IndexationMethod }
     *     
     */
    public IndexationMethod getIndexModificationMethod() {
        return indexModificationMethod;
    }

    /**
     * Legt den Wert der indexModificationMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexationMethod }
     *     
     */
    public void setIndexModificationMethod(IndexationMethod value) {
        this.indexModificationMethod = value;
    }

    /**
     * Ruft den Wert der indexPassthrough-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndexPassthrough() {
        return indexPassthrough;
    }

    /**
     * Legt den Wert der indexPassthrough-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndexPassthrough(BigDecimal value) {
        this.indexPassthrough = value;
    }

    /**
     * Ruft den Wert der indexRow-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IndexRow }
     *     
     */
    public IndexRow getIndexRow() {
        return indexRow;
    }

    /**
     * Legt den Wert der indexRow-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexRow }
     *     
     */
    public void setIndexRow(IndexRow value) {
        this.indexRow = value;
    }

    /**
     * Ruft den Wert der interiorQuality-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InteriorQuality }
     *     
     */
    public InteriorQuality getInteriorQuality() {
        return interiorQuality;
    }

    /**
     * Legt den Wert der interiorQuality-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InteriorQuality }
     *     
     */
    public void setInteriorQuality(InteriorQuality value) {
        this.interiorQuality = value;
    }

    /**
     * Ruft den Wert der lastRentAdjustmentDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastRentAdjustmentDate() {
        return lastRentAdjustmentDate;
    }

    /**
     * Legt den Wert der lastRentAdjustmentDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastRentAdjustmentDate(String value) {
        this.lastRentAdjustmentDate = value;
    }

    /**
     * Ruft den Wert der leasedArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getLeasedArea() {
        return leasedArea;
    }

    /**
     * Legt den Wert der leasedArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setLeasedArea(Area value) {
        this.leasedArea = value;
    }

    /**
     * Ruft den Wert der occupancyState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OccupancyState }
     *     
     */
    public OccupancyState getOccupancyState() {
        return occupancyState;
    }

    /**
     * Legt den Wert der occupancyState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupancyState }
     *     
     */
    public void setOccupancyState(OccupancyState value) {
        this.occupancyState = value;
    }

    /**
     * Ruft den Wert der optRate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OptRate }
     *     
     */
    public OptRate getOptRate() {
        return optRate;
    }

    /**
     * Legt den Wert der optRate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OptRate }
     *     
     */
    public void setOptRate(OptRate value) {
        this.optRate = value;
    }

    /**
     * Ruft den Wert der parkingSpaceCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getParkingSpaceCosts() {
        return parkingSpaceCosts;
    }

    /**
     * Legt den Wert der parkingSpaceCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setParkingSpaceCosts(Amount value) {
        this.parkingSpaceCosts = value;
    }

    /**
     * Ruft den Wert der payment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getPayment() {
        return payment;
    }

    /**
     * Legt den Wert der payment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setPayment(Amount value) {
        this.payment = value;
    }

    /**
     * Ruft den Wert der rentAdjustmentDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentAdjustmentDate() {
        return rentAdjustmentDate;
    }

    /**
     * Legt den Wert der rentAdjustmentDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentAdjustmentDate(String value) {
        this.rentAdjustmentDate = value;
    }

    /**
     * Ruft den Wert der rentAdjustmentDelay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getRentAdjustmentDelay() {
        return rentAdjustmentDelay;
    }

    /**
     * Legt den Wert der rentAdjustmentDelay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setRentAdjustmentDelay(Duration value) {
        this.rentAdjustmentDelay = value;
    }

    /**
     * Ruft den Wert der rentAdjustmentFrequence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getRentAdjustmentFrequence() {
        return rentAdjustmentFrequence;
    }

    /**
     * Legt den Wert der rentAdjustmentFrequence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setRentAdjustmentFrequence(Duration value) {
        this.rentAdjustmentFrequence = value;
    }

    /**
     * Ruft den Wert der rentConcession-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getRentConcession() {
        return rentConcession;
    }

    /**
     * Legt den Wert der rentConcession-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setRentConcession(Amount value) {
        this.rentConcession = value;
    }

    /**
     * Ruft den Wert der rentIncreasePercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRentIncreasePercentage() {
        return rentIncreasePercentage;
    }

    /**
     * Legt den Wert der rentIncreasePercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRentIncreasePercentage(BigDecimal value) {
        this.rentIncreasePercentage = value;
    }

    /**
     * Ruft den Wert der rentIncreaseType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RentIncreaseType }
     *     
     */
    public RentIncreaseType getRentIncreaseType() {
        return rentIncreaseType;
    }

    /**
     * Legt den Wert der rentIncreaseType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RentIncreaseType }
     *     
     */
    public void setRentIncreaseType(RentIncreaseType value) {
        this.rentIncreaseType = value;
    }

    /**
     * Ruft den Wert der terminated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTerminated() {
        return terminated;
    }

    /**
     * Legt den Wert der terminated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTerminated(Boolean value) {
        this.terminated = value;
    }

    /**
     * Ruft den Wert der terminationDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTerminationDuration() {
        return terminationDuration;
    }

    /**
     * Legt den Wert der terminationDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTerminationDuration(Duration value) {
        this.terminationDuration = value;
    }

    /**
     * Ruft den Wert der terminationReceiptDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminationReceiptDate() {
        return terminationReceiptDate;
    }

    /**
     * Legt den Wert der terminationReceiptDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminationReceiptDate(String value) {
        this.terminationReceiptDate = value;
    }

    /**
     * Ruft den Wert der turnoverAdjType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NumberType }
     *     
     */
    public NumberType getTurnoverAdjType() {
        return turnoverAdjType;
    }

    /**
     * Legt den Wert der turnoverAdjType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberType }
     *     
     */
    public void setTurnoverAdjType(NumberType value) {
        this.turnoverAdjType = value;
    }

    /**
     * Ruft den Wert der turnoverCertificate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTurnoverCertificate() {
        return turnoverCertificate;
    }

    /**
     * Legt den Wert der turnoverCertificate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTurnoverCertificate(Boolean value) {
        this.turnoverCertificate = value;
    }

    /**
     * Ruft den Wert der turnoverMinimum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getTurnoverMinimum() {
        return turnoverMinimum;
    }

    /**
     * Legt den Wert der turnoverMinimum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setTurnoverMinimum(Amount value) {
        this.turnoverMinimum = value;
    }

    /**
     * Ruft den Wert der turnoverRentCap-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getTurnoverRentCap() {
        return turnoverRentCap;
    }

    /**
     * Legt den Wert der turnoverRentCap-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setTurnoverRentCap(Amount value) {
        this.turnoverRentCap = value;
    }

    /**
     * Ruft den Wert der turnoverReportingInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTurnoverReportingInterval() {
        return turnoverReportingInterval;
    }

    /**
     * Legt den Wert der turnoverReportingInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTurnoverReportingInterval(Duration value) {
        this.turnoverReportingInterval = value;
    }

    /**
     * Ruft den Wert der turnoverSortiment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurnoverSortiment() {
        return turnoverSortiment;
    }

    /**
     * Legt den Wert der turnoverSortiment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurnoverSortiment(String value) {
        this.turnoverSortiment = value;
    }

    /**
     * Ruft den Wert der useType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UseType }
     *     
     */
    public UseType getUseType() {
        return useType;
    }

    /**
     * Legt den Wert der useType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UseType }
     *     
     */
    public void setUseType(UseType value) {
        this.useType = value;
    }

    /**
     * Ruft den Wert der vacancyDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getVacancyDuration() {
        return vacancyDuration;
    }

    /**
     * Legt den Wert der vacancyDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setVacancyDuration(Duration value) {
        this.vacancyDuration = value;
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
