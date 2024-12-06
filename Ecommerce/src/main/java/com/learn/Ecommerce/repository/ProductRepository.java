package com.learn.Ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.learn.Ecommerce.entity.Product;
import com.learn.Ecommerce.projection.ProductProjection;


@RepositoryRestResource (excerptProjection = ProductProjection.class)
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	
	List<Product> findByProductPriceLessThan(int price);
	List<Product> findByProductPriceLessThanEqual(int price);
	
	
	List<Product> findByProductPriceGreaterThan(int price);
	
	List<Product> findByProductPriceBetween(int start,int end);
	
	List<Product> findByProductNameStartingWith(String productName);
	
	
	
		
	
}
