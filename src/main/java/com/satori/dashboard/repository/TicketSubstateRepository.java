package com.satori.dashboard.repository;

import com.satori.dashboard.model.TicketSubstate;

public interface TicketSubstateRepository extends BaseRepository<TicketSubstate, Long> {

	public TicketSubstate findBySubstateCode(String substateCode);
}
