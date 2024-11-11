package Practice2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
public static void main(String[] args) {
	
	ApplicationContext context=
			new AnnotationConfigApplicationContext(Config1.class);
	
	Product1 p = context.getBean("p1",Product1.class);
	System.out.println(p);
	
	
	Category1 c = context.getBean("c1",Category1.class);
	System.out.println(c);
	
	
	
	
	
//	Product1 pp=context.getBean("product",Product1.class);
//	System.out.println(pp);
//	
}
}
