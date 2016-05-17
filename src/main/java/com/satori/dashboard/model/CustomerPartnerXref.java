package com.satori.dashboard.model;

import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
public class CustomerPartnerXref {

    private Long id;
    
    private Customer customer;

    private Group group;

    private Partner partner;

    private Set<Partnership> partnerships;

    public CustomerPartnerXref(){
    	this(null, null, null);
    }
    
    public CustomerPartnerXref(Customer customer, Group group){
    	this(customer, group, null);
    }
    
    public CustomerPartnerXref(Customer customer, Partner partner){
    	this(customer, null, partner);
    }
    
    private CustomerPartnerXref(Customer customer, Group group, Partner partner) {
    	this.customer = customer;
    	this.group = group;
    	this.partner = partner;
    }
    
	public Long getId() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Group getGroup() {
		return group;
	}

	public Partner getPartner() {
		return partner;
	}

	public Set<Partnership> getPartnerships() {
		return partnerships;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public void setPartner(Partner partner) {
		this.partner = partner;
	}

	public void setPartnerships(Set<Partnership> partnerships) {
		this.partnerships = partnerships;
	}

	public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
    }
}
