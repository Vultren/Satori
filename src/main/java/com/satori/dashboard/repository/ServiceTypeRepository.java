package com.satori.dashboard.repository;

import com.satori.dashboard.model.ServiceType;

public interface ServiceTypeRepository extends BaseRepository<ServiceType, Long> {

	public ServiceType findByServiceTypeName(String serviceTypeName);
}
