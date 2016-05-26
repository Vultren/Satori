/**
 * ServiceAssetXref.java 
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
 * The Class ServiceAssetXref.
 */
@Entity
public class ServiceAssetXref {

	/** The id. */
	private Long id;
	
	/** The asset. */
	private Asset asset;

    /** The service. */
    private Service service;

    /** The service weight. */
    private Integer serviceWeight;
	
	/** The is active. */
	private boolean isActive; 
	
    /** The stats. */
    private Set<Stat> stats;

    /**
     * Instantiates a new service asset xref.
     */
    public ServiceAssetXref(){
    	this(null, null, 0, false);
    }
    
    /**
     * Instantiates a new service asset xref.
     *
     * @param asset the asset
     * @param service the service
     */
    public ServiceAssetXref(Asset asset, Service service){
    	this(asset, service, 0, false);
    }
    
    /**
     * Instantiates a new service asset xref.
     *
     * @param asset the asset
     * @param service the service
     * @param serviceWeight the service weight
     */
    public ServiceAssetXref(Asset asset, Service service, Integer serviceWeight){
    	this(asset,service, serviceWeight, false);
    }
    
    /**
     * Instantiates a new service asset xref.
     *
     * @param asset the asset
     * @param service the service
     * @param serviceWeight the service weight
     * @param isActive the is active
     */
    public ServiceAssetXref(Asset asset, Service service, Integer serviceWeight, boolean isActive){
    	this.asset = asset;
    	this.service = service;
    	this.serviceWeight = serviceWeight;
    	this.isActive = isActive;
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
	 * Gets the asset.
	 *
	 * @return the asset
	 */
	public Asset getAsset() {
		return asset;
	}

	/**
	 * Gets the service.
	 *
	 * @return the service
	 */
	public Service getService() {
		return service;
	}

	/**
	 * Gets the service weight.
	 *
	 * @return the service weight
	 */
	public Integer getServiceWeight() {
		return serviceWeight;
	}

	/**
	 * Checks if is active.
	 *
	 * @return true, if is active
	 */
	public boolean isActive() {
		return isActive;
	}

	/**
	 * Gets the stats.
	 *
	 * @return the stats
	 */
	public Set<Stat> getStats() {
		return stats;
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
	 * Sets the asset.
	 *
	 * @param asset the new asset
	 */
	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	/**
	 * Sets the service.
	 *
	 * @param service the new service
	 */
	public void setService(Service service) {
		this.service = service;
	}

	/**
	 * Sets the service weight.
	 *
	 * @param serviceWeight the new service weight
	 */
	public void setServiceWeight(Integer serviceWeight) {
		this.serviceWeight = serviceWeight;
	}

	/**
	 * Sets the active.
	 *
	 * @param isActive the new active
	 */
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * Sets the stats.
	 *
	 * @param stats the new stats
	 */
	public void setStats(Set<Stat> stats) {
		this.stats = stats;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
    }
}
