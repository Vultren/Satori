package com.satori.dashboard.model;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
public class CompositeServiceXref {

	private static final Logger logger = LoggerFactory.getLogger(CompositeServiceXref.class);
	
	private Long id;
    
	private Service compositeService;

    private Service subService;

    private Integer serviceWeight;

    public CompositeServiceXref() {
    	this(null, null, 0);
    }
    
    public CompositeServiceXref(Service compositeSerivce, Service subSerivce) {
    	this(compositeSerivce, subSerivce, 0);
    }

    public CompositeServiceXref(Service compositeSerivce, Service subSerivce, Integer serviceWeight) {
    	this.compositeService = compositeSerivce;
    	this.subService = subSerivce;
    	this.serviceWeight = serviceWeight;
    }
    
	public Long getId() {
		return id;
	}

	public Service getCompositeService() {
		return compositeService;
	}

	public Service getSubService() {
		return subService;
	}

	public Integer getServiceWeight() {
		return serviceWeight;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCompositeService(Service compositeService) {
		this.compositeService = compositeService;
	}

	public void setSubService(Service subService) {
		this.subService = subService;
	}

	public void setServiceWeight(Integer serviceWeight) {
		this.serviceWeight = serviceWeight;
	}

	public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
    }
}
