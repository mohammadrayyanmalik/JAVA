package com.learn.Ecommerce.validators;

import com.learn.Ecommerce.Dto.UserDto;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
									// constrantValidator ke pass isValid method hai jiske return type
									// me hum password and confirm password ko compare karenge
public class PasswordValidator implements ConstraintValidator<PasswordMatch, UserDto> {

	@Override
	public boolean isValid(UserDto value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return value.getPassword().equals(value.getConfirmPassword());
		
		
		
	}
	
	

}
