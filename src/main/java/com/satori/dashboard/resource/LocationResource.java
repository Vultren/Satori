package com.satori.dashboard.resource;

import org.springframework.hateoas.ResourceSupport;

import com.satori.dashboard.model.Location;

public class LocationResource extends ResourceSupport {

	private Location location;
	
	public LocationResource() {
		this(null);
	}

	public LocationResource(Location location) {
		this.location = location;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

}
