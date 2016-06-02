package com.satori.dashboard.resource;

import org.springframework.hateoas.ResourceSupport;

import com.satori.dashboard.model.Organization;

public class OrganizationResource extends ResourceSupport {

	private Organization organization;
	
	public OrganizationResource() {
		this(null);
	}

	public OrganizationResource(Organization organization) {
		this.organization = organization;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

}
