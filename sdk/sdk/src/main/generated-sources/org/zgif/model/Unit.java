//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.07.27 um 11:43:51 AM CEST 
//


package org.zgif.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Unit complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Unit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apartmentType" type="{}ApartmentType" minOccurs="0"/>
 *         &lt;element name="archValidFrom" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="archValidTo" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="areaMeasurement" type="{}AreaMeasurement" minOccurs="0"/>
 *         &lt;element name="areaType" type="{}AreaType" minOccurs="0"/>
 *         &lt;element name="autoLift" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="balcony" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="barrierfree" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="certificateOfEligibility" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="condition" type="{}ObjectCondition" minOccurs="0"/>
 *         &lt;element name="courtage" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="endPriceMaintenance" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="garden" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="guestToilet" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="hallHeight" type="{}iTYPE_DOUBLE" minOccurs="0"/>
 *         &lt;element name="hasBuiltinKitchen" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="hasFurniture" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="interiorQuality" type="{}InteriorQuality" minOccurs="0"/>
 *         &lt;element name="isLodgerFlat" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="lanCables" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="lastRefurbishmentDate" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="lettableArea" type="{}Area" minOccurs="0"/>
 *         &lt;element name="lettableUnits" type="{}iTYPE_DOUBLE" minOccurs="0"/>
 *         &lt;element name="localReferenceRent" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="maxNumberOfPerson" type="{}iTYPE_INTEGER" minOccurs="0"/>
 *         &lt;element name="minimumDivisible" type="{}iTYPE_INTEGER" minOccurs="0"/>
 *         &lt;element name="modernisationStatus" type="{}RestorationStatus" minOccurs="0"/>
 *         &lt;element name="nonSmoker" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="numberOfBathrooms" type="{}iTYPE_INTEGER" minOccurs="0"/>
 *         &lt;element name="numberOfBedrooms" type="{}iTYPE_INTEGER" minOccurs="0"/>
 *         &lt;element name="numberOfParkingSpaces" type="{}iTYPE_INTEGER" minOccurs="0"/>
 *         &lt;element name="numberOfRooms" type="{}iTYPE_INTEGER" minOccurs="0"/>
 *         &lt;element name="parkingSpaceType" type="{}ParkingSpaceType" minOccurs="0"/>
 *         &lt;element name="propertyManager" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="summerResidencePractical" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="titleOfExposee" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="useType" type="{}UseType" minOccurs="0"/>
 *         &lt;element name="useTypeCustomer" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="vacancyReason" type="{}VacancyReason" minOccurs="0"/>
 *         &lt;element name="address" type="{}Address" minOccurs="0"/>
 *         &lt;element name="extensionMap" type="{}ExtensionMap" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="hash" type="{}iTYPE_STRING" />
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
@XmlType(name = "Unit", propOrder = {
    "apartmentType",
    "archValidFrom",
    "archValidTo",
    "areaMeasurement",
    "areaType",
    "autoLift",
    "balcony",
    "barrierfree",
    "certificateOfEligibility",
    "condition",
    "courtage",
    "endPriceMaintenance",
    "garden",
    "guestToilet",
    "hallHeight",
    "hasBuiltinKitchen",
    "hasFurniture",
    "interiorQuality",
    "isLodgerFlat",
    "lanCables",
    "lastRefurbishmentDate",
    "lettableArea",
    "lettableUnits",
    "localReferenceRent",
    "maxNumberOfPerson",
    "minimumDivisible",
    "modernisationStatus",
    "nonSmoker",
    "numberOfBathrooms",
    "numberOfBedrooms",
    "numberOfParkingSpaces",
    "numberOfRooms",
    "parkingSpaceType",
    "propertyManager",
    "summerResidencePractical",
    "titleOfExposee",
    "useType",
    "useTypeCustomer",
    "vacancyReason",
    "address",
    "extensionMap"
})
public class Unit {

