/**
 * TicketClassificationRepository.java 
 *
 * Satori
 * @author Eric Walden
 * Created May 27, 2016 12:20:37 PM
 */
package com.satori.dashboard.repository;

import com.satori.dashboard.model.TicketClassification;

/**
 * The Interface TicketClassificationRepository.
 */
public interface TicketClassificationRepository extends BaseRepository<TicketClassification, Long> {

	/**
	 * Find by classification code.
	 *
	 * @param classificationCode
	 *            the classification code
	 * @return the ticket classification
	 */
	public TicketClassification findByClassificationCode(String classificationCode);
}
