package com.satori.dashboard.model.reporting;

import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
public class ReportType {

	private static final Logger logger = LoggerFactory.getLogger(ReportType.class);
	
	private Long id;
	
    private String reportTypeCode;
    
    private byte[] description;
	
	private Set<Report> reports;
 
	public ReportType() {
		this(null);
	}
	
	public ReportType(String reportTypeCode) {
		this.reportTypeCode = reportTypeCode;
	}
	
	public Long getId() {
		return id;
	}

	public String getReportTypeCode() {
		return reportTypeCode;
	}

	public byte[] getDescription() {
		return description;
	}

	public Set<Report> getReports() {
		return reports;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setReportTypeCode(String reportTypeCode) {
		this.reportTypeCode = reportTypeCode;
	}

	public void setDescription(byte[] description) {
		this.description = description;
	}

	public void setReports(Set<Report> reports) {
		this.reports = reports;
	}

	public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
    }
}
