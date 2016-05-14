package com.satori.dashboard.model;

import java.time.Instant;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
public class Asset {
	
	private static final Logger logger = LoggerFactory.getLogger(Asset.class);
	
	@Id
    private Long id;
	
    private String assetSysId;
	
    private Long em7AssetNumber;

    private String assetName;

    private String ipAddress;

    private String modelNumber;
	
    private Address address;

    private Instant createdDate;

    private Instant updatedDate;
    
    private InstallStatus installStatus;

    private Organization organization;

    private Set<Partnership> partnerships;

    private Set<ServiceAssetXref> serviceAssetXrefs;

    private SystemClassName systemClassName;

    private Set<Ticket> tickets;

	public Long getId() {
		return id;
	}

	public String getAssetSysId() {
		return assetSysId;
	}

	public Long getEm7AssetNumber() {
		return em7AssetNumber;
	}

	public String getAssetName() {
		return assetName;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public Address getAddress() {
		return address;
	}

	public Instant getCreatedDate() {
		return createdDate;
	}

	public InstallStatus getInstallStatus() {
		return installStatus;
	}

	public Organization getOrganization() {
		return organization;
	}

	public Set<Partnership> getPartnerships() {
		return partnerships;
	}

	public Set<ServiceAssetXref> getServiceAssetXrefs() {
		return serviceAssetXrefs;
	}

	public SystemClassName getSystemClassName() {
		return systemClassName;
	}

	public Set<Ticket> getTickets() {
		return tickets;
	}

	public Instant getUpdatedDate() {
		return updatedDate;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAssetSysId(String assetSysId) {
		this.assetSysId = assetSysId;
	}

	public void setEm7AssetNumber(Long em7AssetNumber) {
		this.em7AssetNumber = em7AssetNumber;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setCreatedDate(Instant createdDate) {
		this.createdDate = createdDate;
	}

	public void setInstallStatus(InstallStatus installStatus) {
		this.installStatus = installStatus;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public void setPartnerships(Set<Partnership> partnerships) {
		this.partnerships = partnerships;
	}

	public void setServiceAssetXrefs(Set<ServiceAssetXref> serviceAssetXrefs) {
		this.serviceAssetXrefs = serviceAssetXrefs;
	}

	public void setSystemClassName(SystemClassName systemClassName) {
		this.systemClassName = systemClassName;
	}

	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}

	public void setUpdatedDate(Instant updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String toString() {
	    return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
	    .setExcludeFieldNames()
	    .toString();
	}
	
}
