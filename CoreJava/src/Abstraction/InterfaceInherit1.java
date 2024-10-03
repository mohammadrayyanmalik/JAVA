package Abstraction;

public class InterfaceInherit1 implements I1 {
	// over ride 
	public void display()
	{
		System.out.println("overriding methods of class A");
	}
	
	
	public void square(int n)
	{
		System.out.println(n*n);
	}
}
