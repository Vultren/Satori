package com.satori.dashboard.model.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.satori.dashboard.model.UsState;

public class UsStateValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return UsState.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		
	}

}
