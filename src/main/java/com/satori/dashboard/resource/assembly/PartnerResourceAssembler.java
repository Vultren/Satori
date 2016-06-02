package com.satori.dashboard.resource.assembly;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.satori.dashboard.model.Partner;
import com.satori.dashboard.resource.PartnerResource;

public class PartnerResourceAssembler extends ResourceAssemblerSupport<Partner, PartnerResource> {

	public PartnerResourceAssembler() {
		super(Partner.class, PartnerResource.class);
	}

	@Override
	public PartnerResource toResource(Partner partner) {
		PartnerResource resource = instantiateResource(partner);
		return resource;
	}
	
	@Override
	protected PartnerResource instantiateResource(Partner partner) {
		return new PartnerResource(partner);
		
	}

}