/**
 * CompositeServiceXref.java 
 *
 *Satori
 * @author Eric Walden
 * Created 3:59:26 PM
 */
package com.satori.dashboard.model;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class CompositeServiceXref.
 */
@Entity
public class CompositeServiceXref {

	/** The Constant logger. */
	private static final Logger logger = LoggerFactory.getLogger(CompositeServiceXref.class);
	
	/** The id. */
	private Long id;
    
	/** The composite service. */
	private Service compositeService;

    /** The sub service. */
    private Service subService;

    /** The service weight. */
    private Integer serviceWeight;

    /**
     * Instantiates a new composite service xref.
     */
    public CompositeServiceXref() {
    	this(null, null, 0);
    }
    
    /**
     * Instantiates a new composite service xref.
     *
     * @param compositeSerivce the composite serivce
     * @param subSerivce the sub serivce
     */
    public CompositeServiceXref(Service compositeSerivce, Service subSerivce) {
    	this(compositeSerivce, subSerivce, 0);
    }

    /**
     * Instantiates a new composite service xref.
     *
     * @param compositeSerivce the composite serivce
     * @param subSerivce the sub serivce
     * @param serviceWeight the service weight
     */
    public CompositeServiceXref(Service compositeSerivce, Service subSerivce, Integer serviceWeight) {
    	this.compositeService = compositeSerivce;
    	this.subService = subSerivce;
    	this.serviceWeight = serviceWeight;
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
	 * Gets the composite service.
	 *
	 * @return the composite service
	 */
	public Service getCompositeService() {
		return compositeService;
	}

	/**
	 * Gets the sub service.
	 *
	 * @return the sub service
	 */
	public Service getSubService() {
		return subService;
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
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Sets the composite service.
	 *
	 * @param compositeService the new composite service
	 */
	public void setCompositeService(Service compositeService) {
		this.compositeService = compositeService;
	}

	/**
	 * Sets the sub service.
	 *
	 * @param subService the new sub service
	 */
	public void setSubService(Service subService) {
		this.subService = subService;
	}

	/**
	 * Sets the service weight.
	 *
	 * @param serviceWeight the new service weight
	 */
	public void setServiceWeight(Integer serviceWeight) {
		this.serviceWeight = serviceWeight;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
    }
}