    protected ApartmentType apartmentType;
    protected String archValidFrom;
    protected String archValidTo;
    protected AreaMeasurement areaMeasurement;
    protected AreaType areaType;
    protected Boolean autoLift;
    protected Boolean balcony;
    protected Boolean barrierfree;
    protected Boolean certificateOfEligibility;
    protected ObjectCondition condition;
    protected Amount courtage;
    protected String endPriceMaintenance;
    protected Boolean garden;
    protected Boolean guestToilet;
    protected BigDecimal hallHeight;
    protected Boolean hasBuiltinKitchen;
    protected Boolean hasFurniture;
    protected InteriorQuality interiorQuality;
    protected Boolean isLodgerFlat;
    protected Boolean lanCables;
    protected String lastRefurbishmentDate;
    protected Area lettableArea;
    protected BigDecimal lettableUnits;
    protected Amount localReferenceRent;
    protected BigInteger maxNumberOfPerson;
    protected BigInteger minimumDivisible;
    protected RestorationStatus modernisationStatus;
    protected Boolean nonSmoker;
    protected BigInteger numberOfBathrooms;
    protected BigInteger numberOfBedrooms;
    protected BigInteger numberOfParkingSpaces;
    protected BigInteger numberOfRooms;
    protected ParkingSpaceType parkingSpaceType;
    protected String propertyManager;
    protected Boolean summerResidencePractical;
    protected String titleOfExposee;
    protected UseType useType;
    protected String useTypeCustomer;
    protected VacancyReason vacancyReason;
    protected Address address;
    protected ExtensionMap extensionMap;
    @XmlAttribute(name = "hash")
    protected String hash;
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
     * Ruft den Wert der apartmentType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ApartmentType }
     *     
     */
    public ApartmentType getApartmentType() {
        return apartmentType;
    }

    /**
     * Legt den Wert der apartmentType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ApartmentType }
     *     
     */
    public void setApartmentType(ApartmentType value) {
        this.apartmentType = value;
    }

    /**
     * Ruft den Wert der archValidFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchValidFrom() {
        return archValidFrom;
    }

    /**
     * Legt den Wert der archValidFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchValidFrom(String value) {
        this.archValidFrom = value;
    }

    /**
     * Ruft den Wert der archValidTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchValidTo() {
        return archValidTo;
    }

    /**
     * Legt den Wert der archValidTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchValidTo(String value) {
        this.archValidTo = value;
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
     * Ruft den Wert der autoLift-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoLift() {
        return autoLift;
    }

    /**
     * Legt den Wert der autoLift-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoLift(Boolean value) {
        this.autoLift = value;
    }

    /**
     * Ruft den Wert der balcony-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBalcony() {
        return balcony;
    }

    /**
     * Legt den Wert der balcony-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBalcony(Boolean value) {
        this.balcony = value;
    }

    /**
     * Ruft den Wert der barrierfree-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBarrierfree() {
        return barrierfree;
    }

    /**
     * Legt den Wert der barrierfree-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBarrierfree(Boolean value) {
        this.barrierfree = value;
    }

    /**
     * Ruft den Wert der certificateOfEligibility-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCertificateOfEligibility() {
        return certificateOfEligibility;
    }

    /**
     * Legt den Wert der certificateOfEligibility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCertificateOfEligibility(Boolean value) {
        this.certificateOfEligibility = value;
    }

    /**
     * Ruft den Wert der condition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ObjectCondition }
     *     
     */
    public ObjectCondition getCondition() {
        return condition;
    }

    /**
     * Legt den Wert der condition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectCondition }
     *     
     */
    public void setCondition(ObjectCondition value) {
        this.condition = value;
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
     * Ruft den Wert der endPriceMaintenance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndPriceMaintenance() {
        return endPriceMaintenance;
    }

    /**
     * Legt den Wert der endPriceMaintenance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndPriceMaintenance(String value) {
        this.endPriceMaintenance = value;
    }

    /**
     * Ruft den Wert der garden-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGarden() {
        return garden;
    }

    /**
     * Legt den Wert der garden-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGarden(Boolean value) {
        this.garden = value;
    }

    /**
     * Ruft den Wert der guestToilet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuestToilet() {
        return guestToilet;
    }

    /**
     * Legt den Wert der guestToilet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuestToilet(Boolean value) {
        this.guestToilet = value;
    }

    /**
     * Ruft den Wert der hallHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHallHeight() {
        return hallHeight;
    }

    /**
     * Legt den Wert der hallHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHallHeight(BigDecimal value) {
        this.hallHeight = value;
    }

    /**
     * Ruft den Wert der hasBuiltinKitchen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasBuiltinKitchen() {
        return hasBuiltinKitchen;
    }

    /**
     * Legt den Wert der hasBuiltinKitchen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasBuiltinKitchen(Boolean value) {
        this.hasBuiltinKitchen = value;
    }

    /**
     * Ruft den Wert der hasFurniture-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasFurniture() {
        return hasFurniture;
    }

    /**
     * Legt den Wert der hasFurniture-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasFurniture(Boolean value) {
        this.hasFurniture = value;
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
     * Ruft den Wert der isLodgerFlat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLodgerFlat() {
        return isLodgerFlat;
    }

    /**
     * Legt den Wert der isLodgerFlat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLodgerFlat(Boolean value) {
        this.isLodgerFlat = value;
    }

    /**
     * Ruft den Wert der lanCables-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLanCables() {
        return lanCables;
    }

    /**
     * Legt den Wert der lanCables-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLanCables(Boolean value) {
        this.lanCables = value;
    }

    /**
     * Ruft den Wert der lastRefurbishmentDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastRefurbishmentDate() {
        return lastRefurbishmentDate;
    }

    /**
     * Legt den Wert der lastRefurbishmentDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastRefurbishmentDate(String value) {
        this.lastRefurbishmentDate = value;
    }

    /**
     * Ruft den Wert der lettableArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getLettableArea() {
        return lettableArea;
    }

    /**
     * Legt den Wert der lettableArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setLettableArea(Area value) {
        this.lettableArea = value;
    }

    /**
     * Ruft den Wert der lettableUnits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLettableUnits() {
        return lettableUnits;
    }

    /**
     * Legt den Wert der lettableUnits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLettableUnits(BigDecimal value) {
        this.lettableUnits = value;
    }

    /**
     * Ruft den Wert der localReferenceRent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getLocalReferenceRent() {
        return localReferenceRent;
    }

    /**
     * Legt den Wert der localReferenceRent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setLocalReferenceRent(Amount value) {
        this.localReferenceRent = value;
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
     * Ruft den Wert der minimumDivisible-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumDivisible() {
        return minimumDivisible;
    }

    /**
     * Legt den Wert der minimumDivisible-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumDivisible(BigInteger value) {
        this.minimumDivisible = value;
    }

    /**
     * Ruft den Wert der modernisationStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RestorationStatus }
     *     
     */
    public RestorationStatus getModernisationStatus() {
        return modernisationStatus;
    }

    /**
     * Legt den Wert der modernisationStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RestorationStatus }
     *     
     */
    public void setModernisationStatus(RestorationStatus value) {
        this.modernisationStatus = value;
    }

    /**
     * Ruft den Wert der nonSmoker-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonSmoker() {
        return nonSmoker;
    }

    /**
     * Legt den Wert der nonSmoker-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonSmoker(Boolean value) {
        this.nonSmoker = value;
    }

    /**
     * Ruft den Wert der numberOfBathrooms-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    /**
     * Legt den Wert der numberOfBathrooms-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfBathrooms(BigInteger value) {
        this.numberOfBathrooms = value;
    }

    /**
     * Ruft den Wert der numberOfBedrooms-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    /**
     * Legt den Wert der numberOfBedrooms-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfBedrooms(BigInteger value) {
        this.numberOfBedrooms = value;
    }

    /**
     * Ruft den Wert der numberOfParkingSpaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfParkingSpaces() {
        return numberOfParkingSpaces;
    }

    /**
     * Legt den Wert der numberOfParkingSpaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfParkingSpaces(BigInteger value) {
        this.numberOfParkingSpaces = value;
    }

    /**
     * Ruft den Wert der numberOfRooms-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfRooms() {
        return numberOfRooms;
    }

    /**
     * Legt den Wert der numberOfRooms-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfRooms(BigInteger value) {
        this.numberOfRooms = value;
    }

    /**
     * Ruft den Wert der parkingSpaceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParkingSpaceType }
     *     
     */
    public ParkingSpaceType getParkingSpaceType() {
        return parkingSpaceType;
    }

    /**
     * Legt den Wert der parkingSpaceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingSpaceType }
     *     
     */
    public void setParkingSpaceType(ParkingSpaceType value) {
        this.parkingSpaceType = value;
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
     * Ruft den Wert der summerResidencePractical-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSummerResidencePractical() {
        return summerResidencePractical;
    }

    /**
     * Legt den Wert der summerResidencePractical-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSummerResidencePractical(Boolean value) {
        this.summerResidencePractical = value;
    }

    /**
     * Ruft den Wert der titleOfExposee-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleOfExposee() {
        return titleOfExposee;
    }

    /**
     * Legt den Wert der titleOfExposee-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleOfExposee(String value) {
        this.titleOfExposee = value;
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
     * Ruft den Wert der useTypeCustomer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseTypeCustomer() {
        return useTypeCustomer;
    }

    /**
     * Legt den Wert der useTypeCustomer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseTypeCustomer(String value) {
        this.useTypeCustomer = value;
    }

    /**
     * Ruft den Wert der vacancyReason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VacancyReason }
     *     
     */
    public VacancyReason getVacancyReason() {
        return vacancyReason;
    }

    /**
     * Legt den Wert der vacancyReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VacancyReason }
     *     
     */
    public void setVacancyReason(VacancyReason value) {
        this.vacancyReason = value;
    }

    /**
     * Ruft den Wert der address-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
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
     * Ruft den Wert der hash-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHash() {
        return hash;
    }

    /**
     * Legt den Wert der hash-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHash(String value) {
        this.hash = value;
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
