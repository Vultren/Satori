package com.satori.dashboard.resource.assembly;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.satori.dashboard.model.Organization;
import com.satori.dashboard.resource.OrganizationResource;

public class OrganizationResourceAssembler extends ResourceAssemblerSupport<Organization, OrganizationResource> {

	public OrganizationResourceAssembler() {
		super(Organization.class, OrganizationResource.class);
	}

	@Override
	public OrganizationResource toResource(Organization organization) {
		OrganizationResource resource = instantiateResource(organization);
		return resource;
	}
	
	@Override
	protected OrganizationResource instantiateResource(Organization organization) {
		return new OrganizationResource(organization);
		
	}
}