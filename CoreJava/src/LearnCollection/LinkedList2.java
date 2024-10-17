package LearnCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.function.Predicate;

public class LinkedList2 {

	public static void main(String[] args) {
		LinkedList<String> name=new LinkedList<String>();
		
		name.add("Amit");
		name.add("Rayyan");
		name.add("Abrar");
		name.add("Samir");
		
//		Predicate<Stirng> names=()
		
		
//		name.removeIf(na->na.startsWith("A"));
//		System.out.println(name);
		
		System.out.println("=================================================================");
		
		LinkedList<Product> products=new LinkedList<Product>();
		
		products.add(new Product(101,"Laptop",10000.30));
		products.add(new Product(102,"iphone",20000.30));
		products.add(new Product(103,"Mobile",30000.30));
				
		
		System.out.println(products);
		products.removeIf((price)->price.getPrice()<20000);
		
		System.out.println(products);
		
		System.out.println("=========================================");
		
		
		
		
		
	}
	
}
