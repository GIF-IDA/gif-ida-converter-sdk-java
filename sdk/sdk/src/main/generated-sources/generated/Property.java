//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.06.18 um 11:56:39 AM CEST 
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
 * <p>Java-Klasse für Property complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Property">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="administrationCosts" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="airconditioning" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="archValidFrom" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="archValidTo" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="areaMeasurement" type="{}AreaMeasurement" minOccurs="0"/>
 *         &lt;element name="areaType" type="{}AreaType" minOccurs="0"/>
 *         &lt;element name="assetAccountType" type="{}AssetAccountType" minOccurs="0"/>
 *         &lt;element name="assetCategory" type="{}AssetCategory" minOccurs="0"/>
 *         &lt;element name="assetManager" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="assetValue" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="balcony" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="barrierfree" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="capitalIncome" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="cellar" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="condition" type="{}ObjectCondition" minOccurs="0"/>
 *         &lt;element name="constructionDate" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="courtage" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="currency" type="{}iTYPE_CURRENCY" minOccurs="0"/>
 *         &lt;element name="distanceToAirport" type="{}iTYPE_DOUBLE" minOccurs="0"/>
 *         &lt;element name="distanceToHighway" type="{}iTYPE_DOUBLE" minOccurs="0"/>
 *         &lt;element name="distanceToPublicTransport" type="{}iTYPE_DOUBLE" minOccurs="0"/>
 *         &lt;element name="distanceToRailStation" type="{}iTYPE_DOUBLE" minOccurs="0"/>
 *         &lt;element name="economicConstructionDate" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="elevator" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="facilityManager" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="fairValue" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="groundRent" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="heatingType" type="{}HeatingType" minOccurs="0"/>
 *         &lt;element name="interiorQuality" type="{}InteriorQuality" minOccurs="0"/>
 *         &lt;element name="ipdObjectId" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="ipdPortfolioId" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="lanCables" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="lastRefurbishmentDate" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="leasedArea" type="{}Area" minOccurs="0"/>
 *         &lt;element name="locationClassificationType" type="{}LocationType" minOccurs="0"/>
 *         &lt;element name="maintenanceCosts" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="marketRentalValue" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="modernisationStatus" type="{}RestorationStatus" minOccurs="0"/>
 *         &lt;element name="monumentProtectionCategory" type="{}MonumentsType" minOccurs="0"/>
 *         &lt;element name="netIncome" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="note" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="numberOfBathrooms" type="{}iTYPE_INTEGER" minOccurs="0"/>
 *         &lt;element name="numberOfBedrooms" type="{}iTYPE_INTEGER" minOccurs="0"/>
 *         &lt;element name="numberOfCanteen" type="{}iTYPE_INTEGER" minOccurs="0"/>
 *         &lt;element name="numberOfParkingSpaces" type="{}iTYPE_INTEGER" minOccurs="0"/>
 *         &lt;element name="numberOfRooms" type="{}iTYPE_INTEGER" minOccurs="0"/>
 *         &lt;element name="operatingCosts" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="operatingCostsSettled" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="optRate" type="{}OptRate" minOccurs="0"/>
 *         &lt;element name="otherCosts" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="ownerOccupation" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="ownershipShare" type="{}iTYPE_DOUBLE" minOccurs="0"/>
 *         &lt;element name="ownershipType" type="{}OwnershipType" minOccurs="0"/>
 *         &lt;element name="partialPurchase" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="partialSales" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="plotArea" type="{}Area" minOccurs="0"/>
 *         &lt;element name="portfolioName" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="portfolioPartName" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="protfolioType" type="{}PortfolioType" minOccurs="0"/>
 *         &lt;element name="propertyManager" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="purchaseAdditionalCosts" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="purchaseBrokerage" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="purchaseDate" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="purchaseGrossPrice" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="purchaseLegalFees" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="purchaseNetPrice" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="purchaseTransferTax" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="rentalIncomeAdditional" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="rentalIncomeMain" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="rented" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="retailLocation" type="{}RetailLocationType" minOccurs="0"/>
 *         &lt;element name="riskStyle" type="{}RiskSegment" minOccurs="0"/>
 *         &lt;element name="saleAdditionalCosts" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="saleBrokerage" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="saleDate" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="saleGrossPrice" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="saleNetPrice" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="saleTransferTax" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="titleOfExposee" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="totalApportionableCosts" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="totalGrossCosts" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="totalNetCosts" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="useTypePrimary" type="{}BuildingType" minOccurs="0"/>
 *         &lt;element name="useTypeSecondary" type="{}BuildingType" minOccurs="0"/>
 *         &lt;element name="vacancyOperatingCosts" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="valueIncreasingReconstructCosts" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="address" type="{}Address" minOccurs="0"/>
 *         &lt;element name="extensionMap" type="{}iTYPE_EXTENSION_MAP" minOccurs="0"/>
 *         &lt;element name="LIST_OF_UNIT" type="{}Units" minOccurs="0"/>
 *         &lt;element name="LIST_OF_PROJ" type="{}Projects" minOccurs="0"/>
 *         &lt;element name="LIST_OF_LAND" type="{}Lands" minOccurs="0"/>
 *         &lt;element name="LIST_OF_BUILD" type="{}Buildings" minOccurs="0"/>
 *         &lt;element name="LIST_OF_LEASE" type="{}Leases" minOccurs="0"/>
 *         &lt;element name="LIST_OF_CON" type="{}ServiceContracts" minOccurs="0"/>
 *         &lt;element name="LIST_OF_VAL" type="{}Valuations" minOccurs="0"/>
 *         &lt;element name="LIST_OF_REC" type="{}Records" minOccurs="0"/>
 *         &lt;element name="LIST_OF_ACC" type="{}Accounts" minOccurs="0"/>
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
@XmlType(name = "Property", propOrder = {
    "administrationCosts",
    "airconditioning",
    "archValidFrom",
    "archValidTo",
    "areaMeasurement",
    "areaType",
    "assetAccountType",
    "assetCategory",
    "assetManager",
    "assetValue",
    "balcony",
    "barrierfree",
    "capitalIncome",
    "cellar",
    "condition",
    "constructionDate",
    "courtage",
    "currency",
    "distanceToAirport",
    "distanceToHighway",
    "distanceToPublicTransport",
    "distanceToRailStation",
    "economicConstructionDate",
    "elevator",
    "facilityManager",
    "fairValue",
    "groundRent",
    "heatingType",
    "interiorQuality",
    "ipdObjectId",
    "ipdPortfolioId",
    "lanCables",
    "lastRefurbishmentDate",
    "leasedArea",
    "locationClassificationType",
    "maintenanceCosts",
    "marketRentalValue",
    "modernisationStatus",
    "monumentProtectionCategory",
    "netIncome",
    "note",
    "numberOfBathrooms",
    "numberOfBedrooms",
    "numberOfCanteen",
    "numberOfParkingSpaces",
    "numberOfRooms",
    "operatingCosts",
    "operatingCostsSettled",
    "optRate",
    "otherCosts",
    "ownerOccupation",
    "ownershipShare",
    "ownershipType",
    "partialPurchase",
    "partialSales",
    "plotArea",
    "portfolioName",
    "portfolioPartName",
    "protfolioType",
    "propertyManager",
    "purchaseAdditionalCosts",
    "purchaseBrokerage",
    "purchaseDate",
    "purchaseGrossPrice",
    "purchaseLegalFees",
    "purchaseNetPrice",
    "purchaseTransferTax",
    "rentalIncomeAdditional",
    "rentalIncomeMain",
    "rented",
    "retailLocation",
    "riskStyle",
    "saleAdditionalCosts",
    "saleBrokerage",
    "saleDate",
    "saleGrossPrice",
    "saleNetPrice",
    "saleTransferTax",
    "titleOfExposee",
    "totalApportionableCosts",
    "totalGrossCosts",
    "totalNetCosts",
    "useTypePrimary",
    "useTypeSecondary",
    "vacancyOperatingCosts",
    "valueIncreasingReconstructCosts",
    "address",
    "extensionMap",
    "listofunit",
    "listofproj",
    "listofland",
    "listofbuild",
    "listoflease",
    "listofcon",
    "listofval",
    "listofrec",
    "listofacc"
})
public class Property {

