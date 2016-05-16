package com.satori.dashboard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.satori.dashboard.model.Asset;
import com.satori.dashboard.model.Location;
import com.satori.dashboard.model.Service;
import com.satori.dashboard.model.Ticket;

public interface TicketRepository {

	public Ticket findByTicketNumber(String ticketNumber);
	
	public List<Ticket> findByAsset(Asset asset);
	
	@Query("SELECT o FROM Ticket o, IN(o.asset.serviceAssetXrefs) sax WHERE sax.service = :service")
	public List<Ticket> findByService(Service service);
	
	@Query("SELECT o FROM Ticket o, IN(o.asset.address) ad, IN(o.asset.serviceAssetXrefs) sax WHERE sax.service = :service AND ad.location = :location")
	public List<Ticket> findByServiceAndLocation(Service service, Location location);
}
