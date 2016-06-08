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

/*	public static boolean isValidUsState(String stateCode) {
		if (stateCode == null || stateCode.isEmpty()){
			logger.warn("State code not recieved.");
		} else if (findUsStateByStateCode(stateCode) == null){
			logger.warn("[{}] is not a valid code for a state in the US.", stateCode);
			return false;
		}
		return true;
	}*/
}
