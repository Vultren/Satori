package com.satori.dashboard.resource;

import org.springframework.hateoas.ResourceSupport;

import com.satori.dashboard.model.Person;

public class PersonResource extends ResourceSupport {

	private Person person;
	
	public PersonResource() {
		this(null);
	}

	public PersonResource(Person person) {
		this.person = person;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
