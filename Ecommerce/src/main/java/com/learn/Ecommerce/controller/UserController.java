package com.learn.Ecommerce.controller;

import java.security.Provider.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learn.Ecommerce.Dto.UserDto;
import com.learn.Ecommerce.entity.User;
import com.learn.Ecommerce.repository.UserRepository;
import com.learn.Ecommerce.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;
	@Autowired
	UserRepository userRepository;
// @postMapping("/users") to add user
	@PostMapping							
	public ResponseEntity<UserDto> adduser(@RequestBody @Valid UserDto userDto)
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
	
	
// deleteMapping ("/users/{id}")
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUserById(@PathVariable String id)
	{					// userService.deleteuser jo likha haiwoh service imple ke method ko likha hai
		 String messege = userService.deleteuser(id);
		 return new ResponseEntity<String>(messege,HttpStatus.OK);
		
	}
	
	@PutMapping("/{id}")				// pathvariable url se java me data ko transefer karata h 
	public ResponseEntity<UserDto> updateUser(@PathVariable String id,
					@RequestBody UserDto userDto)
	{
		UserDto updatedUser = userService.updateUser(id, userDto);
		return new ResponseEntity<UserDto>(updatedUser,HttpStatus.OK);
	}
	
	
	@GetMapping("find-by-email/{emailId}")
	public ResponseEntity<UserDto> getByEmailId(@PathVariable String emailId)
	{
		 UserDto userByEmail = userService.getUserByEmail(emailId);
		return new ResponseEntity<UserDto>(userByEmail,HttpStatus.FOUND);
	}
	
	
	
	@GetMapping ("find-By-FirstName")
	public ResponseEntity<List<UserDto>> getUserByFirstName(@RequestParam String fname)
	{
		return new ResponseEntity<List<UserDto>>
		(userService.getUserByFirstName(fname),HttpStatus.FOUND);
	}
	
	
	
	
	
}
// requestbody use to read object from post man
// validation: it is applying rule (dependency:spring validation)  
// post man se data pahle Dto ke pass hi ataa hai