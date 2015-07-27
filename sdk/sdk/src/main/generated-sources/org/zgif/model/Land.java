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
 * <p>Java-Klasse für Land complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Land">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="areaMeasurement" type="{}AreaMeasurement" minOccurs="0"/>
 *         &lt;element name="areaType" type="{}AreaType" minOccurs="0"/>
 *         &lt;element name="assetAccountType" type="{}AssetAccountType" minOccurs="0"/>
 *         &lt;element name="buildingPermission" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="courtage" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="demolition" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="fairValue" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="gfz" type="{}iTYPE_DECIMAL" minOccurs="0"/>
 *         &lt;element name="grz" type="{}iTYPE_DECIMAL" minOccurs="0"/>
 *         &lt;element name="monumentProtectionCategory" type="{}MonumentsType" minOccurs="0"/>
 *         &lt;element name="numberOfParkingSpaces" type="{}iTYPE_INTEGER" minOccurs="0"/>
 *         &lt;element name="ownerOccupation" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="plotArea" type="{}Area" minOccurs="0"/>
 *         &lt;element name="propertyManager" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="purchaseDate" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="purchaseGrossPrice" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="purchaseNetPrice" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="riskStyle" type="{}RiskSegment" minOccurs="0"/>
 *         &lt;element name="saleGrossPrice" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="saleNetPrice" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="shortTermConstructible" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="siteConstructibleType" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="siteDevelopmentType" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="address" type="{}Address" minOccurs="0"/>
 *         &lt;element name="extensionMap" type="{}ExtensionMap" minOccurs="0"/>
 *         &lt;element name="hashUnits" type="{}HashUnits" minOccurs="0"/>
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
@XmlType(name = "Land", propOrder = {
    "areaMeasurement",
    "areaType",
    "assetAccountType",
    "buildingPermission",
    "courtage",
    "demolition",
    "fairValue",
    "gfz",
    "grz",
    "monumentProtectionCategory",
    "numberOfParkingSpaces",
    "ownerOccupation",
    "plotArea",
    "propertyManager",
    "purchaseDate",
    "purchaseGrossPrice",
    "purchaseNetPrice",
    "riskStyle",
    "saleGrossPrice",
    "saleNetPrice",
    "shortTermConstructible",
    "siteConstructibleType",
    "siteDevelopmentType",
    "address",
    "extensionMap",
    "hashUnits"
})
public class Land {

    protected AreaMeasurement areaMeasurement;
    protected AreaType areaType;
    protected AssetAccountType assetAccountType;
    protected Boolean buildingPermission;
    protected Amount courtage;
    protected Boolean demolition;
    protected Amount fairValue;
    protected BigDecimal gfz;
    protected BigDecimal grz;
    protected MonumentsType monumentProtectionCategory;
    protected BigInteger numberOfParkingSpaces;
    protected Boolean ownerOccupation;
    protected Area plotArea;
    protected String propertyManager;
    protected String purchaseDate;
    protected Amount purchaseGrossPrice;
    protected Amount purchaseNetPrice;
    protected RiskSegment riskStyle;
    protected Amount saleGrossPrice;
    protected Amount saleNetPrice;
    protected Boolean shortTermConstructible;
    protected String siteConstructibleType;
    protected String siteDevelopmentType;
    protected Address address;
    protected ExtensionMap extensionMap;
    protected HashUnits hashUnits;
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
     * Ruft den Wert der buildingPermission-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuildingPermission() {
        return buildingPermission;
    }

    /**
     * Legt den Wert der buildingPermission-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuildingPermission(Boolean value) {
        this.buildingPermission = value;
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
     * Ruft den Wert der demolition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDemolition() {
        return demolition;
    }

    /**
     * Legt den Wert der demolition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDemolition(Boolean value) {
        this.demolition = value;
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
     * Ruft den Wert der gfz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGfz() {
        return gfz;
    }

    /**
     * Legt den Wert der gfz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGfz(BigDecimal value) {
        this.gfz = value;
    }

    /**
     * Ruft den Wert der grz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrz() {
        return grz;
    }

    /**
     * Legt den Wert der grz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrz(BigDecimal value) {
        this.grz = value;
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
     * Ruft den Wert der shortTermConstructible-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShortTermConstructible() {
        return shortTermConstructible;
    }

    /**
     * Legt den Wert der shortTermConstructible-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShortTermConstructible(Boolean value) {
        this.shortTermConstructible = value;
    }

    /**
     * Ruft den Wert der siteConstructibleType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteConstructibleType() {
        return siteConstructibleType;
    }

    /**
     * Legt den Wert der siteConstructibleType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteConstructibleType(String value) {
        this.siteConstructibleType = value;
    }

    /**
     * Ruft den Wert der siteDevelopmentType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteDevelopmentType() {
        return siteDevelopmentType;
    }

    /**
     * Legt den Wert der siteDevelopmentType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteDevelopmentType(String value) {
        this.siteDevelopmentType = value;
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
     * Ruft den Wert der hashUnits-Eigenschaft ab.
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
     * Legt den Wert der hashUnits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HashUnits }
     *     
     */
    public void setHashUnits(HashUnits value) {
        this.hashUnits = value;
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
