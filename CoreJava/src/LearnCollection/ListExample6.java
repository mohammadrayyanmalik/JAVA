package LearnCollection;

import java.util.Stack;

public class ListExample6 {
	
	public static void main(String[] args) {
		
		
		Stack<Integer> stack=new Stack<Integer>();
//		System.out.println(stack.empty());
		
		stack.push(20);
		stack.push(10);
		stack.push(30);
		
		System.out.println("==================================================");
		System.out.println(stack);
		
		System.out.println(stack.search(30));
		
		
		System.out.println("==================================================");
		System.out.println(stack.pop());
//		stack.pop(); // use can alse this
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack);
		
		System.out.println(stack.peek());
		System.out.println(stack);
		
		System.out.println(stack.empty());
		
		
		
		
	}
	
}

// vector and array list both are same
//by vector multithreding is not allowed while array listallows multithreding
// list ke direct child ke pass hi sirf add method hota hai 
// stack is not a direct child of list but it is a  child of vector 
//element ko add karte hue hum push method k use karege
// element ko delete karne ke liye hum pop method ka use karenge
// pop method delete ke sath sath remove item ko show karta hai
// stack.pop always remove last added element
// stack.empty check only it's a empty or not
// stack.peek only provide elements that available in the box
// stack ki indexing 0 se nahi hti hai


	