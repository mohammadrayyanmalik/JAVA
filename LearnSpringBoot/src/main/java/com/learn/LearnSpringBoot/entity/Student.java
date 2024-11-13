package com.learn.LearnSpringBoot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // it is belong to lombok and its used to parametarized constructor
@NoArgsConstructor //  it is belong to lombok and its used to non parametarized constructor
public class Student {
	
	private int id;
	private String name;
	private int marks;
	
	
	
}
