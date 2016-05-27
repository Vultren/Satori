/**
 * AssetRepository.java 
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
import com.satori.dashboard.model.Location;
import com.satori.dashboard.model.Organization;
import com.satori.dashboard.model.Service;

/**
 * The Interface AssetRepository.
 */
public interface AssetRepository extends BaseRepository<Asset, Long> {
	
	/**
	 * Find by sys id.
	 *
	 * @param sys_id
	 *            the sys_id
	 * @return the asset
	 */
	Asset findBySysId(String sys_id);
	
	/**
	 * Find by organization.
	 *
	 * @param organization
	 *            the organization
	 * @return the list
	 */
	List<Asset> findByOrganization(Organization organization);
	
	/**
	 * Find by service.
	 *
	 * @param service
	 *            the service
	 * @return the list
	 */
	@Query("SELECT o FROM Asset o INNER JOIN o.serviceAssetXrefs sax WHERE sax.service =:service")
	List<Asset> findByService(@Param("service") Service service);
	
	/**
	 * Find by service and location.
	 *
	 * @param service
	 *            the service
	 * @param location
	 *            the location
	 * @return the list
	 */
	@Query("SELECT o FROM Asset o INNER JOIN o.serviceAssetXrefs sax WHERE sax.service =:service AND o.address.location =:location")
	List<Asset> findByServiceAndLocation(@Param("service") Service service, @Param("location") Location location);
}
