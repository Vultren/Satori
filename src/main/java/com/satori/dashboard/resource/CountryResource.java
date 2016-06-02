package com.satori.dashboard.resource;

import org.springframework.hateoas.ResourceSupport;

import com.satori.dashboard.model.Country;

public class CountryResource extends ResourceSupport {

	private Country country;
	
	public CountryResource() {
		this(null);
	}

	public CountryResource(Country country) {
		this.country = country;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}
