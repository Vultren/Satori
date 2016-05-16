package com.satori.dashboard.repository;

import com.satori.dashboard.model.TicketState;

public interface TicketStateRepository extends BaseRepository<TicketState, Long> {

	public TicketState findByStateCode(String stateCode);
}
