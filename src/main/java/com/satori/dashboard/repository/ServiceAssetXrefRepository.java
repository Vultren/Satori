/**
 * ServiceAssetXrefRepository.java 
 *
 * Satori
 * @author Eric Walden
 * Created May 27, 2016 12:20:36 PM
 */
package com.satori.dashboard.repository;

import java.util.List;

import com.satori.dashboard.model.Asset;
import com.satori.dashboard.model.Service;
import com.satori.dashboard.model.ServiceAssetXref;

/**
 * The Interface ServiceAssetXrefRepository.
 */
public interface ServiceAssetXrefRepository extends BaseRepository<ServiceAssetXref, Long> {

	/**
	 * Find by asset.
	 *
	 * @param asset
	 *            the asset
	 * @return the list
	 */
	List<ServiceAssetXref> findByAsset(Asset asset);
	
	/**
	 * Find by service.
	 *
	 * @param service
	 *            the service
	 * @return the list
	 */
	List<ServiceAssetXref> findByService(Service service);

	/**
	 * Find by asset and service.
	 *
	 * @param asset
	 *            the asset
	 * @param service
	 *            the service
	 * @return the service asset xref
	 */
	ServiceAssetXref findByAssetAndService(Asset asset, Service service);
}
