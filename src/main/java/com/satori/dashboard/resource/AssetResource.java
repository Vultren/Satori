package com.satori.dashboard.resource;

import org.springframework.hateoas.ResourceSupport;

import com.satori.dashboard.model.Asset;

public class AssetResource extends ResourceSupport {

	private Asset asset;
	
	public AssetResource() {
		this(null);
	}

	public AssetResource(Asset asset) {
		this.asset = asset;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

}