    protected Amount administrationCosts;
    protected Boolean airconditioning;
    protected String archValidFrom;
    protected String archValidTo;
    protected AreaMeasurement areaMeasurement;
    protected AreaType areaType;
    protected AssetAccountType assetAccountType;
    protected AssetCategory assetCategory;
    protected String assetManager;
    protected Amount assetValue;
    protected Boolean balcony;
    protected Boolean barrierfree;
    protected Amount capitalIncome;
    protected Boolean cellar;
    protected ObjectCondition condition;
    protected String constructionDate;
    protected Amount courtage;
    protected String currency;
    protected BigDecimal distanceToAirport;
    protected BigDecimal distanceToHighway;
    protected BigDecimal distanceToPublicTransport;
    protected BigDecimal distanceToRailStation;
    protected String economicConstructionDate;
    protected Boolean elevator;
    protected String facilityManager;
    protected Amount fairValue;
    protected Amount groundRent;
    protected HeatingType heatingType;
    protected InteriorQuality interiorQuality;
    protected String ipdObjectId;
    protected String ipdPortfolioId;
    protected Boolean lanCables;
    protected String lastRefurbishmentDate;
    protected Area leasedArea;
    protected LocationType locationClassificationType;
    protected Amount maintenanceCosts;
    protected Amount marketRentalValue;
    protected RestorationStatus modernisationStatus;
    protected MonumentsType monumentProtectionCategory;
    protected Amount netIncome;
    protected String note;
    protected BigInteger numberOfBathrooms;
    protected BigInteger numberOfBedrooms;
    protected BigInteger numberOfCanteen;
    protected BigInteger numberOfParkingSpaces;
    protected BigInteger numberOfRooms;
    protected Amount operatingCosts;
    protected Amount operatingCostsSettled;
    protected OptRate optRate;
    protected Amount otherCosts;
    protected Boolean ownerOccupation;
    protected BigDecimal ownershipShare;
    protected OwnershipType ownershipType;
    protected Amount partialPurchase;
    protected Amount partialSales;
    protected Area plotArea;
    protected String portfolioName;
    protected String portfolioPartName;
    protected PortfolioType protfolioType;
    protected String propertyManager;
    protected Amount purchaseAdditionalCosts;
    protected Amount purchaseBrokerage;
    protected String purchaseDate;
    protected Amount purchaseGrossPrice;
    protected Amount purchaseLegalFees;
    protected Amount purchaseNetPrice;
    protected Amount purchaseTransferTax;
    protected Amount rentalIncomeAdditional;
    protected Amount rentalIncomeMain;
    protected Boolean rented;
    protected RetailLocationType retailLocation;
    protected RiskSegment riskStyle;
    protected Amount saleAdditionalCosts;
    protected Amount saleBrokerage;
    protected String saleDate;
    protected Amount saleGrossPrice;
    protected Amount saleNetPrice;
    protected Amount saleTransferTax;
    protected String titleOfExposee;
    protected Amount totalApportionableCosts;
    protected Amount totalGrossCosts;
    protected Amount totalNetCosts;
    protected BuildingType useTypePrimary;
    protected BuildingType useTypeSecondary;
    protected Amount vacancyOperatingCosts;
    protected Amount valueIncreasingReconstructCosts;
    protected Address address;
    protected ITYPEEXTENSIONMAP extensionMap;
    @XmlElement(name = "LIST_OF_UNIT")
    protected Units listofunit;
    @XmlElement(name = "LIST_OF_PROJ")
    protected Projects listofproj;
    @XmlElement(name = "LIST_OF_LAND")
    protected Lands listofland;
    @XmlElement(name = "LIST_OF_BUILD")
    protected Buildings listofbuild;
    @XmlElement(name = "LIST_OF_LEASE")
    protected Leases listoflease;
    @XmlElement(name = "LIST_OF_CON")
    protected ServiceContracts listofcon;
    @XmlElement(name = "LIST_OF_VAL")
    protected Valuations listofval;
    @XmlElement(name = "LIST_OF_REC")
    protected Records listofrec;
    @XmlElement(name = "LIST_OF_ACC")
    protected Accounts listofacc;
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
     * Ruft den Wert der administrationCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getAdministrationCosts() {
        return administrationCosts;
    }

