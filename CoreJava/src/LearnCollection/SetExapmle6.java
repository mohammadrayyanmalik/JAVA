package LearnCollection;

import java.util.TreeSet;

public class SetExapmle6 {

		public static void main(String[] args) {
			
			TreeSet<Product> treeSet=new TreeSet<Product>((p1,p2)->p2.getId()-p1.getId());
			
			treeSet.add(new Product(101,"Laptop",130000));
			treeSet.add(new Product(102,"iphone",12000));
			treeSet.add(new Product(103,"samsung",50000));
			treeSet.add(new Product(104,"mobile",400000));
			
			System.out.println(treeSet);
			
			
		}
	
}
