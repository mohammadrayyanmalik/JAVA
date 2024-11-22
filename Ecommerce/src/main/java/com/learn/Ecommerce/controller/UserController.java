package com.learn.Ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.Ecommerce.Dto.UserDto;
import com.learn.Ecommerce.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;
// @postMapping("/users") to add user
	@PostMapping
	public ResponseEntity<UserDto> adduser(@RequestBody UserDto userDto)
	{
		UserDto savedUser = userService.adduser(userDto);
		return new ResponseEntity<UserDto>(savedUser,HttpStatus.CREATED);
	}
	
	
// GET ("/user/{id}") to fetch user by id
	@GetMapping("/{id}")
	public ResponseEntity<UserDto> getUserById(@PathVariable String id)
	{
		UserDto userDto = userService.getUserById(id);
		return new ResponseEntity<UserDto>(userDto,HttpStatus.FOUND);
	}
	
// GET ["/users"] to fetch all users
	
	@GetMapping
	public ResponseEntity<List<UserDto>> fetchAllUsers()
	{
		List<UserDto> users = userService.getAllUser();
		return new ResponseEntity<List<UserDto>> (users,HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUserById(@PathVariable String id)
	{					// userService.deleteuser jo likha haiwoh service imple ke method ko likha hai
		 String messege = userService.deleteuser(id);
		 return new ResponseEntity<String>(messege,HttpStatus.OK);
		
	}
	
	
	
	
	
	
}
// requestbody use to read object from post man