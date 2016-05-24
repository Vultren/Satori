package com.satori.dashboard.repository;

import com.satori.dashboard.model.reporting.ReportType;

public interface ReportTypeRepository extends BaseRepository<ReportType, Long> {
	public ReportType findByReportTypeCode(String reportTypeCode);
}
