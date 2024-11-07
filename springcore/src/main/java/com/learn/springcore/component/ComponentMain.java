package com.learn.springcore.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentMain {

	
	public static void main(String[] args) {
		
		ApplicationContext context=					// config class and .class 
				new AnnotationConfigApplicationContext(Config.class);
		
		Product p1 = context.getBean("product",Product.class);
		System.out.println(p1);
		
		
		
		System.out.println("======================================================");
		ApplicationContext context1=
				new AnnotationConfigApplicationContext(CategoryConfig.class);
		
		Category c1 = context1.getBean("category",Category.class);
		
		System.out.println(c1);
		
	}
}
