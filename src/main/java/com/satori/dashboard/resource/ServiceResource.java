package com.satori.dashboard.resource;

import org.springframework.hateoas.ResourceSupport;

import com.satori.dashboard.model.Service;

public class ServiceResource extends ResourceSupport {

	private Service service;
	
	public ServiceResource() {
		this(null);
	}

	public ServiceResource(Service service) {
		this.service = service;
	}

	public Service getservice() {
		return service;
	}

	public void setservice(Service service) {
		this.service = service;
	}

}
