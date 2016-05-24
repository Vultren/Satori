package com.satori.dashboard.model.reporting;

import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Entity
public class ContentType {
	
	private static final Logger logger = LoggerFactory.getLogger(ContentType.class); 
	
	private Long id;
	
    private String contentTypeCode;
    
    private String extensionCode;
    
    private String contentTypeDescription;
    
    private Set<Report> reports;


    public ContentType() {
		this(null);
	}
	
	public ContentType(String contentTypeCode) {
		this.contentTypeCode = contentTypeCode;
	}
    
	public Long getId() {
		return id;
	}

	public String getContentTypeCode() {
		return contentTypeCode;
	}

	public String getExtensionCode() {
		return extensionCode;
	}

	public String getContentTypeDescription() {
		return contentTypeDescription;
	}

	public Set<Report> getReports() {
		return reports;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setContentTypeCode(String contentTypeCode) {
		this.contentTypeCode = contentTypeCode;
	}

	public void setExtensionCode(String extensionCode) {
		this.extensionCode = extensionCode;
	}

	public void setContentTypeDescription(String contentTypeDescription) {
		this.contentTypeDescription = contentTypeDescription;
	}

	public void setReports(Set<Report> reports) {
		this.reports = reports;
	}

	public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
    }
    
}
