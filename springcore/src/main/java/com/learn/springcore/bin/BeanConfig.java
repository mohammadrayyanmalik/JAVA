package com.learn.springcore.bin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration


public class BeanConfig {

	@Bean
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
