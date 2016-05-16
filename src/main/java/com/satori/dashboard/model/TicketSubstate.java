package com.satori.dashboard.model;

import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
public class TicketSubstate {
	private static Logger logger = LoggerFactory.getLogger(TicketSubstate.class);
	
	private Long id;

	private String substateCode;

	private String description;

	private Set<Ticket> tickets;
	
	public TicketSubstate() {
		this(null);
	}
	
	public TicketSubstate(String substateCode) {
		super();
		this.substateCode = substateCode;
	}

	public Long getId() {
		return id;
	}

	public String getSubstateCode() {
		return substateCode;
	}

	public String getDescription() {
		return description;
	}

	public Set<Ticket> getTickets() {
		return tickets;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setSubstateCode(String substateCode) {
		this.substateCode = substateCode;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}

	public String toString() {
		return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
	}
	
}
