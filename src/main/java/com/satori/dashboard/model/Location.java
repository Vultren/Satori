package com.satori.dashboard.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Location {

	private Country country;
	private UsState state;

	public Location() {
		this(null, null);
	}
	
	public Location(Country country) {
		this(country, null);
	}
	
	public Location(Country country, UsState state) {
		this.country = country;
		this.state = state;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public UsState getState() {
		return state;
	}

	public void setState(UsState state) {
		this.state = state;
	}
	
	public String toString() {
	    return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
	    .setExcludeFieldNames()
	    .toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
