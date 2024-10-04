package Abstraction;

	interface Test1
	{
		void printName(String name);
	}

public class InterfaceExample12 {
	public static void main(String[] args) {
		
		Test1 t2=(name)-> System.out.println("My name is :"+name);
		t2.printName("Rayyan");
		
		Test1 t3=(name)-> System.out.println(name);
		t3.printName("Qasim");
		
		
	}
}
