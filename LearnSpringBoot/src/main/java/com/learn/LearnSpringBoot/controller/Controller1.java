package com.learn.LearnSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;

// @controller        @restController

import org.springframework.web.bind.annotation.RestController;

import com.learn.LearnSpringBoot.entity.Student;



@RestController   
public class Controller1 {

	// @restController hello as it is print karega 
	// Controller Hello ko xml,html and json form me retun karega
	
	@GetMapping("/hello")
	public String hello()
	{
		return "Hello world";
	}
	
	@GetMapping("/Myname")
	public String name()
	{
		return "Mohammad Rayyan Malik";
	}
	
	@GetMapping("/FatherName")
	public String FatherName()
	{
		return "Mohmammad Qasim Malik";
	}
	
	@GetMapping("/student")
	public Student getStudent()
	{
		Student s=new Student();
		s.setId(101);
		s.setName("Rayyan");
		s.setMarks(90);
		return s;
	}
	
	
}
