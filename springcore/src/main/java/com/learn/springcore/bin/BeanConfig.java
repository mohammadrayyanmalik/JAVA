package com.learn.springcore.bin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration // configration ek setting ka option hai
// @ComponentScan 


public class BeanConfig {

	@Bean // multiple bins create karta hai
	public Student s1()
	{
		return new Student(101,"Nisha",null);
	}
	
	@Bean
	public School sc1()
	{
		return new School (678,"National School");
	}
	
	@Bean
	public School school1()
	{
		return new School (671,"Kohinoor international");
	}
	
	
	
	
	
}
