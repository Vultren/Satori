package com.satori.dashboard.resource;

import org.springframework.hateoas.ResourceSupport;

import com.satori.dashboard.model.Partner;

public class PartnerResource extends ResourceSupport {

	private Partner partner;
	
	public PartnerResource() {
		this(null);
	}

	public PartnerResource(Partner partner) {
		this.partner = partner;
	}

	public Partner getPartner() {
		return partner;
	}

	public void setPartner(Partner partner) {
		this.partner = partner;
	}

}
