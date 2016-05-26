/**
 * Group.java 
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

/**
 * The Class Group.
 */
@Entity
public class Group {

    /** The id. */
    private Long id;
   
    /** The group name. */
    private String groupName;

    /** The group description. */
    private String groupDescription;
    
	/** The organization. */
	private Organization organization;
	
	/** The is primary. */
	private boolean isPrimary;
	
	/** The services. */
	private Set<Service> services;
	
    /** The contact infoes. */
    private Set<ContactInfo> contactInfoes;

    /** The customer partner xrefs. */
    private Set<CustomerPartnerXref> customerPartnerXrefs;

    /** The group person xrefs. */
    private Set<GroupPersonXref> groupPersonXrefs;
	
    /**
     * Instantiates a new group.
     */
    public Group() {
    	this("", "", null, false);
    }

    /**
     * Instantiates a new group.
     *
     * @param groupName the group name
     * @param organization the organization
     */
    public Group(String groupName, Organization organization) {
    	this(groupName, "", organization, false);
    }

    /**
     * Instantiates a new group.
     *
     * @param groupName the group name
     * @param organization the organization
     * @param isPrimary the is primary
     */
    public Group(String groupName, Organization organization, boolean isPrimary) {
    	this(groupName, "", organization, isPrimary);
    }    
    
    /**
     * Instantiates a new group.
     *
     * @param groupName the group name
     * @param groupDescription the group description
     * @param organization the organization
     */
    public Group(String groupName, String groupDescription, Organization organization) {
    	this(groupName, groupDescription, organization, false);
    }

    /**
     * Instantiates a new group.
     *
     * @param groupName the group name
     * @param groupDescription the group description
     * @param organization the organization
     * @param isPrimary the is primary
     */
    public Group(String groupName, String groupDescription, Organization organization, boolean isPrimary) {
    	this.groupName = groupName;	
    	this.groupDescription = groupDescription;
    	this.organization = organization;
    	this.isPrimary = isPrimary;
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
	 * Gets the group name.
	 *
	 * @return the group name
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * Gets the group description.
	 *
	 * @return the group description
	 */
	public String getGroupDescription() {
		return groupDescription;
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
	 * Checks if is primary.
	 *
	 * @return true, if is primary
	 */
	public boolean isPrimary() {
		return isPrimary;
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
	 * Gets the contact infoes.
	 *
	 * @return the contact infoes
	 */
	public Set<ContactInfo> getContactInfoes() {
		return contactInfoes;
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
	 * Gets the group person xrefs.
	 *
	 * @return the group person xrefs
	 */
	public Set<GroupPersonXref> getGroupPersonXrefs() {
		return groupPersonXrefs;
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
	 * Sets the group name.
	 *
	 * @param groupName the new group name
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	/**
	 * Sets the group description.
	 *
	 * @param groupDescription the new group description
	 */
	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
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
	 * Sets the primary.
	 *
	 * @param isPrimary the new primary
	 */
	public void setPrimary(boolean isPrimary) {
		this.isPrimary = isPrimary;
	}

	/**
	 * Sets the services.
	 *
	 * @param services the new services
	 */
	public void setServices(Set<Service> services) {
		this.services = services;
	}

	/**
	 * Sets the contact infoes.
	 *
	 * @param contactInfoes the new contact infoes
	 */
	public void setContactInfoes(Set<ContactInfo> contactInfoes) {
		this.contactInfoes = contactInfoes;
	}

	/**
	 * Sets the customer partner xrefs.
	 *
	 * @param customerPartnerXrefs the new customer partner xrefs
	 */
	public void setCustomerPartnerXrefs(Set<CustomerPartnerXref> customerPartnerXrefs) {
		this.customerPartnerXrefs = customerPartnerXrefs;
	}

	/**
	 * Sets the group person xrefs.
	 *
	 * @param groupPersonXrefs the new group person xrefs
	 */
	public void setGroupPersonXrefs(Set<GroupPersonXref> groupPersonXrefs) {
		this.groupPersonXrefs = groupPersonXrefs;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
    }
}
