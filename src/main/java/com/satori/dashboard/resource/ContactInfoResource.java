package com.satori.dashboard.resource;

import org.springframework.hateoas.ResourceSupport;

import com.satori.dashboard.model.ContactInfo;

public class ContactInfoResource extends ResourceSupport {

	private ContactInfo contactInfo;
	
	public ContactInfoResource() {
		this(null);
	}

	public ContactInfoResource(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}
}
