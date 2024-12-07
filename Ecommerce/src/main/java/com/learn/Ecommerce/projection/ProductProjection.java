package com.learn.Ecommerce.projection;

import org.springframework.beans.factory.annotation.Value;

public interface ProductProjection {

	String getProductName();
	
	//						?if any product not categories then don't show error 
	@Value("#{target.category?.categoryName}")
	String getCategory();
	
	
	
}
