package com.learn.Ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Category {

	@Id
	private String categoryId;
	private String categoryName;
	private String categoryDesc;
	
	
	
	
}
