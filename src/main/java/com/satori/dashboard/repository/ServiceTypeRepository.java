/**
 * ServiceTypeRepository.java 
 *
 * Satori
 * @author Eric Walden
 * Created May 27, 2016 12:20:42 PM
 */
package com.satori.dashboard.repository;

import com.satori.dashboard.model.ServiceType;

/**
 * The Interface ServiceTypeRepository.
 */
public interface ServiceTypeRepository extends BaseRepository<ServiceType, Long> {

	/**
	 * Find by service type name.
	 *
	 * @param serviceTypeName
	 *            the service type name
	 * @return the service type
	 */
	public ServiceType findByServiceTypeName(String serviceTypeName);
}
