package com.learn.Ecommerce.entity;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String categoryId;
	
	@Column(nullable = false)
	private String categoryName;
	
	@Column(nullable = false)
	private String categoryDesc;
	
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "category")
	private List<Product> products;
	
}
