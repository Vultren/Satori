/**
 * Asset.java 
 *
 *Satori
 * @author Eric Walden
 * Created 3:59:25 PM
 */
package com.satori.dashboard.model;

import java.time.Instant;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class Asset.
 */
@Entity
public class Asset {
	
	/** The Constant logger. */
	private static final Logger logger = LoggerFactory.getLogger(Asset.class);
	
	/** The id. */
	@Id
    private Long id;
	
    /** The asset sys id. */
    private String assetSysId;
	
    /** The em7 asset number. */
    private Long em7AssetNumber;

    /** The asset name. */
    private String assetName;

    /** The ip address. */
    private String ipAddress;

    /** The model number. */
    private String modelNumber;
	
    /** The address. */
    private Address address;

    /** The created date. */
    private Instant createdDate;

    /** The updated date. */
    private Instant updatedDate;
    
    /** The install status. */
    private InstallStatus installStatus;

    /** The organization. */
    private Organization organization;

    /** The partnerships. */
    private Set<Partnership> partnerships;

    /** The service asset xrefs. */
    private Set<ServiceAssetXref> serviceAssetXrefs;

    /** The system class name. */
    private SystemClassName systemClassName;

    /** The tickets. */
    private Set<Ticket> tickets;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Gets the asset sys id.
	 *
	 * @return the asset sys id
	 */
	public String getAssetSysId() {
		return assetSysId;
	}

	/**
	 * Gets the em7 asset number.
	 *
	 * @return the em7 asset number
	 */
	public Long getEm7AssetNumber() {
		return em7AssetNumber;
	}

	/**
	 * Gets the asset name.
	 *
	 * @return the asset name
	 */
	public String getAssetName() {
		return assetName;
	}

	/**
	 * Gets the ip address.
	 *
	 * @return the ip address
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * Gets the model number.
	 *
	 * @return the model number
	 */
	public String getModelNumber() {
		return modelNumber;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public Address getAddress() {
		return address;
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
	 * Gets the install status.
	 *
	 * @return the install status
	 */
	public InstallStatus getInstallStatus() {
		return installStatus;
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
	 * Gets the partnerships.
	 *
	 * @return the partnerships
	 */
	public Set<Partnership> getPartnerships() {
		return partnerships;
	}

	/**
	 * Gets the service asset xrefs.
	 *
	 * @return the service asset xrefs
	 */
	public Set<ServiceAssetXref> getServiceAssetXrefs() {
		return serviceAssetXrefs;
	}

	/**
	 * Gets the system class name.
	 *
	 * @return the system class name
	 */
	public SystemClassName getSystemClassName() {
		return systemClassName;
	}

	/**
	 * Gets the tickets.
	 *
	 * @return the tickets
	 */
	public Set<Ticket> getTickets() {
		return tickets;
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
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Sets the asset sys id.
	 *
	 * @param assetSysId the new asset sys id
	 */
	public void setAssetSysId(String assetSysId) {
		this.assetSysId = assetSysId;
	}

	/**
	 * Sets the em7 asset number.
	 *
	 * @param em7AssetNumber the new em7 asset number
	 */
	public void setEm7AssetNumber(Long em7AssetNumber) {
		this.em7AssetNumber = em7AssetNumber;
	}

	/**
	 * Sets the asset name.
	 *
	 * @param assetName the new asset name
	 */
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	/**
	 * Sets the ip address.
	 *
	 * @param ipAddress the new ip address
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/**
	 * Sets the model number.
	 *
	 * @param modelNumber the new model number
	 */
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * Sets the created date.
	 *
	 * @param createdDate the new created date
	 */
	public void setCreatedDate(Instant createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * Sets the install status.
	 *
	 * @param installStatus the new install status
	 */
	public void setInstallStatus(InstallStatus installStatus) {
		this.installStatus = installStatus;
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
	 * Sets the partnerships.
	 *
	 * @param partnerships the new partnerships
	 */
	public void setPartnerships(Set<Partnership> partnerships) {
		this.partnerships = partnerships;
	}

	/**
	 * Sets the service asset xrefs.
	 *
	 * @param serviceAssetXrefs the new service asset xrefs
	 */
	public void setServiceAssetXrefs(Set<ServiceAssetXref> serviceAssetXrefs) {
		this.serviceAssetXrefs = serviceAssetXrefs;
	}

	/**
	 * Sets the system class name.
	 *
	 * @param systemClassName the new system class name
	 */
	public void setSystemClassName(SystemClassName systemClassName) {
		this.systemClassName = systemClassName;
	}

	/**
	 * Sets the tickets.
	 *
	 * @param tickets the new tickets
	 */
	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}

	/**
	 * Sets the updated date.
	 *
	 * @param updatedDate the new updated date
	 */
	public void setUpdatedDate(Instant updatedDate) {
		this.updatedDate = updatedDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
	    return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
	    .setExcludeFieldNames()
	    .toString();
	}
	
}
