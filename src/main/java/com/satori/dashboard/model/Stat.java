/**
 * Stat.java 
 *
 *Satori
 * @author Eric Walden
 * Created 3:59:25 PM
 */
package com.satori.dashboard.model;
import java.time.Instant;
import java.util.Arrays;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class Stat.
 */
@Entity
public class Stat {

	/** The Constant logger. */
	private static final Logger logger = LoggerFactory.getLogger(Stat.class);

    /** The id. */
    private Long id;

    /** The created date. */
    private Instant createdDate;

    /** The performance. */
    private Integer performance;

    /** The availability. */
    private Integer availability;

    /** The capacity. */
    private Integer capacity;

    /** The configuration. */
    private Integer configuration;

    /** The security. */
    private Integer security;

    /** The environmental. */
    private Integer environmental;

    /** The ticket. */
    private Ticket ticket;
    
    /** The service asset xref. */
    private ServiceAssetXref serviceAssetXref;

    
		
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}



	/**
	 * Gets the created date.
	 *
	 * @return the created date
	 */
	public Instant getCreatedDate() {
		return createdDate;
	}



	/**
	 * Gets the performance.
	 *
	 * @return the performance
	 */
	public Integer getPerformance() {
		return performance;
	}



	/**
	 * Gets the availability.
	 *
	 * @return the availability
	 */
	public Integer getAvailability() {
		return availability;
	}



	/**
	 * Gets the capacity.
	 *
	 * @return the capacity
	 */
	public Integer getCapacity() {
		return capacity;
	}



	/**
	 * Gets the configuration.
	 *
	 * @return the configuration
	 */
	public Integer getConfiguration() {
		return configuration;
	}



	/**
	 * Gets the security.
	 *
	 * @return the security
	 */
	public Integer getSecurity() {
		return security;
	}



	/**
	 * Gets the environmental.
	 *
	 * @return the environmental
	 */
	public Integer getEnvironmental() {
		return environmental;
	}

	/**
	 * Gets the overall.
	 *
	 * @return the overall
	 */
	public Integer getOverall() {
		return Arrays.asList(new Integer[]{availability, performance, capacity, configuration, environmental, security})
				.stream()
				.min(Integer::compare)
				.get();
	}

	/**
	 * Gets the ticket.
	 *
	 * @return the ticket
	 */
	public Ticket getTicket() {
		return ticket;
	}

	/**
	 * Gets the service asset xref.
	 *
	 * @return the service asset xref
	 */
	public ServiceAssetXref getServiceAssetXref() {
		return serviceAssetXref;
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
	 * Sets the created date.
	 *
	 * @param createdDate the new created date
	 */
	public void setCreatedDate(Instant createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * Sets the performance.
	 *
	 * @param performance the new performance
	 */
	public void setPerformance(Integer performance) {
		this.performance = performance;
	}

	/**
	 * Sets the availability.
	 *
	 * @param availability the new availability
	 */
	public void setAvailability(Integer availability) {
		this.availability = availability;
	}

	/**
	 * Sets the capacity.
	 *
	 * @param capacity the new capacity
	 */
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	/**
	 * Sets the configuration.
	 *
	 * @param configuration the new configuration
	 */
	public void setConfiguration(Integer configuration) {
		this.configuration = configuration;
	}

	/**
	 * Sets the security.
	 *
	 * @param security the new security
	 */
	public void setSecurity(Integer security) {
		this.security = security;
	}

	/**
	 * Sets the environmental.
	 *
	 * @param environmental the new environmental
	 */
	public void setEnvironmental(Integer environmental) {
		this.environmental = environmental;
	}

	/**
	 * Sets the ticket.
	 *
	 * @param ticket the new ticket
	 */
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	/**
	 * Sets the service asset xref.
	 *
	 * @param serviceAssetXref the new service asset xref
	 */
	public void setServiceAssetXref(ServiceAssetXref serviceAssetXref) {
		this.serviceAssetXref = serviceAssetXref;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
    }
}
