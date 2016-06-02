package com.satori.dashboard.resource.assembly;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.satori.dashboard.model.Stat;
import com.satori.dashboard.resource.StatResource;

public class StatResourceAssembler extends ResourceAssemblerSupport<Stat, StatResource> {

	public StatResourceAssembler() {
		super(Stat.class, StatResource.class);
	}

	@Override
	public StatResource toResource(Stat stat) {
		StatResource resource = instantiateResource(stat);
		return resource;
	}
	
	@Override
	protected StatResource instantiateResource(Stat stat) {
		return new StatResource(stat);
		
	}
}