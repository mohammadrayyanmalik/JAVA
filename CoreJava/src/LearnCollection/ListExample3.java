package LearnCollection;

import java.util.ArrayList;

public class ListExample3 {
	
	public static void main(String[] args) {
		
		ArrayList<Product> products=new ArrayList<Product>();
		
		products.add(new Product(101,"Laptop",10000.30));
		products.add(new Product(102,"iphone",20000.30));
		products.add(new Product(103,"Mobile",30000.30));
				
		System.out.println(products);
		
		
		for(Product p:products)
		{
		
			System.out.println(p);
		}
		System.out.println("==================================================================");

		
		
		
		for(Product p:products)
		{
		
			if (p.getPrice()>20000)
			System.out.println(p);
		}
		
		
		System.out.println("==================================================================");

		for(Product p:products)
		{
			if(p.getName().startsWith("M"))
			System.out.println(p);
		}
		
		System.out.println("==================================================================");

		
	}
	
}
