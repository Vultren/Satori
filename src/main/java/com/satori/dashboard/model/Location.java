/**
 * Location.java 
 *
 *Satori
 * @author Eric Walden
 * Created 3:59:25 PM
 */
package com.satori.dashboard.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * The Class Location.
 */
public class Location {

	/** The country. */
	private Country country;
	
	/** The state. */
	private UsState state;

	/**
	 * Instantiates a new location.
	 */
	public Location() {
		this(null, null);
	}
	
	/**
	 * Instantiates a new location.
	 *
	 * @param country the country
	 */
	public Location(Country country) {
		this(country, null);
	}
	
	/**
	 * Instantiates a new location.
	 *
	 * @param country the country
	 * @param state the state
	 */
	public Location(Country country, UsState state) {
		this.country = country;
		this.state = state;
	}

	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * Sets the country.
	 *
	 * @param country the new country
	 */
	public void setCountry(Country country) {
		this.country = country;
	}

	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public UsState getState() {
		return state;
	}

	/**
	 * Sets the state.
	 *
	 * @param state the new state
	 */
	public void setState(UsState state) {
		this.state = state;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
	    return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
	    .setExcludeFieldNames()
	    .toString();
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
