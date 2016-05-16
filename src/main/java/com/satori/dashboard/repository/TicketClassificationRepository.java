package com.satori.dashboard.repository;

import com.satori.dashboard.model.TicketClassification;

public interface TicketClassificationRepository extends BaseRepository<TicketClassification, Long> {

	public TicketClassification findByClassificationCode(String classificationCode);
}
