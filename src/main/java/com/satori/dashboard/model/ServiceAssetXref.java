package com.satori.dashboard.model;

import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
public class ServiceAssetXref {

	private Long id;
	
	private Asset asset;

    private Service service;

    private Integer serviceWeight;
	
	private boolean isActive; 
	
    private Set<Stat> stats;

    public ServiceAssetXref(){
    	this(null, null, 0, false);
    }
    
    public ServiceAssetXref(Asset asset, Service service){
    	this(asset, service, 0, false);
    }
    
    public ServiceAssetXref(Asset asset, Service service, Integer serviceWeight){
    	this(asset,service, serviceWeight, false);
    }
    
    public ServiceAssetXref(Asset asset, Service service, Integer serviceWeight, boolean isActive){
    	this.asset = asset;
    	this.service = service;
    	this.serviceWeight = serviceWeight;
    	this.isActive = isActive;
    }
    
	public Long getId() {
		return id;
	}

	public Asset getAsset() {
		return asset;
	}

	public Service getService() {
		return service;
	}

	public Integer getServiceWeight() {
		return serviceWeight;
	}

	public boolean isActive() {
		return isActive;
	}

	public Set<Stat> getStats() {
		return stats;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public void setServiceWeight(Integer serviceWeight) {
		this.serviceWeight = serviceWeight;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public void setStats(Set<Stat> stats) {
		this.stats = stats;
	}

	public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
    }
}
