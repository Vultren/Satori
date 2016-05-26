/**
 * TicketClassificationDetail.java 
 *
 *Satori
 * @author Eric Walden
 * Created 3:59:26 PM
 */
package com.satori.dashboard.model;

import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class TicketClassificationDetail.
 */
@Entity
public class TicketClassificationDetail {

	/** The logger. */
	private static Logger logger = LoggerFactory.getLogger(TicketClassificationDetail.class);
	
	/** The id. */
	private Integer id;

	/** The classification detail code. */
	private String classificationDetailCode;

	/** The description. */
	private String description;

	/** The tickets. */
	private Set<Ticket> tickets;

	/**
	 * Instantiates a new ticket classification detail.
	 */
	public TicketClassificationDetail() {
		this(null);
	}
	
	/**
	 * Instantiates a new ticket classification detail.
	 *
	 * @param classificationDetailCode the classification detail code
	 */
	public TicketClassificationDetail(String classificationDetailCode) {
		this.classificationDetailCode = classificationDetailCode;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Gets the classification detail code.
	 *
	 * @return the classification detail code
	 */
	public String getClassificationDetailCode() {
		return classificationDetailCode;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Gets the tickets.
	 *
	 * @return the tickets
	 */
	public Set<Ticket> getTickets() {
		return tickets;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Sets the classification detail code.
	 *
	 * @param classificationDetailCode the new classification detail code
	 */
	public void setClassificationDetailCode(String classificationDetailCode) {
		this.classificationDetailCode = classificationDetailCode;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Sets the tickets.
	 *
	 * @param tickets the new tickets
	 */
	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
	}
	
}
