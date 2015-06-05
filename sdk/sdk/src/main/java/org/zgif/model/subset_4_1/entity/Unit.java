package org.zgif.model.subset_4_1.entity;

import java.time.LocalDate;

import org.zgif.model.annotation.WikiDataField;
import org.zgif.model.datatype.Amount;
import org.zgif.model.datatype.Area;
import org.zgif.model.datatype.enumeration.ApartmentType;
import org.zgif.model.datatype.enumeration.AreaMessurement;
import org.zgif.model.datatype.enumeration.AreaType;
import org.zgif.model.datatype.enumeration.InteriorQuality;
import org.zgif.model.datatype.enumeration.ObjectCondition;
import org.zgif.model.datatype.enumeration.ParkingSpaceType;
import org.zgif.model.datatype.enumeration.RestorationStatus;
import org.zgif.model.datatype.enumeration.UseType;
import org.zgif.model.node.entity.AbstractUnit;
import org.zgif.model.node.group.EnergyRating;

public class Unit extends AbstractUnit {
	@WikiDataField(pageName = "Wohnungskategorie")
	private ApartmentType apartmentType;
	@WikiDataField(pageName = "Achitektonische Gültigkeit Ab")
	private LocalDate archValidFrom;
	@WikiDataField(pageName = "Achitektonische Gültigkeit bis")
	private LocalDate archValidTo;
	@WikiDataField(pageName = "Flächenmaß")
	private AreaMessurement areaMessure;
	@WikiDataField(pageName = "Flächenart")
	private AreaType areaType;
	@WikiDataField(pageName = "Hebebühne")
	private Boolean autoLift;

	@WikiDataField(pageName = "Balkon/Terrasse")
	private Boolean balcony;
	@WikiDataField(pageName = "Barrierefrei")
	private Boolean barrierFree;

	@WikiDataField(pageName = "WBS-Schein erforderlich")
	private Boolean certificateOfEligibility;
	@WikiDataField(pageName = "Objektzustand")
	private ObjectCondition condition;
	@WikiDataField(pageName = "Provisionsbetrag")
	private Amount courtage;

	@WikiDataField(pageName = "Gartenbenutzung")
	private Boolean garden;
	@WikiDataField(pageName = "Gäste WC")
	private Boolean guestToilet;

	@WikiDataField(pageName = "Hallen-/ Geschosshöhe")
	private Double hallHeight;
	@WikiDataField(pageName = "Einbauküche")
	private Boolean hasBuiltinKitchen;
	@WikiDataField(pageName = "Möblierung")
	private Boolean hasFurniture;

	@WikiDataField(pageName = "Ausstattungsqualität")
	private InteriorQuality interiorQuality;
	@WikiDataField(pageName = "Einliegerwohnung")
	private Boolean isLodgerFlat;

	@WikiDataField(pageName = "DV-Verkabelung")
	private Boolean lanCables;
	@WikiDataField(pageName = "Modernisierungsdatum")
	private LocalDate lastRefurbishmentDate;
	@WikiDataField(pageName = "Vermietbare_Fläche")
	private Area lettableArea;
	@WikiDataField(pageName = "Vermietbare_Anzahl")
	private Double lettableUnits;

	@WikiDataField(pageName = "Maximale Anzahl Personen")
	private Integer maxNumberOfPerson;
	@WikiDataField(pageName = "Teilbar ab")
	private Integer minimumDivisible;
	@WikiDataField(pageName = "Modernisierungszustand")
	private RestorationStatus modernisationStatus;

	@WikiDataField(pageName = "Nichtraucher")
	private Boolean nonSmoker;
	@WikiDataField(pageName = "Anzahl Badezimmer")
	private Integer numberOfBathrooms;
	@WikiDataField(pageName = "Anzahl Schlafzimmer")
	private Integer numberOfBedrooms;
	@WikiDataField(pageName = "Anzahl Parkflächen")
	private Integer numberOfParkingSpaces;
	@WikiDataField(pageName = "Anzahl Zimmer")
	private Integer numberOfRooms;

	@WikiDataField(pageName = "Parkplatztyp")
	private ParkingSpaceType parkingSpaceType;

	@WikiDataField(pageName = "Als Ferienwohnung geeignet")
	private Boolean summerResidencePractical;

	@WikiDataField(pageName = "Exposeüberschrift")
	private String titleOfExposee;

	@WikiDataField(pageName = "Nutzungsart")
	private UseType useType;

	// //////////////////////////////////////

	private EnergyRating lastEnergyRating;

	public ApartmentType getApartmentType() {
		return apartmentType;
	}

