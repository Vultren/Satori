/**
 * TicketUrgency.java 
 *
 *Satori
 * @author Eric Walden
 * Created 3:59:25 PM
 */
package com.satori.dashboard.model;

import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class TicketUrgency.
 */
@Entity
public class TicketUrgency {

	/** The logger. */
	private static Logger logger = LoggerFactory.getLogger(TicketUrgency.class);
	
	/** The id. */
	private Long id;

	/** The urgency code. */
	private String urgencyCode;

	/** The description. */
	private String description;

	/** The tickets. */
	private Set<Ticket> tickets;
	
	/**
	 * Instantiates a new ticket urgency.
	 */
	public TicketUrgency() {
		this(null);
	}
	
	/**
	 * Instantiates a new ticket urgency.
	 *
	 * @param urgencyCode the urgency code
	 */
	public TicketUrgency(String urgencyCode) {
		this.urgencyCode = urgencyCode;
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
	 * Gets the urgency code.
	 *
	 * @return the urgency code
	 */
	public String getUrgencyCode() {
		return urgencyCode;
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
	 * Sets the urgency code.
	 *
	 * @param urgencyCode the new urgency code
	 */
	public void setUrgencyCode(String urgencyCode) {
		this.urgencyCode = urgencyCode;
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
		return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames("tickets").toString();
	}
}
