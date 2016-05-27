/**
 * CompositeServiceXrefRespository.java 
 *
 * Satori
 * @author Eric Walden
 * Created May 27, 2016 12:20:43 PM
 */
package com.satori.dashboard.repository;

import java.util.List;

import com.satori.dashboard.model.CompositeServiceXref;
import com.satori.dashboard.model.Service;

/**
 * The Interface CompositeServiceXrefRespository.
 */
public interface CompositeServiceXrefRespository extends BaseRepository<CompositeServiceXref, Long> {

	/**
	 * Find by composite service.
	 *
	 * @param compositeService
	 *            the composite service
	 * @return the list
	 */
	public List<CompositeServiceXref> findByCompositeService(Service compositeService);
	
	/**
	 * Find by composite service and subservice.
	 *
	 * @param compositeService
	 *            the composite service
	 * @param subService
	 *            the sub service
	 * @return the composite service xref
	 */
	public CompositeServiceXref findByCompositeServiceAndSubservice(Service compositeService, Service subService);
}
