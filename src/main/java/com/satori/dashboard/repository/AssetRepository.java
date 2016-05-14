package com.satori.dashboard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.satori.dashboard.model.Asset;
import com.satori.dashboard.model.Location;
import com.satori.dashboard.model.Organization;
import com.satori.dashboard.model.Service;

public interface AssetRepository extends BaseRepository<Asset, Long> {
	
	Asset findBySysId(String sys_id);
	
	List<Asset> findByOrganization(Organization organization);
	
	@Query("SELECT o FROM Asset o INNER JOIN o.serviceAssetXrefs sax WHERE sax.service =:service")
	List<Asset> findByService(@Param("service") Service service);
	
	@Query("SELECT o FROM Asset o INNER JOIN o.serviceAssetXrefs sax WHERE sax.service =:service AND o.address.location =:location")
	List<Asset> findByServiceAndLocation(@Param("service") Service service, @Param("location") Location location);
}
