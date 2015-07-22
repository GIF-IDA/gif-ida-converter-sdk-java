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
package org.zgif.model.subset_4_1.entity;

import java.util.Currency;
import java.util.Map;

import org.joda.time.LocalDate;
import org.zgif.model.annotation.DataField;
import org.zgif.model.annotation.NodeList;
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
    @DataField(wikiPageName = "Klimaanlage")
    private Boolean               airconditioning;
    @DataField(wikiPageName = "Achitektonische Gültigkeit Ab")
    private LocalDate             archValidFrom;
    @DataField(wikiPageName = "Achitektonische Gültigkeit bis")
    private LocalDate             archValidTo;
    @DataField(wikiPageName = "Flächenmaß")
    private AreaMessurement       areaMessurement;
    @DataField(wikiPageName = "Flächenart")
    private AreaType              areaType;

    @DataField(wikiPageName = "Balkon/Terrasse")
    private Boolean               balcony;
    @DataField(wikiPageName = "Barrierefrei")
    private Boolean               barrierfree;

    @DataField(wikiPageName = "Keller")
    private Boolean               cellar;
    @DataField(wikiPageName = "Objektzustand")
    private ObjectCondition       condition;
    @DataField(wikiPageName = "Datum der Fertigstellung/Errichtung")
    private LocalDate             constructionDate;
    @DataField(wikiPageName = "Provisionsbetrag")
    private Amount                courtage;
    @DataField(wikiPageName = "Währung")
    private Currency              currency;

    @DataField(wikiPageName = "Entfernung zum nächsten Flughafen")
    private Double                distanceToAirport;
    @DataField(wikiPageName = "Entfernung zur nächsten Autobahn")
    private Double                distanceToHighway;
    @DataField(wikiPageName = "Entfernung zum ÖPNV")
    private Double                distanceToPublicTransport;
    @DataField(wikiPageName = "Entfernung zum nächsten Bahnhof")
    private Double                distanceToRailStation;

    @DataField(wikiPageName = "Aufzug")
    private Boolean               elevator;

    @DataField(wikiPageName = "Heizungsart")
    private HeatingType           heatingType;

    @DataField(wikiPageName = "Ausstattungsqualität")
    private InteriorQuality       interiorQuality;

    @DataField(wikiPageName = "DV-Verkabelung")
    private Boolean               lanCables;
    @DataField(wikiPageName = "Modernisierungsdatum")
    private LocalDate             lastRefurbishmentDate;
    @DataField(wikiPageName = "Lageart")
    private LocationType          locationClassificationType;

    @DataField(wikiPageName = "Modernisierungszustand")
    private RestorationStatus     modernisationStatus;
    @DataField(wikiPageName = "Denkmalschutz")
    private MonumentsType         monumentProtectionCategory;

    @DataField(wikiPageName = "Anzahl Badezimmer")
    private Integer               numberOfBathrooms;
    @DataField(wikiPageName = "Anzahl Schlafzimmer")
    private Integer               numberOfBedrooms;
    @DataField(wikiPageName = "Anzahl der Kantinen")
    private Integer               numberOfCanteen;
    @DataField(wikiPageName = "Anzahl Parkflächen")
    private Integer               numberOfParkingSpaces;
    @DataField(wikiPageName = "Zimmer")
    private Integer               numberOfRooms;

    @DataField(wikiPageName = "Eigentumsanteil")
    private Double                ownershipShare;

    @DataField(wikiPageName = "Grundstücksgröße")
    private Amount                plotArea;
    @DataField(wikiPageName = "Ankaufsdatum")
    private LocalDate             purchaseDate;
    @DataField(wikiPageName = "Bruttokaufpreis")
    private Amount                purchaseGrossPrice;

    @DataField(wikiPageName = "Vermietet")
    private Boolean               rented;

    @DataField(wikiPageName = "Exposeüberschrift")
    private String                titleOfExposee;

    @NodeList
    private Map<String, Building> listOfBuild;
    @NodeList
    private Map<String, Land>     listOfLand;

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

    public void setLocationClassificationType(LocationType locationClassificationType) {
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

    public void setMonumentProtectionCategory(MonumentsType monumentProtectionCategory) {
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

    public Map<String, Building> getListOfBuild() {
        return listOfBuild;
    }

    public void setListOfBuild(Map<String, Building> listOfBuild) {
        this.listOfBuild = listOfBuild;
    }

    public Map<String, Land> getListOfLand() {
        return listOfLand;
    }

    public void setListOfLand(Map<String, Land> listOfLand) {
        this.listOfLand = listOfLand;
    }
}
