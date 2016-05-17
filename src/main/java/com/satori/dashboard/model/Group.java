package com.satori.dashboard.model;

import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
public class Group {

    private Long id;
   
    private String groupName;

    private String groupDescription;
    
	private Organization organization;
	
	private boolean isPrimary;
	
	private Set<Service> services;
	
    private Set<ContactInfo> contactInfoes;

    private Set<CustomerPartnerXref> customerPartnerXrefs;

    private Set<GroupPersonXref> groupPersonXrefs;
	
    public Group() {
    	this("", "", null, false);
    }

    public Group(String groupName, Organization organization) {
    	this(groupName, "", organization, false);
    }

    public Group(String groupName, Organization organization, boolean isPrimary) {
    	this(groupName, "", organization, isPrimary);
    }    
    
    public Group(String groupName, String groupDescription, Organization organization) {
    	this(groupName, groupDescription, organization, false);
    }

    public Group(String groupName, String groupDescription, Organization organization, boolean isPrimary) {
    	this.groupName = groupName;	
    	this.groupDescription = groupDescription;
    	this.organization = organization;
    	this.isPrimary = isPrimary;
    }
    
	public Long getId() {
		return id;
	}

	public String getGroupName() {
		return groupName;
	}

	public String getGroupDescription() {
		return groupDescription;
	}

	public Organization getOrganization() {
		return organization;
	}

	public boolean isPrimary() {
		return isPrimary;
	}

	public Set<Service> getServices() {
		return services;
	}

	public Set<ContactInfo> getContactInfoes() {
		return contactInfoes;
	}

	public Set<CustomerPartnerXref> getCustomerPartnerXrefs() {
		return customerPartnerXrefs;
	}

	public Set<GroupPersonXref> getGroupPersonXrefs() {
		return groupPersonXrefs;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public void setPrimary(boolean isPrimary) {
		this.isPrimary = isPrimary;
	}

	public void setServices(Set<Service> services) {
		this.services = services;
	}

	public void setContactInfoes(Set<ContactInfo> contactInfoes) {
		this.contactInfoes = contactInfoes;
	}

	public void setCustomerPartnerXrefs(Set<CustomerPartnerXref> customerPartnerXrefs) {
		this.customerPartnerXrefs = customerPartnerXrefs;
	}

	public void setGroupPersonXrefs(Set<GroupPersonXref> groupPersonXrefs) {
		this.groupPersonXrefs = groupPersonXrefs;
	}

	public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
    }
}
