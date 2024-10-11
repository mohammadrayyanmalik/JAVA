package ExceptionHandling;

import java.io.FileNotFoundException;
public class mainForAge {

	
	// run time exception custom
	public static void checkAge(int age)
	{
		if (age<18)
		{
			throw new InvalidAgeException("Invalid age");
		}
		else 
		{
			System.out.println("registration successfull");
		}
	}
	
	
	public static void main(String[] args) {
		
		checkAge(19);
	
	}
}
