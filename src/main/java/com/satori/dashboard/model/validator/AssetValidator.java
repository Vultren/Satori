package com.satori.dashboard.model.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.satori.dashboard.model.Asset;

public class AssetValidator implements Validator {

	private final Validator addressValidator;
	private final Validator organizationValidator;
	
	public public AssetValidator(Validator addressValidator, Validator organizationValidator) {
		
		this.addressValidator = addressValidator;
		this.organizationValidator = organizationValidator;
	}
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Asset.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		Asset asset = (Asset) target;
	}

}
