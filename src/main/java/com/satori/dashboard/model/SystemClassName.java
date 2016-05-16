package com.satori.dashboard.model;

import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
public class SystemClassName {
	
	private static final Logger logger = LoggerFactory.getLogger(SystemClassName.class);

    private Long id;

    private String className;

    private String classDescription;
    
    private Set<Asset> assets;
    
    public SystemClassName(){
    	this(null);
    }
    
    public SystemClassName(String className){
    	this.className = className;
    }
    
	public Long getId() {
		return id;
	}

	public String getClassName() {
		return className;
	}

	public String getClassDescription() {
		return classDescription;
	}

	public Set<Asset> getAssets() {
		return assets;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public void setClassDescription(String classDescription) {
		this.classDescription = classDescription;
	}

	public void setAssets(Set<Asset> assets) {
		this.assets = assets;
	}

	public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
    }
	
}
