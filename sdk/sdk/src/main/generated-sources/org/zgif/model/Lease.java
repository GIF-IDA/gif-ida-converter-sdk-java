//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.07.27 um 11:43:51 AM CEST 
//


package org.zgif.model;

import org.zgif.model.*;
import org.zgif.model.types.*;
import org.zgif.model.*;


import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java-Klasse für Lease complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Lease">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acceptedTerminationDate" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="badDebt" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="beginRentPayment" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="breakOption" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="collectiveObjectIdSender" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="contractCompletionDate" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="contractExtensionDuration" type="{}iTYPE_PERIOD" minOccurs="0"/>
 *         &lt;element name="courtage" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="currency" type="{}iTYPE_CURRENCY" minOccurs="0"/>
 *         &lt;element name="debitor" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="debitorId" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="depositAgreed" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="depositAmount" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="depositIncreaseType" type="{}DepositIncreaseType" minOccurs="0"/>
 *         &lt;element name="depositPayed" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="depositType" type="{}DepositType" minOccurs="0"/>
 *         &lt;element name="dmiendOption" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="dunningIndicator" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="dunningLevel" type="{}DunningLevel" minOccurs="0"/>
 *         &lt;element name="freeFrom" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="heatingCosts" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="leaseBeginDate" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="leaseContractType" type="{}LeaseContractType" minOccurs="0"/>
 *         &lt;element name="leaseEndDate" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="maxNumberOfPerson" type="{}iTYPE_INTEGER" minOccurs="0"/>
 *         &lt;element name="maxRentalTime" type="{}iTYPE_PERIOD" minOccurs="0"/>
 *         &lt;element name="minRentalTime" type="{}iTYPE_PERIOD" minOccurs="0"/>
 *         &lt;element name="nation" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="openItems" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="operatingCostPrepayment" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="operatingCostsSettled" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="option" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="parkingSpaceCosts" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="payment" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="paymentPattern" type="{}iTYPE_PERIOD" minOccurs="0"/>
 *         &lt;element name="periodsTurnoverRents" type="{}iTYPE_PERIOD" minOccurs="0"/>
 *         &lt;element name="petsAllowed" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="propertyManager" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="sector" type="{}Sector" minOccurs="0"/>
 *         &lt;element name="tenancy" type="{}iTYPE_PERIOD" minOccurs="0"/>
 *         &lt;element name="terminated" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="terminationDuration" type="{}iTYPE_PERIOD" minOccurs="0"/>
 *         &lt;element name="terminationReceiptDate" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="turnoverAdjType" type="{}NumberType" minOccurs="0"/>
 *         &lt;element name="turnoverCertificate" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="turnoverMinimum" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="turnoverRentCap" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="turnoverReportingInterval" type="{}iTYPE_PERIOD" minOccurs="0"/>
 *         &lt;element name="turnoverSortiment" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="extensionMap" type="{}ExtensionMap" minOccurs="0"/>
 *         &lt;element name="termUnits" type="{}TermUnits" minOccurs="0"/>
 *         &lt;element name="terms" type="{}Terms" minOccurs="0"/>
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
@XmlType(name = "Lease", propOrder = {
    "acceptedTerminationDate",
    "badDebt",
    "beginRentPayment",
    "breakOption",
    "collectiveObjectIdSender",
    "contractCompletionDate",
    "contractExtensionDuration",
    "courtage",
    "currency",
    "debitor",
    "debitorId",
    "depositAgreed",
    "depositAmount",
    "depositIncreaseType",
    "depositPayed",
    "depositType",
    "dmiendOption",
    "dunningIndicator",
    "dunningLevel",
    "freeFrom",
    "heatingCosts",
    "leaseBeginDate",
    "leaseContractType",
    "leaseEndDate",
    "maxNumberOfPerson",
    "maxRentalTime",
    "minRentalTime",
    "nation",
    "openItems",
    "operatingCostPrepayment",
    "operatingCostsSettled",
    "option",
    "parkingSpaceCosts",
    "payment",
    "paymentPattern",
    "periodsTurnoverRents",
    "petsAllowed",
    "propertyManager",
    "sector",
    "tenancy",
    "terminated",
    "terminationDuration",
    "terminationReceiptDate",
    "turnoverAdjType",
    "turnoverCertificate",
    "turnoverMinimum",
    "turnoverRentCap",
    "turnoverReportingInterval",
    "turnoverSortiment",
    "extensionMap",
    "termUnits",
    "terms"
})
public class Lease {

