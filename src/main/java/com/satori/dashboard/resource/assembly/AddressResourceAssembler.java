package com.satori.dashboard.resource.assembly;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.satori.dashboard.model.Address;
import com.satori.dashboard.resource.AddressResource;

public class AddressResourceAssembler extends ResourceAssemblerSupport<Address, AddressResource> {

	public AddressResourceAssembler() {
		super(Address.class, AddressResource.class);
	}

	@Override
	public AddressResource toResource(Address address) {
		AddressResource resource = instantiateResource(address);
		return resource;
	}
	
	@Override
	protected AddressResource instantiateResource(Address address) {
		return new AddressResource(address);
		
	}
}