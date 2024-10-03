package Abstraction;

public class C implements A,B {
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void subs(int a,int b)
	{
		System.out.println(a-b);

	}
	
	public int  square(int n)
	{
		return n*n;
	}
}
