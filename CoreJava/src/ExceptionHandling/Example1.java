package ExceptionHandling;

public class Example1 {
	public static void main(String[] args) {
		System.out.println("Hello");
		
		try 
		{
			System.out.println(5/1);
		}
		
		catch(ArithmeticException e) // ArithmeticException is readymade Class created by java and here it's a object and e is a varialble
		{
			System.out.println(e);
		}
		
		
		
		System.out.println("Code after exception");
	}
}
//Exception 
//exception means sytex should be correct but run time it does not compile 
//eg: u use 3306 port in mysql but when you connect with java and u put port 3307 it give exception

//try kabhi akele nahi likh sakte uske sath hamesha catch block bhi aaiga
//try block  ke under hum risky code ko likhen ge(risky code that give exception)
// one try can have mulitple catch block
