package com.satori.dashboard.model;

import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
public class TicketState {

	private static Logger logger = LoggerFactory.getLogger(TicketState.class);
	
	private Long id;

	private String stateCode;

	private String description;

	private Set<Ticket> tickets;
	
	public TicketState() {
		this(null);
	}
	
	public TicketState(String stateCode) {
		this.stateCode = stateCode;
	}

	public Long getId() {
		return id;
	}

	public String getStateCode() {
		return stateCode;
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

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}

	public String toString() {
		return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames("tickets").toString();
	}
}
