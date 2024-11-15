package com.learn.LearnSpringBoot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
	
	@GetMapping("/st")
	public Student st()
	{
		Student s1=new Student();
		s1.setId(102);
		s1.setName("Faizan");
		s1.setMarks(100);
		
		return s1;
	}
	
	@GetMapping("/all-student")
	public List<Student> allStudent()
	{
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(103, "Asrar", 89));
		students.add(new Student(104, "Asif", 98));
		return students;
		
	}
	
	@GetMapping("get-all-students")
	public ResponseEntity<List<Student>> getAllStudent()
	{
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(103, "Asrar", 89));
		students.add(new Student(104, "Asif", 98));
		return new ResponseEntity<List<Student>> (students,HttpStatus.FOUND);
	}
	
	
	@GetMapping("/students/{id}")
	public String learnPathVariable(@PathVariable("id") int  userid)
	{
		System.out.println(userid);
		return "data fetch successfully";
	}
	
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student)
	{
		System.out.println(student);
		return student; 
	}
	
	// ResponseEntity
	@PostMapping("/add-student")
	public ResponseEntity<Student> addStudentWithResponseEntity(@RequestBody Student student)
	{
		System.out.println(student);
		return new ResponseEntity<Student>(student,HttpStatus.CREATED);
		
	}
	
}
// return type always be responseEntity while we wants to give response  like 202, and its generics should
// be 