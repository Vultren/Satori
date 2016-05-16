package com.satori.dashboard.repository;

import com.satori.dashboard.model.TicketUrgency;

public interface TicketUrgencyRepository extends BaseRepository<TicketUrgency, Long>{

	public TicketUrgency findTicketUrgencyByUrgencyCode(String urgencyCode);
}
