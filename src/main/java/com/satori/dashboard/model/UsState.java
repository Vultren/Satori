package com.satori.dashboard.model;

import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
public class UsState {

	private static final Logger logger = LoggerFactory.getLogger(UsState.class);
	
    private Long id;

    private String stateName;

    private String stateCode;

    private Set<Address> addresses;
    
    public UsState() {
		this(null, null);
	}
	
	public UsState(String stateCode) {
		this(null, stateCode);
	}
	
	public UsState(String stateName,String stateCode) {
		this.stateName = stateName;
		this.stateCode = stateCode;
	}
	
	public Long getId() {
		return id;
	}

	public String getStateName() {
		return stateName;
	}

	public String getStateCode() {
		return stateCode;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames("addresses").toString();
    }
}
