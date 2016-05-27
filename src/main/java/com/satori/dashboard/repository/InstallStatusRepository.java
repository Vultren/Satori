/**
 * InstallStatusRepository.java 
 *
 * Satori
 * @author Eric Walden
 * Created May 27, 2016 12:20:43 PM
 */
package com.satori.dashboard.repository;

import com.satori.dashboard.model.InstallStatus;

/**
 * The Interface InstallStatusRepository.
 */
public interface InstallStatusRepository extends BaseRepository<InstallStatus, Long> {
	
	/**
	 * Find by install status code.
	 *
	 * @param installStatusCode
	 *            the install status code
	 * @return the install status
	 */
	public InstallStatus findByInstallStatusCode(String installStatusCode);
}
