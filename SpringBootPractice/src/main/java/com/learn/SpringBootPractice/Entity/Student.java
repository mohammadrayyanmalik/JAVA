package com.learn.SpringBootPractice.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {

	private int id;
	private String name;
	private int age;
	
	
}
