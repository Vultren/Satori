/**
 * TicketSubstateRepository.java 
 *
 * Satori
 * @author Eric Walden
 * Created May 27, 2016 12:20:41 PM
 */
package com.satori.dashboard.repository;

import com.satori.dashboard.model.TicketSubstate;

/**
 * The Interface TicketSubstateRepository.
 */
public interface TicketSubstateRepository extends BaseRepository<TicketSubstate, Long> {

	/**
	 * Find by substate code.
	 *
	 * @param substateCode
	 *            the substate code
	 * @return the ticket substate
	 */
	public TicketSubstate findBySubstateCode(String substateCode);
}
