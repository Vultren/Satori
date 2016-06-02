package com.satori.dashboard.resource.assembly;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.satori.dashboard.model.Person;
import com.satori.dashboard.resource.PersonResource;

public class PersonResourceAssembler extends ResourceAssemblerSupport<Person, PersonResource> {

	public PersonResourceAssembler() {
		super(Person.class, PersonResource.class);
	}

	@Override
	public PersonResource toResource(Person person) {
		PersonResource resource = instantiateResource(person);
		return resource;
	}
	
	@Override
	protected PersonResource instantiateResource(Person person) {
		return new PersonResource(person);
		
	}

}