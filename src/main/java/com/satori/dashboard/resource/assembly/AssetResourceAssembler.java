package com.satori.dashboard.resource.assembly;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.satori.dashboard.model.Asset;
import com.satori.dashboard.resource.AssetResource;

public class AssetResourceAssembler extends ResourceAssemblerSupport<Asset, AssetResource> {

	public AssetResourceAssembler() {
		super(Asset.class, AssetResource.class);
	}

	@Override
	public AssetResource toResource(Asset asset) {
		AssetResource resource = instantiateResource(asset);
		return resource;
	}
	
	@Override
	protected AssetResource instantiateResource(Asset asset) {
		return new AssetResource(asset);
		
	}

}
