package StreamApi;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import LearnCollection.Product;

public class StreamExample6 {

	public static void main(String[] args) {
		
		List<Product> products=new LinkedList<Product>(); 
		
		products.add(new Product(101,"Laptop",10000));
		products.add(new Product(102,"Iphone",300000));
		products.add(new Product(103,"Mobile",20000));
		
		
		
		
		
		List<Product> PriceGreaterThan = products.stream()
				.filter(p->p.getPrice()>10000)
				.collect(Collectors.toList());
		
		System.out.println(PriceGreaterThan);
		
		
	}
	
}
