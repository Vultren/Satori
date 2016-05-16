package com.satori.dashboard.model;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
public class Ticket {

	private static final Logger logger = LoggerFactory.getLogger(Ticket.class);
		
	private Long id;
	
	private Asset asset;

    private TicketClassificationDetail classificationDetail;

    private TicketClassification classification;

    private Set<Stat> stats;

    private TicketImpact ticketImpact;

    private TicketState ticketState;

    private TicketSubstate ticketSubstate;

    private TicketUrgency ticketUrgency;
    private String ticketSubject;
	
    private Instant callLogDate;

    private Instant callLastActionDate;

    private Instant callResolvedDate;
	
    private String ticketNumber;
	
    private String eventStatus;

	public Long getId() {
		return id;
	}

	public Asset getAsset() {
		return asset;
	}

	public TicketClassificationDetail getClassificationDetail() {
		return classificationDetail;
	}

	public TicketClassification getClassification() {
		return classification;
	}

	public Set<Stat> getStats() {
		return stats;
	}

	public TicketImpact getTicketImpact() {
		return ticketImpact;
	}

	public TicketState getTicketState() {
		return ticketState;
	}

	public TicketSubstate getTicketSubstate() {
		return ticketSubstate;
	}

	public TicketUrgency getTicketUrgency() {
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

	public String getEventStatus() {
		return eventStatus;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public void setClassificationDetail(TicketClassificationDetail classificationDetail) {
		this.classificationDetail = classificationDetail;
	}

	public void setClassification(TicketClassification classification) {
		this.classification = classification;
	}

	public void setStats(Set<Stat> stats) {
		this.stats = stats;
	}

	public void setTicketImpact(TicketImpact ticketImpact) {
		this.ticketImpact = ticketImpact;
	}

	public void setTicketState(TicketState ticketState) {
		this.ticketState = ticketState;
	}

	public void setTicketSubstate(TicketSubstate ticketSubstate) {
		this.ticketSubstate = ticketSubstate;
	}

	public void setTicketUrgency(TicketUrgency ticketUrgency) {
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

	public void setEventStatus(String eventStatus) {
		this.eventStatus = eventStatus;
	}

	public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
    }
}