package com.satori.dashboard.repository;

import com.satori.dashboard.model.SystemClassName;

public interface SystemClassRepository extends BaseRepository<SystemClassName, Long> {

	public SystemClassName findByClassName(String className);
}
