package org.zgif.model.subset_4_1.entity;

import java.time.LocalDate;
import java.util.List;

import org.zgif.model.annotation.WikiDataField;
import org.zgif.model.datatype.Amount;
import org.zgif.model.datatype.enumeration.AreaMessurement;
import org.zgif.model.datatype.enumeration.AreaType;
import org.zgif.model.datatype.enumeration.MonumentsType;
import org.zgif.model.datatype.enumeration.SiteConstrucibleType;
import org.zgif.model.node.entity.AbstractEntityNode;

public class Land extends AbstractEntityNode {
	@WikiDataField(pageName = "Flächenmaß")
	private AreaMessurement areaMessurement;
	@WikiDataField(pageName = "Flächenart")
	private AreaType areaType;

	@WikiDataField(pageName = "Baugenehmigung")
	private Boolean buildingPermission;

	@WikiDataField(pageName = "Provisionsbetrag")
	private Amount courtage;

	@WikiDataField(pageName = "Abriss")
	private Boolean demolition;

	@WikiDataField(pageName = "GFZ")
	private Double gfz;
	@WikiDataField(pageName = "GRZ")
	private Double grz;

	@WikiDataField(pageName = "Denkmalschutz")
	private MonumentsType monumentProtectionCategory;

	@WikiDataField(pageName = "Anzahl Parkflächen")
	private Integer numberOfParkingSpaces;

	@WikiDataField(pageName = "Grundstücksgröße")
	private Amount plotArea;
	@WikiDataField(pageName = "Ankaufsdatum")
	private LocalDate purchaseDate;
	@WikiDataField(pageName = "Bruttokaufspreis")
	private Amount purchaseGrossPrice;

	@WikiDataField(pageName = "kurzfristig bebaubar")
	private Boolean shortTermConstructible;
	@WikiDataField(pageName = "Bebaubar nach")
	private SiteConstrucibleType siteConstrucibleType;
	@WikiDataField(pageName = "Erschliessungszustand")
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

	public void setMonumentProtectionCategory(
			MonumentsType monumentProtectionCategory) {
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

	public void setSiteConstrucibleType(
			SiteConstrucibleType siteConstrucibleType) {
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
