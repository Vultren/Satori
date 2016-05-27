/**
 * TicketRepository.java 
 *
 * Satori
 * @author Eric Walden
 * Created May 27, 2016 12:20:37 PM
 */
package com.satori.dashboard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.satori.dashboard.model.Asset;
import com.satori.dashboard.model.Location;
import com.satori.dashboard.model.Service;
import com.satori.dashboard.model.Ticket;

/**
 * The Interface TicketRepository.
 */
public interface TicketRepository {

	/**
	 * Find by ticket number.
	 *
	 * @param ticketNumber
	 *            the ticket number
	 * @return the ticket
	 */
	public Ticket findByTicketNumber(String ticketNumber);
	
	/**
	 * Find by asset.
	 *
	 * @param asset
	 *            the asset
	 * @return the list
	 */
	public List<Ticket> findByAsset(Asset asset);
	
	/**
	 * Find by service.
	 *
	 * @param service
	 *            the service
	 * @return the list
	 */
	@Query("SELECT o FROM Ticket o, IN(o.asset.serviceAssetXrefs) sax WHERE sax.service = :service")
	public List<Ticket> findByService(Service service);
	
	/**
	 * Find by service and location.
	 *
	 * @param service
	 *            the service
	 * @param location
	 *            the location
	 * @return the list
	 */
	@Query("SELECT o FROM Ticket o, IN(o.asset.address) ad, IN(o.asset.serviceAssetXrefs) sax WHERE sax.service = :service AND ad.location = :location")
	public List<Ticket> findByServiceAndLocation(Service service, Location location);
}
