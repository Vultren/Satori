/**
 * AddressRepository.java 
 *
 * Satori
 * @author Eric Walden
 * Created May 26, 2016 4:32:44 PM
 */
package com.satori.dashboard.repository;

import com.satori.dashboard.model.Address;

/**
 * The Interface AddressRepository.
 */
public interface AddressRepository extends BaseRepository<Address, Long> {

	/**
	 * Find by sys id.
	 *
	 * @param sysId
	 *            the sys id
	 * @return the address
	 */
	Address findBySysId(String sysId);
}
