package com.satori.dashboard.model;

import java.time.Instant;
import java.util.Arrays;
import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
public class Ticket {

	public enum Classification{
		PERFORMANCE_HIGH("Performance", "Inoperative", ""),
		PERFORMANCE_MED("Performance", "Degraded", ""),
		PERFORMANCE_LOW("Performance", "None", ""),
		AVAILABILITY_HIGH("Availability", "Down", ""),
		AVAILABILITY_MED("Availability", "Flapping/Intermittent", ""),
		AVAILABILITY_LOW("Availability", "None", ""),
		SECURITY_HIGH("Security", "Asset Compromised", ""),
		SECURITY_MED("Security", "Asset Vulnerable", ""),
		SECURITY_LOW("Security", "None", ""),
		CONFIGURATION_HIGH("Configuration", "Down-Time Required", ""),
		CONFIGURATION_MED("Configuration", "Reboot Required", ""),
		CONFIGURATION_LOW("Configuration", "None", ""),
		ENVIRONMENTAL_HIGH("Environmental", "Inoperative", ""),
		ENVIRONMENTAL_MED("Environmental", "Degraded", ""),
		ENVIRONMENTAL_LOW("Environmental", "None", ""),
		CAPACITY_HIGH("Capacity", "Capacity Reached", ""),
		CAPACITY_MED("Capacity", "Threshold Exceeded", ""),
		CAPACITY_LOW("Capacity", "None", "");

		private String displayName;
		private String detail;
		private String description;

		private Classification(String displayName, String detail, String description) {
			this.displayName = displayName;
			this.detail = detail;
			this.description = description;
		}

		public static Classification toEnum(String classification, String classificationDetail) {
			return Arrays.asList(Classification.values()).stream().filter(type -> type.displayName().equalsIgnoreCase(classification) 
					&& type.classificationDetail().equalsIgnoreCase(classificationDetail))
					.findFirst().orElse(null);
		}

		public String displayName() {
			return displayName;
		}

		public String classificationDetail() {
			return detail;
		}
		
		public String description() {
			return description;
		}

	}
	
	public enum State{
		TECH_ACTION("Tech Action Required", ""),
		IN_PROGRESS("Work in Progress", ""),
		PENDING("Pending", ""),
		RESOLVED("Resolved", ""),
		CLOSED("Closed", "");

		private String displayName;
		private String description;

		private State(String displayName, String description) {
			this.displayName = displayName;
			this.description = description;
		}

		public static State toEnum(String value) {
			return Arrays.asList(State.values()).stream().filter(type -> type.displayName().equalsIgnoreCase(value))
					.findFirst().orElse(null);
		}

		public String displayName() {
			return displayName;
		}

		public String description() {
			return description;
		}

	}
	
	public enum Substate{
		CUSTOMER_FEEDBACK("Customer Feedback", "dependent on Pending state"),
		VENDOR_FEEDBACK("Vendor Feedback ", "dependent on Pending state"),
		MAINTENANCE("Maintenance", "dependent on Pending state"),
		SUSPENSION("Suspension", "dependent on Pending state"),
		PENDING_PROBLEM("Pending Problem", "dependent on Pending state"),
		CUSTOMER_ACCPTENCE("Pending Customer Acceptance", "dependent on Resolved"),
		INTERNAL_FEEDBACK("Pending Internal Feedback", "dependent on Resolved"),
		FIRST_CALL_RESOLUTION("First Call Resolution", "dependent on Resolved"),
		DEVICE_RECOVERED("Device Recovered", "dependent on Resolved"),
		CLOSED_BY("Closed/Resolved by Requested for", "dependent on Resolved"),
		VENDOR("Vendor", "dependent on Pending state"),
		DISPATCH("Dispatch Date", "dependent on Pending state");


		private String displayName;
		private String description;

		private Substate(String displayName, String description) {
			this.displayName = displayName;
			this.description = description;
		}

