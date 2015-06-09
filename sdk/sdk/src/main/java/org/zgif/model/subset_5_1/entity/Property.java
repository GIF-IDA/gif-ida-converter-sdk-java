package org.zgif.model.subset_5_1.entity;

import java.util.Currency;
import java.util.List;

import org.joda.time.LocalDate;
import org.zgif.model.annotation.DataField;
import org.zgif.model.datatype.Amount;
import org.zgif.model.datatype.enumeration.AreaMessurement;
import org.zgif.model.datatype.enumeration.AreaType;
import org.zgif.model.datatype.enumeration.MonumentsType;
import org.zgif.model.datatype.enumeration.ObjectCondition;
import org.zgif.model.datatype.enumeration.RestorationStatus;
import org.zgif.model.node.entity.AbstractProperty;
import org.zgif.model.node.group.EnergyRating;
import org.zgif.model.subset_4_1.entity.Building;

public class Property extends AbstractProperty {

	@DataField(wikiPageName = "Achitektonische G�ltigkeit Ab")
	private LocalDate archValidFrom;
	@DataField(wikiPageName = "Achitektonische G�ltigkeit bis")
	private LocalDate archValidTo;
	@DataField(wikiPageName = "Fl�chenma�")
	private AreaMessurement areaMessurement;
	@DataField(wikiPageName = "Fl�chenart")
	private AreaType areaType;
	@DataField(wikiPageName = "Asset_Manager")
	private String assetManager;

	@DataField(wikiPageName = "Objektzustand")
	private ObjectCondition condition;
	@DataField(wikiPageName = "Datum der Fertigstellung/Errichtung")
	private LocalDate constructionDate;
	@DataField(wikiPageName = "W�hrung")
	private Currency currency;

	@DataField(wikiPageName = "Facility_Manager")
	private String facilityManager;

	@DataField(wikiPageName = "Modernisierungsdatum")
	private LocalDate lastRefurbishmentDate;

	@DataField(wikiPageName = "Modernisierungszustand")
	private RestorationStatus modernisationStatus;
	@DataField(wikiPageName = "Denkmalschutz")
	private MonumentsType monumentProtectionCategory;

	@DataField(wikiPageName = "Notiz")
	private String note;
	@DataField(wikiPageName = "Anzahl Parkfl�chen")
	private Integer numberOfParkingSpaces;
	@DataField(wikiPageName = "Zimmer")
	private Integer numberOfRooms;

	@DataField(wikiPageName = "Betriebskosten_ohne_Leerstandsbetriebskosten")
	private Amount operatingCosts;
	@DataField(wikiPageName = "Abgerechnete Betriebskosten")
	private Amount operatingCostsSettled;
	// TODO: optRate - eTYPE_OptRate
	@DataField(wikiPageName = "Eigentumsanteil")
	private Double ownershipShare;

	@DataField(wikiPageName = "Grundst�cksgr��e")
	private Amount plotArea;
	@DataField(wikiPageName = "Portfolio")
	private String portfolioName;
	@DataField(wikiPageName = "Portfolioname")
	private String portfolioPartName;
	@DataField(wikiPageName = "Property Manager")
	private String propertyManager;
	@DataField(wikiPageName = "Ankaufsdatum")
	private LocalDate purchaseDate;
	@DataField(wikiPageName = "Bruttokaufpreis")
	private Amount purchaseGrossPrice;

	private EnergyRating lastEnergyRating;

	private List<Building> listOfBuild;
	private List<Lease> listOfLease;
	private List<Account> listOfAcc;

	public LocalDate getArchValidFrom() {
		return archValidFrom;
	}

	public void setArchValidFrom(LocalDate archValidFrom) {
		this.archValidFrom = archValidFrom;
	}

	public LocalDate getArchValidTo() {
		return archValidTo;
	}

	public void setArchValidTo(LocalDate archValidTo) {
		this.archValidTo = archValidTo;
	}

	public AreaMessurement getAreaMessurement() {
		return areaMessurement;
	}

	public void setAreaMessurement(AreaMessurement areaMessurement) {
		this.areaMessurement = areaMessurement;
	}

