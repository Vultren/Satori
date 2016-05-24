package com.satori.dashboard.model.reporting;

import java.time.Instant;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.satori.dashboard.model.Customer;


@Entity
public class Report{

	private static final Logger logger = LoggerFactory.getLogger(Report.class);
	
	private Long id;
	
	private String reportName;
	
	private String reportDisplayName;
	
	private ReportType reportType;
	
	private ContentType contentType;
	
    private Instant createdDate;

    private Instant updatedDate;
	
	private Customer customer;
	
	private String description;
	
	private String author;

	public Long getId() {
		return id;
	}

	public String getReportName() {
		return reportName;
	}

	public String getReportDisplayName() {
		return reportDisplayName;
	}

	public ReportType getReportType() {
		return reportType;
	}

	public ContentType getContentType() {
		return contentType;
	}

	public Instant getCreatedDate() {
		return createdDate;
	}

	public Instant getUpdatedDate() {
		return updatedDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public String getDescription() {
		return description;
	}

	public String getAuthor() {
		return author;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public void setReportDisplayName(String reportDisplayName) {
		this.reportDisplayName = reportDisplayName;
	}

	public void setReportType(ReportType reportType) {
		this.reportType = reportType;
	}

	public void setContentType(ContentType contentType) {
		this.contentType = contentType;
	}

	public void setCreatedDate(Instant createdDate) {
		this.createdDate = createdDate;
	}

	public void setUpdatedDate(Instant updatedDate) {
		this.updatedDate = updatedDate;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames("description", "contentType", "customer").toString();
    }
}
