/**
 * CountryRepository.java 
 *
 * Satori
 * @author Eric Walden
 * Created May 27, 2016 12:20:40 PM
 */
package com.satori.dashboard.repository;

import com.satori.dashboard.model.Country;

/**
 * The Interface CountryRepository.
 */
public interface CountryRepository extends BaseRepository<Country, Long> {
	
	/**
	 * Find by country name.
	 *
	 * @param countryName
	 *            the country name
	 * @return the country
	 */
	Country findByCountryName(String countryName);
}