	public void setApartmentType(ApartmentType apartmentType) {
		this.apartmentType = apartmentType;
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

	public AreaMessurement getAreaMessure() {
		return areaMessure;
	}

	public void setAreaMessure(AreaMessurement areaMessure) {
		this.areaMessure = areaMessure;
	}

	public AreaType getAreaType() {
		return areaType;
	}

	public void setAreaType(AreaType areaType) {
		this.areaType = areaType;
	}

	public Boolean getAutoLift() {
		return autoLift;
	}

	public void setAutoLift(Boolean autoLift) {
		this.autoLift = autoLift;
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

	public Boolean getCertificateOfEligibility() {
		return certificateOfEligibility;
	}

	public void setCertificateOfEligibility(Boolean certificateOfEligibility) {
		this.certificateOfEligibility = certificateOfEligibility;
	}

	public ObjectCondition getCondition() {
		return condition;
	}

	public void setCondition(ObjectCondition condition) {
		this.condition = condition;
	}

	public Amount getCourtage() {
		return courtage;
	}

	public void setCourtage(Amount courtage) {
		this.courtage = courtage;
	}

	public Boolean getGarden() {
		return garden;
	}

	public void setGarden(Boolean garden) {
		this.garden = garden;
	}

	public Boolean getGuestToilet() {
		return guestToilet;
	}

	public void setGuestToilet(Boolean guestToilet) {
		this.guestToilet = guestToilet;
	}

	public Double getHallHeight() {
		return hallHeight;
	}

	public void setHallHeight(Double hallHeight) {
		this.hallHeight = hallHeight;
	}

	public Boolean getHasBuiltinKitchen() {
		return hasBuiltinKitchen;
	}

	public void setHasBuiltinKitchen(Boolean hasBuiltinKitchen) {
		this.hasBuiltinKitchen = hasBuiltinKitchen;
	}

	public Boolean getHasFurniture() {
		return hasFurniture;
	}

	public void setHasFurniture(Boolean hasFurniture) {
		this.hasFurniture = hasFurniture;
	}

	public InteriorQuality getInteriorQuality() {
		return interiorQuality;
	}

	public void setInteriorQuality(InteriorQuality interiorQuality) {
		this.interiorQuality = interiorQuality;
	}

	public Boolean getIsLodgerFlat() {
		return isLodgerFlat;
	}

	public void setIsLodgerFlat(Boolean isLodgerFlat) {
		this.isLodgerFlat = isLodgerFlat;
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

	public Area getLettableArea() {
		return lettableArea;
	}

	public void setLettableArea(Area lettableArea) {
		this.lettableArea = lettableArea;
	}

	public Double getLettableUnits() {
		return lettableUnits;
	}

	public void setLettableUnits(Double lettableUnits) {
		this.lettableUnits = lettableUnits;
	}

	public Integer getMaxNumberOfPerson() {
		return maxNumberOfPerson;
	}

	public void setMaxNumberOfPerson(Integer maxNumberOfPerson) {
		this.maxNumberOfPerson = maxNumberOfPerson;
	}

	public Integer getMinimumDivisible() {
		return minimumDivisible;
	}

	public void setMinimumDivisible(Integer minimumDivisible) {
		this.minimumDivisible = minimumDivisible;
	}

	public RestorationStatus getModernisationStatus() {
		return modernisationStatus;
	}

	public void setModernisationStatus(RestorationStatus modernisationStatus) {
		this.modernisationStatus = modernisationStatus;
	}

	public Boolean getNonSmoker() {
		return nonSmoker;
	}

	public void setNonSmoker(Boolean nonSmoker) {
		this.nonSmoker = nonSmoker;
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

	public ParkingSpaceType getParkingSpaceType() {
		return parkingSpaceType;
	}

	public void setParkingSpaceType(ParkingSpaceType parkingSpaceType) {
		this.parkingSpaceType = parkingSpaceType;
	}

	public Boolean getSummerResidencePractical() {
		return summerResidencePractical;
	}

	public void setSummerResidencePractical(Boolean summerResidencePractical) {
		this.summerResidencePractical = summerResidencePractical;
	}

	public String getTitleOfExposee() {
		return titleOfExposee;
	}

	public void setTitleOfExposee(String titleOfExposee) {
		this.titleOfExposee = titleOfExposee;
	}

	public UseType getUseType() {
		return useType;
	}

	public void setUseType(UseType useType) {
		this.useType = useType;
	}

	public EnergyRating getLastEnergyRating() {
		return lastEnergyRating;
	}

	public void setLastEnergyRating(EnergyRating lastEnergyRating) {
		this.lastEnergyRating = lastEnergyRating;
	}
}
