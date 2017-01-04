package com.satori.dashboard.model.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.satori.dashboard.model.Asset;
import com.satori.dashboard.model.Service;
import com.satori.dashboard.model.ServiceAssetXref;

public class ServiceAssetXrefValidator extends BaseValidator<ServiceAssetXref>{

	private Validator assetValidator;
	private Validator serviceValidator;
	
	
	public ServiceAssetXrefValidator(Validator assetvalidator, Validator serviceValidator) {
		checkValidator(assetvalidator, Asset.class);
		checkValidator(serviceValidator, Service.class);
		
		this.assetValidator = assetvalidator;
		this.serviceValidator = serviceValidator;
	}
	@Override
	public boolean supports(Class<?> clazz) {
		return ServiceAssetXref.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmpty(errors, "asset", "sax.asset.invalid");
		ValidationUtils.rejectIfEmpty(errors, "service", "sax.service.invalid");
		
		ServiceAssetXref xref = (ServiceAssetXref) target;
		
		if(xref.getServiceWeight() < 0 || xref.getServiceWeight() > 100)
			errors.reject("serviceWeight", "sax.weight.invalid");
		
		validateNested(errors, "asset", assetValidator, xref.getAsset());
		validateNested(errors, "service", serviceValidator, xref.getService());
	}
}