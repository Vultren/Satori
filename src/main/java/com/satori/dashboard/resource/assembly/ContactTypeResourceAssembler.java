package com.satori.dashboard.resource.assembly;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.satori.dashboard.model.ContactType;
import com.satori.dashboard.resource.ContactTypeResource;

public class ContactTypeResourceAssembler extends ResourceAssemblerSupport<ContactType, ContactTypeResource> {

	public ContactTypeResourceAssembler() {
		super(ContactType.class, ContactTypeResource.class);
	}

	@Override
	public ContactTypeResource toResource(ContactType contactType) {
		ContactTypeResource resource = instantiateResource(contactType);
		return resource;
	}
	
	@Override
	protected ContactTypeResource instantiateResource(ContactType contactType) {
		return new ContactTypeResource(contactType);
		
	}

}