/**
 * Address.java 
 *
 * Satori
 * @author Eric Walden
 * Created May 26, 2016 4:06:53 PM
 */
package com.satori.dashboard.model;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class Address.
 */
@Entity
public class Address {

	/**
	 * The Constant logger.
	 */
	private static final Logger logger = LoggerFactory.getLogger(Address.class);

	/**
	 * The id.
	 */
	private Long id;

	/**
	 * The assets.
	 */
	private Set<Asset> assets;

	/**
	 * The location.
	 */
	private Location location;

	/**
	 * The organization.
	 */
	private Organization organization;

	/**
	 * The people.
	 */
	private Set<Person> people;

	/**
	 * The street address1.
	 */
	private String streetAddress1;

	/**
	 * The street address2.
	 */
	private String streetAddress2;

	/**
	 * The city.
	 */
	private String city;

	/**
	 * The zip.
	 */
	private String zip;

	/**
	 * The zip ext.
	 */
	private String zipExt;

	/**
	 * The building info.
	 */
	private String buildingInfo;

	/**
	 * The floor.
	 */
	private String floor;

	/**
	 * The room.
	 */
	private String room;

	/**
	 * The latitude.
	 */
	private BigDecimal latitude;

	/**
	 * The location sys id.
	 */
	private String locationSysId;

	/**
	 * The longitude.
	 */
	private BigDecimal longitude;

	/**
	 * The site name.
	 */
	private String siteName;

	/**
	 * The site description.
	 */
	private String siteDescription;

	/**
	 * The is headquarters.
	 */
	private boolean isHeadquarters;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Gets the assets.
	 *
	 * @return the assets
	 */
	public Set<Asset> getAssets() {
		return assets;
	}

	/**
	 * Gets the location.
	 *
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * Gets the organization.
	 *
	 * @return the organization
	 */
	public Organization getOrganization() {
		return organization;
	}

	/**
	 * Gets the people.
	 *
	 * @return the people
	 */
	public Set<Person> getPeople() {
		return people;
	}

	/**
	 * Gets the street address1.
	 *
	 * @return the street address1
	 */
	public String getStreetAddress1() {
		return streetAddress1;
	}

	/**
	 * Gets the street address2.
	 *
	 * @return the street address2
	 */
	public String getStreetAddress2() {
		return streetAddress2;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Gets the zip.
	 *
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * Gets the zip ext.
	 *
	 * @return the zip ext
	 */
	public String getZipExt() {
		return zipExt;
	}

	/**
	 * Gets the building info.
	 *
	 * @return the building info
	 */
	public String getBuildingInfo() {
		return buildingInfo;
	}

	/**
	 * Gets the floor.
	 *
	 * @return the floor
	 */
	public String getFloor() {
		return floor;
	}

	/**
	 * Gets the room.
	 *
	 * @return the room
	 */
	public String getRoom() {
		return room;
	}

	/**
	 * Gets the latitude.
	 *
	 * @return the latitude
	 */
	public BigDecimal getLatitude() {
		return latitude;
	}

	/**
	 * Gets the location sys id.
	 *
	 * @return the location sys id
	 */
	public String getLocationSysId() {
		return locationSysId;
	}

	/**
	 * Gets the longitude.
	 *
	 * @return the longitude
	 */
	public BigDecimal getLongitude() {
		return longitude;
	}

	/**
	 * Gets the site name.
	 *
	 * @return the site name
	 */
	public String getSiteName() {
		return siteName;
	}

	/**
	 * Gets the site description.
	 *
	 * @return the site description
	 */
	public String getSiteDescription() {
		return siteDescription;
	}

	/**
	 * Checks if is headquarters.
	 *
	 * @return true, if is headquarters
	 */
	public boolean isHeadquarters() {
		return isHeadquarters;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Sets the assets.
	 *
	 * @param assets
	 *            the new assets
	 */
	public void setAssets(Set<Asset> assets) {
		this.assets = assets;
	}

	/**
	 * Sets the location.
	 *
	 * @param location
	 *            the new location
	 */
	public void setLocation(Location location) {
		this.location = location;
	}

	/**
	 * Sets the organization.
	 *
	 * @param organization
	 *            the new organization
	 */
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	/**
	 * Sets the people.
	 *
	 * @param people
	 *            the new people
	 */
	public void setPeople(Set<Person> people) {
		this.people = people;
	}

	/**
	 * Sets the street address1.
	 *
	 * @param streetAddress1
	 *            the new street address1
	 */
	public void setStreetAddress1(String streetAddress1) {
		this.streetAddress1 = streetAddress1;
	}

	/**
	 * Sets the street address2.
	 *
	 * @param streetAddress2
	 *            the new street address2
	 */
	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
	}

	/**
	 * Sets the city.
	 *
	 * @param city
	 *            the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Sets the zip.
	 *
	 * @param zip
	 *            the new zip
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * Sets the zip ext.
	 *
	 * @param zipExt
	 *            the new zip ext
	 */
	public void setZipExt(String zipExt) {
		this.zipExt = zipExt;
	}

	/**
	 * Sets the building info.
	 *
	 * @param buildingInfo
	 *            the new building info
	 */
	public void setBuildingInfo(String buildingInfo) {
		this.buildingInfo = buildingInfo;
	}

	/**
	 * Sets the floor.
	 *
	 * @param floor
	 *            the new floor
	 */
	public void setFloor(String floor) {
		this.floor = floor;
	}

	/**
	 * Sets the room.
	 *
	 * @param room
	 *            the new room
	 */
	public void setRoom(String room) {
		this.room = room;
	}

	/**
	 * Sets the latitude.
	 *
	 * @param latitude
	 *            the new latitude
	 */
	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	/**
	 * Sets the location sys id.
	 *
	 * @param locationSysId
	 *            the new location sys id
	 */
	public void setLocationSysId(String locationSysId) {
		this.locationSysId = locationSysId;
	}

	/**
	 * Sets the longitude.
	 *
	 * @param longitude
	 *            the new longitude
	 */
	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	/**
	 * Sets the site name.
	 *
	 * @param siteName
	 *            the new site name
	 */
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	/**
	 * Sets the site description.
	 *
	 * @param siteDescription
	 *            the new site description
	 */
	public void setSiteDescription(String siteDescription) {
		this.siteDescription = siteDescription;
	}

	/**
	 * Sets the headquarters.
	 *
	 * @param isHeadquarters
	 *            the new headquarters
	 */
	public void setHeadquarters(boolean isHeadquarters) {
		this.isHeadquarters = isHeadquarters;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
	}
}
