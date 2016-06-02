package com.satori.dashboard.resource;

import org.springframework.hateoas.ResourceSupport;

import com.satori.dashboard.model.Customer;

public class CustomerResource extends ResourceSupport {

	private Customer customer;
	
	public CustomerResource() {
		this(null);
	}

	public CustomerResource(Customer customer) {
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
