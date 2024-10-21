package LearnCollection;

import java.util.Stack;

public class ListExample7 {
	
	public static void main(String[] args) {
		
		Stack<Product> product=new  Stack<Product>();
		
		product.push(new Product(101,"Mouse",100));
		product.push(new Product(101,"Mouse",100));
		product.push(new Product(101,"Mouse",100));
		System.out.println(product);
		
	}
	
}
