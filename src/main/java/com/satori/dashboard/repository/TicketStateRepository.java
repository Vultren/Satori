/**
 * TicketStateRepository.java 
 *
 * Satori
 * @author Eric Walden
 * Created May 27, 2016 12:20:43 PM
 */
package com.satori.dashboard.repository;

import com.satori.dashboard.model.TicketState;

/**
 * The Interface TicketStateRepository.
 */
public interface TicketStateRepository extends BaseRepository<TicketState, Long> {

	/**
	 * Find by state code.
	 *
	 * @param stateCode
	 *            the state code
	 * @return the ticket state
	 */
	public TicketState findByStateCode(String stateCode);
}
