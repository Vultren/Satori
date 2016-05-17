package com.satori.dashboard.model;

import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
public class Partner {

	private Long id;

	private Organization organization;

	private String partnerDescription;

	private Set<CustomerPartnerXref> customerPartnerXrefs;

	public Partner() {
		this(null, null);
	}

	public Partner(Organization organization) {
		this(organization, "");
	}

	public Partner(Organization organization, String partnerDescription) {
		this.organization = organization;
		this.partnerDescription = partnerDescription;
	}
	
	public Long getId() {
		return id;
	}

	public Organization getOrganization() {
		return organization;
	}

	public String getPartnerDescription() {
		return partnerDescription;
	}

	public Set<CustomerPartnerXref> getCustomerPartnerXrefs() {
		return customerPartnerXrefs;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public void setPartnerDescription(String partnerDescription) {
		this.partnerDescription = partnerDescription;
	}

	public void setCustomerPartnerXrefs(Set<CustomerPartnerXref> customerPartnerXrefs) {
		this.customerPartnerXrefs = customerPartnerXrefs;
	}

	public String toString() {
		return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames("customerPartnerXrefs", "organization").toString();
	}
}
