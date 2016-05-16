package com.satori.dashboard.model;

import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
public class InstallStatus {

	private static Logger logger = LoggerFactory.getLogger(InstallStatus.class);
	
    private Integer id;
	
    private String installStatusCode;

    private String installStatusDescription;

	private Set<Asset> assets;

	public InstallStatus() {
		this(null);
	}

	public InstallStatus(String installStatusCode) {
		this.installStatusCode = installStatusCode;
	}
	
	public Integer getId() {
		return id;
	}

	public String getInstallStatusCode() {
		return installStatusCode;
	}

	public String getInstallStatusDescription() {
		return installStatusDescription;
	}

	public Set<Asset> getAssets() {
		return assets;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setInstallStatusCode(String installStatusCode) {
		this.installStatusCode = installStatusCode;
	}

	public void setInstallStatusDescription(String installStatusDescription) {
		this.installStatusDescription = installStatusDescription;
	}

	public void setAssets(Set<Asset> assets) {
		this.assets = assets;
	}

	public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames("assets").toString();
    }
}
