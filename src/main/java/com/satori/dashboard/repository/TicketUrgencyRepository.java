/**
 * TicketUrgencyRepository.java 
 *
 * Satori
 * @author Eric Walden
 * Created May 27, 2016 12:20:39 PM
 */
package com.satori.dashboard.repository;

import com.satori.dashboard.model.TicketUrgency;

/**
 * The Interface TicketUrgencyRepository.
 */
public interface TicketUrgencyRepository extends BaseRepository<TicketUrgency, Long>{

	/**
	 * Find ticket urgency by urgency code.
	 *
	 * @param urgencyCode
	 *            the urgency code
	 * @return the ticket urgency
	 */
	public TicketUrgency findTicketUrgencyByUrgencyCode(String urgencyCode);
}
