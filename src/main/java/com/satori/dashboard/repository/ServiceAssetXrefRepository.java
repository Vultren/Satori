package com.satori.dashboard.repository;

import java.util.List;

import com.satori.dashboard.model.Asset;
import com.satori.dashboard.model.Service;
import com.satori.dashboard.model.ServiceAssetXref;

public interface ServiceAssetXrefRepository extends BaseRepository<ServiceAssetXref, Long> {

	List<ServiceAssetXref> findByAsset(Asset asset);
	
	List<ServiceAssetXref> findByService(Service service);

	ServiceAssetXref findByAssetAndService(Asset asset, Service service);
}
