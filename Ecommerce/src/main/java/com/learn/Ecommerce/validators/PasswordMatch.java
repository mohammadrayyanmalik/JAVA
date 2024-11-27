package com.learn.Ecommerce.validators;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented  // it is used for registration, purpose aapka interface jvm me add ho jai
@Target (ElementType.TYPE) // its mean you can add constructor and method ,class,enum and record
@Retention(RetentionPolicy.RUNTIME) // for suggestion purpose it is used on run time 
@Constraint(validatedBy = PasswordValidator.class)
public @interface PasswordMatch  {
	
	String message() default "{Password and confirm password is not match}";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
