/**
 * TicketClassification.java 
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
 * The Class TicketClassification.
 */
@Entity
public class TicketClassification {

	/** The logger. */
	private static Logger logger = LoggerFactory.getLogger(TicketClassification.class);
	
	/** The id. */
	private Long id;

	/** The classification code. */
	private String classificationCode;

	/** The description. */
	private String description;

	/** The tickets. */
	private Set<Ticket> tickets;
	
	/**
	 * Instantiates a new ticket classification.
	 */
	public TicketClassification() {
		this(null);
	}
	
	/**
	 * Instantiates a new ticket classification.
	 *
	 * @param classificationCode the classification code
	 */
	public TicketClassification(String classificationCode) {
		this.classificationCode = classificationCode; 
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Gets the classification code.
	 *
	 * @return the classification code
	 */
	public String getClassificationCode() {
		return classificationCode;
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
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Sets the classification code.
	 *
	 * @param classificationCode the new classification code
	 */
	public void setClassificationCode(String classificationCode) {
		this.classificationCode = classificationCode;
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
