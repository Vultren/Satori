package com.satori.dashboard.model.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.satori.dashboard.model.Asset;

public class AssetValidator implements Validator {

	private final Validator addressValidator;
	private final Validator organizationValidator;
	
	public AssetValidator(Validator addressValidator, Validator organizationValidator) {
		
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
		validateNested(errors, "address", this.addressValidator, asset.getAddress());
		validateNested(errors, "orgnization", this.organizationValidator, asset.getOrganization());
	}
	
	public <T> void validateNested(Errors errors, String path, Validator validator, T item) {
		try{
			errors.pushNestedPath(path);
			ValidationUtils.invokeValidator(validator, item, errors);
		} finally {
			errors.popNestedPath();
		}
	}
	
}
