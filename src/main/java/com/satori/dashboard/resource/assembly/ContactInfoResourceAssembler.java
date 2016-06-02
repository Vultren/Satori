package com.satori.dashboard.resource.assembly;

import javax.persistence.Entity;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.satori.dashboard.model.ContactInfo;
import com.satori.dashboard.resource.ContactInfoResource;

@Entity
public class ContactInfoResourceAssembler extends ResourceAssemblerSupport<ContactInfo, ContactInfoResource> {

	public ContactInfoResourceAssembler() {
		super(ContactInfo.class, ContactInfoResource.class);
	}

	@Override
	public ContactInfoResource toResource(ContactInfo contactInfo) {
		ContactInfoResource resource = instantiateResource(contactInfo);
		return resource;
	}
	
	@Override
	protected ContactInfoResource instantiateResource(ContactInfo contactInfo) {
		return new ContactInfoResource(contactInfo);
		
	}

}