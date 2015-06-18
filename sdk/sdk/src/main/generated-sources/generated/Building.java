//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.06.18 um 01:19:59 PM CEST 
//


package generated;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Building complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Building">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
 *         &lt;element name="extensionMap" type="{}iTYPE_EXTENSION_MAP" minOccurs="0"/>
 *         &lt;element name="LIST_OF_UNIT" type="{}LIST_OF_HUNIT" minOccurs="0"/>
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
    "listofunit"
})
public class Building {

    protected Boolean airconditioning;
    protected String archValidFrom;
    protected String archValidTo;
    protected AreaMeasurement areaMeasurement;
    protected AreaType areaType;
    protected AssetAccountType assetAccountType;
    protected Boolean balcony;
    protected Boolean barrierFree;
    protected ObjectCondition condition;
    protected String constructionDate;
    protected Amount courtage;
    protected BigDecimal cubature;
    protected String economicConstructionDate;
    protected Boolean elevator;
    protected EnergySource energySource;
    protected BigDecimal floorload;
    protected Boolean guestToilet;
    protected Boolean highVoltage;
    protected InteriorQuality interiorQuality;
    protected Boolean lanCables;
    protected String lastRefurbishmentDate;
    protected RestorationStatus modernisationStatus;
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
    protected RiskSegment riskStyle;
    protected Amount saleGrossPrice;
    protected Area usableArea;
    protected BuildingType useTypePrimary;
    protected BuildingType useTypeSecondary;
    protected Address address;
    protected EnergyRating lastEnergyRating;
    protected ITYPEEXTENSIONMAP extensionMap;
    @XmlElement(name = "LIST_OF_UNIT")
    protected LISTOFHUNIT listofunit;
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
     * Ruft den Wert der airconditioning-Eigenschaft ab.
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
     * Legt den Wert der airconditioning-Eigenschaft fest.
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
     * Ruft den Wert der assetAccountType-Eigenschaft ab.
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
     * Legt den Wert der assetAccountType-Eigenschaft fest.
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
     * Ruft den Wert der barrierFree-Eigenschaft ab.
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
     * Legt den Wert der barrierFree-Eigenschaft fest.
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
     * Ruft den Wert der constructionDate-Eigenschaft ab.
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
     * Legt den Wert der constructionDate-Eigenschaft fest.
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
     * Ruft den Wert der cubature-Eigenschaft ab.
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
     * Legt den Wert der cubature-Eigenschaft fest.
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
     * Ruft den Wert der economicConstructionDate-Eigenschaft ab.
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
     * Legt den Wert der economicConstructionDate-Eigenschaft fest.
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
     * Ruft den Wert der elevator-Eigenschaft ab.
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
     * Legt den Wert der elevator-Eigenschaft fest.
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
     * Ruft den Wert der energySource-Eigenschaft ab.
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
     * Legt den Wert der energySource-Eigenschaft fest.
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
     * Ruft den Wert der floorload-Eigenschaft ab.
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
     * Legt den Wert der floorload-Eigenschaft fest.
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
     * Ruft den Wert der highVoltage-Eigenschaft ab.
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
     * Legt den Wert der highVoltage-Eigenschaft fest.
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
     * Ruft den Wert der monumentProtectionCategory-Eigenschaft ab.
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
     * Legt den Wert der monumentProtectionCategory-Eigenschaft fest.
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
     * Ruft den Wert der numberOfCanteen-Eigenschaft ab.
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
     * Legt den Wert der numberOfCanteen-Eigenschaft fest.
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
     * Ruft den Wert der numberOfFloors-Eigenschaft ab.
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
     * Legt den Wert der numberOfFloors-Eigenschaft fest.
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
     * Ruft den Wert der ownerOccupation-Eigenschaft ab.
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
     * Legt den Wert der ownerOccupation-Eigenschaft fest.
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
     * Ruft den Wert der purchaseDate-Eigenschaft ab.
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
     * Legt den Wert der purchaseDate-Eigenschaft fest.
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
     * Ruft den Wert der ramp-Eigenschaft ab.
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
     * Legt den Wert der ramp-Eigenschaft fest.
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
     * Ruft den Wert der rented-Eigenschaft ab.
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
     * Legt den Wert der rented-Eigenschaft fest.
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
     * Ruft den Wert der riskStyle-Eigenschaft ab.
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
     * Legt den Wert der riskStyle-Eigenschaft fest.
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
     * Ruft den Wert der saleGrossPrice-Eigenschaft ab.
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
     * Legt den Wert der saleGrossPrice-Eigenschaft fest.
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
     * Ruft den Wert der usableArea-Eigenschaft ab.
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
     * Legt den Wert der usableArea-Eigenschaft fest.
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
     * Ruft den Wert der useTypePrimary-Eigenschaft ab.
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
     * Legt den Wert der useTypePrimary-Eigenschaft fest.
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
     * Ruft den Wert der useTypeSecondary-Eigenschaft ab.
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
     * Legt den Wert der useTypeSecondary-Eigenschaft fest.
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
     * Ruft den Wert der lastEnergyRating-Eigenschaft ab.
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
     * Legt den Wert der lastEnergyRating-Eigenschaft fest.
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
     * Ruft den Wert der extensionMap-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ITYPEEXTENSIONMAP }
     *     
     */
    public ITYPEEXTENSIONMAP getExtensionMap() {
        return extensionMap;
    }

    /**
     * Legt den Wert der extensionMap-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ITYPEEXTENSIONMAP }
     *     
     */
    public void setExtensionMap(ITYPEEXTENSIONMAP value) {
        this.extensionMap = value;
    }

    /**
     * Ruft den Wert der listofunit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LISTOFHUNIT }
     *     
     */
    public LISTOFHUNIT getLISTOFUNIT() {
        return listofunit;
    }

    /**
     * Legt den Wert der listofunit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTOFHUNIT }
     *     
     */
    public void setLISTOFUNIT(LISTOFHUNIT value) {
        this.listofunit = value;
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