    protected String acceptedTerminationDate;
    protected Amount badDebt;
    protected String beginRentPayment;
    protected String breakOption;
    protected String collectiveObjectIdSender;
    protected String contractCompletionDate;
    protected Duration contractExtensionDuration;
    protected Amount courtage;
    protected String currency;
    protected String debitor;
    protected String debitorId;
    protected Boolean depositAgreed;
    protected Amount depositAmount;
    protected DepositIncreaseType depositIncreaseType;
    protected Boolean depositPayed;
    protected DepositType depositType;
    protected String dmiendOption;
    protected Boolean dunningIndicator;
    protected DunningLevel dunningLevel;
    protected String freeFrom;
    protected Amount heatingCosts;
    protected String leaseBeginDate;
    protected LeaseContractType leaseContractType;
    protected String leaseEndDate;
    protected BigInteger maxNumberOfPerson;
    protected Duration maxRentalTime;
    protected Duration minRentalTime;
    protected String nation;
    protected Amount openItems;
    protected Amount operatingCostPrepayment;
    protected Amount operatingCostsSettled;
    protected Boolean option;
    protected Amount parkingSpaceCosts;
    protected Amount payment;
    protected Duration paymentPattern;
    protected Duration periodsTurnoverRents;
    protected Boolean petsAllowed;
    protected String propertyManager;
    protected Sector sector;
    protected Duration tenancy;
    protected Boolean terminated;
    protected Duration terminationDuration;
    protected String terminationReceiptDate;
    protected NumberType turnoverAdjType;
    protected Boolean turnoverCertificate;
    protected Amount turnoverMinimum;
    protected Amount turnoverRentCap;
    protected Duration turnoverReportingInterval;
    protected String turnoverSortiment;
    protected ExtensionMap extensionMap;
    protected TermUnits termUnits;
    protected Terms terms;
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
     * Ruft den Wert der acceptedTerminationDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptedTerminationDate() {
        return acceptedTerminationDate;
    }

    /**
     * Legt den Wert der acceptedTerminationDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptedTerminationDate(String value) {
        this.acceptedTerminationDate = value;
    }

    /**
     * Ruft den Wert der badDebt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getBadDebt() {
        return badDebt;
    }

    /**
     * Legt den Wert der badDebt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setBadDebt(Amount value) {
        this.badDebt = value;
    }

    /**
     * Ruft den Wert der beginRentPayment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginRentPayment() {
        return beginRentPayment;
    }

    /**
     * Legt den Wert der beginRentPayment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginRentPayment(String value) {
        this.beginRentPayment = value;
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
     * Ruft den Wert der collectiveObjectIdSender-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectiveObjectIdSender() {
        return collectiveObjectIdSender;
    }

    /**
     * Legt den Wert der collectiveObjectIdSender-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectiveObjectIdSender(String value) {
        this.collectiveObjectIdSender = value;
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
     * Ruft den Wert der contractExtensionDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getContractExtensionDuration() {
        return contractExtensionDuration;
    }

    /**
     * Legt den Wert der contractExtensionDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setContractExtensionDuration(Duration value) {
        this.contractExtensionDuration = value;
    }

    /**
     * Ruft den Wert der courtage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getCourtage() {
        return courtage;
    }

    /**
     * Legt den Wert der courtage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setCourtage(Amount value) {
        this.courtage = value;
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
     * Ruft den Wert der debitor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitor() {
        return debitor;
    }

    /**
     * Legt den Wert der debitor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitor(String value) {
        this.debitor = value;
    }

    /**
     * Ruft den Wert der debitorId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitorId() {
        return debitorId;
    }

    /**
     * Legt den Wert der debitorId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitorId(String value) {
        this.debitorId = value;
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
     * Ruft den Wert der dunningIndicator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDunningIndicator() {
        return dunningIndicator;
    }

    /**
     * Legt den Wert der dunningIndicator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDunningIndicator(Boolean value) {
        this.dunningIndicator = value;
    }

    /**
     * Ruft den Wert der dunningLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DunningLevel }
     *     
     */
    public DunningLevel getDunningLevel() {
        return dunningLevel;
    }

