package com.satori.dashboard;

public interface SatoriConstants {
	
	String ASSET_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	String TICKET_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	String REPORT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	Integer SERVICE_IMPACT_SCORE_MAX = 100;
	Integer SERVICE_IMPACT_SCORE_MIN = 1;
	
	public interface TicketClassificationConstants {
		// Ticket Classification Constants
		 String PERFORMANCE = "Performance";
		 String AVAILABILITY = "Availability";
		 String SECURITY = "Security";
		 String CONFIGURATION = "Configuration";
		 String ENVIRONMENTAL = "Environmental";
		 String CAPACITY = "Capacity";
	}
	
	public interface ServiceTypeConstants {
		// Service Type Constants
		 String NETWORK_SERVICE_TYPE = "Network";
		 String EMAIL_SERVICE_TYPE = "Email";
		 String STORAGE_SERVICE_TYPE = "Storage";
		 String SECURITY_SERVICE_TYPE = "Security";
		 String VOICE_SERVICE_TYPE = "Voice";
		 String UNKNOWN_SERVICE_TYPE = "Unknown";
		 String CUSTOM_SERVICE_TYPE = "Custom";
		 String COMPOSITE_SERVICE_TYPE = "Composite";
	}
	
	public interface TicketStateConstants {
		// Ticket State Constants
		 String TECH_ACTION = "Tech Action Required";
		 String IN_PROGRESS = "Work in Progress";
		 String PENDING = "Pending";
		 String RESOLVED = "Resolved";
		 String CLOSED = "Closed";
	}
	
	public interface TicketEventConstants {
		// Ticket State Constants
		 String  NOT_CLEARED = "Not Cleared";
		 String CLEARED = "Cleared";
	}
	
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
}
