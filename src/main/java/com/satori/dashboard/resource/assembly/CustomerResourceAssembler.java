package com.satori.dashboard.resource.assembly;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.satori.dashboard.model.Customer;
import com.satori.dashboard.resource.CustomerResource;

public class CustomerResourceAssembler extends ResourceAssemblerSupport<Customer, CustomerResource> {

	public CustomerResourceAssembler() {
		super(Customer.class, CustomerResource.class);
	}

	@Override
	public CustomerResource toResource(Customer customer) {
		CustomerResource resource = instantiateResource(customer);
		return resource;
	}
	
	@Override
	protected CustomerResource instantiateResource(Customer customer) {
		return new CustomerResource(customer);
		
	}
}