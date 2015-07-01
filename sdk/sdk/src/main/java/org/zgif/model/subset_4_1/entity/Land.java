package org.zgif.model.subset_4_1.entity;

import java.util.List;

import org.joda.time.LocalDate;
import org.zgif.model.annotation.DataField;
import org.zgif.model.datatype.Amount;
import org.zgif.model.datatype.enumeration.AreaMessurement;
import org.zgif.model.datatype.enumeration.AreaType;
import org.zgif.model.datatype.enumeration.MonumentsType;
import org.zgif.model.datatype.enumeration.SiteConstrucibleType;
import org.zgif.model.node.entity.AbstractEntityNode;

public class Land extends AbstractEntityNode {
	@DataField(wikiPageName = "Flächenmaß")
	private AreaMessurement areaMessurement;
	@DataField(wikiPageName = "Flächenart")
	private AreaType areaType;

	@DataField(wikiPageName = "Baugenehmigung")
	private Boolean buildingPermission;

	@DataField(wikiPageName = "Provisionsbetrag")
	private Amount courtage;

	@DataField(wikiPageName = "Abriss")
	private Boolean demolition;

	@DataField(wikiPageName = "GFZ")
	private Double gfz;
	@DataField(wikiPageName = "GRZ")
	private Double grz;

	@DataField(wikiPageName = "Denkmalschutz")
	private MonumentsType monumentProtectionCategory;

	@DataField(wikiPageName = "Anzahl Parkflächen")
	private Integer numberOfParkingSpaces;

	@DataField(wikiPageName = "Grundstücksgröße")
	private Amount plotArea;
	@DataField(wikiPageName = "Ankaufsdatum")
	private LocalDate purchaseDate;
	@DataField(wikiPageName = "Bruttokaufspreis")
	private Amount purchaseGrossPrice;

	@DataField(wikiPageName = "kurzfristig bebaubar")
	private Boolean shortTermConstructible;
	@DataField(wikiPageName = "Bebaubar nach")
	private SiteConstrucibleType siteConstrucibleType;
	@DataField(wikiPageName = "Erschliessungszustand")
	private String siteDevelopmentType;

	private List<Unit> listOfUnit;

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

	public Boolean getBuildingPermission() {
		return buildingPermission;
	}

	public void setBuildingPermission(Boolean buildingPermission) {
		this.buildingPermission = buildingPermission;
	}

	public Amount getCourtage() {
		return courtage;
	}

	public void setCourtage(Amount courtage) {
		this.courtage = courtage;
	}

	public Boolean getDemolition() {
		return demolition;
	}

	public void setDemolition(Boolean demolition) {
		this.demolition = demolition;
	}

	public Double getGfz() {
		return gfz;
	}

	public void setGfz(Double gfz) {
		this.gfz = gfz;
	}

	public Double getGrz() {
		return grz;
	}

	public void setGrz(Double grz) {
		this.grz = grz;
	}

	public MonumentsType getMonumentProtectionCategory() {
		return monumentProtectionCategory;
	}

	public void setMonumentProtectionCategory(MonumentsType monumentProtectionCategory) {
		this.monumentProtectionCategory = monumentProtectionCategory;
	}

	public Integer getNumberOfParkingSpaces() {
		return numberOfParkingSpaces;
	}

	public void setNumberOfParkingSpaces(Integer numberOfParkingSpaces) {
		this.numberOfParkingSpaces = numberOfParkingSpaces;
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

	public Boolean getShortTermConstructible() {
		return shortTermConstructible;
	}

	public void setShortTermConstructible(Boolean shortTermConstructible) {
		this.shortTermConstructible = shortTermConstructible;
	}

	public SiteConstrucibleType getSiteConstrucibleType() {
		return siteConstrucibleType;
	}

	public void setSiteConstrucibleType(SiteConstrucibleType siteConstrucibleType) {
		this.siteConstrucibleType = siteConstrucibleType;
	}

	public String getSiteDevelopmentType() {
		return siteDevelopmentType;
	}

	public void setSiteDevelopmentType(String siteDevelopmentType) {
		this.siteDevelopmentType = siteDevelopmentType;
	}

	public List<Unit> getListOfUnit() {
		return listOfUnit;
	}

	public void setListOfUnit(List<Unit> listOfUnit) {
		this.listOfUnit = listOfUnit;
	}

}
