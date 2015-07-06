/*******************************************************************************
 * Copyright (c) 2015 Martin Fluegge (Berlin, Germany) and others..
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Martin Fluegge - initial API and implementation and/or initial documentation
 *  
 *******************************************************************************/
package org.zgif.model.subset_5_1.entity;

import java.util.List;

import org.joda.time.LocalDate;
import org.zgif.model.annotation.DataField;
import org.zgif.model.datatype.Amount;
import org.zgif.model.datatype.Area;
import org.zgif.model.datatype.enumeration.AreaMessurement;
import org.zgif.model.datatype.enumeration.AreaType;
import org.zgif.model.datatype.enumeration.ObjectCondition;
import org.zgif.model.datatype.enumeration.RestorationStatus;
import org.zgif.model.datatype.enumeration.UseType;
import org.zgif.model.datatype.enumeration.VacancyReason;
import org.zgif.model.node.entity.AbstractUnit;
import org.zgif.model.node.group.EnergyRating;

public class Unit extends AbstractUnit {
	@DataField(wikiPageName = "Achitektonische G�ltigkeit Ab")
	private LocalDate archValidFrom;
	@DataField(wikiPageName = "Achitektonische G�ltigkeit bis")
	private LocalDate archValidTo;
	@DataField(wikiPageName = "Fl�chenma�")
	private AreaMessurement areaMessure;
	@DataField(wikiPageName = "Fl�chenart")
	private AreaType areaType;

	@DataField(wikiPageName = "Objektzustand")
	private ObjectCondition condition;

	@DataField(wikiPageName = "Mietpreisbindungsende")
	private LocalDate endPriceMaintenance;

	@DataField(wikiPageName = "Modernisierungsdatum")
	private LocalDate lastRefurbishmentDate;
	@DataField(wikiPageName = "Vermietbare_Fl�che")
	private Area lettableArea;
	@DataField(wikiPageName = "Vermietbare_Anzahl")
	private Double lettableUnits;
	@DataField(wikiPageName = "Ermittelte_orts�bliche_Vergleichsmiete_der_Mieteinheit")
	private Amount localReferenceRent;

	@DataField(wikiPageName = "Modernisierungszustand")
	private RestorationStatus modernisationStatus;

	@DataField(wikiPageName = "Anzahl Parkfl�chen")
	private Integer numberOfParkingSpaces;
	@DataField(wikiPageName = "Anzahl Zimmer")
	private Integer numberOfRooms;

	@DataField(wikiPageName = "Property Manager")
	private String propertyManager;

	@DataField(wikiPageName = "Nutzungsart")
	private UseType useType;
	@DataField(wikiPageName = "Nutzungsart (Kundenauspr�gung)")
	private String useTypeCustomer;

	@DataField(wikiPageName = "Leerstand")
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
