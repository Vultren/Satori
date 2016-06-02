package com.satori.dashboard.resource.assembly;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.satori.dashboard.model.Location;
import com.satori.dashboard.resource.LocationResource;

public class LocationResourceAssembler extends ResourceAssemblerSupport<Location, LocationResource> {

	public LocationResourceAssembler() {
		super(Location.class, LocationResource.class);
	}

	@Override
	public LocationResource toResource(Location location) {
		LocationResource resource = instantiateResource(location);
		return resource;
	}
	
	@Override
	protected LocationResource instantiateResource(Location location) {
		return new LocationResource(location);
		
	}

}