	public AreaType getAreaType() {
		return areaType;
	}

	public void setAreaType(AreaType areaType) {
		this.areaType = areaType;
	}

	public String getAssetManager() {
		return assetManager;
	}

	public void setAssetManager(String assetManager) {
		this.assetManager = assetManager;
	}

	public ObjectCondition getCondition() {
		return condition;
	}

	public void setCondition(ObjectCondition condition) {
		this.condition = condition;
	}

	public LocalDate getConstructionDate() {
		return constructionDate;
	}

	public void setConstructionDate(LocalDate constructionDate) {
		this.constructionDate = constructionDate;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public String getFacilityManager() {
		return facilityManager;
	}

	public void setFacilityManager(String facilityManager) {
		this.facilityManager = facilityManager;
	}

	public LocalDate getLastRefurbishmentDate() {
		return lastRefurbishmentDate;
	}

	public void setLastRefurbishmentDate(LocalDate lastRefurbishmentDate) {
		this.lastRefurbishmentDate = lastRefurbishmentDate;
	}

	public RestorationStatus getModernisationStatus() {
		return modernisationStatus;
	}

	public void setModernisationStatus(RestorationStatus modernisationStatus) {
		this.modernisationStatus = modernisationStatus;
	}

	public MonumentsType getMonumentProtectionCategory() {
		return monumentProtectionCategory;
	}

	public void setMonumentProtectionCategory(
			MonumentsType monumentProtectionCategory) {
		this.monumentProtectionCategory = monumentProtectionCategory;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Integer getNumberOfParkingSpaces() {
		return numberOfParkingSpaces;
	}

	public void setNumberOfParkingSpaces(Integer numberOfParkingSpaces) {
		this.numberOfParkingSpaces = numberOfParkingSpaces;
	}

	public Integer getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(Integer numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public Amount getOperatingCosts() {
		return operatingCosts;
	}

	public void setOperatingCosts(Amount operatingCosts) {
		this.operatingCosts = operatingCosts;
	}

	public Amount getOperatingCostsSettled() {
		return operatingCostsSettled;
	}

	public void setOperatingCostsSettled(Amount operatingCostsSettled) {
		this.operatingCostsSettled = operatingCostsSettled;
	}

	public Double getOwnershipShare() {
		return ownershipShare;
	}

	public void setOwnershipShare(Double ownershipShare) {
		this.ownershipShare = ownershipShare;
	}

	public Amount getPlotArea() {
		return plotArea;
	}

	public void setPlotArea(Amount plotArea) {
		this.plotArea = plotArea;
	}

	public String getPortfolioName() {
		return portfolioName;
	}

	public void setPortfolioName(String portfolioName) {
		this.portfolioName = portfolioName;
	}

	public String getPortfolioPartName() {
		return portfolioPartName;
	}

	public void setPortfolioPartName(String portfolioPartName) {
		this.portfolioPartName = portfolioPartName;
	}

	public String getPropertyManager() {
		return propertyManager;
	}

	public void setPropertyManager(String propertyManager) {
		this.propertyManager = propertyManager;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Amount getPurchaseGrossPrice() {
		return purchaseGrossPrice;
	}

	public void setPurchaseGrossPrice(Amount purchaseGrossPrice) {
		this.purchaseGrossPrice = purchaseGrossPrice;
	}

	public EnergyRating getLastEnergyRating() {
		return lastEnergyRating;
	}

	public void setLastEnergyRating(EnergyRating lastEnergyRating) {
		this.lastEnergyRating = lastEnergyRating;
	}

	public List<Building> getListOfBuild() {
		return listOfBuild;
	}

	public void setListOfBuild(List<Building> listOfBuild) {
		this.listOfBuild = listOfBuild;
	}

	public List<Lease> getListOfLease() {
		return listOfLease;
	}

	public void setListOfLease(List<Lease> listOfLease) {
		this.listOfLease = listOfLease;
	}

	public List<Account> getListOfAcc() {
		return listOfAcc;
	}

	public void setListOfAcc(List<Account> listOfAcc) {
		this.listOfAcc = listOfAcc;
	}
}