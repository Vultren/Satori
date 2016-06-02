package com.satori.dashboard.resource;

import org.springframework.hateoas.ResourceSupport;

import com.satori.dashboard.model.Group;

public class GroupResource extends ResourceSupport {

	private Group group;
	
	public GroupResource() {
		this(null);
	}

	public GroupResource(Group group) {
		this.group = group;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

}
