package com.satori.dashboard.repository;

import java.util.List;

import com.satori.dashboard.model.CompositeServiceXref;
import com.satori.dashboard.model.Service;

public interface CompositeServiceXrefRespository extends BaseRepository<CompositeServiceXref, Long> {

	public List<CompositeServiceXref> findByCompositeService(Service compositeService);
	
	public CompositeServiceXref findByCompositeServiceAndSubservice(Service compositeService, Service subService);
}
