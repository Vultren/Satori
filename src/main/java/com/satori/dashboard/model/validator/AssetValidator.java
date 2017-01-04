package com.satori.dashboard.model.validator;

import org.apache.commons.validator.routines.InetAddressValidator;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.satori.dashboard.model.Address;
import com.satori.dashboard.model.Asset;
import com.satori.dashboard.model.Organization;

public class AssetValidator extends BaseValidator<Asset> {

	private final Validator addressValidator;
	private final Validator organizationValidator;
	private final InetAddressValidator validate;
	
	public AssetValidator(Validator addressValidator, Validator organizationValidator) {
		checkValidator(addressValidator, Address.class);
		checkValidator(organizationValidator, Organization.class);
		
		this.addressValidator = addressValidator;
		this.organizationValidator = organizationValidator;
		validate = InetAddressValidator.getInstance();
	}
	
	public boolean supports(Class<?> clazz) {
		return Asset.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "asset.name.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "sysId", "asset.sysId.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ipAddress", "asset.ip.empty");
		ValidationUtils.rejectIfEmpty(errors, "createdDate", "asset.created.empty");
		ValidationUtils.rejectIfEmpty(errors, "updatedDate", "asset.updated.empty");
		ValidationUtils.rejectIfEmpty(errors, "systemClass", "asset.systemClass.empty");
		ValidationUtils.rejectIfEmpty(errors, "status", "asset.status.empty");
		Asset asset = (Asset) target;
		if (asset.getAssetSysId().length() != 32) {
			errors.rejectValue("sysId", "asset.sysId.length");
		} else if (!asset.getAssetSysId().matches("[0-9A-Fa-f]+")) {
			errors.rejectValue("sysId", "asset.sysId.invalid");
		}
		
		if (asset.getAssetName().length() > 255) {
			errors.rejectValue("name", "asset.name.length");
		}
		
		if (!validate.isValid(asset.getIpAddress())) {
			errors.rejectValue("ipAddress", "asset.ip.invalid");
		}
		
		if (asset.getModelNumber().length() > 255) {
			errors.rejectValue("modelNumber", "asset.model.length");
		}
		
		if(!timeWithinEpochWindow(asset.getCreatedDate())) {
			errors.rejectValue("createdDate", "asset.date.window");
		}
		
		if(!timeWithinEpochWindow(asset.getUpdatedDate())) {
			errors.rejectValue("updatedDate", "asset.date.window");
		}
		
		validateNested(errors, "address", this.addressValidator, asset.getAddress());
		validateNested(errors, "orgnization", this.organizationValidator, asset.getOrganization());
	}
	
	

	

	
}
