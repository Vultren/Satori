package com.satori.dashboard.model;

import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
public class ServiceType {

	private static final Logger logger = LoggerFactory.getLogger(ServiceType.class);
	
    private Long id;

    private String serviceTypeName;

    private byte[] serviceTypeDescription;

    private Set<Service> services;

	public ServiceType() {
		this(null);
	}

	public ServiceType(String serviceTypeName) {
		this.serviceTypeName = serviceTypeName;
	}

	public Long getId() {
		return id;
	}

	public String getServiceTypeName() {
		return serviceTypeName;
	}

	public byte[] getServiceTypeDescription() {
		return serviceTypeDescription;
	}

	public Set<Service> getServices() {
		return services;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setServiceTypeName(String serviceTypeName) {
		this.serviceTypeName = serviceTypeName;
	}

	public void setServiceTypeDescription(byte[] serviceTypeDescription) {
		this.serviceTypeDescription = serviceTypeDescription;
	}

	public void setServices(Set<Service> services) {
		this.services = services;
	}

	public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
    }

}
