package com.satori.dashboard.model.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public abstract class BaseValidator<T> implements Validator {

	@Override
	public abstract boolean supports(Class<?> clazz);

	@Override
	public abstract void validate(Object target, Errors errors);
	
	protected <S> void validateNested(Errors errors, String path, Validator validator, S item) {
		try{
			errors.pushNestedPath(path);
			ValidationUtils.invokeValidator(validator, item, errors);
		} finally {
			errors.popNestedPath();
		}
	}
	
	protected void checkValidator(Validator validator, Class<?> clazz){
		String nullValidator = String.format("The supplied [%s Validator] is " +
                "required and must not be null.", clazz.getName());
		String unsupportedValidator = String.format("The supplied [Validator] must " +
                "support the validation of [%s] instances.", clazz.getName());
		if(validator == null){
			throw new IllegalArgumentException(nullValidator);
		}
		if(!validator.supports(clazz))
			throw new IllegalArgumentException(unsupportedValidator);
	}

}
