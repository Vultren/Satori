package com.satori.dashboard.repository;

import java.util.List;

import com.satori.dashboard.model.reporting.ContentType;

public interface ContentTypeRepository extends BaseRepository<ContentType, Long> {

	public List<ContentType> findByContentTypeCode(String contentTypeCode);
	
	public ContentType findByExtensionCode(String extensionCode);
}
