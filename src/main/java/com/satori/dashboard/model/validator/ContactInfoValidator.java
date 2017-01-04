package com.satori.dashboard.model.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.satori.dashboard.model.ContactInfo;

public class ContactInfoValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ContactInfo contact = (ContactInfo) target;
		PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
		//if(phoneUtil.isValid())
		
	}
}