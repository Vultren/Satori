package com.satori.dashboard.repository;

import com.satori.dashboard.model.Country;

public interface CountryRepository extends BaseRepository<Country, Long> {
	Country findByCountryName(String countryName);
}
