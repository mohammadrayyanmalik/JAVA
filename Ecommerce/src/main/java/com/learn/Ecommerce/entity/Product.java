package com.learn.Ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//@Table(name="product_detials") will help to change table name
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class Product {

	@Id
	private int productId;	
	@Column(nullable =false)
	private String productName;
	@Column(nullable =false)
	private String description;
	@Column(nullable=false)
	private int productPrice;

	@ManyToOne
	private Category category;
	
	
	
}

//  GET  POST  /products
//  GET   	/Products/{id}
//  PUT     /Products/{id}
// Delete   /Products/{id}
 