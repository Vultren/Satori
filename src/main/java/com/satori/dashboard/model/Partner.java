/**
 * Partner.java 
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

/**
 * The Class Partner.
 */
@Entity
public class Partner {

	/** The id. */
	private Long id;

	/** The organization. */
	private Organization organization;

	/** The partner description. */
	private String partnerDescription;

	/** The customer partner xrefs. */
	private Set<CustomerPartnerXref> customerPartnerXrefs;

	/**
	 * Instantiates a new partner.
	 */
	public Partner() {
		this(null, null);
	}

	/**
	 * Instantiates a new partner.
	 *
	 * @param organization the organization
	 */
	public Partner(Organization organization) {
		this(organization, "");
	}

	/**
	 * Instantiates a new partner.
	 *
	 * @param organization the organization
	 * @param partnerDescription the partner description
	 */
	public Partner(Organization organization, String partnerDescription) {
		this.organization = organization;
		this.partnerDescription = partnerDescription;
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
	 * Gets the organization.
	 *
	 * @return the organization
	 */
	public Organization getOrganization() {
		return organization;
	}

	/**
	 * Gets the partner description.
	 *
	 * @return the partner description
	 */
	public String getPartnerDescription() {
		return partnerDescription;
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
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
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
	 * Sets the partner description.
	 *
	 * @param partnerDescription the new partner description
	 */
	public void setPartnerDescription(String partnerDescription) {
		this.partnerDescription = partnerDescription;
	}

	/**
	 * Sets the customer partner xrefs.
	 *
	 * @param customerPartnerXrefs the new customer partner xrefs
	 */
	public void setCustomerPartnerXrefs(Set<CustomerPartnerXref> customerPartnerXrefs) {
		this.customerPartnerXrefs = customerPartnerXrefs;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames("customerPartnerXrefs", "organization").toString();
	}
}
