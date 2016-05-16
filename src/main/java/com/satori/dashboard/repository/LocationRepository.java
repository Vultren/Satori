package com.satori.dashboard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.satori.dashboard.model.Address;
import com.satori.dashboard.model.Location;
import com.satori.dashboard.model.Service;

public interface LocationRepository extends BaseRepository<Location, Long> {

	@Query()
	public List<Address> findByService(Service service);
	
	@Query()
	public List<Address> findByCompositeService(Service service);
}
