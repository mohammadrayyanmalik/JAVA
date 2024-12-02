package com.learn.Ecommerce.Dto;

import com.learn.Ecommerce.entity.Address;
import com.learn.Ecommerce.validators.PasswordMatch;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// DTO data transfer object

@Data
@AllArgsConstructor
@NoArgsConstructor
@PasswordMatch
public class UserDto {

	private String id;
	@NotNull
	@NotBlank(message = "First name con not be  null") // @notBlank used only on string 
	@Size(min=2,max = 10) 				// @size used only on string
	private String firstName;
	@NotNull
	@NotBlank (message = "Last name can not be null")
	@Size(min=2,max=10)
	private String lastName;
	@NotNull
	@NotBlank(message = "email name can not be null")
	@Pattern (regexp = "^((?!\\.)[\\w\\-_.]*[^.])(@\\w+)(\\.\\w+(\\.\\w+)?[^.\\W])$")
	private String emailId;
	@NotNull
	@NotBlank(message = "password can not be null")
	@Pattern(regexp = "^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[^\\w\\d\\s:])([^\\s]){8,16}$")
	private String password;
	@NotNull
	@NotBlank(message = "confirm password can not be null")
	
	private String confirmPassword;
	@NotNull
	@Min(13)
	@Max(160)
	private int age;
	private Address address;
	
	
}

// validation annotation Dto per lagane ke baad humko Controller per @valid lagana padega
