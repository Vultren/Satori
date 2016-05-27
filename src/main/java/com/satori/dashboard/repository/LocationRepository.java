/**
 * LocationRepository.java 
 *
 * Satori
 * @author Eric Walden
 * Created May 27, 2016 12:20:38 PM
 */
package com.satori.dashboard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.satori.dashboard.model.Address;
import com.satori.dashboard.model.Location;
import com.satori.dashboard.model.Service;

/**
 * The Interface LocationRepository.
 */
public interface LocationRepository extends BaseRepository<Location, Long> {

	/**
	 * Find by service.
	 *
	 * @param service
	 *            the service
	 * @return the list
	 */
	@Query()
	public List<Address> findByService(Service service);
	
	/**
	 * Find by composite service.
	 *
	 * @param service
	 *            the service
	 * @return the list
	 */
	@Query()
	public List<Address> findByCompositeService(Service service);
}
