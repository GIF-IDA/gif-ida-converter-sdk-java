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
import org.zgif.model.datatype.Area;
import org.zgif.model.datatype.enumeration.AreaMessurement;
import org.zgif.model.datatype.enumeration.AreaType;
import org.zgif.model.datatype.enumeration.MonumentsType;
import org.zgif.model.datatype.enumeration.ObjectCondition;
import org.zgif.model.datatype.enumeration.RestorationStatus;
import org.zgif.model.node.entity.AbstractBuilding;
import org.zgif.model.node.group.EnergyRating;

public class Building extends AbstractBuilding {

	@DataField(wikiPageName = "Achitektonische Gültigkeit Ab")
	private LocalDate archValidFrom;
	@DataField(wikiPageName = "Achitektonische Gültigkeit bis")
	private LocalDate archValidTo;
	@DataField(wikiPageName = "Flächenmaß")
	private AreaMessurement areaMessurement;
	@DataField(wikiPageName = "Flächenart")
	private AreaType areaType;

	@DataField(wikiPageName = "Objektzustand")
	private ObjectCondition condition;
	@DataField(wikiPageName = "Datum der Fertigstellung/Errichtung")
	private LocalDate constructionDate;
	@DataField(wikiPageName = "Kubatur")
	private Double cubature;

	@DataField(wikiPageName = "Modernisierungsdatum")
	private LocalDate lastRefurbishmentDate;

	@DataField(wikiPageName = "Modernisierungszustand")
	private RestorationStatus modernisationStatus;
	@DataField(wikiPageName = "Denkmalschutz")
	private MonumentsType monumentProtectionCategory;

	@DataField(wikiPageName = "Etagenzahl")
	private Integer numberOfFloors;
	@DataField(wikiPageName = "Anzahl Parkflächen")
	private Integer numberOfParkingSpaces;
	@DataField(wikiPageName = "Zimmer")
	private Integer numberOfRooms;

	@DataField(wikiPageName = "Eigentumsanteil")
	private Double ownershipShare;

	@DataField(wikiPageName = "Property Manager")
	private String propertyManager;
	@DataField(wikiPageName = "Ankaufsdatum")
	private LocalDate purchaseDate;

	@DataField(wikiPageName = "Nutzfläche")
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

	public void setMonumentProtectionCategory(MonumentsType monumentProtectionCategory) {
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
