package com.satori.dashboard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.satori.dashboard.model.Asset;
import com.satori.dashboard.model.Service;

public interface ServiceRepository extends BaseRepository<Service, Long> {

	@Query("SELECT o FROM Service o, IN(o.serviceAssetXrefs) sax WHERE sax.asset =:asset")
	List<Service> findByAsset(@Param("asset") Asset asset);
	
	@Query("SELECT o FROM Service o JOIN o.subServices ss JOIN ss.subService s JOIN s.serviceAssetXrefs sax "
			+ "WHERE sax.asset =:asset")
	List<Service> findByAssetComposite(@Param("asset") Asset asset);
}
