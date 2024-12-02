package com.learn.Ecommerce.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// address sequance table create hoga jab hum auto increament  lagate hain id per and sequence maintain
// nahi rahega and isko delete nahi karna hai


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)// generated value annotaion is used  auto increament
	private int addressId;
	
	@Column (nullable = false)
	private String addressLine1;
	
	@Column (nullable = false)
	private String addressLine2;
	
	@Column (nullable = false)
	private String city;
	
	@Column (nullable = false)
	private String state;
	
	@Column (nullable = false)
	private String pincode;
	
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "address")
	private User user;
	
}
