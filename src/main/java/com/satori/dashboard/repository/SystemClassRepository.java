/**
 * SystemClassRepository.java 
 *
 * Satori
 * @author Eric Walden
 * Created May 27, 2016 12:20:43 PM
 */
package com.satori.dashboard.repository;

import com.satori.dashboard.model.SystemClassName;

/**
 * The Interface SystemClassRepository.
 */
public interface SystemClassRepository extends BaseRepository<SystemClassName, Long> {

	/**
	 * Find by class name.
	 *
	 * @param className
	 *            the class name
	 * @return the system class name
	 */
	public SystemClassName findByClassName(String className);
}
