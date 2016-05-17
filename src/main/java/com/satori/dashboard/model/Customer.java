package com.satori.dashboard.model;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.satori.dashboard.model.reporting.Report;

@Entity
public class Customer {
	
    private Long id;
	
    private Instant createdDate;

    private Instant updatedDate;

    private boolean dashboardActive;

    private Organization organization;

    private Set<CustomerPartnerXref> customerPartnerXrefs;
	
    private Set<Report> reports;

    public Customer() {
    	
    }
    
    public Customer(Organization organization) {
    	
    }
    

    public Customer(Organization organization, boolean dashboardActive) {
    	this.organization = organization;
    	this.dashboardActive = dashboardActive;
    }
	public Long getId() {
		return id;
	}

	public Instant getCreatedDate() {
		return createdDate;
	}

	public Instant getUpdatedDate() {
		return updatedDate;
	}

	public boolean getDashboardActive() {
		return dashboardActive;
	}

	public Organization getOrganization() {
		return organization;
	}

	public Set<CustomerPartnerXref> getCustomerPartnerXrefs() {
		return customerPartnerXrefs;
	}

	public Set<Report> getReports() {
		return reports;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCreatedDate(Instant createdDate) {
		this.createdDate = createdDate;
	}

	public void setUpdatedDate(Instant updatedDate) {
		this.updatedDate = updatedDate;
	}

	public void setDashboardActive(boolean dashboardActive) {
		this.dashboardActive = dashboardActive;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public void setCustomerPartnerXrefs(Set<CustomerPartnerXref> customerPartnerXrefs) {
		this.customerPartnerXrefs = customerPartnerXrefs;
	}

	public void setReports(Set<Report> reports) {
		this.reports = reports;
	}
	
	public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
    }
}
