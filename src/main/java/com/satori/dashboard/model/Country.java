package com.satori.dashboard.model;

import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
public class Country {

	private static Logger logger = LoggerFactory.getLogger(Country.class);

	private Long id;
	 
    private String countryCode;

    private String countryName;

    private Set<Address> addresses;

	public Long getId() {
		return id;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	public Country() {
		super();
	}

	public Country(String countryName) {
		super();
		this.countryName = countryName;
	}

	public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames("addresses").toString();
    }
}
