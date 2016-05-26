/**
 * Service.java 
 *
 *Satori
 * @author Eric Walden
 * Created 3:59:25 PM
 */
package com.satori.dashboard.model;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.satori.dashboard.SatoriConstants;

/**
 * The Class Service.
 */
@Configurable
@Entity
@Table(name = "service")
@JsonIgnoreProperties( {"entityManager", "compositeServices", "subServices", "serviceAssetXrefs"} )

public class Service {

	/** The logger. */
	private static Logger logger = LoggerFactory.getLogger(Service.class);

	/** The id. */
	private Long id;

	/** The service name. */
	private String serviceName;

	/** The display service name. */
	private String displayServiceName;

	/** The service description. */
	private String serviceDescription;

	/** The created date. */
	private Instant createdDate;

	/** The updated date. */
	private Instant updatedDate;

	/** The service type. */
	private ServiceType serviceType;

	/** The organization. */
	private Organization organization;

	/** The group. */
	private Group group;

	/** The service asset xrefs. */
	private Set<ServiceAssetXref> serviceAssetXrefs;

	/** The sub services. */
	private Set<CompositeServiceXref> subServices;

	/** The composite services. */
	private Set<CompositeServiceXref> compositeServices;

	/**
	 * Instantiates a new service.
	 */
	public Service() {
		this(null, null);
	}
	
	/**
	 * Instantiates a new service.
	 *
	 * @param organization the organization
	 */
	public Service(Organization organization) {
		this(organization, new ServiceType(SatoriConstants.ServiceTypeConstants.UNKNOWN_SERVICE_TYPE));
	}
	
	/**
	 * Instantiates a new service.
	 *
	 * @param organization the organization
	 * @param serviceType the service type
	 */
	public Service(Organization organization, ServiceType serviceType) {
		 this.serviceName  = String.format("%s %s", organization.getOrganizationName(), serviceType.getServiceTypeName());
		 this.displayServiceName = serviceType.getServiceTypeName();
		 this.serviceDescription = serviceName;
		 this.createdDate = Instant.now();
		 this.updatedDate = Instant.now();
		 this.serviceType = serviceType;
		 this.organization = organization;
		 this.group = new Group();
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
	 * Gets the service name.
	 *
	 * @return the service name
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * Gets the display service name.
	 *
	 * @return the display service name
	 */
	public String getDisplayServiceName() {
		return displayServiceName;
	}

	/**
	 * Gets the service description.
	 *
	 * @return the service description
	 */
	public String getServiceDescription() {
		return serviceDescription;
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
	 * Gets the updated date.
	 *
	 * @return the updated date
	 */
	public Instant getUpdatedDate() {
		return updatedDate;
	}

	/**
	 * Gets the service type.
	 *
	 * @return the service type
	 */
	public ServiceType getServiceType() {
		return serviceType;
	}

	/**
	 * Gets the organization.
	 *
	 * @return the organization
	 */
	public Organization getOrganization() {
		return organization;
	}

	/**
	 * Gets the group.
	 *
	 * @return the group
	 */
	public Group getGroup() {
		return group;
	}

	/**
	 * Gets the service asset xrefs.
	 *
	 * @return the service asset xrefs
	 */
	public Set<ServiceAssetXref> getServiceAssetXrefs() {
		return serviceAssetXrefs;
	}

	/**
	 * Gets the sub services.
	 *
	 * @return the sub services
	 */
	public Set<CompositeServiceXref> getSubServices() {
		return subServices;
	}

	/**
	 * Gets the composite services.
	 *
	 * @return the composite services
	 */
	public Set<CompositeServiceXref> getCompositeServices() {
		return compositeServices;
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
	 * Sets the service name.
	 *
	 * @param serviceName the new service name
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	/**
	 * Sets the display service name.
	 *
	 * @param displayServiceName the new display service name
	 */
	public void setDisplayServiceName(String displayServiceName) {
		this.displayServiceName = displayServiceName;
	}

	/**
	 * Sets the service description.
	 *
	 * @param serviceDescription the new service description
	 */
	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
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
	 * Sets the updated date.
	 *
	 * @param updatedDate the new updated date
	 */
	public void setUpdatedDate(Instant updatedDate) {
		this.updatedDate = updatedDate;
	}

	/**
	 * Sets the service type.
	 *
	 * @param serviceType the new service type
	 */
	public void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
	}

	/**
	 * Sets the organization.
	 *
	 * @param organization the new organization
	 */
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	/**
	 * Sets the group.
	 *
	 * @param group the new group
	 */
	public void setGroup(Group group) {
		this.group = group;
	}

	/**
	 * Sets the service asset xrefs.
	 *
	 * @param serviceAssetXrefs the new service asset xrefs
	 */
	public void setServiceAssetXrefs(Set<ServiceAssetXref> serviceAssetXrefs) {
		this.serviceAssetXrefs = serviceAssetXrefs;
	}

	/**
	 * Sets the sub services.
	 *
	 * @param subServices the new sub services
	 */
	public void setSubServices(Set<CompositeServiceXref> subServices) {
		this.subServices = subServices;
	}

	/**
	 * Sets the composite services.
	 *
	 * @param compositeServices the new composite services
	 */
	public void setCompositeServices(Set<CompositeServiceXref> compositeServices) {
		this.compositeServices = compositeServices;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
	}
}
