package com.satori.dashboard.resource;

import org.springframework.hateoas.ResourceSupport;

import com.satori.dashboard.model.Stat;

public class StatResource extends ResourceSupport {

	private Stat stat;
	
	public StatResource() {
		this(null);
	}

	public StatResource(Stat stat) {
		this.stat = stat;
	}

	public Stat getStat() {
		return stat;
	}

	public void setStat(Stat stat) {
		this.stat = stat;
	}

}
