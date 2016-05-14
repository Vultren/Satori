package com.satori.dashboard.model;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
public class Address {

	private static final Logger logger = LoggerFactory.getLogger(Address.class);
	
	private Long id; 
    
	private Set<Asset> assets;

    private Location location;

    private Organization organization;

    private String streetAddress1;
    
    private String streetAddress2;

    private String city;

	private String zip;
	
	private String zipExt;

	private String buildingInfo;

	private String floor;
	
	private String room;

	private BigDecimal latitude;
	
	private String locationSysId;		

	private BigDecimal longitude;

	private String siteName;

	private String siteDescription;

    private boolean isHeadquarters;

	public Long getId() {
		return id;
	}

	public Set<Asset> getAssets() {
		return assets;
	}

	public Location getLocation() {
		return location;
	}

	public Organization getOrganization() {
		return organization;
	}

	public String getStreetAddress1() {
		return streetAddress1;
	}
	
	public String getStreetAddress2() {
		return streetAddress2;
	}

	public String getCity() {
		return city;
	}

	public String getZip() {
		return zip;
	}

	public String getZipExt() {
		return zipExt;
	}

	public String getBuildingInfo() {
		return buildingInfo;
	}

	public String getFloor() {
		return floor;
	}

	public String getRoom() {
		return room;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public String getLocationSysId() {
		return locationSysId;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public String getSiteName() {
		return siteName;
	}

	public String getSiteDescription() {
		return siteDescription;
	}

	public boolean isHeadquarters() {
		return isHeadquarters;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAssets(Set<Asset> assets) {
		this.assets = assets;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public void setStreetAddress1(String streetAddress1) {
		this.streetAddress1 = streetAddress1;
	}
	
	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public void setZipExt(String zipExt) {
		this.zipExt = zipExt;
	}

	public void setBuildingInfo(String buildingInfo) {
		this.buildingInfo = buildingInfo;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public void setLocationSysId(String locationSysId) {
		this.locationSysId = locationSysId;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public void setSiteDescription(String siteDescription) {
		this.siteDescription = siteDescription;
	}

	public void setHeadquarters(boolean isHeadquarters) {
		this.isHeadquarters = isHeadquarters;
	}

	public String toString() {
	    return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
	    .setExcludeFieldNames()
	    .toString();
	}
}
