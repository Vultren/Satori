/**
 * Ticket.java 
 *
 *Satori
 * @author Eric Walden
 * Created 3:59:26 PM
 */
package com.satori.dashboard.model;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class Ticket.
 */
@Entity
public class Ticket {

	/** The Constant logger. */
	private static final Logger logger = LoggerFactory.getLogger(Ticket.class);
		
	/** The id. */
	private Long id;
	
	/** The asset. */
	private Asset asset;

    /** The classification detail. */
    private TicketClassificationDetail classificationDetail;

    /** The classification. */
    private TicketClassification classification;

    /** The stats. */
    private Set<Stat> stats;

    /** The ticket impact. */
    private TicketImpact ticketImpact;

    /** The ticket state. */
    private TicketState ticketState;

    /** The ticket substate. */
    private TicketSubstate ticketSubstate;

    /** The ticket urgency. */
    private TicketUrgency ticketUrgency;
    
    /** The ticket subject. */
    private String ticketSubject;
	
    /** The call log date. */
    private Instant callLogDate;

    /** The call last action date. */
    private Instant callLastActionDate;

    /** The call resolved date. */
    private Instant callResolvedDate;
	
    /** The ticket number. */
    private String ticketNumber;
	
    /** The event status. */
    private String eventStatus;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Gets the asset.
	 *
	 * @return the asset
	 */
	public Asset getAsset() {
		return asset;
	}

	/**
	 * Gets the classification detail.
	 *
	 * @return the classification detail
	 */
	public TicketClassificationDetail getClassificationDetail() {
		return classificationDetail;
	}

	/**
	 * Gets the classification.
	 *
	 * @return the classification
	 */
	public TicketClassification getClassification() {
		return classification;
	}

	/**
	 * Gets the stats.
	 *
	 * @return the stats
	 */
	public Set<Stat> getStats() {
		return stats;
	}

	/**
	 * Gets the ticket impact.
	 *
	 * @return the ticket impact
	 */
	public TicketImpact getTicketImpact() {
		return ticketImpact;
	}

	/**
	 * Gets the ticket state.
	 *
	 * @return the ticket state
	 */
	public TicketState getTicketState() {
		return ticketState;
	}

	/**
	 * Gets the ticket substate.
	 *
	 * @return the ticket substate
	 */
	public TicketSubstate getTicketSubstate() {
		return ticketSubstate;
	}

	/**
	 * Gets the ticket urgency.
	 *
	 * @return the ticket urgency
	 */
	public TicketUrgency getTicketUrgency() {
		return ticketUrgency;
	}

	/**
	 * Gets the ticket subject.
	 *
	 * @return the ticket subject
	 */
	public String getTicketSubject() {
		return ticketSubject;
	}

	/**
	 * Gets the call log date.
	 *
	 * @return the call log date
	 */
	public Instant getCallLogDate() {
		return callLogDate;
	}

	/**
	 * Gets the call last action date.
	 *
	 * @return the call last action date
	 */
	public Instant getCallLastActionDate() {
		return callLastActionDate;
	}

	/**
	 * Gets the call resolved date.
	 *
	 * @return the call resolved date
	 */
	public Instant getCallResolvedDate() {
		return callResolvedDate;
	}

	/**
	 * Gets the ticket number.
	 *
	 * @return the ticket number
	 */
	public String getTicketNumber() {
		return ticketNumber;
	}

	/**
	 * Gets the event status.
	 *
	 * @return the event status
	 */
	public String getEventStatus() {
		return eventStatus;
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
	 * Sets the asset.
	 *
	 * @param asset the new asset
	 */
	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	/**
	 * Sets the classification detail.
	 *
	 * @param classificationDetail the new classification detail
	 */
	public void setClassificationDetail(TicketClassificationDetail classificationDetail) {
		this.classificationDetail = classificationDetail;
	}

	/**
	 * Sets the classification.
	 *
	 * @param classification the new classification
	 */
	public void setClassification(TicketClassification classification) {
		this.classification = classification;
	}

	/**
	 * Sets the stats.
	 *
	 * @param stats the new stats
	 */
	public void setStats(Set<Stat> stats) {
		this.stats = stats;
	}

	/**
	 * Sets the ticket impact.
	 *
	 * @param ticketImpact the new ticket impact
	 */
	public void setTicketImpact(TicketImpact ticketImpact) {
		this.ticketImpact = ticketImpact;
	}

	/**
	 * Sets the ticket state.
	 *
	 * @param ticketState the new ticket state
	 */
	public void setTicketState(TicketState ticketState) {
		this.ticketState = ticketState;
	}

	/**
	 * Sets the ticket substate.
	 *
	 * @param ticketSubstate the new ticket substate
	 */
	public void setTicketSubstate(TicketSubstate ticketSubstate) {
		this.ticketSubstate = ticketSubstate;
	}

	/**
	 * Sets the ticket urgency.
	 *
	 * @param ticketUrgency the new ticket urgency
	 */
	public void setTicketUrgency(TicketUrgency ticketUrgency) {
		this.ticketUrgency = ticketUrgency;
	}

	/**
	 * Sets the ticket subject.
	 *
	 * @param ticketSubject the new ticket subject
	 */
	public void setTicketSubject(String ticketSubject) {
		this.ticketSubject = ticketSubject;
	}

	/**
	 * Sets the call log date.
	 *
	 * @param callLogDate the new call log date
	 */
	public void setCallLogDate(Instant callLogDate) {
		this.callLogDate = callLogDate;
	}

	/**
	 * Sets the call last action date.
	 *
	 * @param callLastActionDate the new call last action date
	 */
	public void setCallLastActionDate(Instant callLastActionDate) {
		this.callLastActionDate = callLastActionDate;
	}

	/**
	 * Sets the call resolved date.
	 *
	 * @param callResolvedDate the new call resolved date
	 */
	public void setCallResolvedDate(Instant callResolvedDate) {
		this.callResolvedDate = callResolvedDate;
	}

	/**
	 * Sets the ticket number.
	 *
	 * @param ticketNumber the new ticket number
	 */
	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	/**
	 * Sets the event status.
	 *
	 * @param eventStatus the new event status
	 */
	public void setEventStatus(String eventStatus) {
		this.eventStatus = eventStatus;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
    }
}