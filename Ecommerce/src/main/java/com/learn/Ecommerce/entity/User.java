package com.learn.Ecommerce.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity// to create table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id // @id means to marks our column to primary key
	private String id;
	@Column (nullable=false)// @column means to make column and nullable false means not null
	private String firstName;
	@Column (nullable=false)
	private String lastName;
	@Column (nullable=false,unique=true)
	private String emailId;
	@Column(nullable=false)
	private String password;
	@Column(nullable=false)
	private int age;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	
}
