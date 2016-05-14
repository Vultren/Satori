package com.satori.dashboard.repository;

import com.satori.dashboard.model.Organization;

public interface OrganizationRepository extends BaseRepository<Organization, Long> {
	Organization findByOrganizationName(String oganizationName);

}
