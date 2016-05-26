/**
 * CustomerPartnerXref.java 
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
 * The Class CustomerPartnerXref.
 */
@Entity
public class CustomerPartnerXref {

    /** The id. */
    private Long id;
    
    /** The customer. */
    private Customer customer;

    /** The group. */
    private Group group;

    /** The partner. */
    private Partner partner;

    /** The partnerships. */
    private Set<Partnership> partnerships;

    /**
     * Instantiates a new customer partner xref.
     */
    public CustomerPartnerXref(){
    	this(null, null, null);
    }
    
    /**
     * Instantiates a new customer partner xref.
     *
     * @param customer the customer
     * @param group the group
     */
    public CustomerPartnerXref(Customer customer, Group group){
    	this(customer, group, null);
    }
    
    /**
     * Instantiates a new customer partner xref.
     *
     * @param customer the customer
     * @param partner the partner
     */
    public CustomerPartnerXref(Customer customer, Partner partner){
    	this(customer, null, partner);
    }
    
    /**
     * Instantiates a new customer partner xref.
     *
     * @param customer the customer
     * @param group the group
     * @param partner the partner
     */
    private CustomerPartnerXref(Customer customer, Group group, Partner partner) {
    	this.customer = customer;
    	this.group = group;
    	this.partner = partner;
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
	 * Gets the customer.
	 *
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
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
	 * Gets the partner.
	 *
	 * @return the partner
	 */
	public Partner getPartner() {
		return partner;
	}

	/**
	 * Gets the partnerships.
	 *
	 * @return the partnerships
	 */
	public Set<Partnership> getPartnerships() {
		return partnerships;
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
	 * Sets the customer.
	 *
	 * @param customer the new customer
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
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
	 * Sets the partner.
	 *
	 * @param partner the new partner
	 */
	public void setPartner(Partner partner) {
		this.partner = partner;
	}

	/**
	 * Sets the partnerships.
	 *
	 * @param partnerships the new partnerships
	 */
	public void setPartnerships(Set<Partnership> partnerships) {
		this.partnerships = partnerships;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
    }
}
