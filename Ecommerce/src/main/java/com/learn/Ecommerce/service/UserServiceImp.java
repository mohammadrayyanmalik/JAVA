package com.learn.Ecommerce.service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.Ecommerce.Dto.UserDto;
import com.learn.Ecommerce.entity.User;
import com.learn.Ecommerce.repository.UserRepository;
@Service
public class UserServiceImp implements UserService {

	// userRepository ke pass sare methods hai isi liye userrepo ka object banaya hai
	// and save method ko userrepo hi call karsakta hai kion ki userrepo inherit karta hai jpa ko
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDto adduser(UserDto userDto) {
// for unique and random id used UUID
		UUID randomUUID = UUID.randomUUID();
		String id = randomUUID.toString();
		userDto.setId(id);
		
		User user = dtoToEntity(userDto);
		
		User savedUser = userRepository.save(user);
		
		UserDto savedDto = entityToDto(savedUser);
		
		return savedDto ;
	}

	 
	@Override
	public List<UserDto> getAllUser() {
		List<User> users = userRepository.findAll();
		
//userRepository ke pass findall method hai and uska return type user hai aur user ko hum directly 
// return nahi kar sakte isliye map ka used kiya jo har ek users per perform karta hai and map 
// method stream ke pass hai so humne stream.map used kiyaand collect method ke pass ek 
// collector.list hai jo stream ko list me convert karega phir userDtoList ko return kiya hai

		List<UserDto> userDtoList = users.stream()
		.map(u->entityToDto(u))
		.collect(Collectors.toList());
		
		return userDtoList;
	}

	@Override
	public UserDto getUserById(String id) {
		User user = userRepository.findById(id)
		.orElseThrow(()->new RuntimeException(id+"not found"));// work like ifelse
		return entityToDto(user);
	}

	@Override
	public UserDto updateUser(String id, UserDto userDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteuser(String id) {
		User user= userRepository.findById(id)
		.orElseThrow(()->new RuntimeException(id+"not found"));
		
		userRepository.delete(user);
		return user.getId()+"deleted successfully";
	}

	@Override
	public UserDto entityToDto(User user) {
		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto.setFirstName(user.getFirstName());
		userDto.setLastName(user.getLastName());
		userDto.setEmailId(user.getEmailId());
		userDto.setPassword(user.getPassword());
		userDto.setAge(user.getAge());
		
		return userDto;
	}

	@Override
	public User dtoToEntity(UserDto userDto) {
		User user = new User();
		user.setId(userDto.getId());
		user.setFirstName(userDto.getFirstName());
		user.setLastName(userDto.getLastName());
		user.setEmailId(userDto.getEmailId());
		user.setPassword(userDto.getPassword());
		user.setAge(userDto.getAge());
		
		return user;
	}

	
	
}
