package com.satori.dashboard.model;

import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
public class TicketClassificationDetail {

	private static Logger logger = LoggerFactory.getLogger(TicketClassificationDetail.class);
	
	private Integer id;

	private String classificationDetailCode;

	private String description;

	private Set<Ticket> tickets;

	public TicketClassificationDetail() {
		this(null);
	}
	
	public TicketClassificationDetail(String classificationDetailCode) {
		this.classificationDetailCode = classificationDetailCode;
	}

	public Integer getId() {
		return id;
	}

	public String getClassificationDetailCode() {
		return classificationDetailCode;
	}

	public String getDescription() {
		return description;
	}

	public Set<Ticket> getTickets() {
		return tickets;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setClassificationDetailCode(String classificationDetailCode) {
		this.classificationDetailCode = classificationDetailCode;
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
