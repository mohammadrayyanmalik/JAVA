package Practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainCustomer {

	
	
	public static void main(String[] args) {
		ApplicationContext context=
		new AnnotationConfigApplicationContext(ComponentConfig.class);
		
		Customer c1 = context.getBean("customer",Customer.class);
		
		System.out.println(c1);
		
	}
	
}
