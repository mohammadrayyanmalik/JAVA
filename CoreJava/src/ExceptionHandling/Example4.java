package ExceptionHandling;

public class Example4 {
public static void main(String[] args) {
	
	String s="Laptop";

	try
	{
		s.charAt(199);
	}
	catch (StringIndexOutOfBoundsException sc)
	{
		System.out.println(sc);
	}
	
	System.out.println("Code after exception");
}
}
