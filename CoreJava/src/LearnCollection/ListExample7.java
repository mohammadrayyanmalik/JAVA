package LearnCollection;
import java.util.Scanner;
import java.util.Stack;

public class ListExample7 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		
		
		Stack<Product> product=new  Stack<Product>();
		
		product.push(new Product(101,"Mouse",100));
		product.push(new Product(102,"pc",20000));
		product.push(new Product(103,"cpu",10000));
		System.out.println(product);
		

		System.out.println("Do you want to delete last added items?(Y/N)");
		System.out.println(product.peek());
		
		char decision=sc.next().charAt(0);
		
		if(decision=='Y' || decision=='y')
		{
			System.out.println(product.pop().getName()+" Delete");
		}
		else
		{
			System.out.println("");
		}
		
		
		System.out.println(product);
		
		
		
		
		
		
		
	}
	
}
