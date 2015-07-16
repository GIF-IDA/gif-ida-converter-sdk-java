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

    /**
     * @author Pascal Houdek
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @author Pascal Houdek
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @author Pascal Houdek
     * @return the floorLocation
     */
    public String getFloorLocation() {
        return floorLocation;
    }

    /**
     * @author Pascal Houdek
     * @param floorLocation the floorLocation to set
     */
    public void setFloorLocation(String floorLocation) {
        this.floorLocation = floorLocation;
    }

    /**
     * @author Pascal Houdek
     * @return the floor
     */
    public String getFloor() {
        return floor;
    }

    /**
     * @author Pascal Houdek
     * @param floor the floor to set
     */
    public void setFloor(String floor) {
        this.floor = floor;
    }

    /**
     * @author Pascal Houdek
     * @return the housenumber
     */
    public String getHousenumber() {
        return housenumber;
    }

    /**
     * @author Pascal Houdek
     * @param housenumber the housenumber to set
     */
    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }

    /**
     * @author Pascal Houdek
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @author Pascal Houdek
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @author Pascal Houdek
     * @return the district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * @author Pascal Houdek
     * @param district the district to set
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * @author Pascal Houdek
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * @author Pascal Houdek
     * @param zip the zip to set
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * @author Pascal Houdek
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @author Pascal Houdek
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @author Pascal Houdek
     * @return the region
     */
    public String getRegion() {
        return region;
    }

    /**
     * @author Pascal Houdek
     * @param region the region to set
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * @author Pascal Houdek
     * @return the country
     */
    public Country getCountry() {
        return country;
    }

    /**
     * @author Pascal Houdek
     * @param country the country to set
     */
    public void setCountry(Country country) {
        this.country = country;
    }

    /**
     * @author Pascal Houdek
     * @return the latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * @author Pascal Houdek
     * @param latitude the latitude to set
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * @author Pascal Houdek
     * @return the longitude
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * @author Pascal Houdek
     * @param longitude the longitude to set
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * @author Pascal Houdek
     * @return the isPublic
     */
    public Boolean getIsPublic() {
        return isPublic;
    }

    /**
     * @author Pascal Houdek
     * @param isPublic the isPublic to set
     */
    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }
}
