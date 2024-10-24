package LearnCollection;

import java.util.Comparator;
import java.util.TreeMap;

public class MapExample3 {
		
	public static void main(String[] args) {
		
		TreeMap<Integer, Product>  products=new TreeMap<Integer, Product>((p1,p2)->p2-p1);
		
		
		
		products.put(101, new Product(101,"Laptop",50000));
		products.put(102, new Product(102,"Mobile",10000));
		products.put(103, new Product(103,"Tablet",20000));
		
		System.out.println(products);
//		System.out.println(products.get(101).getPrice());
		
//		Product laptop=products.get(101);
//		System.out.println(laptop.getName());
		
		System.out.println("=============================================================");
		
		
		
		
	}
	
}
// treemap insertion order maintain in asc order