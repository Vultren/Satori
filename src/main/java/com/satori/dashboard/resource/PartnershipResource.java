package com.satori.dashboard.resource;

import org.springframework.hateoas.ResourceSupport;

import com.satori.dashboard.model.Partnership;

public class PartnershipResource extends ResourceSupport {

	private Partnership partnership;
	
	public PartnershipResource() {
		this(null);
	}

	public PartnershipResource(Partnership partnership) {
		this.partnership = partnership;
	}

	public Partnership getPartnership() {
		return partnership;
	}

	public void setPartnership(Partnership partnership) {
		this.partnership = partnership;
	}

}
