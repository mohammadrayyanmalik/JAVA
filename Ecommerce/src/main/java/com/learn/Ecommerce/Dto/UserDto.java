package com.learn.Ecommerce.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// DTO data transfer object

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

	private String id;
	@NotNull
	private String firstName;
	@NotNull
	private String lastName;
	@NotNull
	private String emailId;
	@NotNull
	private String password;
	@NotNull
	private String confirmPassword;
	@NotNull
	private int age;
	
	
}

// validation annotation Dto per lagane ke baad humko Controller per @valid lagana padega
