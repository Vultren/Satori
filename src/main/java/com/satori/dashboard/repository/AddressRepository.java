package com.satori.dashboard.repository;

import com.satori.dashboard.model.Address;

public interface AddressRepository extends BaseRepository<Address, Long> {
	Address findBySysId(String sysId);
}
