package com.satori.dashboard.resource.assembly;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.satori.dashboard.model.Country;
import com.satori.dashboard.resource.CountryResource;

public class CountryResourceAssembler extends ResourceAssemblerSupport<Country, CountryResource> {

	public CountryResourceAssembler() {
		super(Country.class, CountryResource.class);
	}

	@Override
	public CountryResource toResource(Country country) {
		CountryResource resource = instantiateResource(country);
		return resource;
	}
	
	@Override
	protected CountryResource instantiateResource(Country country) {
		return new CountryResource(country);
		
	}

}