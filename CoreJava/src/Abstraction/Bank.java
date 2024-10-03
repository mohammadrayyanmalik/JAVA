package Abstraction;

public interface Bank {
	
	void detials();
	void address();
	
	 default void methodBank()
	{
		System.out.println("Default method");
	}
	 
	 static void staticMethod()
	 {
		 System.out.println("static methods from bank");
	 }
}
