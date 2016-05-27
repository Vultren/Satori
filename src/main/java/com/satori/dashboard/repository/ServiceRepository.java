/**
 * ServiceRepository.java 
 *
 * Satori
 * @author Eric Walden
 * Created May 27, 2016 12:20:40 PM
 */
package com.satori.dashboard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.satori.dashboard.model.Asset;
import com.satori.dashboard.model.Service;

/**
 * The Interface ServiceRepository.
 */
public interface ServiceRepository extends BaseRepository<Service, Long> {

	/**
	 * Find by asset.
	 *
	 * @param asset
	 *            the asset
	 * @return the list
	 */
	@Query("SELECT o FROM Service o, IN(o.serviceAssetXrefs) sax WHERE sax.asset =:asset")
	List<Service> findByAsset(@Param("asset") Asset asset);
	
	/**
	 * Find by asset composite.
	 *
	 * @param asset
	 *            the asset
	 * @return the list
	 */
	@Query("SELECT o FROM Service o JOIN o.subServices ss JOIN ss.subService s JOIN s.serviceAssetXrefs sax "
			+ "WHERE sax.asset =:asset")
	List<Service> findByAssetComposite(@Param("asset") Asset asset);
}
