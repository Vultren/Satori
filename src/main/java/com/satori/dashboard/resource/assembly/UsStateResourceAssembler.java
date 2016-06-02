package com.satori.dashboard.resource.assembly;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.satori.dashboard.model.UsState;
import com.satori.dashboard.resource.UsStateResource;

public class UsStateResourceAssembler extends ResourceAssemblerSupport<UsState, UsStateResource> {

	public UsStateResourceAssembler() {
		super(UsState.class, UsStateResource.class);
	}

	@Override
	public UsStateResource toResource(UsState state) {
		UsStateResource resource = instantiateResource(state);
		return resource;
	}
	
	@Override
	protected UsStateResource instantiateResource(UsState state) {
		return new UsStateResource(state);
		
	}

}