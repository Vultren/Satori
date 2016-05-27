/**
 * TicketClassificationDetailRepository.java 
 *
 * Satori
 * @author Eric Walden
 * Created May 27, 2016 12:20:40 PM
 */
package com.satori.dashboard.repository;

import com.satori.dashboard.model.TicketClassificationDetail;

/**
 * The Interface TicketClassificationDetailRepository.
 */
public interface TicketClassificationDetailRepository extends BaseRepository<TicketClassificationDetail, Long> {

	/**
	 * Find by classification detail code.
	 *
	 * @param classificationDetailCode
	 *            the classification detail code
	 * @return the ticket classification detail
	 */
	public TicketClassificationDetail findByClassificationDetailCode(String classificationDetailCode);
}
