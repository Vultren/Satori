package com.satori.dashboard.resource;

import org.springframework.hateoas.ResourceSupport;

import com.satori.dashboard.model.Address;

public class AddressResource extends ResourceSupport {

	private Address address;
	
	public AddressResource() {
		this(null);
	}

	public AddressResource(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
