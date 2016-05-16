package com.satori.dashboard.model;

import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
public class TicketClassification {

	private static Logger logger = LoggerFactory.getLogger(TicketClassification.class);
	
	private Long id;

	private String classificationCode;

	private String description;

	private Set<Ticket> tickets;
	
	public TicketClassification() {
		this(null);
	}
	
	public TicketClassification(String classificationCode) {
		this.classificationCode = classificationCode; 
	}

	public Long getId() {
		return id;
	}

	public String getClassificationCode() {
		return classificationCode;
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

	public void setClassificationCode(String classificationCode) {
		this.classificationCode = classificationCode;
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
