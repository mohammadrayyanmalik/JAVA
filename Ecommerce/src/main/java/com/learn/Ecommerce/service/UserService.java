package com.learn.Ecommerce.service;

import java.util.List;

import com.learn.Ecommerce.Dto.UserDto;
import com.learn.Ecommerce.entity.User;

public interface UserService {

// to add user
	UserDto adduser(UserDto userDto);
	
// To fetch all user
	List<UserDto>getAllUser();
	
// To fetch user by id
	UserDto getUserById(String id);
	
// update user by Id
	UserDto updateUser(String id,UserDto userDto);
	
// delete User by Id
	// delete ke liye sirf id dena hai woh delete kar lega 
	String deleteuser(String id);
	
// Entity To Dto conversion
	UserDto entityToDto(User user);
	
// Dto to Entity
	User dtoToEntity(UserDto userDto);
	
// to fetch by email
	UserDto getUserByEmail(String email);
	
	//to fetch by firstName
	List<UserDto> getUserByFirstName(String firstName);
	
}
//  aapke pass service honi chahiye like logic of business 