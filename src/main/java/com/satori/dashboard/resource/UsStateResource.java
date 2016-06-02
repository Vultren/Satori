package com.satori.dashboard.resource;

import org.springframework.hateoas.ResourceSupport;

import com.satori.dashboard.model.UsState;

public class UsStateResource extends ResourceSupport {

	private UsState state;
	
	public UsStateResource() {
		this(null);
	}

	public UsStateResource(UsState state) {
		this.state = state;
	}

	public UsState getUsState() {
		return state;
	}

	public void setUsState(UsState state) {
		this.state = state;
	}

}
