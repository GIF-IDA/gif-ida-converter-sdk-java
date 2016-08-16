//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.16 at 12:41:56 PM CEST 
//


package org.zgif.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import java.math.BigDecimal;


/**
 * <p>Java class for Term complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Term">
 *   &lt;complexContent>
 *     &lt;extension base="{}AbstractEntityNode">
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
 *     &lt;/extension>
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
public class Term
    extends AbstractEntityNode
{

    protected BigDecimal baseIndex;
    protected String beginningRentConsession;
    protected String breakOption;
    protected Amount conditionAmount;
    @XmlSchemaType(name = "string")
    protected ConditionType conditionType;
    protected String contractCompletionDate;
    @XmlSchemaType(name = "string")
    protected ContractOption contractOption;
    protected String currency;
    protected Amount deltaGraduatedRent;
    protected Boolean depositAgreed;
    protected Amount depositAmount;
    @XmlSchemaType(name = "string")
    protected DepositIncreaseType depositIncreaseType;
    protected Boolean depositPayed;
    @XmlSchemaType(name = "string")
    protected DepositType depositType;
    protected String dmiendOption;
    protected String endRentConcession;
    protected String freeFrom;
    protected String graduateRentBegin;
    protected Amount heatingCosts;
    protected Boolean heatingCostsInServiceCharge;
    protected Amount incomeLoss;
    protected String indexAdjustmentBegin;
    @XmlSchemaType(name = "string")
    protected IndexAdjustmentDirection indexAdjustmentDirection;
    @XmlSchemaType(name = "string")
    protected NumberType indexAdjustmentValueType;
    protected String indexBaseYear;
    @XmlSchemaType(name = "string")
    protected Country indexCountry;
    protected BigDecimal indexMinimumAdjustmentInPercent;
    protected BigDecimal indexMinimumAdjustmentInPoints;
    @XmlSchemaType(name = "string")
    protected IndexationMethod indexModificationMethod;
    protected BigDecimal indexPassthrough;
    @XmlSchemaType(name = "string")
    protected IndexRow indexRow;
    @XmlSchemaType(name = "string")
    protected InteriorQuality interiorQuality;
    protected String lastRentAdjustmentDate;
    protected Area leasedArea;
    @XmlSchemaType(name = "string")
    protected OccupancyState occupancyState;
    @XmlSchemaType(name = "string")
    protected OptRate optRate;
    protected Amount parkingSpaceCosts;
    protected Amount payment;
    protected String rentAdjustmentDate;
    protected Duration rentAdjustmentDelay;
    protected Duration rentAdjustmentFrequence;
    protected Amount rentConcession;
    protected BigDecimal rentIncreasePercentage;
    @XmlSchemaType(name = "string")
    protected RentIncreaseType rentIncreaseType;
    protected Boolean terminated;
    protected Duration terminationDuration;
    protected String terminationReceiptDate;
    @XmlSchemaType(name = "string")
    protected NumberType turnoverAdjType;
    protected Boolean turnoverCertificate;
    protected Amount turnoverMinimum;
    protected Amount turnoverRentCap;
    protected Duration turnoverReportingInterval;
    protected String turnoverSortiment;
    @XmlSchemaType(name = "string")
    protected UseType useType;
    protected Duration vacancyDuration;
    protected ExtensionMap extensionMap;

    /**
     * Gets the value of the baseIndex property.
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
     * Sets the value of the baseIndex property.
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
     * Gets the value of the beginningRentConsession property.
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
     * Sets the value of the beginningRentConsession property.
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
     * Gets the value of the breakOption property.
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
     * Sets the value of the breakOption property.
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
     * Gets the value of the conditionAmount property.
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
     * Sets the value of the conditionAmount property.
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
     * Gets the value of the conditionType property.
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
     * Sets the value of the conditionType property.
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
     * Gets the value of the contractCompletionDate property.
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
     * Sets the value of the contractCompletionDate property.
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
     * Gets the value of the contractOption property.
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
     * Sets the value of the contractOption property.
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
     * Gets the value of the currency property.
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
     * Sets the value of the currency property.
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
     * Gets the value of the deltaGraduatedRent property.
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
     * Sets the value of the deltaGraduatedRent property.
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
     * Gets the value of the depositAgreed property.
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
     * Sets the value of the depositAgreed property.
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
     * Gets the value of the depositAmount property.
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
     * Sets the value of the depositAmount property.
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
     * Gets the value of the depositIncreaseType property.
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
     * Sets the value of the depositIncreaseType property.
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
     * Gets the value of the depositPayed property.
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
     * Sets the value of the depositPayed property.
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
     * Gets the value of the depositType property.
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
     * Sets the value of the depositType property.
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
     * Gets the value of the dmiendOption property.
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
     * Sets the value of the dmiendOption property.
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
     * Gets the value of the endRentConcession property.
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
     * Sets the value of the endRentConcession property.
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
     * Gets the value of the freeFrom property.
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
     * Sets the value of the freeFrom property.
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
     * Gets the value of the graduateRentBegin property.
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
     * Sets the value of the graduateRentBegin property.
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
     * Gets the value of the heatingCosts property.
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
     * Sets the value of the heatingCosts property.
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
     * Gets the value of the heatingCostsInServiceCharge property.
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
     * Sets the value of the heatingCostsInServiceCharge property.
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
     * Gets the value of the incomeLoss property.
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
     * Sets the value of the incomeLoss property.
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
     * Gets the value of the indexAdjustmentBegin property.
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
     * Sets the value of the indexAdjustmentBegin property.
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
     * Gets the value of the indexAdjustmentDirection property.
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
     * Sets the value of the indexAdjustmentDirection property.
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
     * Gets the value of the indexAdjustmentValueType property.
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
     * Sets the value of the indexAdjustmentValueType property.
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
     * Gets the value of the indexBaseYear property.
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
     * Sets the value of the indexBaseYear property.
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
     * Gets the value of the indexCountry property.
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
     * Sets the value of the indexCountry property.
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
     * Gets the value of the indexMinimumAdjustmentInPercent property.
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
     * Sets the value of the indexMinimumAdjustmentInPercent property.
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
     * Gets the value of the indexMinimumAdjustmentInPoints property.
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
     * Sets the value of the indexMinimumAdjustmentInPoints property.
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
     * Gets the value of the indexModificationMethod property.
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
     * Sets the value of the indexModificationMethod property.
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
     * Gets the value of the indexPassthrough property.
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
     * Sets the value of the indexPassthrough property.
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
     * Gets the value of the indexRow property.
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
     * Sets the value of the indexRow property.
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
     * Gets the value of the interiorQuality property.
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
     * Sets the value of the interiorQuality property.
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
     * Gets the value of the lastRentAdjustmentDate property.
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
     * Sets the value of the lastRentAdjustmentDate property.
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
     * Gets the value of the leasedArea property.
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
     * Sets the value of the leasedArea property.
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
     * Gets the value of the occupancyState property.
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
     * Sets the value of the occupancyState property.
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
     * Gets the value of the optRate property.
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
     * Sets the value of the optRate property.
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
     * Gets the value of the parkingSpaceCosts property.
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
     * Sets the value of the parkingSpaceCosts property.
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
     * Gets the value of the payment property.
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
     * Sets the value of the payment property.
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
     * Gets the value of the rentAdjustmentDate property.
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
     * Sets the value of the rentAdjustmentDate property.
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
     * Gets the value of the rentAdjustmentDelay property.
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
     * Sets the value of the rentAdjustmentDelay property.
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
     * Gets the value of the rentAdjustmentFrequence property.
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
     * Sets the value of the rentAdjustmentFrequence property.
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
     * Gets the value of the rentConcession property.
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
     * Sets the value of the rentConcession property.
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
     * Gets the value of the rentIncreasePercentage property.
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
     * Sets the value of the rentIncreasePercentage property.
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
     * Gets the value of the rentIncreaseType property.
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
     * Sets the value of the rentIncreaseType property.
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
     * Gets the value of the terminated property.
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
     * Sets the value of the terminated property.
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
     * Gets the value of the terminationDuration property.
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
     * Sets the value of the terminationDuration property.
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
     * Gets the value of the terminationReceiptDate property.
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
     * Sets the value of the terminationReceiptDate property.
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
     * Gets the value of the turnoverAdjType property.
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
     * Sets the value of the turnoverAdjType property.
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
     * Gets the value of the turnoverCertificate property.
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
     * Sets the value of the turnoverCertificate property.
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
     * Gets the value of the turnoverMinimum property.
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
     * Sets the value of the turnoverMinimum property.
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
     * Gets the value of the turnoverRentCap property.
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
     * Sets the value of the turnoverRentCap property.
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
     * Gets the value of the turnoverReportingInterval property.
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
     * Sets the value of the turnoverReportingInterval property.
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
     * Gets the value of the turnoverSortiment property.
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
     * Sets the value of the turnoverSortiment property.
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
     * Gets the value of the useType property.
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
     * Sets the value of the useType property.
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
     * Gets the value of the vacancyDuration property.
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
     * Sets the value of the vacancyDuration property.
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
     * Gets the value of the extensionMap property.
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
     * Sets the value of the extensionMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionMap }
     *     
     */
    public void setExtensionMap(ExtensionMap value) {
        this.extensionMap = value;
    }

}