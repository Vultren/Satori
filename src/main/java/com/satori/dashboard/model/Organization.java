/**
 * Organization.java 
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
 * The Class Organization.
 */
@Entity
public class Organization {

	/** The Constant logger. */
	private static final Logger logger = LoggerFactory.getLogger(Organization.class);

	/** The id. */
	private Long id;

	/** The organization name. */
	private String organizationName;

	/** The description. */
	private byte[] description;

	/** The organization type. */
	private String organizationType;

	/** The organization home page url. */
	private String organizationHomePageUrl;

	/** The addresses. */
	private Set<Address> addresses;

	/** The assets. */
	private Set<Asset> assets;

	/** The customers. */
	private Set<Customer> customers;

	/** The groups. */
	private Set<Group> groups;

	/** The partners. */
	private Set<Partner> partners;

	/** The services. */
	private Set<Service> services;

	/**
	 * Instantiates a new organization.
	 */
	public Organization() {
		this(null);
	}

	/**
	 * Instantiates a new organization.
	 *
	 * @param organizationName the organization name
	 */
	public Organization(String organizationName) {

		this.organizationName = organizationName;
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
	 * Gets the organization name.
	 *
	 * @return the organization name
	 */
	public String getOrganizationName() {
		return organizationName;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public byte[] getDescription() {
		return description;
	}

	/**
	 * Gets the organization type.
	 *
	 * @return the organization type
	 */
	public String getOrganizationType() {
		return organizationType;
	}

	/**
	 * Gets the organization home page url.
	 *
	 * @return the organization home page url
	 */
	public String getOrganizationHomePageUrl() {
		return organizationHomePageUrl;
	}

	/**
	 * Gets the addresses.
	 *
	 * @return the addresses
	 */
	public Set<Address> getAddresses() {
		return addresses;
	}

	/**
	 * Gets the assets.
	 *
	 * @return the assets
	 */
	public Set<Asset> getAssets() {
		return assets;
	}

	/**
	 * Gets the customers.
	 *
	 * @return the customers
	 */
	public Set<Customer> getCustomers() {
		return customers;
	}

	/**
	 * Gets the groups.
	 *
	 * @return the groups
	 */
	public Set<Group> getGroups() {
		return groups;
	}

	/**
	 * Gets the partners.
	 *
	 * @return the partners
	 */
	public Set<Partner> getPartners() {
		return partners;
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
	 * Sets the organization name.
	 *
	 * @param organizationName the new organization name
	 */
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(byte[] description) {
		this.description = description;
	}

	/**
	 * Sets the organization type.
	 *
	 * @param organizationType the new organization type
	 */
	public void setOrganizationType(String organizationType) {
		this.organizationType = organizationType;
	}

	/**
	 * Sets the organization home page url.
	 *
	 * @param organizationHomePageUrl the new organization home page url
	 */
	public void setOrganizationHomePageUrl(String organizationHomePageUrl) {
		this.organizationHomePageUrl = organizationHomePageUrl;
	}

	/**
	 * Sets the addresses.
	 *
	 * @param addresses the new addresses
	 */
	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	/**
	 * Sets the assets.
	 *
	 * @param assets the new assets
	 */
	public void setAssets(Set<Asset> assets) {
		this.assets = assets;
	}

	/**
	 * Sets the customers.
	 *
	 * @param customers the new customers
	 */
	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

	/**
	 * Sets the groups.
	 *
	 * @param groups the new groups
	 */
	public void setGroups(Set<Group> groups) {
		this.groups = groups;
	}

	/**
	 * Sets the partners.
	 *
	 * @param partners the new partners
	 */
	public void setPartners(Set<Partner> partners) {
		this.partners = partners;
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
		return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames("addresses", "assets", "customers", "groups", "partners", "services", "stats").toString();
	}
}
