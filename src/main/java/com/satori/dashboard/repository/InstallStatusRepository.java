package com.satori.dashboard.repository;

import com.satori.dashboard.model.InstallStatus;

public interface InstallStatusRepository extends BaseRepository<InstallStatus, Long> {
	
	public InstallStatus findByInstallStatusCode(String installStatusCode);
}
