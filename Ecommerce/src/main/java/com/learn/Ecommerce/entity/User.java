package com.learn.Ecommerce.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
	
	
	@JsonManagedReference
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	
	@OneToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE},mappedBy = "user")
	private List<Order> orders;
	
	
	
}
