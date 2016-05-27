/**
 * UsStateRepository.java 
 *
 * Satori
 * @author Eric Walden
 * Created May 27, 2016 12:20:43 PM
 */
package com.satori.dashboard.repository;

import com.satori.dashboard.model.UsState;

/**
 * The Interface UsStateRepository.
 */
public interface UsStateRepository extends BaseRepository<UsState, Long> {

	 /**
	 * Find by state code.
	 *
	 * @param stateCode
	 *            the state code
	 * @return the us state
	 */
 	UsState findByStateCode(String stateCode);
}
