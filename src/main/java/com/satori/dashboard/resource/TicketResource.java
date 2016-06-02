package com.satori.dashboard.resource;

import javax.persistence.Entity;

import org.springframework.hateoas.ResourceSupport;

import com.satori.dashboard.model.Ticket;

@Entity
public class TicketResource extends ResourceSupport {

	private Ticket ticket;
	
	public TicketResource() {
		this(null);
	}

	public TicketResource(Ticket ticket) {
		this.ticket = ticket;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

}
