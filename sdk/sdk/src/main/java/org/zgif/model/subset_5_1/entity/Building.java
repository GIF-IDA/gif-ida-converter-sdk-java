package org.zgif.model.subset_5_1.entity;

import java.time.LocalDate;
import java.util.List;

import org.zgif.model.annotation.WikiDataField;
import org.zgif.model.datatype.Area;
import org.zgif.model.datatype.enumeration.AreaMessurement;
import org.zgif.model.datatype.enumeration.AreaType;
import org.zgif.model.datatype.enumeration.MonumentsType;
import org.zgif.model.datatype.enumeration.ObjectCondition;
import org.zgif.model.datatype.enumeration.RestorationStatus;
import org.zgif.model.node.entity.AbstractBuilding;
import org.zgif.model.node.group.EnergyRating;

public class Building extends AbstractBuilding {

	@WikiDataField(pageName = "Achitektonische Gültigkeit Ab")
	private LocalDate archValidFrom;
	@WikiDataField(pageName = "Achitektonische Gültigkeit bis")
	private LocalDate archValidTo;
	@WikiDataField(pageName = "Flächenmaß")
	private AreaMessurement areaMessurement;
	@WikiDataField(pageName = "Flächenart")
	private AreaType areaType;

	@WikiDataField(pageName = "Objektzustand")
	private ObjectCondition condition;
	@WikiDataField(pageName = "Datum der Fertigstellung/Errichtung")
	private LocalDate constructionDate;
	@WikiDataField(pageName = "Kubatur")
	private Double cubature;

	@WikiDataField(pageName = "Modernisierungsdatum")
	private LocalDate lastRefurbishmentDate;

	@WikiDataField(pageName = "Modernisierungszustand")
	private RestorationStatus modernisationStatus;
	@WikiDataField(pageName = "Denkmalschutz")
	private MonumentsType monumentProtectionCategory;

	@WikiDataField(pageName = "Etagenzahl")
	private Integer numberOfFloors;
	@WikiDataField(pageName = "Anzahl Parkflächen")
	private Integer numberOfParkingSpaces;
	@WikiDataField(pageName = "Zimmer")
	private Integer numberOfRooms;

	@WikiDataField(pageName = "Eigentumsanteil")
	private Double ownershipShare;

	@WikiDataField(pageName = "Property Manager")
	private String propertyManager;
	@WikiDataField(pageName = "Ankaufsdatum")
	private LocalDate purchaseDate;

	@WikiDataField(pageName = "Nutzfläche")
	private Area usableArea;

	// ////////////////////////////////////////////

	private EnergyRating lastEnergyRating;

	private List<Unit> listOfUnit;

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

	public Double getCubature() {
		return cubature;
	}

	public void setCubature(Double cubature) {
		this.cubature = cubature;
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

	public Integer getNumberOfFloors() {
		return numberOfFloors;
	}

	public void setNumberOfFloors(Integer numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
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

	public Double getOwnershipShare() {
		return ownershipShare;
	}

	public void setOwnershipShare(Double ownershipShare) {
		this.ownershipShare = ownershipShare;
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

	public Area getUsableArea() {
		return usableArea;
	}

	public void setUsableArea(Area usableArea) {
		this.usableArea = usableArea;
	}

	public EnergyRating getLastEnergyRating() {
		return lastEnergyRating;
	}

	public void setLastEnergyRating(EnergyRating lastEnergyRating) {
		this.lastEnergyRating = lastEnergyRating;
	}

	public List<Unit> getListOfUnit() {
		return listOfUnit;
	}

	public void setListOfUnit(List<Unit> listOfUnit) {
		this.listOfUnit = listOfUnit;
	}
}