    /**
     * Legt den Wert der administrationCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setAdministrationCosts(Amount value) {
        this.administrationCosts = value;
    }

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
     * Ruft den Wert der assetCategory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssetCategory }
     *     
     */
    public AssetCategory getAssetCategory() {
        return assetCategory;
    }

    /**
     * Legt den Wert der assetCategory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetCategory }
     *     
     */
    public void setAssetCategory(AssetCategory value) {
        this.assetCategory = value;
    }

    /**
     * Ruft den Wert der assetManager-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetManager() {
        return assetManager;
    }

    /**
     * Legt den Wert der assetManager-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetManager(String value) {
        this.assetManager = value;
    }

    /**
     * Ruft den Wert der assetValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getAssetValue() {
        return assetValue;
    }

    /**
     * Legt den Wert der assetValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setAssetValue(Amount value) {
        this.assetValue = value;
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
     * Ruft den Wert der capitalIncome-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getCapitalIncome() {
        return capitalIncome;
    }

    /**
     * Legt den Wert der capitalIncome-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setCapitalIncome(Amount value) {
        this.capitalIncome = value;
    }

    /**
     * Ruft den Wert der cellar-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCellar() {
        return cellar;
    }

    /**
     * Legt den Wert der cellar-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCellar(Boolean value) {
        this.cellar = value;
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
     * Ruft den Wert der distanceToAirport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistanceToAirport() {
        return distanceToAirport;
    }

    /**
     * Legt den Wert der distanceToAirport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistanceToAirport(BigDecimal value) {
        this.distanceToAirport = value;
    }

    /**
     * Ruft den Wert der distanceToHighway-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistanceToHighway() {
        return distanceToHighway;
    }

    /**
     * Legt den Wert der distanceToHighway-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistanceToHighway(BigDecimal value) {
        this.distanceToHighway = value;
    }

    /**
     * Ruft den Wert der distanceToPublicTransport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistanceToPublicTransport() {
        return distanceToPublicTransport;
    }

    /**
     * Legt den Wert der distanceToPublicTransport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistanceToPublicTransport(BigDecimal value) {
        this.distanceToPublicTransport = value;
    }

    /**
     * Ruft den Wert der distanceToRailStation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistanceToRailStation() {
        return distanceToRailStation;
    }

    /**
     * Legt den Wert der distanceToRailStation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistanceToRailStation(BigDecimal value) {
        this.distanceToRailStation = value;
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
     * Ruft den Wert der facilityManager-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityManager() {
        return facilityManager;
    }

    /**
     * Legt den Wert der facilityManager-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityManager(String value) {
        this.facilityManager = value;
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
     * Ruft den Wert der groundRent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getGroundRent() {
        return groundRent;
    }

    /**
     * Legt den Wert der groundRent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setGroundRent(Amount value) {
        this.groundRent = value;
    }

    /**
     * Ruft den Wert der heatingType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeatingType }
     *     
     */
    public HeatingType getHeatingType() {
        return heatingType;
    }

