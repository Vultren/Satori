package com.satori.dashboard.repository;

import java.util.List;

import com.satori.dashboard.model.Organization;
import com.satori.dashboard.model.reporting.Report;
import com.satori.dashboard.model.reporting.ReportType;

public interface ReportRepository extends BaseRepository<Report, Long> {
	public Report findByReportName(String reportName);
	
    public List<Report> findByReportType(ReportType type);
    
    public List<Report> findByOrganization(Organization organization);
}
