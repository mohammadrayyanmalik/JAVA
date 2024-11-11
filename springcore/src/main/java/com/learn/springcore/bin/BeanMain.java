package com.learn.springcore.bin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanMain {

	
	public static void main(String[] args) {

		
		// bean ko fetch karne ke liye AnnotationConfigApplicationContext
			ApplicationContext context=
					new AnnotationConfigApplicationContext(BeanConfig.class);
										// bin name classname.class
			Student s1 = context.getBean("s1",Student.class);
			
			System.out.println(s1);
			
			
			
			System.out.println("======================================");
			
			School sc1=context.getBean("sc1",School.class);
			System.out.println(sc1);
			
			
			
			
			System.out.println("=====================================");
			School school1=context.getBean("school1",School.class);
			System.out.println(school1);
			
			
			
		
	}
}
