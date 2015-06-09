package org.zgif.model.subset_4_1.entity;

import javax.xml.bind.annotation.XmlRootElement;

import org.joda.time.LocalDate;
import org.zgif.model.annotation.DataField;
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

@XmlRootElement
public class Unit extends AbstractUnit {
	@DataField(wikiPageName = "Wohnungskategorie")
	private ApartmentType apartmentType;
	@DataField(wikiPageName = "Achitektonische G�ltigkeit Ab")
	private LocalDate archValidFrom;
	@DataField(wikiPageName = "Achitektonische G�ltigkeit bis")
	private LocalDate archValidTo;
	@DataField(wikiPageName = "Fl�chenma�")
	private AreaMessurement areaMessure;
	@DataField(wikiPageName = "Fl�chenart")
	private AreaType areaType;
	@DataField(wikiPageName = "Hebeb�hne")
	private Boolean autoLift;

	@DataField(wikiPageName = "Balkon/Terrasse")
	private Boolean balcony;
	@DataField(wikiPageName = "Barrierefrei")
	private Boolean barrierFree;

	@DataField(wikiPageName = "WBS-Schein erforderlich")
	private Boolean certificateOfEligibility;
	@DataField(wikiPageName = "Objektzustand")
	private ObjectCondition condition;
	@DataField(wikiPageName = "Provisionsbetrag")
	private Amount courtage;

	@DataField(wikiPageName = "Gartenbenutzung")
	private Boolean garden;
	@DataField(wikiPageName = "G�ste WC")
	private Boolean guestToilet;

	@DataField(wikiPageName = "Hallen-/ Geschossh�he")
	private Double hallHeight;
	@DataField(wikiPageName = "Einbauk�che")
	private Boolean hasBuiltinKitchen;
	@DataField(wikiPageName = "M�blierung")
	private Boolean hasFurniture;

	@DataField(wikiPageName = "Ausstattungsqualit�t")
	private InteriorQuality interiorQuality;
	@DataField(wikiPageName = "Einliegerwohnung")
	private Boolean isLodgerFlat;

	@DataField(wikiPageName = "DV-Verkabelung")
	private Boolean lanCables;
	@DataField(wikiPageName = "Modernisierungsdatum")
	private LocalDate lastRefurbishmentDate;
	@DataField(wikiPageName = "Vermietbare_Fl�che")
	private Area lettableArea;
	@DataField(wikiPageName = "Vermietbare_Anzahl")
	private Double lettableUnits;

	@DataField(wikiPageName = "Maximale Anzahl Personen")
	private Integer maxNumberOfPerson;
	@DataField(wikiPageName = "Teilbar ab")
	private Integer minimumDivisible;
	@DataField(wikiPageName = "Modernisierungszustand")
	private RestorationStatus modernisationStatus;

	@DataField(wikiPageName = "Nichtraucher")
	private Boolean nonSmoker;
	@DataField(wikiPageName = "Anzahl Badezimmer")
	private Integer numberOfBathrooms;
	@DataField(wikiPageName = "Anzahl Schlafzimmer")
	private Integer numberOfBedrooms;
	@DataField(wikiPageName = "Anzahl Parkfl�chen")
	private Integer numberOfParkingSpaces;
	@DataField(wikiPageName = "Anzahl Zimmer")
	private Integer numberOfRooms;

	@DataField(wikiPageName = "Parkplatztyp")
	private ParkingSpaceType parkingSpaceType;

	@DataField(wikiPageName = "Als Ferienwohnung geeignet")
	private Boolean summerResidencePractical;

	@DataField(wikiPageName = "Expose�berschrift")
	private String titleOfExposee;

	@DataField(wikiPageName = "Nutzungsart")
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
