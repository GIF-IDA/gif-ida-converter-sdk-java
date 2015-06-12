package org.zgif.model.node.group;

import org.zgif.model.annotation.DataField;
import org.zgif.model.annotation.Node;
import org.zgif.model.datatype.Country;

@Node(parentNodes={})
public class Address extends AbstractGroupNode {
	@DataField(wikiPageName="Bezeichnung")
	private String label;
	@DataField(wikiPageName="Lage in Etage")
	private String floorLocation;
	@DataField(wikiPageName="Etage")
	private String floor;
	@DataField(wikiPageName="Hausnummer")
	private String housenumber;
	@DataField(wikiPageName="Stra�e")
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
	@DataField(wikiPageName="Geografische L�nge")
	private Double longitude;

	@DataField(wikiPageName="Adresse ver�ffentlichen")
	private Boolean isPublic;
}
