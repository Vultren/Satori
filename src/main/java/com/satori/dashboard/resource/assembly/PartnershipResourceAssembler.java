package com.satori.dashboard.resource.assembly;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.satori.dashboard.model.Partnership;
import com.satori.dashboard.resource.PartnershipResource;

public class PartnershipResourceAssembler extends ResourceAssemblerSupport<Partnership, PartnershipResource> {

	public PartnershipResourceAssembler() {
		super(Partnership.class, PartnershipResource.class);
	}

	@Override
	public PartnershipResource toResource(Partnership partnership) {
		PartnershipResource resource = instantiateResource(partnership);
		return resource;
	}
	
	@Override
	protected PartnershipResource instantiateResource(Partnership partnership) {
		return new PartnershipResource(partnership);
		
	}

}