package org.zgif.model.subset_4_1.entity;

import java.time.LocalDate;
import java.util.List;

import org.zgif.model.annotation.WikiDataField;
import org.zgif.model.datatype.Amount;
import org.zgif.model.datatype.Area;
import org.zgif.model.datatype.enumeration.AreaMessurement;
import org.zgif.model.datatype.enumeration.AreaType;
import org.zgif.model.datatype.enumeration.EnergySource;
import org.zgif.model.datatype.enumeration.InteriorQuality;
import org.zgif.model.datatype.enumeration.MonumentsType;
import org.zgif.model.datatype.enumeration.ObjectCondition;
import org.zgif.model.datatype.enumeration.RestorationStatus;
import org.zgif.model.node.entity.AbstractBuilding;
import org.zgif.model.node.group.EnergyRating;

public class Building extends AbstractBuilding {
	@WikiDataField(pageName="Klimaanlage")
	private Boolean airconditioning;
	@WikiDataField(pageName="Achitektonische Gültigkeit Ab")
	private LocalDate archValidFrom;
	@WikiDataField(pageName="Achitektonische Gültigkeit bis")
	private LocalDate archValidTo;
	@WikiDataField(pageName="Flächenmaß")
	private AreaMessurement areaMessurement;
	@WikiDataField(pageName="Flächenart")
	private AreaType areaType;

	@WikiDataField(pageName="Balkon/Terrasse")
	private Boolean balcony;
	@WikiDataField(pageName="Barrierefrei")
	private Boolean barrierFree;

	@WikiDataField(pageName="Objektzustand")
	private ObjectCondition condition;
	@WikiDataField(pageName="Datum der Fertigstellung/Errichtung")
	private LocalDate constructionDate;
	@WikiDataField(pageName="Provisionsbetrag")
	private Amount courtage;

	@WikiDataField(pageName="Aufzug")
	private Boolean elevator;
	@WikiDataField(pageName="Befeuerungsart")
	private EnergySource energySource;

	@WikiDataField(pageName="Deckenlast")
	private Double floorload;

	@WikiDataField(pageName="Gäste WC")
	private Boolean guestToilet;

	@WikiDataField(pageName="Starkstrom")
	private Boolean highVoltage;

	@WikiDataField(pageName="Ausstattungsqualität")
	private InteriorQuality interiorQuality;

	@WikiDataField(pageName="DV-Verkabelung")
	private Boolean lanCables;
	@WikiDataField(pageName="Modernisierungsdatum")
	private LocalDate lastRefurbishmentDate;

	@WikiDataField(pageName="Modernisierungszustand")
	private RestorationStatus modernisationStatus;
	@WikiDataField(pageName="Denkmalschutz")
	private MonumentsType monumentProtectionCategory;

	@WikiDataField(pageName="Anzahl Badezimmer")
	private Integer numberOfBathrooms;
	@WikiDataField(pageName="Anzahl Schlafzimmer")
	private Integer numberOfBedrooms;
	@WikiDataField(pageName="Anzahl der Kantinen")
	private Integer numberOfCanteen;
	@WikiDataField(pageName="Etagenzahl")
	private Integer numberOfFloors;
	@WikiDataField(pageName="Anzahl Parkflächen")
	private Integer numberOfParkingSpaces;
	@WikiDataField(pageName="Zimmer")
	private Integer numberOfRooms;

	@WikiDataField(pageName="Eigentumsanteil")
	private Double ownershipShare;

	@WikiDataField(pageName="Ankaufsdatum")
	private LocalDate purchaseDate;

	@WikiDataField(pageName="Rampe")
	private Boolean ramp;
	@WikiDataField(pageName="Vermietet")
	private Boolean rented;

	@WikiDataField(pageName="Nutzfläche")
	private Area usableArea;

	//////////////////////////////////////////////

	private EnergyRating lastEnergyRating;
	
	private List<Unit> listOfUnit;
	
	public Building() {
	}

	public Boolean getAirconditioning() {
		return airconditioning;
	}

	public void setAirconditioning(Boolean airconditioning) {
		this.airconditioning = airconditioning;
	}

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

	public Boolean getBalcony() {
		return balcony;
	}

	public void setBalcony(Boolean balcony) {
		this.balcony = balcony;
	}

	public Boolean getBarrierFree() {
		return barrierFree;
	}

	public void setBarrierFree(Boolean barrierFree) {
		this.barrierFree = barrierFree;
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

	public Amount getCourtage() {
		return courtage;
	}

	public void setCourtage(Amount courtage) {
		this.courtage = courtage;
	}

	public Boolean getElevator() {
		return elevator;
	}

	public void setElevator(Boolean elevator) {
		this.elevator = elevator;
	}

	public EnergySource getEnergySource() {
		return energySource;
	}

	public void setEnergySource(EnergySource energySource) {
		this.energySource = energySource;
	}

	public Double getFloorload() {
		return floorload;
	}

	public void setFloorload(Double floorload) {
		this.floorload = floorload;
	}

	public Boolean getGuestToilet() {
		return guestToilet;
	}

	public void setGuestToilet(Boolean guestToilet) {
		this.guestToilet = guestToilet;
	}

	public Boolean getHighVoltage() {
		return highVoltage;
	}

	public void setHighVoltage(Boolean highVoltage) {
		this.highVoltage = highVoltage;
	}

	public InteriorQuality getInteriorQuality() {
		return interiorQuality;
	}

	public void setInteriorQuality(InteriorQuality interiorQuality) {
		this.interiorQuality = interiorQuality;
	}

	public Boolean getLanCables() {
		return lanCables;
	}

	public void setLanCables(Boolean lanCables) {
		this.lanCables = lanCables;
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

	public Integer getNumberOfBathrooms() {
		return numberOfBathrooms;
	}

	public void setNumberOfBathrooms(Integer numberOfBathrooms) {
		this.numberOfBathrooms = numberOfBathrooms;
	}

	public Integer getNumberOfBedrooms() {
		return numberOfBedrooms;
	}

	public void setNumberOfBedrooms(Integer numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}

	public Integer getNumberOfCanteen() {
		return numberOfCanteen;
	}

	public void setNumberOfCanteen(Integer numberOfCanteen) {
		this.numberOfCanteen = numberOfCanteen;
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

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Boolean getRamp() {
		return ramp;
	}

	public void setRamp(Boolean ramp) {
		this.ramp = ramp;
	}

	public Boolean getRented() {
		return rented;
	}

	public void setRented(Boolean rented) {
		this.rented = rented;
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
