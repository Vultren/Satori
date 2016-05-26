/**
 * Customer.java 
 *
 *Satori
 * @author Eric Walden
 * Created 3:59:26 PM
 */
package com.satori.dashboard.model;

import java.time.Instant;
import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * The Class Customer.
 */
@Entity
public class Customer {

	/** The id. */
	private Long id;

	/** The created date. */
	private Instant createdDate;

	/** The updated date. */
	private Instant updatedDate;

	/** The dashboard active. */
	private boolean dashboardActive;

	/** The organization. */
	private Organization organization;

	/** The customer partner xrefs. */
	private Set<CustomerPartnerXref> customerPartnerXrefs;

	/**
	 * Instantiates a new customer.
	 */
	public Customer() {

	}

	/**
	 * Instantiates a new customer.
	 *
	 * @param organization
	 *            the organization
	 */
	public Customer(Organization organization) {

	}

	/**
	 * Instantiates a new customer.
	 *
	 * @param organization
	 *            the organization
	 * @param dashboardActive
	 *            the dashboard active
	 */
	public Customer(Organization organization, boolean dashboardActive) {
		this.organization = organization;
		this.dashboardActive = dashboardActive;
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
	 * Gets the dashboard active.
	 *
	 * @return the dashboard active
	 */
	public boolean getDashboardActive() {
		return dashboardActive;
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
	 * Gets the customer partner xrefs.
	 *
	 * @return the customer partner xrefs
	 */
	public Set<CustomerPartnerXref> getCustomerPartnerXrefs() {
		return customerPartnerXrefs;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Sets the created date.
	 *
	 * @param createdDate
	 *            the new created date
	 */
	public void setCreatedDate(Instant createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * Sets the updated date.
	 *
	 * @param updatedDate
	 *            the new updated date
	 */
	public void setUpdatedDate(Instant updatedDate) {
		this.updatedDate = updatedDate;
	}

	/**
	 * Sets the dashboard active.
	 *
	 * @param dashboardActive
	 *            the new dashboard active
	 */
	public void setDashboardActive(boolean dashboardActive) {
		this.dashboardActive = dashboardActive;
	}

	/**
	 * Sets the organization.
	 *
	 * @param organization
	 *            the new organization
	 */
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	/**
	 * Sets the customer partner xrefs.
	 *
	 * @param customerPartnerXrefs
	 *            the new customer partner xrefs
	 */
	public void setCustomerPartnerXrefs(Set<CustomerPartnerXref> customerPartnerXrefs) {
		this.customerPartnerXrefs = customerPartnerXrefs;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
	}
}
