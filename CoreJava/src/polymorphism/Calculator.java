package polymorphism;

public class Calculator {
	
	void add (int a, int b)
	{
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	void add(float a, float b)
	{
		System.out.println(a+b);
	}
	
	void add(float a, int b)
	{
		System.out.println(a+b);
	}
	
	void add (double a, float b)
	{
		System.out.println(a+b);
	}
	
	void add (float a, float b, float c )
	{
		System.out.println(a+b+c);
	}
	
	void subs(int a, int b)
	{
		System.out.println(a+b);
	}
	
	void subs (float a, float b, int c)
	{
		System.out.println(a+b+c);
	}
	
	void multi(int a, float b, int c, double d){
		{
			System.out.println(a*b*c*d);
		}
	}
	
	public static void main(String[] args) {
		Calculator c1=new Calculator();
		c1.add(10, 10);
		
		c1.add(100, 10, 10);
		
		c1.add(12.12f,12.12f);
		
		c1.add(10.21, 21.2f);
		
		c1.add(10.1, 10);
		
		c1.subs(21.2f, 220.2f, 20);
		
		c1.multi(12, 21.2f, 120, 21.20);
	}
}



//polymorphism (many form)

//types of polumorphism
//method overloading 
//over riding 

//method overloading 
//same class me kam karna hai
//aapke method ka name same hoga but type of parameter and number of parameter should be different honge 


//method overridng 
//2 different classes 
//same methods name
//same no of parameter and same type of parameters
