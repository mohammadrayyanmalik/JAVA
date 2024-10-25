package StreamApi;

import java.util.ArrayList;

import LearnCollection.Product;

public class SreamExample3 {

	public static void main(String[] args) {
		
		ArrayList<Product> product=new ArrayList<Product>();
		product.add(new Product(101,"laptop",100000));
		product.add(new Product(102,"Mobile",150000));
		product.add(new Product(103,"iphone",200000));
		
		product.stream()
		.forEach((p)->System.out.println(p.getName()));
		
		System.out.println("=======================================");
		
		product.stream().
		forEach((p)->System.out.println(p.getName()+" "+p.getPrice()*80/100));
		
		
	}
	
}
