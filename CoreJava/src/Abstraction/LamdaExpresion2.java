package Abstraction;
// functionalInterface
@FunctionalInterface
	interface Test1
	{
		void printName(String name);
	}
	
	

	interface Test2
	{
		int add(int a, int b);
	}
	
	
	
	interface Test3
	{
		int square(int n);
		
	}
	
	
public class LamdaExpresion2 {
	public static void main(String[] args) {
		
		Test1 t2=(name)-> System.out.println("My name is :"+name);
		t2.printName("Rayyan");
		
		Test1 t3=(name)-> System.out.println(name);
		t3.printName("Qasim");
		
		System.out.println("==============================================================");
		
		Test1 t4=(sam)->{
			
			for(int i=1; i<=100; i++)
			{
				System.out.println(sam);
			}
		};
		t4.printName("Kareem");
		
		
		System.out.println("==============================================================");
		
		Test2 t=(a,b)->a+b;
	
		
		int sum=t.add(12, 32);
		System.out.println(sum);
		
		
		System.out.println("==============================================================");

		
		Test3 t11=(n)->n*n;
		System.out.println(t11.square(12));
		
	}
}



