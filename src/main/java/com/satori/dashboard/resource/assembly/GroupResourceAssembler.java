package com.satori.dashboard.resource.assembly;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.satori.dashboard.model.Group;
import com.satori.dashboard.resource.GroupResource;

public class GroupResourceAssembler extends ResourceAssemblerSupport<Group, GroupResource> {

	public GroupResourceAssembler() {
		super(Group.class, GroupResource.class);
	}

	@Override
	public GroupResource toResource(Group group) {
		GroupResource resource = instantiateResource(group);
		return resource;
	}
	
	@Override
	protected GroupResource instantiateResource(Group group) {
		return new GroupResource(group);
		
	}

}