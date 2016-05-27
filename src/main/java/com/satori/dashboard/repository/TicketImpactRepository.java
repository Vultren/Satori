/**
 * TicketImpactRepository.java 
 *
 * Satori
 * @author Eric Walden
 * Created May 27, 2016 12:20:41 PM
 */
package com.satori.dashboard.repository;

import com.satori.dashboard.model.TicketImpact;

/**
 * The Interface TicketImpactRepository.
 */
public interface TicketImpactRepository extends BaseRepository<TicketImpact, Long> {

	/**
	 * Find by impact code.
	 *
	 * @param impactCode
	 *            the impact code
	 * @return the ticket impact
	 */
	public TicketImpact findByImpactCode(String impactCode);
}
