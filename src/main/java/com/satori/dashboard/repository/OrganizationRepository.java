/**
 * OrganizationRepository.java 
 *
 * Satori
 * @author Eric Walden
 * Created May 27, 2016 12:20:43 PM
 */
package com.satori.dashboard.repository;

import com.satori.dashboard.model.Organization;

/**
 * The Interface OrganizationRepository.
 */
public interface OrganizationRepository extends BaseRepository<Organization, Long> {
	
	/**
	 * Find by organization name.
	 *
	 * @param oganizationName
	 *            the oganization name
	 * @return the organization
	 */
	Organization findByOrganizationName(String oganizationName);

}
