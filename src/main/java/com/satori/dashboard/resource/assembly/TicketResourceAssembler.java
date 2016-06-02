package com.satori.dashboard.resource.assembly;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.satori.dashboard.model.Ticket;
import com.satori.dashboard.resource.TicketResource;

public class TicketResourceAssembler extends ResourceAssemblerSupport<Ticket, TicketResource> {

	public TicketResourceAssembler() {
		super(Ticket.class, TicketResource.class);
	}

	@Override
	public TicketResource toResource(Ticket ticket) {
		TicketResource resource = instantiateResource(ticket);
		return resource;
	}
	
	@Override
	protected TicketResource instantiateResource(Ticket ticket) {
		return new TicketResource(ticket);
		
	}

}