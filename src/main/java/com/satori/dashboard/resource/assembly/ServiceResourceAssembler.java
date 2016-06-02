package com.satori.dashboard.resource.assembly;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.satori.dashboard.model.Service;
import com.satori.dashboard.resource.ServiceResource;

public class ServiceResourceAssembler extends ResourceAssemblerSupport<Service, ServiceResource> {

	public ServiceResourceAssembler() {
		super(Service.class, ServiceResource.class);
	}

	@Override
	public ServiceResource toResource(Service service) {
		ServiceResource resource = instantiateResource(service);
		return resource;
	}
	
	@Override
	protected ServiceResource instantiateResource(Service service) {
		return new ServiceResource(service);
		
	}

}