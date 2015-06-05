package org.zgif.model.node.group;

import org.zgif.model.annotation.WikiDataField;
import org.zgif.model.datatype.Country;

public class Address extends AbstractGroupNode {
	@WikiDataField(pageName="Bezeichnung")
	private String label;
	@WikiDataField(pageName="Lage in Etage")
	private String floorLocation;
	@WikiDataField(pageName="Etage")
	private String floor;
	@WikiDataField(pageName="Hausnummer")
	private String housenumber;
	@WikiDataField(pageName="Straße")
	private String street;
	@WikiDataField(pageName="Stadtteil")
	private String district;
	@WikiDataField(pageName="Postleitzahl")
	private String zip;
	@WikiDataField(pageName="Stadt")
	private String city;
	@WikiDataField(pageName="Region")
	private String region;
	@WikiDataField(pageName="Land")
	private Country country;

	@WikiDataField(pageName="Geografische Breite")
	private Double latitude;
	@WikiDataField(pageName="Geografische Länge")
	private Double longitude;

	@WikiDataField(pageName="Adresse veröffentlichen")
	private Boolean isPublic;
}
