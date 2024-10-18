package LearnCollection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkedList4 {
	public static void main(String[] args) {
		
		LinkedList<Product> products=new LinkedList<Product>();
		
		products.add(new Product(104,"Laptop",10000.30));
		products.add(new Product(102,"Iphone",20000.30));
		products.add(new Product(103,"Mobile",30000.30));
//		Comparator<Product> idComparator=(p1,p2)->p1.getId()-p2.getId();
		Comparator<Product> idComparator=(p1,p2)->{
		
			if(p1.getPrice()>p2.getPrice())
			{
				return 1;
			}
			else {
				return -1;
			}
		};
		
		
		
		Collections.sort(products,idComparator);
		System.out.println(products);
		
		Collections.sort(products,idComparator);
		System.out.println(products);
		
	}
}
