/**
 * Partnership.java 
 *
 *Satori
 * @author Eric Walden
 * Created 3:59:26 PM
 */
package com.satori.dashboard.model;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * The Class Partnership.
 */
@Entity
public class Partnership {

	/** The id. */
	private Long id;

	/** The asset. */
	private Asset asset;

	/** The customer partner xref. */
	private CustomerPartnerXref customerPartnerXref;

	/**
	 * Instantiates a new partnership.
	 */
	public Partnership(){
		this(null);
	}
	
	/**
	 * Instantiates a new partnership.
	 *
	 * @param asset the asset
	 */
	public Partnership(Asset asset){
		this.asset = asset;
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
	 * Gets the customer partner xref.
	 *
	 * @return the customer partner xref
	 */
	public CustomerPartnerXref getCustomerPartnerXref() {
		return customerPartnerXref;
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
	 * Sets the customer partner xref.
	 *
	 * @param customerPartnerXref the new customer partner xref
	 */
	public void setCustomerPartnerXref(CustomerPartnerXref customerPartnerXref) {
		this.customerPartnerXref = customerPartnerXref;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
	}
}