    /**
     * Legt den Wert der dunningLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DunningLevel }
     *     
     */
    public void setDunningLevel(DunningLevel value) {
        this.dunningLevel = value;
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
     * Ruft den Wert der leaseBeginDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaseBeginDate() {
        return leaseBeginDate;
    }

    /**
     * Legt den Wert der leaseBeginDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaseBeginDate(String value) {
        this.leaseBeginDate = value;
    }

    /**
     * Ruft den Wert der leaseContractType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LeaseContractType }
     *     
     */
    public LeaseContractType getLeaseContractType() {
        return leaseContractType;
    }

    /**
     * Legt den Wert der leaseContractType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaseContractType }
     *     
     */
    public void setLeaseContractType(LeaseContractType value) {
        this.leaseContractType = value;
    }

    /**
     * Ruft den Wert der leaseEndDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaseEndDate() {
        return leaseEndDate;
    }

    /**
     * Legt den Wert der leaseEndDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaseEndDate(String value) {
        this.leaseEndDate = value;
    }

    /**
     * Ruft den Wert der maxNumberOfPerson-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumberOfPerson() {
        return maxNumberOfPerson;
    }

    /**
     * Legt den Wert der maxNumberOfPerson-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumberOfPerson(BigInteger value) {
        this.maxNumberOfPerson = value;
    }

    /**
     * Ruft den Wert der maxRentalTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaxRentalTime() {
        return maxRentalTime;
    }

    /**
     * Legt den Wert der maxRentalTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaxRentalTime(Duration value) {
        this.maxRentalTime = value;
    }

    /**
     * Ruft den Wert der minRentalTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinRentalTime() {
        return minRentalTime;
    }

    /**
     * Legt den Wert der minRentalTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinRentalTime(Duration value) {
        this.minRentalTime = value;
    }

    /**
     * Ruft den Wert der nation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNation() {
        return nation;
    }

    /**
     * Legt den Wert der nation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNation(String value) {
        this.nation = value;
    }

    /**
     * Ruft den Wert der openItems-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getOpenItems() {
        return openItems;
    }

    /**
     * Legt den Wert der openItems-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setOpenItems(Amount value) {
        this.openItems = value;
    }

    /**
     * Ruft den Wert der operatingCostPrepayment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getOperatingCostPrepayment() {
        return operatingCostPrepayment;
    }

    /**
     * Legt den Wert der operatingCostPrepayment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setOperatingCostPrepayment(Amount value) {
        this.operatingCostPrepayment = value;
    }

    /**
     * Ruft den Wert der operatingCostsSettled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getOperatingCostsSettled() {
        return operatingCostsSettled;
    }

    /**
     * Legt den Wert der operatingCostsSettled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setOperatingCostsSettled(Amount value) {
        this.operatingCostsSettled = value;
    }

    /**
     * Ruft den Wert der option-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOption() {
        return option;
    }

    /**
     * Legt den Wert der option-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOption(Boolean value) {
        this.option = value;
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
     * Ruft den Wert der paymentPattern-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPaymentPattern() {
        return paymentPattern;
    }

    /**
     * Legt den Wert der paymentPattern-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPaymentPattern(Duration value) {
        this.paymentPattern = value;
    }

    /**
     * Ruft den Wert der periodsTurnoverRents-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPeriodsTurnoverRents() {
        return periodsTurnoverRents;
    }

    /**
     * Legt den Wert der periodsTurnoverRents-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPeriodsTurnoverRents(Duration value) {
        this.periodsTurnoverRents = value;
    }

    /**
     * Ruft den Wert der petsAllowed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPetsAllowed() {
        return petsAllowed;
    }

    /**
     * Legt den Wert der petsAllowed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPetsAllowed(Boolean value) {
        this.petsAllowed = value;
    }

    /**
     * Ruft den Wert der propertyManager-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyManager() {
        return propertyManager;
    }

    /**
     * Legt den Wert der propertyManager-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyManager(String value) {
        this.propertyManager = value;
    }

    /**
     * Ruft den Wert der sector-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Sector }
     *     
     */
    public Sector getSector() {
        return sector;
    }

    /**
     * Legt den Wert der sector-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Sector }
     *     
     */
    public void setSector(Sector value) {
        this.sector = value;
    }

    /**
     * Ruft den Wert der tenancy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTenancy() {
        return tenancy;
    }

    /**
     * Legt den Wert der tenancy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTenancy(Duration value) {
        this.tenancy = value;
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
     * Ruft den Wert der termUnits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TermUnits }
     *     
     */
    public TermUnits getTermUnits() {
        return termUnits;
    }

    /**
     * Legt den Wert der termUnits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TermUnits }
     *     
     */
    public void setTermUnits(TermUnits value) {
        this.termUnits = value;
    }

    /**
     * Ruft den Wert der terms-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Terms }
     *     
     */
    public Terms getTerms() {
        return terms;
    }

    /**
     * Legt den Wert der terms-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Terms }
     *     
     */
    public void setTerms(Terms value) {
        this.terms = value;
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
