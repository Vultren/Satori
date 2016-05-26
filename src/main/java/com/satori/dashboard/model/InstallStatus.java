/**
 * InstallStatus.java 
 *
 *Satori
 * @author Eric Walden
 * Created 3:59:26 PM
 */
package com.satori.dashboard.model;

import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class InstallStatus.
 */
@Entity
public class InstallStatus {

	/** The logger. */
	private static Logger logger = LoggerFactory.getLogger(InstallStatus.class);
	
    /** The id. */
    private Integer id;
	
    /** The install status code. */
    private String installStatusCode;

    /** The install status description. */
    private String installStatusDescription;

	/** The assets. */
	private Set<Asset> assets;

	/**
	 * Instantiates a new install status.
	 */
	public InstallStatus() {
		this(null);
	}

	/**
	 * Instantiates a new install status.
	 *
	 * @param installStatusCode the install status code
	 */
	public InstallStatus(String installStatusCode) {
		this.installStatusCode = installStatusCode;
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Gets the install status code.
	 *
	 * @return the install status code
	 */
	public String getInstallStatusCode() {
		return installStatusCode;
	}

	/**
	 * Gets the install status description.
	 *
	 * @return the install status description
	 */
	public String getInstallStatusDescription() {
		return installStatusDescription;
	}

	/**
	 * Gets the assets.
	 *
	 * @return the assets
	 */
	public Set<Asset> getAssets() {
		return assets;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Sets the install status code.
	 *
	 * @param installStatusCode the new install status code
	 */
	public void setInstallStatusCode(String installStatusCode) {
		this.installStatusCode = installStatusCode;
	}

	/**
	 * Sets the install status description.
	 *
	 * @param installStatusDescription the new install status description
	 */
	public void setInstallStatusDescription(String installStatusDescription) {
		this.installStatusDescription = installStatusDescription;
	}

	/**
	 * Sets the assets.
	 *
	 * @param assets the new assets
	 */
	public void setAssets(Set<Asset> assets) {
		this.assets = assets;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames("assets").toString();
    }
}
