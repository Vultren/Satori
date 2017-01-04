package com.satori.dashboard.model.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.satori.dashboard.model.Country;
import com.satori.dashboard.model.Location;
import com.satori.dashboard.model.UsState;

public class LocationValidator extends BaseValidator<Location>{

	private Validator countryValidator;
	private Validator usStateValidator;
	
	public LocationValidator(Validator countryValidator, Validator usStateValidator) {
		checkValidator(countryValidator, Country.class);
		checkValidator(usStateValidator, UsState.class);
		
		this.countryValidator = countryValidator;
		this.usStateValidator = usStateValidator;
	}
	
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {

		ValidationUtils.rejectIfEmpty(errors, "country", "location.contry.invalid");
		Location location = (Location) target;
		
		if(location.getState() != null) 
			validateNested(errors, "state", usStateValidator, location.getState());
		validateNested(errors, "contry", countryValidator, location.getCountry());
	}

	
}
