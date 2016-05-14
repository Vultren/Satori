package com.satori.dashboard.repository;

import com.satori.dashboard.model.UsState;

public interface UsStateRepository extends BaseRepository<UsState, Long> {

	 UsState findByStateCode(String stateCode);
}
