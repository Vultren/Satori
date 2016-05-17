package com.satori.dashboard.model;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
public class Partnership {

	private Long id;

	private Asset asset;

	private CustomerPartnerXref customerPartnerXref;

	public Partnership(){
		this(null);
	}
	
	public Partnership(Asset asset){
		this.asset = asset;
	}
	
	public Long getId() {
		return id;
	}

	public Asset getAsset() {
		return asset;
	}

	public CustomerPartnerXref getCustomerPartnerXref() {
		return customerPartnerXref;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public void setCustomerPartnerXref(CustomerPartnerXref customerPartnerXref) {
		this.customerPartnerXref = customerPartnerXref;
	}

	public String toString() {
		return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
	}
}
