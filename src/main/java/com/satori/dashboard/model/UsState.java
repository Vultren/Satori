/**
 * UsState.java 
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class UsState.
 */
@Entity
public class UsState {

	/** The Constant logger. */
	private static final Logger logger = LoggerFactory.getLogger(UsState.class);
	
    /** The id. */
    private Long id;

    /** The state name. */
    private String stateName;

    /** The state code. */
    private String stateCode;

    /** The addresses. */
    private Set<Address> addresses;
    
    /**
     * Instantiates a new us state.
     */
    public UsState() {
		this(null, null);
	}
	
	/**
	 * Instantiates a new us state.
	 *
	 * @param stateCode the state code
	 */
	public UsState(String stateCode) {
		this(null, stateCode);
	}
	
	/**
	 * Instantiates a new us state.
	 *
	 * @param stateName the state name
	 * @param stateCode the state code
	 */
	public UsState(String stateName,String stateCode) {
		this.stateName = stateName;
		this.stateCode = stateCode;
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
	 * Gets the state name.
	 *
	 * @return the state name
	 */
	public String getStateName() {
		return stateName;
	}

	/**
	 * Gets the state code.
	 *
	 * @return the state code
	 */
	public String getStateCode() {
		return stateCode;
	}

	/**
	 * Gets the addresses.
	 *
	 * @return the addresses
	 */
	public Set<Address> getAddresses() {
		return addresses;
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
	 * Sets the state name.
	 *
	 * @param stateName the new state name
	 */
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	/**
	 * Sets the state code.
	 *
	 * @param stateCode the new state code
	 */
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	/**
	 * Sets the addresses.
	 *
	 * @param addresses the new addresses
	 */
	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames("addresses").toString();
    }
}
