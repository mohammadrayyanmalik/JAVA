package LearnCollection;

import java.util.PriorityQueue;

public class QueueExapmle2 {

	
	public static void main(String[] args) {
		
		PriorityQueue<Product> product=new PriorityQueue<Product>((p1,p2)->p2.getId()-p1.getId());
		
		product.add(new Product(101,"Laptop",100000));
		product.add(new Product(103,"computer",400000));
		product.add(new Product(102,"mobile",12000));
		
		
		
		System.out.println(product.poll());
		System.out.println(product);
		System.out.println(product.peek());
		
		
		
		
		
	}
}
// linked list is most powerful methods because it has two interface




// collection has three parts
// 1) set  2)List  3) queue

//map is not part of collections but its relevant to collections