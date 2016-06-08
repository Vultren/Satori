package com.satori.dashboard.model;

import java.time.Instant;
import java.util.Arrays;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Configurable
@Entity
@Table(name = "service")
@JsonIgnoreProperties({ "entityManager", "compositeServices", "subServices", "serviceAssetXrefs" })

public class Service {

	public enum Type {
		NETWORK_SERVICE("Network", ""),
		EMAIL_SERVICE("Email", ""),
		STORAGE_SERVICE("Storage", ""),
		SECURITY_SERVICE("Security", ""),
		VOICE_SERVICE("Voice", ""),
		UNKNOWN_SERVICE("Unknown", ""),
		CUSTOM_SERVICE("Custom", ""),
		COMPOSITE_SERVICE("Composite", "");

		private String displayName;
		private String description;

		private Type(String displayName, String description) {
			this.displayName = displayName;
			this.description = description;
		}

		public static Type toEnum(String value) {
			return Arrays.asList(Type.values()).stream().filter(type -> type.displayName().equalsIgnoreCase(value))
					.findFirst().orElse(null);
		}

		public String displayName() {
			return displayName;
		}

		public String description() {
			return description;
		}

	}
	
	private static Logger logger = LoggerFactory.getLogger(Service.class);

	private Long id;

	private String serviceName;

	private String displayServiceName;

	private String serviceDescription;

	private Instant createdDate;

	private Instant updatedDate;

	private Type serviceType;

	private Organization organization;

	private Group group;

	private Set<ServiceAssetXref> serviceAssetXrefs;

	private Set<CompositeServiceXref> subServices;

	private Set<CompositeServiceXref> compositeServices;

	public Service() {
		this(null, null);
	}

	public Service(Organization organization) {
		this(organization, Type.UNKNOWN_SERVICE);

	}

	public Service(Organization organization, Type serviceType) {
		this.serviceName = String.format("%s %s", organization.getOrganizationName(), serviceType.displayName());
		this.displayServiceName = serviceType.displayName();
		this.serviceDescription = serviceType.description();
		this.createdDate = Instant.now();
		this.updatedDate = Instant.now();
		this.serviceType = serviceType;
		this.organization = organization;
		this.group = new Group();
	}

	public Long getId() {
		return id;
	}

	public String getServiceName() {
		return serviceName;
	}

	public String getDisplayServiceName() {
		return displayServiceName;
	}

	public String getServiceDescription() {
		return serviceDescription;
	}

	public Instant getCreatedDate() {
		return createdDate;
	}

	public Instant getUpdatedDate() {
		return updatedDate;
	}

	public Type getServiceType() {
		return serviceType;
	}

	public Organization getOrganization() {
		return organization;
	}

	public Group getGroup() {
		return group;
	}

	public Set<ServiceAssetXref> getServiceAssetXrefs() {
		return serviceAssetXrefs;
	}

	public Set<CompositeServiceXref> getSubServices() {
		return subServices;
	}

	public Set<CompositeServiceXref> getCompositeServices() {
		return compositeServices;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public void setDisplayServiceName(String displayServiceName) {
		this.displayServiceName = displayServiceName;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public void setCreatedDate(Instant createdDate) {
		this.createdDate = createdDate;
	}

	public void setUpdatedDate(Instant updatedDate) {
		this.updatedDate = updatedDate;
	}

	public void setServiceType(Type serviceType) {
		this.serviceType = serviceType;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public void setServiceAssetXrefs(Set<ServiceAssetXref> serviceAssetXrefs) {
		this.serviceAssetXrefs = serviceAssetXrefs;
	}

	public void setSubServices(Set<CompositeServiceXref> subServices) {
		this.subServices = subServices;
	}

	public void setCompositeServices(Set<CompositeServiceXref> compositeServices) {
		this.compositeServices = compositeServices;
	}

	public String toString() {
		return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
	}

}
