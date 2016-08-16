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
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * <p>Java class for Building complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Building">
 *   &lt;complexContent>
 *     &lt;extension base="{}AbstractEntityNode">
 *       &lt;sequence>
 *         &lt;element name="airconditioning" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="archValidFrom" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="archValidTo" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="areaMeasurement" type="{}AreaMeasurement" minOccurs="0"/>
 *         &lt;element name="areaType" type="{}AreaType" minOccurs="0"/>
 *         &lt;element name="assetAccountType" type="{}AssetAccountType" minOccurs="0"/>
 *         &lt;element name="balcony" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="barrierFree" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="condition" type="{}ObjectCondition" minOccurs="0"/>
 *         &lt;element name="constructionDate" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="courtage" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="cubature" type="{}iTYPE_DOUBLE" minOccurs="0"/>
 *         &lt;element name="economicConstructionDate" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="elevator" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="energySource" type="{}EnergySource" minOccurs="0"/>
 *         &lt;element name="floorload" type="{}iTYPE_DOUBLE" minOccurs="0"/>
 *         &lt;element name="guestToilet" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="highVoltage" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="interiorQuality" type="{}InteriorQuality" minOccurs="0"/>
 *         &lt;element name="lanCables" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="lastRefurbishmentDate" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="modernisationStatus" type="{}RestorationStatus" minOccurs="0"/>
 *         &lt;element name="monumentProtectionCategory" type="{}MonumentsType" minOccurs="0"/>
 *         &lt;element name="numberOfBathrooms" type="{}iTYPE_INTEGER" minOccurs="0"/>
 *         &lt;element name="numberOfBedrooms" type="{}iTYPE_INTEGER" minOccurs="0"/>
 *         &lt;element name="numberOfCanteen" type="{}iTYPE_INTEGER" minOccurs="0"/>
 *         &lt;element name="numberOfFloors" type="{}iTYPE_INTEGER" minOccurs="0"/>
 *         &lt;element name="numberOfParkingSpaces" type="{}iTYPE_INTEGER" minOccurs="0"/>
 *         &lt;element name="numberOfRooms" type="{}iTYPE_INTEGER" minOccurs="0"/>
 *         &lt;element name="ownerOccupation" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="ownershipShare" type="{}iTYPE_DOUBLE" minOccurs="0"/>
 *         &lt;element name="propertyManager" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="purchaseDate" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="ramp" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="rented" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="riskStyle" type="{}RiskSegment" minOccurs="0"/>
 *         &lt;element name="saleGrossPrice" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="usableArea" type="{}Area" minOccurs="0"/>
 *         &lt;element name="useTypePrimary" type="{}BuildingType" minOccurs="0"/>
 *         &lt;element name="useTypeSecondary" type="{}BuildingType" minOccurs="0"/>
 *         &lt;element name="address" type="{}Address" minOccurs="0"/>
 *         &lt;element name="lastEnergyRating" type="{}EnergyRating" minOccurs="0"/>
 *         &lt;element name="extensionMap" type="{}ExtensionMap" minOccurs="0"/>
 *         &lt;element name="hashUnits" type="{}HashUnits" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Building", propOrder = {
    "airconditioning",
    "archValidFrom",
    "archValidTo",
    "areaMeasurement",
    "areaType",
    "assetAccountType",
    "balcony",
    "barrierFree",
    "condition",
    "constructionDate",
    "courtage",
    "cubature",
    "economicConstructionDate",
    "elevator",
    "energySource",
    "floorload",
    "guestToilet",
    "highVoltage",
    "interiorQuality",
    "lanCables",
    "lastRefurbishmentDate",
    "modernisationStatus",
    "monumentProtectionCategory",
    "numberOfBathrooms",
    "numberOfBedrooms",
    "numberOfCanteen",
    "numberOfFloors",
    "numberOfParkingSpaces",
    "numberOfRooms",
    "ownerOccupation",
    "ownershipShare",
    "propertyManager",
    "purchaseDate",
    "ramp",
    "rented",
    "riskStyle",
    "saleGrossPrice",
    "usableArea",
    "useTypePrimary",
    "useTypeSecondary",
    "address",
    "lastEnergyRating",
    "extensionMap",
    "hashUnits"
})
public class Building
    extends AbstractEntityNode
{

    protected Boolean airconditioning;
    protected String archValidFrom;
    protected String archValidTo;
    @XmlSchemaType(name = "string")
    protected AreaMeasurement areaMeasurement;
    @XmlSchemaType(name = "string")
    protected AreaType areaType;
    @XmlSchemaType(name = "string")
    protected AssetAccountType assetAccountType;
    protected Boolean balcony;
    protected Boolean barrierFree;
    @XmlSchemaType(name = "string")
    protected ObjectCondition condition;
    protected String constructionDate;
    protected Amount courtage;
    protected BigDecimal cubature;
    protected String economicConstructionDate;
    protected Boolean elevator;
    @XmlSchemaType(name = "string")
    protected EnergySource energySource;
    protected BigDecimal floorload;
    protected Boolean guestToilet;
    protected Boolean highVoltage;
    @XmlSchemaType(name = "string")
    protected InteriorQuality interiorQuality;
    protected Boolean lanCables;
    protected String lastRefurbishmentDate;
    @XmlSchemaType(name = "string")
    protected RestorationStatus modernisationStatus;
    @XmlSchemaType(name = "string")
    protected MonumentsType monumentProtectionCategory;
    protected BigInteger numberOfBathrooms;
    protected BigInteger numberOfBedrooms;
    protected BigInteger numberOfCanteen;
    protected BigInteger numberOfFloors;
    protected BigInteger numberOfParkingSpaces;
    protected BigInteger numberOfRooms;
    protected Boolean ownerOccupation;
    protected BigDecimal ownershipShare;
    protected String propertyManager;
    protected String purchaseDate;
    protected Boolean ramp;
    protected Boolean rented;
    @XmlSchemaType(name = "string")
    protected RiskSegment riskStyle;
    protected Amount saleGrossPrice;
    protected Area usableArea;
    @XmlSchemaType(name = "string")
    protected BuildingType useTypePrimary;
    @XmlSchemaType(name = "string")
    protected BuildingType useTypeSecondary;
    protected Address address;
    protected EnergyRating lastEnergyRating;
    protected ExtensionMap extensionMap;
    protected HashUnits hashUnits;

    /**
     * Gets the value of the airconditioning property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAirconditioning() {
        return airconditioning;
    }

    /**
     * Sets the value of the airconditioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAirconditioning(Boolean value) {
        this.airconditioning = value;
    }

    /**
     * Gets the value of the archValidFrom property.
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
     * Sets the value of the archValidFrom property.
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
     * Gets the value of the archValidTo property.
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
     * Sets the value of the archValidTo property.
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
     * Gets the value of the areaMeasurement property.
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
     * Sets the value of the areaMeasurement property.
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
     * Gets the value of the areaType property.
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
     * Sets the value of the areaType property.
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
     * Gets the value of the assetAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link AssetAccountType }
     *     
     */
    public AssetAccountType getAssetAccountType() {
        return assetAccountType;
    }

    /**
     * Sets the value of the assetAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetAccountType }
     *     
     */
    public void setAssetAccountType(AssetAccountType value) {
        this.assetAccountType = value;
    }

    /**
     * Gets the value of the balcony property.
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
     * Sets the value of the balcony property.
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
     * Gets the value of the barrierFree property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBarrierFree() {
        return barrierFree;
    }

    /**
     * Sets the value of the barrierFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBarrierFree(Boolean value) {
        this.barrierFree = value;
    }

    /**
     * Gets the value of the condition property.
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
     * Sets the value of the condition property.
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
     * Gets the value of the constructionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstructionDate() {
        return constructionDate;
    }

    /**
     * Sets the value of the constructionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstructionDate(String value) {
        this.constructionDate = value;
    }

    /**
     * Gets the value of the courtage property.
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
     * Sets the value of the courtage property.
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
     * Gets the value of the cubature property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCubature() {
        return cubature;
    }

    /**
     * Sets the value of the cubature property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCubature(BigDecimal value) {
        this.cubature = value;
    }

    /**
     * Gets the value of the economicConstructionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEconomicConstructionDate() {
        return economicConstructionDate;
    }

    /**
     * Sets the value of the economicConstructionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEconomicConstructionDate(String value) {
        this.economicConstructionDate = value;
    }

    /**
     * Gets the value of the elevator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElevator() {
        return elevator;
    }

    /**
     * Sets the value of the elevator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setElevator(Boolean value) {
        this.elevator = value;
    }

    /**
     * Gets the value of the energySource property.
     * 
     * @return
     *     possible object is
     *     {@link EnergySource }
     *     
     */
    public EnergySource getEnergySource() {
        return energySource;
    }

    /**
     * Sets the value of the energySource property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergySource }
     *     
     */
    public void setEnergySource(EnergySource value) {
        this.energySource = value;
    }

    /**
     * Gets the value of the floorload property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFloorload() {
        return floorload;
    }

    /**
     * Sets the value of the floorload property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFloorload(BigDecimal value) {
        this.floorload = value;
    }

    /**
     * Gets the value of the guestToilet property.
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
     * Sets the value of the guestToilet property.
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
     * Gets the value of the highVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHighVoltage() {
        return highVoltage;
    }

    /**
     * Sets the value of the highVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHighVoltage(Boolean value) {
        this.highVoltage = value;
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
     * Gets the value of the lanCables property.
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
     * Sets the value of the lanCables property.
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
     * Gets the value of the lastRefurbishmentDate property.
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
     * Sets the value of the lastRefurbishmentDate property.
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
     * Gets the value of the modernisationStatus property.
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
     * Sets the value of the modernisationStatus property.
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
     * Gets the value of the monumentProtectionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link MonumentsType }
     *     
     */
    public MonumentsType getMonumentProtectionCategory() {
        return monumentProtectionCategory;
    }

    /**
     * Sets the value of the monumentProtectionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonumentsType }
     *     
     */
    public void setMonumentProtectionCategory(MonumentsType value) {
        this.monumentProtectionCategory = value;
    }

    /**
     * Gets the value of the numberOfBathrooms property.
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
     * Sets the value of the numberOfBathrooms property.
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
     * Gets the value of the numberOfBedrooms property.
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
     * Sets the value of the numberOfBedrooms property.
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
     * Gets the value of the numberOfCanteen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfCanteen() {
        return numberOfCanteen;
    }

    /**
     * Sets the value of the numberOfCanteen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfCanteen(BigInteger value) {
        this.numberOfCanteen = value;
    }

    /**
     * Gets the value of the numberOfFloors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfFloors() {
        return numberOfFloors;
    }

    /**
     * Sets the value of the numberOfFloors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfFloors(BigInteger value) {
        this.numberOfFloors = value;
    }

    /**
     * Gets the value of the numberOfParkingSpaces property.
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
     * Sets the value of the numberOfParkingSpaces property.
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
     * Gets the value of the numberOfRooms property.
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
     * Sets the value of the numberOfRooms property.
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
     * Gets the value of the ownerOccupation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOwnerOccupation() {
        return ownerOccupation;
    }

    /**
     * Sets the value of the ownerOccupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwnerOccupation(Boolean value) {
        this.ownerOccupation = value;
    }

    /**
     * Gets the value of the ownershipShare property.
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
     * Sets the value of the ownershipShare property.
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
     * Gets the value of the propertyManager property.
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
     * Sets the value of the propertyManager property.
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
     * Gets the value of the purchaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Sets the value of the purchaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseDate(String value) {
        this.purchaseDate = value;
    }

    /**
     * Gets the value of the ramp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRamp() {
        return ramp;
    }

    /**
     * Sets the value of the ramp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRamp(Boolean value) {
        this.ramp = value;
    }

    /**
     * Gets the value of the rented property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRented() {
        return rented;
    }

    /**
     * Sets the value of the rented property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRented(Boolean value) {
        this.rented = value;
    }

    /**
     * Gets the value of the riskStyle property.
     * 
     * @return
     *     possible object is
     *     {@link RiskSegment }
     *     
     */
    public RiskSegment getRiskStyle() {
        return riskStyle;
    }

    /**
     * Sets the value of the riskStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskSegment }
     *     
     */
    public void setRiskStyle(RiskSegment value) {
        this.riskStyle = value;
    }

    /**
     * Gets the value of the saleGrossPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getSaleGrossPrice() {
        return saleGrossPrice;
    }

    /**
     * Sets the value of the saleGrossPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setSaleGrossPrice(Amount value) {
        this.saleGrossPrice = value;
    }

    /**
     * Gets the value of the usableArea property.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getUsableArea() {
        return usableArea;
    }

    /**
     * Sets the value of the usableArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setUsableArea(Area value) {
        this.usableArea = value;
    }

    /**
     * Gets the value of the useTypePrimary property.
     * 
     * @return
     *     possible object is
     *     {@link BuildingType }
     *     
     */
    public BuildingType getUseTypePrimary() {
        return useTypePrimary;
    }

    /**
     * Sets the value of the useTypePrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildingType }
     *     
     */
    public void setUseTypePrimary(BuildingType value) {
        this.useTypePrimary = value;
    }

    /**
     * Gets the value of the useTypeSecondary property.
     * 
     * @return
     *     possible object is
     *     {@link BuildingType }
     *     
     */
    public BuildingType getUseTypeSecondary() {
        return useTypeSecondary;
    }

    /**
     * Sets the value of the useTypeSecondary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildingType }
     *     
     */
    public void setUseTypeSecondary(BuildingType value) {
        this.useTypeSecondary = value;
    }

    /**
     * Gets the value of the address property.
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
     * Sets the value of the address property.
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
     * Gets the value of the lastEnergyRating property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyRating }
     *     
     */
    public EnergyRating getLastEnergyRating() {
        return lastEnergyRating;
    }

    /**
     * Sets the value of the lastEnergyRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyRating }
     *     
     */
    public void setLastEnergyRating(EnergyRating value) {
        this.lastEnergyRating = value;
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

    /**
     * Gets the value of the hashUnits property.
     * 
     * @return
     *     possible object is
     *     {@link HashUnits }
     *     
     */
    public HashUnits getHashUnits() {
        return hashUnits;
    }

    /**
     * Sets the value of the hashUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link HashUnits }
     *     
     */
    public void setHashUnits(HashUnits value) {
        this.hashUnits = value;
    }

}