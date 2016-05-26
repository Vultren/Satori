/**
 * ServiceType.java 
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
 * The Class ServiceType.
 */
@Entity
public class ServiceType {

	/** The Constant logger. */
	private static final Logger logger = LoggerFactory.getLogger(ServiceType.class);
	
    /** The id. */
    private Long id;

    /** The service type name. */
    private String serviceTypeName;

    /** The service type description. */
    private byte[] serviceTypeDescription;

    /** The services. */
    private Set<Service> services;

	/**
	 * Instantiates a new service type.
	 */
	public ServiceType() {
		this(null);
	}

	/**
	 * Instantiates a new service type.
	 *
	 * @param serviceTypeName the service type name
	 */
	public ServiceType(String serviceTypeName) {
		this.serviceTypeName = serviceTypeName;
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
	 * Gets the service type name.
	 *
	 * @return the service type name
	 */
	public String getServiceTypeName() {
		return serviceTypeName;
	}

	/**
	 * Gets the service type description.
	 *
	 * @return the service type description
	 */
	public byte[] getServiceTypeDescription() {
		return serviceTypeDescription;
	}

	/**
	 * Gets the services.
	 *
	 * @return the services
	 */
	public Set<Service> getServices() {
		return services;
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
	 * Sets the service type name.
	 *
	 * @param serviceTypeName the new service type name
	 */
	public void setServiceTypeName(String serviceTypeName) {
		this.serviceTypeName = serviceTypeName;
	}

	/**
	 * Sets the service type description.
	 *
	 * @param serviceTypeDescription the new service type description
	 */
	public void setServiceTypeDescription(byte[] serviceTypeDescription) {
		this.serviceTypeDescription = serviceTypeDescription;
	}

	/**
	 * Sets the services.
	 *
	 * @param services the new services
	 */
	public void setServices(Set<Service> services) {
		this.services = services;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
    }

}
