package com.satori.dashboard.model;

import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
public class Organization {

	private static final Logger logger = LoggerFactory.getLogger(Organization.class);

	private Long id;

	private String organizationName;

	private byte[] description;

	private String organizationType;

	private String organizationHomePageUrl;

	private Set<Address> addresses;

	private Set<Asset> assets;

	private Set<Customer> customers;

	private Set<Group> groups;

	private Set<Partner> partners;

	private Set<Service> services;

	public Organization() {
		this(null);
	}

	public Organization(String organizationName) {

		this.organizationName = organizationName;
	}

	public Long getId() {
		return id;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public byte[] getDescription() {
		return description;
	}

	public String getOrganizationType() {
		return organizationType;
	}

	public String getOrganizationHomePageUrl() {
		return organizationHomePageUrl;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public Set<Asset> getAssets() {
		return assets;
	}

	public Set<Customer> getCustomers() {
		return customers;
	}

	public Set<Group> getGroups() {
		return groups;
	}

	public Set<Partner> getPartners() {
		return partners;
	}

	public Set<Service> getServices() {
		return services;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public void setDescription(byte[] description) {
		this.description = description;
	}

	public void setOrganizationType(String organizationType) {
		this.organizationType = organizationType;
	}

	public void setOrganizationHomePageUrl(String organizationHomePageUrl) {
		this.organizationHomePageUrl = organizationHomePageUrl;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	public void setAssets(Set<Asset> assets) {
		this.assets = assets;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

	public void setGroups(Set<Group> groups) {
		this.groups = groups;
	}

	public void setPartners(Set<Partner> partners) {
		this.partners = partners;
	}

	public void setServices(Set<Service> services) {
		this.services = services;
	}

	public String toString() {
		return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames("addresses", "assets", "customers", "groups", "partners", "services", "stats").toString();
	}
}
