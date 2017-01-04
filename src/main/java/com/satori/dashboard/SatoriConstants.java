package com.satori.dashboard;

public interface SatoriConstants {
	
	String ASSET_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	String TICKET_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	String REPORT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	Integer SERVICE_IMPACT_SCORE_MAX = 100;
	Integer SERVICE_IMPACT_SCORE_MIN = 1;
		
	public interface ReportConstants {
		// Ticket State Constants
		String REPORT_NAME = "fileName";
		String REPORT_DISPLAY_NAME = "DisplayName";
		String REPORT_TYPE = "type";
		String MIME_TYPE = "contentType";
		String CUSTOMER = "customer";
		String AUTHOR = "author";
		String DESCRIPTION= "description";
		String CREATE_DATE = "createdDate";
		String UPDATE_DATE = "updatedDate";
	}
	
	public interface Patterns {
		String PHONE = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
	}
}
