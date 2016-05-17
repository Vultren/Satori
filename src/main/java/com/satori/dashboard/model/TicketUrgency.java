package com.satori.dashboard.model;

import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
public class TicketUrgency {

	private static Logger logger = LoggerFactory.getLogger(TicketUrgency.class);
	
	private Long id;

	private String urgencyCode;

	private String description;

	private Set<Ticket> tickets;
	
	public TicketUrgency() {
		this(null);
	}
	
	public TicketUrgency(String urgencyCode) {
		this.urgencyCode = urgencyCode;
	}

	public Long getId() {
		return id;
	}

	public String getUrgencyCode() {
		return urgencyCode;
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

	public void setUrgencyCode(String urgencyCode) {
		this.urgencyCode = urgencyCode;
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
