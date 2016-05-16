package com.satori.dashboard.model;
import java.time.Instant;
import java.util.Arrays;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
public class Stat {

	private static final Logger logger = LoggerFactory.getLogger(Stat.class);

    private Long id;

    private Instant createdDate;

    private Integer performance;

    private Integer availability;

    private Integer capacity;

    private Integer configuration;

    private Integer security;

    private Integer environmental;

    private Ticket ticket;
    
    private ServiceAssetXref serviceAssetXref;

    
		
	public Long getId() {
		return id;
	}



	public Instant getCreatedDate() {
		return createdDate;
	}



	public Integer getPerformance() {
		return performance;
	}



	public Integer getAvailability() {
		return availability;
	}



	public Integer getCapacity() {
		return capacity;
	}



	public Integer getConfiguration() {
		return configuration;
	}



	public Integer getSecurity() {
		return security;
	}



	public Integer getEnvironmental() {
		return environmental;
	}

	public Integer getOverall() {
		return Arrays.asList(new Integer[]{availability, performance, capacity, configuration, environmental, security})
				.stream()
				.min(Integer::compare)
				.get();
	}

	public Ticket getTicket() {
		return ticket;
	}

	public ServiceAssetXref getServiceAssetXref() {
		return serviceAssetXref;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCreatedDate(Instant createdDate) {
		this.createdDate = createdDate;
	}

	public void setPerformance(Integer performance) {
		this.performance = performance;
	}

	public void setAvailability(Integer availability) {
		this.availability = availability;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public void setConfiguration(Integer configuration) {
		this.configuration = configuration;
	}

	public void setSecurity(Integer security) {
		this.security = security;
	}

	public void setEnvironmental(Integer environmental) {
		this.environmental = environmental;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public void setServiceAssetXref(ServiceAssetXref serviceAssetXref) {
		this.serviceAssetXref = serviceAssetXref;
	}

	public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
    }
}