		public static Substate toEnum(String value) {
			return Arrays.asList(Substate.values()).stream().filter(type -> type.displayName().equalsIgnoreCase(value))
					.findFirst().orElse(null);
		}

		public String displayName() {
			return displayName;
		}

		public String description() {
			return description;
		}

	}
	
	public enum Impact{
		INDIVIDUAL,
		DEPARTMENT,
		SINGLE_SITE,
		MULTI_SITE,
		ORGANIZATION_WIDE;
		
		public static Impact toEnum(String value) {
			return Arrays.asList(Impact.values()).stream().filter(type -> type.name().equalsIgnoreCase(value))
					.findFirst().orElse(null);
		}
	}
	
	public enum Urgency{
		CRITICAL,
		HIGH,
		MEDIUM,
		LOW;
		
		public static Urgency toEnum(String value) {
			return Arrays.asList(Urgency.values()).stream().filter(type -> type.name().equalsIgnoreCase(value))
					.findFirst().orElse(null);
		}
	}

	public enum ClearEvent {
		ACTIVE ("Not Cleared"),
		CLEARED("Cleared");
		
		private String eventName;
		
		private ClearEvent(String eventName) {
			this.eventName = eventName;
		}
		
		public static ClearEvent toEnum(String value) {
			return Arrays.asList(ClearEvent.values()).stream().filter(type -> type.eventName.equalsIgnoreCase(value))
					.findFirst().orElse(null);
		}
	}

	private static final Logger logger = LoggerFactory.getLogger(Ticket.class);

	private Long id;

	private Asset asset;

	private Classification classification;

	private Set<Stat> stats;

	private Impact ticketImpact;

	private State ticketState;

	private Substate ticketSubstate;

	private Urgency ticketUrgency;
	
	private String ticketSubject;

	private Instant callLogDate;

	private Instant callLastActionDate;

	private Instant callResolvedDate;

	private String ticketNumber;

	private ClearEvent eventStatus;

	public Long getId() {
		return id;
	}

	public Asset getAsset() {
		return asset;
	}

	public Classification getClassification() {
		return classification;
	}

	public Set<Stat> getStats() {
		return stats;
	}

	public Impact getTicketImpact() {
		return ticketImpact;
	}

	public State getTicketState() {
		return ticketState;
	}

	public Substate getTicketSubstate() {
		return ticketSubstate;
	}

	public Urgency getTicketUrgency() {
		return ticketUrgency;
	}

	public String getTicketSubject() {
		return ticketSubject;
	}

	public Instant getCallLogDate() {
		return callLogDate;
	}

	public Instant getCallLastActionDate() {
		return callLastActionDate;
	}

	public Instant getCallResolvedDate() {
		return callResolvedDate;
	}

	public String getTicketNumber() {
		return ticketNumber;
	}

	public ClearEvent getEventStatus() {
		return eventStatus;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public void setClassification(Classification classification) {
		this.classification = classification;
	}

	public void setStats(Set<Stat> stats) {
		this.stats = stats;
	}

	public void setTicketImpact(Impact ticketImpact) {
		this.ticketImpact = ticketImpact;
	}

	public void setTicketState(State ticketState) {
		this.ticketState = ticketState;
	}

	public void setTicketSubstate(Substate ticketSubstate) {
		this.ticketSubstate = ticketSubstate;
	}

	public void setTicketUrgency(Urgency ticketUrgency) {
		this.ticketUrgency = ticketUrgency;
	}

	public void setTicketSubject(String ticketSubject) {
		this.ticketSubject = ticketSubject;
	}

	public void setCallLogDate(Instant callLogDate) {
		this.callLogDate = callLogDate;
	}

	public void setCallLastActionDate(Instant callLastActionDate) {
		this.callLastActionDate = callLastActionDate;
	}

	public void setCallResolvedDate(Instant callResolvedDate) {
		this.callResolvedDate = callResolvedDate;
	}

	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public void setEventStatus(ClearEvent eventStatus) {
		this.eventStatus = eventStatus;
	}

	public String toString() {
		return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
	}
}