package org.zgif.model.subset_5_1.entity;

import java.time.LocalDate;
import java.util.List;

import org.zgif.model.annotation.WikiDataField;
import org.zgif.model.datatype.Amount;
import org.zgif.model.datatype.Area;
import org.zgif.model.datatype.enumeration.AreaMessurement;
import org.zgif.model.datatype.enumeration.AreaType;
import org.zgif.model.datatype.enumeration.ObjectCondition;
import org.zgif.model.datatype.enumeration.RestorationStatus;
import org.zgif.model.datatype.enumeration.UseType;
import org.zgif.model.datatype.enumeration.VacancyReason;
import org.zgif.model.node.entity.AbstractEntityNode;
import org.zgif.model.node.group.EnergyRating;

public class Unit extends AbstractEntityNode {
	@WikiDataField(pageName = "Achitektonische Gültigkeit Ab")
	private LocalDate archValidFrom;
	@WikiDataField(pageName = "Achitektonische Gültigkeit bis")
	private LocalDate archValidTo;
	@WikiDataField(pageName = "Flächenmaß")
	private AreaMessurement areaMessure;
	@WikiDataField(pageName = "Flächenart")
	private AreaType areaType;

	@WikiDataField(pageName = "Objektzustand")
	private ObjectCondition condition;

	@WikiDataField(pageName = "Mietpreisbindungsende")
	private LocalDate endPriceMaintenance;

	@WikiDataField(pageName = "Modernisierungsdatum")
	private LocalDate lastRefurbishmentDate;
	@WikiDataField(pageName = "Vermietbare_Fläche")
	private Area lettableArea;
	@WikiDataField(pageName = "Vermietbare_Anzahl")
	private Double lettableUnits;
	@WikiDataField(pageName = "Ermittelte_ortsübliche_Vergleichsmiete_der_Mieteinheit")
	private Amount localReferenceRent;

	@WikiDataField(pageName = "Modernisierungszustand")
	private RestorationStatus modernisationStatus;

	@WikiDataField(pageName = "Anzahl Parkflächen")
	private Integer numberOfParkingSpaces;
	@WikiDataField(pageName = "Anzahl Zimmer")
	private Integer numberOfRooms;

	@WikiDataField(pageName = "Property Manager")
	private String propertyManager;

	@WikiDataField(pageName = "Nutzungsart")
	private UseType useType;
	@WikiDataField(pageName = "Nutzungsart (Kundenausprägung)")
	private String useTypeCustomer;

	@WikiDataField(pageName = "Leerstand")
	private VacancyReason vacancyReason;

	// //////////////////////////////////////

	private EnergyRating lastEnergyRating;

	private List<Term> listOfTerm;

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

	public ObjectCondition getCondition() {
		return condition;
	}

	public void setCondition(ObjectCondition condition) {
		this.condition = condition;
	}

	public LocalDate getEndPriceMaintenance() {
		return endPriceMaintenance;
	}

	public void setEndPriceMaintenance(LocalDate endPriceMaintenance) {
		this.endPriceMaintenance = endPriceMaintenance;
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

	public Amount getLocalReferenceRent() {
		return localReferenceRent;
	}

	public void setLocalReferenceRent(Amount localReferenceRent) {
		this.localReferenceRent = localReferenceRent;
	}

	public RestorationStatus getModernisationStatus() {
		return modernisationStatus;
	}

	public void setModernisationStatus(RestorationStatus modernisationStatus) {
		this.modernisationStatus = modernisationStatus;
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

	public String getPropertyManager() {
		return propertyManager;
	}

	public void setPropertyManager(String propertyManager) {
		this.propertyManager = propertyManager;
	}

	public UseType getUseType() {
		return useType;
	}

	public void setUseType(UseType useType) {
		this.useType = useType;
	}

	public String getUseTypeCustomer() {
		return useTypeCustomer;
	}

	public void setUseTypeCustomer(String useTypeCustomer) {
		this.useTypeCustomer = useTypeCustomer;
	}

	public VacancyReason getVacancyReason() {
		return vacancyReason;
	}

	public void setVacancyReason(VacancyReason vacancyReason) {
		this.vacancyReason = vacancyReason;
	}

	public EnergyRating getLastEnergyRating() {
		return lastEnergyRating;
	}

	public void setLastEnergyRating(EnergyRating lastEnergyRating) {
		this.lastEnergyRating = lastEnergyRating;
	}

	public List<Term> getListOfTerm() {
		return listOfTerm;
	}

	public void setListOfTerm(List<Term> listOfTerm) {
		this.listOfTerm = listOfTerm;
	}
}
