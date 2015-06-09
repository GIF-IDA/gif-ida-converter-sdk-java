package org.zgif.model.node.group;

import org.zgif.model.annotation.DataField;
import org.zgif.model.datatype.Country;

public class Address extends AbstractGroupNode {
	@DataField(wikiPageName="Bezeichnung")
	private String label;
	@DataField(wikiPageName="Lage in Etage")
	private String floorLocation;
	@DataField(wikiPageName="Etage")
	private String floor;
	@DataField(wikiPageName="Hausnummer")
	private String housenumber;
	@DataField(wikiPageName="Straße")
	private String street;
	@DataField(wikiPageName="Stadtteil")
	private String district;
	@DataField(wikiPageName="Postleitzahl")
	private String zip;
	@DataField(wikiPageName="Stadt")
	private String city;
	@DataField(wikiPageName="Region")
	private String region;
	@DataField(wikiPageName="Land")
	private Country country;

	@DataField(wikiPageName="Geografische Breite")
	private Double latitude;
	@DataField(wikiPageName="Geografische Länge")
	private Double longitude;

	@DataField(wikiPageName="Adresse veröffentlichen")
	private Boolean isPublic;
}
