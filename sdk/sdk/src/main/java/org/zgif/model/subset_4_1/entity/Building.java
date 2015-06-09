package org.zgif.model.subset_4_1.entity;

import java.util.List;

import org.joda.time.LocalDate;
import org.zgif.model.annotation.DataField;
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
	@DataField(wikiPageName="Klimaanlage")
	private Boolean airconditioning;
	@DataField(wikiPageName="Achitektonische G�ltigkeit Ab")
	private LocalDate archValidFrom;
	@DataField(wikiPageName="Achitektonische G�ltigkeit bis")
	private LocalDate archValidTo;
	@DataField(wikiPageName="Fl�chenma�")
	private AreaMessurement areaMessurement;
	@DataField(wikiPageName="Fl�chenart")
	private AreaType areaType;

	@DataField(wikiPageName="Balkon/Terrasse")
	private Boolean balcony;
	@DataField(wikiPageName="Barrierefrei")
	private Boolean barrierFree;

	@DataField(wikiPageName="Objektzustand")
	private ObjectCondition condition;
	@DataField(wikiPageName="Datum der Fertigstellung/Errichtung")
	private LocalDate constructionDate;
	@DataField(wikiPageName="Provisionsbetrag")
	private Amount courtage;

	@DataField(wikiPageName="Aufzug")
	private Boolean elevator;
	@DataField(wikiPageName="Befeuerungsart")
	private EnergySource energySource;

	@DataField(wikiPageName="Deckenlast")
	private Double floorload;

	@DataField(wikiPageName="G�ste WC")
	private Boolean guestToilet;

	@DataField(wikiPageName="Starkstrom")
	private Boolean highVoltage;

	@DataField(wikiPageName="Ausstattungsqualit�t")
	private InteriorQuality interiorQuality;

	@DataField(wikiPageName="DV-Verkabelung")
	private Boolean lanCables;
	@DataField(wikiPageName="Modernisierungsdatum")
	private LocalDate lastRefurbishmentDate;

	@DataField(wikiPageName="Modernisierungszustand")
	private RestorationStatus modernisationStatus;
	@DataField(wikiPageName="Denkmalschutz")
	private MonumentsType monumentProtectionCategory;

	@DataField(wikiPageName="Anzahl Badezimmer")
	private Integer numberOfBathrooms;
	@DataField(wikiPageName="Anzahl Schlafzimmer")
	private Integer numberOfBedrooms;
	@DataField(wikiPageName="Anzahl der Kantinen")
	private Integer numberOfCanteen;
	@DataField(wikiPageName="Etagenzahl")
	private Integer numberOfFloors;
	@DataField(wikiPageName="Anzahl Parkfl�chen")
	private Integer numberOfParkingSpaces;
	@DataField(wikiPageName="Zimmer")
	private Integer numberOfRooms;

	@DataField(wikiPageName="Eigentumsanteil")
	private Double ownershipShare;

	@DataField(wikiPageName="Ankaufsdatum")
	private LocalDate purchaseDate;

	@DataField(wikiPageName="Rampe")
	private Boolean ramp;
	@DataField(wikiPageName="Vermietet")
	private Boolean rented;

	@DataField(wikiPageName="Nutzfl�che")
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
