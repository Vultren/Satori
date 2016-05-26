/**
 * SystemClassName.java 
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
 * The Class SystemClassName.
 */
@Entity
public class SystemClassName {
	
	/** The Constant logger. */
	private static final Logger logger = LoggerFactory.getLogger(SystemClassName.class);

    /** The id. */
    private Long id;

    /** The class name. */
    private String className;

    /** The class description. */
    private String classDescription;
    
    /** The assets. */
    private Set<Asset> assets;
    
    /**
     * Instantiates a new system class name.
     */
    public SystemClassName(){
    	this(null);
    }
    
    /**
     * Instantiates a new system class name.
     *
     * @param className the class name
     */
    public SystemClassName(String className){
    	this.className = className;
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
	 * Gets the class name.
	 *
	 * @return the class name
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * Gets the class description.
	 *
	 * @return the class description
	 */
	public String getClassDescription() {
		return classDescription;
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
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Sets the class name.
	 *
	 * @param className the new class name
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * Sets the class description.
	 *
	 * @param classDescription the new class description
	 */
	public void setClassDescription(String classDescription) {
		this.classDescription = classDescription;
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
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
    }
	
}
