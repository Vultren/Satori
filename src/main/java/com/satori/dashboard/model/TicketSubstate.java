/**
 * TicketSubstate.java 
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
 * The Class TicketSubstate.
 */
@Entity
public class TicketSubstate {
	
	/** The logger. */
	private static Logger logger = LoggerFactory.getLogger(TicketSubstate.class);
	
	/** The id. */
	private Long id;

	/** The substate code. */
	private String substateCode;

	/** The description. */
	private String description;

	/** The tickets. */
	private Set<Ticket> tickets;
	
	/**
	 * Instantiates a new ticket substate.
	 */
	public TicketSubstate() {
		this(null);
	}
	
	/**
	 * Instantiates a new ticket substate.
	 *
	 * @param substateCode the substate code
	 */
	public TicketSubstate(String substateCode) {
		super();
		this.substateCode = substateCode;
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
	 * Gets the substate code.
	 *
	 * @return the substate code
	 */
	public String getSubstateCode() {
		return substateCode;
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
	 * Sets the substate code.
	 *
	 * @param substateCode the new substate code
	 */
	public void setSubstateCode(String substateCode) {
		this.substateCode = substateCode;
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
