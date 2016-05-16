package com.satori.dashboard.repository;

import com.satori.dashboard.model.TicketClassificationDetail;

public interface TicketClassificationDetailRepository extends BaseRepository<TicketClassificationDetail, Long> {

	public TicketClassificationDetail findByClassificationDetailCode(String classificationDetailCode);
}