    /**
     * Legt den Wert der heatingType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeatingType }
     *     
     */
    public void setHeatingType(HeatingType value) {
        this.heatingType = value;
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
     * Ruft den Wert der ipdObjectId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpdObjectId() {
        return ipdObjectId;
    }

    /**
     * Legt den Wert der ipdObjectId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpdObjectId(String value) {
        this.ipdObjectId = value;
    }

    /**
     * Ruft den Wert der ipdPortfolioId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpdPortfolioId() {
        return ipdPortfolioId;
    }

    /**
     * Legt den Wert der ipdPortfolioId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpdPortfolioId(String value) {
        this.ipdPortfolioId = value;
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
     * Ruft den Wert der locationClassificationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLocationClassificationType() {
        return locationClassificationType;
    }

    /**
     * Legt den Wert der locationClassificationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLocationClassificationType(LocationType value) {
        this.locationClassificationType = value;
    }

    /**
     * Ruft den Wert der maintenanceCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getMaintenanceCosts() {
        return maintenanceCosts;
    }

    /**
     * Legt den Wert der maintenanceCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setMaintenanceCosts(Amount value) {
        this.maintenanceCosts = value;
    }

    /**
     * Ruft den Wert der marketRentalValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getMarketRentalValue() {
        return marketRentalValue;
    }

    /**
     * Legt den Wert der marketRentalValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setMarketRentalValue(Amount value) {
        this.marketRentalValue = value;
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
     * Ruft den Wert der netIncome-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getNetIncome() {
        return netIncome;
    }

    /**
     * Legt den Wert der netIncome-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setNetIncome(Amount value) {
        this.netIncome = value;
    }

    /**
     * Ruft den Wert der note-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Legt den Wert der note-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
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
     * Ruft den Wert der operatingCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getOperatingCosts() {
        return operatingCosts;
    }

    /**
     * Legt den Wert der operatingCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setOperatingCosts(Amount value) {
        this.operatingCosts = value;
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
     * Ruft den Wert der otherCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getOtherCosts() {
        return otherCosts;
    }

    /**
     * Legt den Wert der otherCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setOtherCosts(Amount value) {
        this.otherCosts = value;
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
     * Ruft den Wert der ownershipType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OwnershipType }
     *     
     */
    public OwnershipType getOwnershipType() {
        return ownershipType;
    }

    /**
     * Legt den Wert der ownershipType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnershipType }
     *     
     */
    public void setOwnershipType(OwnershipType value) {
        this.ownershipType = value;
    }

    /**
     * Ruft den Wert der partialPurchase-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getPartialPurchase() {
        return partialPurchase;
    }

    /**
     * Legt den Wert der partialPurchase-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setPartialPurchase(Amount value) {
        this.partialPurchase = value;
    }

    /**
     * Ruft den Wert der partialSales-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getPartialSales() {
        return partialSales;
    }

    /**
     * Legt den Wert der partialSales-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setPartialSales(Amount value) {
        this.partialSales = value;
    }

    /**
     * Ruft den Wert der plotArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getPlotArea() {
        return plotArea;
    }

    /**
     * Legt den Wert der plotArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setPlotArea(Area value) {
        this.plotArea = value;
    }

    /**
     * Ruft den Wert der portfolioName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortfolioName() {
        return portfolioName;
    }

    /**
     * Legt den Wert der portfolioName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortfolioName(String value) {
        this.portfolioName = value;
    }

    /**
     * Ruft den Wert der portfolioPartName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortfolioPartName() {
        return portfolioPartName;
    }

    /**
     * Legt den Wert der portfolioPartName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortfolioPartName(String value) {
        this.portfolioPartName = value;
    }

    /**
     * Ruft den Wert der protfolioType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioType }
     *     
     */
    public PortfolioType getProtfolioType() {
        return protfolioType;
    }

    /**
     * Legt den Wert der protfolioType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioType }
     *     
     */
    public void setProtfolioType(PortfolioType value) {
        this.protfolioType = value;
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
     * Ruft den Wert der purchaseAdditionalCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getPurchaseAdditionalCosts() {
        return purchaseAdditionalCosts;
    }

    /**
     * Legt den Wert der purchaseAdditionalCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setPurchaseAdditionalCosts(Amount value) {
        this.purchaseAdditionalCosts = value;
    }

    /**
     * Ruft den Wert der purchaseBrokerage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getPurchaseBrokerage() {
        return purchaseBrokerage;
    }

    /**
     * Legt den Wert der purchaseBrokerage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setPurchaseBrokerage(Amount value) {
        this.purchaseBrokerage = value;
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
     * Ruft den Wert der purchaseGrossPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getPurchaseGrossPrice() {
        return purchaseGrossPrice;
    }

    /**
     * Legt den Wert der purchaseGrossPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setPurchaseGrossPrice(Amount value) {
        this.purchaseGrossPrice = value;
    }

    /**
     * Ruft den Wert der purchaseLegalFees-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getPurchaseLegalFees() {
        return purchaseLegalFees;
    }

    /**
     * Legt den Wert der purchaseLegalFees-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setPurchaseLegalFees(Amount value) {
        this.purchaseLegalFees = value;
    }

    /**
     * Ruft den Wert der purchaseNetPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getPurchaseNetPrice() {
        return purchaseNetPrice;
    }

    /**
     * Legt den Wert der purchaseNetPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setPurchaseNetPrice(Amount value) {
        this.purchaseNetPrice = value;
    }

    /**
     * Ruft den Wert der purchaseTransferTax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getPurchaseTransferTax() {
        return purchaseTransferTax;
    }

    /**
     * Legt den Wert der purchaseTransferTax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setPurchaseTransferTax(Amount value) {
        this.purchaseTransferTax = value;
    }

    /**
     * Ruft den Wert der rentalIncomeAdditional-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getRentalIncomeAdditional() {
        return rentalIncomeAdditional;
    }

    /**
     * Legt den Wert der rentalIncomeAdditional-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setRentalIncomeAdditional(Amount value) {
        this.rentalIncomeAdditional = value;
    }

    /**
     * Ruft den Wert der rentalIncomeMain-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getRentalIncomeMain() {
        return rentalIncomeMain;
    }

    /**
     * Legt den Wert der rentalIncomeMain-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setRentalIncomeMain(Amount value) {
        this.rentalIncomeMain = value;
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
     * Ruft den Wert der retailLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RetailLocationType }
     *     
     */
    public RetailLocationType getRetailLocation() {
        return retailLocation;
    }

    /**
     * Legt den Wert der retailLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailLocationType }
     *     
     */
    public void setRetailLocation(RetailLocationType value) {
        this.retailLocation = value;
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
     * Ruft den Wert der saleAdditionalCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getSaleAdditionalCosts() {
        return saleAdditionalCosts;
    }

    /**
     * Legt den Wert der saleAdditionalCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setSaleAdditionalCosts(Amount value) {
        this.saleAdditionalCosts = value;
    }

    /**
     * Ruft den Wert der saleBrokerage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getSaleBrokerage() {
        return saleBrokerage;
    }

    /**
     * Legt den Wert der saleBrokerage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setSaleBrokerage(Amount value) {
        this.saleBrokerage = value;
    }

    /**
     * Ruft den Wert der saleDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleDate() {
        return saleDate;
    }

    /**
     * Legt den Wert der saleDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleDate(String value) {
        this.saleDate = value;
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
     * Ruft den Wert der saleNetPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getSaleNetPrice() {
        return saleNetPrice;
    }

    /**
     * Legt den Wert der saleNetPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setSaleNetPrice(Amount value) {
        this.saleNetPrice = value;
    }

    /**
     * Ruft den Wert der saleTransferTax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getSaleTransferTax() {
        return saleTransferTax;
    }

    /**
     * Legt den Wert der saleTransferTax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setSaleTransferTax(Amount value) {
        this.saleTransferTax = value;
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
     * Ruft den Wert der totalApportionableCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getTotalApportionableCosts() {
        return totalApportionableCosts;
    }

    /**
     * Legt den Wert der totalApportionableCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setTotalApportionableCosts(Amount value) {
        this.totalApportionableCosts = value;
    }

    /**
     * Ruft den Wert der totalGrossCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getTotalGrossCosts() {
        return totalGrossCosts;
    }

    /**
     * Legt den Wert der totalGrossCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setTotalGrossCosts(Amount value) {
        this.totalGrossCosts = value;
    }

    /**
     * Ruft den Wert der totalNetCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getTotalNetCosts() {
        return totalNetCosts;
    }

    /**
     * Legt den Wert der totalNetCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setTotalNetCosts(Amount value) {
        this.totalNetCosts = value;
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
     * Ruft den Wert der vacancyOperatingCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getVacancyOperatingCosts() {
        return vacancyOperatingCosts;
    }

    /**
     * Legt den Wert der vacancyOperatingCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setVacancyOperatingCosts(Amount value) {
        this.vacancyOperatingCosts = value;
    }

    /**
     * Ruft den Wert der valueIncreasingReconstructCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getValueIncreasingReconstructCosts() {
        return valueIncreasingReconstructCosts;
    }

    /**
     * Legt den Wert der valueIncreasingReconstructCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setValueIncreasingReconstructCosts(Amount value) {
        this.valueIncreasingReconstructCosts = value;
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
     *     {@link Units }
     *     
     */
    public Units getLISTOFUNIT() {
        return listofunit;
    }

    /**
     * Legt den Wert der listofunit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Units }
     *     
     */
    public void setLISTOFUNIT(Units value) {
        this.listofunit = value;
    }

    /**
     * Ruft den Wert der listofproj-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Projects }
     *     
     */
    public Projects getLISTOFPROJ() {
        return listofproj;
    }

    /**
     * Legt den Wert der listofproj-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Projects }
     *     
     */
    public void setLISTOFPROJ(Projects value) {
        this.listofproj = value;
    }

    /**
     * Ruft den Wert der listofland-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Lands }
     *     
     */
    public Lands getLISTOFLAND() {
        return listofland;
    }

    /**
     * Legt den Wert der listofland-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Lands }
     *     
     */
    public void setLISTOFLAND(Lands value) {
        this.listofland = value;
    }

    /**
     * Ruft den Wert der listofbuild-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Buildings }
     *     
     */
    public Buildings getLISTOFBUILD() {
        return listofbuild;
    }

    /**
     * Legt den Wert der listofbuild-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Buildings }
     *     
     */
    public void setLISTOFBUILD(Buildings value) {
        this.listofbuild = value;
    }

    /**
     * Ruft den Wert der listoflease-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Leases }
     *     
     */
    public Leases getLISTOFLEASE() {
        return listoflease;
    }

    /**
     * Legt den Wert der listoflease-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Leases }
     *     
     */
    public void setLISTOFLEASE(Leases value) {
        this.listoflease = value;
    }

    /**
     * Ruft den Wert der listofcon-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceContracts }
     *     
     */
    public ServiceContracts getLISTOFCON() {
        return listofcon;
    }

    /**
     * Legt den Wert der listofcon-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceContracts }
     *     
     */
    public void setLISTOFCON(ServiceContracts value) {
        this.listofcon = value;
    }

    /**
     * Ruft den Wert der listofval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Valuations }
     *     
     */
    public Valuations getLISTOFVAL() {
        return listofval;
    }

    /**
     * Legt den Wert der listofval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Valuations }
     *     
     */
    public void setLISTOFVAL(Valuations value) {
        this.listofval = value;
    }

    /**
     * Ruft den Wert der listofrec-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Records }
     *     
     */
    public Records getLISTOFREC() {
        return listofrec;
    }

    /**
     * Legt den Wert der listofrec-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Records }
     *     
     */
    public void setLISTOFREC(Records value) {
        this.listofrec = value;
    }

    /**
     * Ruft den Wert der listofacc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Accounts }
     *     
     */
    public Accounts getLISTOFACC() {
        return listofacc;
    }

    /**
     * Legt den Wert der listofacc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Accounts }
     *     
     */
    public void setLISTOFACC(Accounts value) {
        this.listofacc = value;
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
