package Practice2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config1 {

	
	@Bean
	public Product1 p1()
	{
		return new Product1(101,"laptop",100000,null);
	}
//	@Bean
//	public Product1 product()
//	{
//		return new Product1(102,"Mobile",200000,null);
//	}
	
	public Category1 category1()
	{
		return new Category1(321,"clothes");
	}
	
	@Bean
	public Category1 c1()
	{
		return new Category1(123,"Electronic");
	}
	
	
}
