package com.satori.dashboard.resource;

import org.springframework.hateoas.ResourceSupport;

import com.satori.dashboard.model.ContactType;

public class ContactTypeResource extends ResourceSupport {

	private ContactType contactType;
	
	public ContactTypeResource() {
		this(null);
	}

	public ContactTypeResource(ContactType contactType) {
		this.contactType = contactType;
	}

	public ContactType getContactType() {
		return contactType;
	}

	public void setContactType(ContactType contactType) {
		this.contactType = contactType;
	}
}
