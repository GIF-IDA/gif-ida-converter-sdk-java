package org.zgif.model.subset_4_1.entity;

import java.time.LocalDate;
import java.util.Currency;
import java.util.List;

import org.zgif.model.annotation.WikiDataField;
import org.zgif.model.datatype.Amount;
import org.zgif.model.datatype.enumeration.AreaMessurement;
import org.zgif.model.datatype.enumeration.AreaType;
import org.zgif.model.datatype.enumeration.HeatingType;
import org.zgif.model.datatype.enumeration.InteriorQuality;
import org.zgif.model.datatype.enumeration.LocationType;
import org.zgif.model.datatype.enumeration.MonumentsType;
import org.zgif.model.datatype.enumeration.ObjectCondition;
import org.zgif.model.datatype.enumeration.RestorationStatus;
import org.zgif.model.node.entity.AbstractProperty;

public class Property extends AbstractProperty {
	@WikiDataField(pageName = "Klimaanlage")
	private Boolean airconditioning;
	@WikiDataField(pageName = "Achitektonische Gültigkeit Ab")
	private LocalDate archValidFrom;
	@WikiDataField(pageName = "Achitektonische Gültigkeit bis")
	private LocalDate archValidTo;
	@WikiDataField(pageName = "Flächenmaß")
	private AreaMessurement areaMessurement;
	@WikiDataField(pageName = "Flächenart")
	private AreaType areaType;

	@WikiDataField(pageName = "Balkon/Terrasse")
	private Boolean balcony;
	@WikiDataField(pageName = "Barrierefrei")
	private Boolean barrierfree;

	@WikiDataField(pageName = "Keller")
	private Boolean cellar;
	@WikiDataField(pageName = "Objektzustand")
	private ObjectCondition condition;
	@WikiDataField(pageName = "Datum der Fertigstellung/Errichtung")
	private LocalDate constructionDate;
	@WikiDataField(pageName = "Provisionsbetrag")
	private Amount courtage;
	@WikiDataField(pageName = "Währung")
	private Currency currency;

	@WikiDataField(pageName = "Entfernung zum nächsten Flughafen")
	private Double distanceToAirport;
	@WikiDataField(pageName = "Entfernung zur nächsten Autobahn")
	private Double distanceToHighway;
	@WikiDataField(pageName = "Entfernung zum ÖPNV")
	private Double distanceToPublicTransport;
	@WikiDataField(pageName = "Entfernung zum nächsten Bahnhof")
	private Double distanceToRailStation;

	@WikiDataField(pageName = "Aufzug")
	private Boolean elevator;

	@WikiDataField(pageName = "Heizungsart")
	private HeatingType heatingType;

	@WikiDataField(pageName = "Ausstattungsqualität")
	private InteriorQuality interiorQuality;

	@WikiDataField(pageName = "DV-Verkabelung")
	private Boolean lanCables;
	@WikiDataField(pageName = "Modernisierungsdatum")
	private LocalDate lastRefurbishmentDate;
	@WikiDataField(pageName = "Lageart")
	private LocationType locationClassificationType;

	@WikiDataField(pageName = "Modernisierungszustand")
	private RestorationStatus modernisationStatus;
	@WikiDataField(pageName = "Denkmalschutz")
	private MonumentsType monumentProtectionCategory;

	@WikiDataField(pageName = "Anzahl Badezimmer")
	private Integer numberOfBathrooms;
	@WikiDataField(pageName = "Anzahl Schlafzimmer")
	private Integer numberOfBedrooms;
	@WikiDataField(pageName = "Anzahl der Kantinen")
	private Integer numberOfCanteen;
	@WikiDataField(pageName = "Anzahl Parkflächen")
	private Integer numberOfParkingSpaces;
	@WikiDataField(pageName = "Zimmer")
	private Integer numberOfRooms;

	@WikiDataField(pageName = "Eigentumsanteil")
	private Double ownershipShare;

	@WikiDataField(pageName = "Grundstücksgröße")
	private Amount plotArea;
	@WikiDataField(pageName = "Ankaufsdatum")
	private LocalDate purchaseDate;
	@WikiDataField(pageName = "Bruttokaufpreis")
	private Amount purchaseGrossPrice;

	@WikiDataField(pageName = "Vermietet")
	private Boolean rented;

	@WikiDataField(pageName = "Exposeüberschrift")
	private String titleOfExposee;

	private List<Building> listOfBuild;
	private List<Land> listOfLand;

	public Property() {
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

	public Boolean getBarrierfree() {
		return barrierfree;
	}

	public void setBarrierfree(Boolean barrierfree) {
		this.barrierfree = barrierfree;
	}

	public Boolean getCellar() {
		return cellar;
	}

	public void setCellar(Boolean cellar) {
		this.cellar = cellar;
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

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public Double getDistanceToAirport() {
		return distanceToAirport;
	}

	public void setDistanceToAirport(Double distanceToAirport) {
		this.distanceToAirport = distanceToAirport;
	}

	public Double getDistanceToHighway() {
		return distanceToHighway;
	}

	public void setDistanceToHighway(Double distanceToHighway) {
		this.distanceToHighway = distanceToHighway;
	}

	public Double getDistanceToPublicTransport() {
		return distanceToPublicTransport;
	}

	public void setDistanceToPublicTransport(Double distanceToPublicTransport) {
		this.distanceToPublicTransport = distanceToPublicTransport;
	}

	public Double getDistanceToRailStation() {
		return distanceToRailStation;
	}

	public void setDistanceToRailStation(Double distanceToRailStation) {
		this.distanceToRailStation = distanceToRailStation;
	}

	public Boolean getElevator() {
		return elevator;
	}

	public void setElevator(Boolean elevator) {
		this.elevator = elevator;
	}

	public HeatingType getHeatingType() {
		return heatingType;
	}

	public void setHeatingType(HeatingType heatingType) {
		this.heatingType = heatingType;
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

	public LocationType getLocationClassificationType() {
		return locationClassificationType;
	}

	public void setLocationClassificationType(
			LocationType locationClassificationType) {
		this.locationClassificationType = locationClassificationType;
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

	public Amount getPlotArea() {
		return plotArea;
	}

	public void setPlotArea(Amount plotArea) {
		this.plotArea = plotArea;
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

	public Boolean getRented() {
		return rented;
	}

	public void setRented(Boolean rented) {
		this.rented = rented;
	}

	public String getTitleOfExposee() {
		return titleOfExposee;
	}

	public void setTitleOfExposee(String titleOfExposee) {
		this.titleOfExposee = titleOfExposee;
	}

	public List<Building> getListOfBuild() {
		return listOfBuild;
	}

	public void setListOfBuild(List<Building> listOfBuild) {
		this.listOfBuild = listOfBuild;
	}

	public List<Land> getListOfLand() {
		return listOfLand;
	}

	public void setListOfLand(List<Land> listOfLand) {
		this.listOfLand = listOfLand;
	}
}
