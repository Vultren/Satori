package com.satori.dashboard.model.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.satori.dashboard.model.Country;

public class CountryValidator extends BaseValidator<Country>{

	@Override
	public boolean supports(Class<?> clazz) {
		return Country.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "countryCode", "country.code.invalid");
	}
}