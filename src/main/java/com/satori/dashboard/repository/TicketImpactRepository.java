package com.satori.dashboard.repository;

import com.satori.dashboard.model.TicketImpact;

public interface TicketImpactRepository extends BaseRepository<TicketImpact, Long> {

	public TicketImpact findByImpactCode(String impactCode);
}
