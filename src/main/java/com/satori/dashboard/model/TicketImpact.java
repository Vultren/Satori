/**
 * TicketImpact.java 
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
 * The Class TicketImpact.
 */
@Entity
public class TicketImpact {

	/** The logger. */
	private static Logger logger = LoggerFactory.getLogger(TicketImpact.class);

	/** The id. */
	private Long id;

	/** The impact code. */
	private String impactCode;

	/** The description. */
	private String description;

	/** The tickets. */
	private Set<Ticket> tickets;

	/**
	 * Instantiates a new ticket impact.
	 */
	public TicketImpact() {
		this(null);
	}
	
	/**
	 * Instantiates a new ticket impact.
	 *
	 * @param impactCode the impact code
	 */
	public TicketImpact(String impactCode) {
		this.impactCode = impactCode;
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
	 * Gets the impact code.
	 *
	 * @return the impact code
	 */
	public String getImpactCode() {
		return impactCode;
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
	 * Sets the impact code.
	 *
	 * @param impactCode the new impact code
	 */
	public void setImpactCode(String impactCode) {
		this.impactCode = impactCode;
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
