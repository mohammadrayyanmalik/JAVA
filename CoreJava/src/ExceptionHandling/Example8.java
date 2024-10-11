package ExceptionHandling;
// its run time exception 

public class Example8 {

	public static void ThrowException()
	{
		throw new NullPointerException("Samir");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		try
		{
		ThrowException();
		}
		catch (NullPointerException n)
		{
			System.out.println(n);
		}
		System.out.println("World");
		
	}
	
}


//throw means exception apni marzi se lane ke liye hum throw keyword ka use karenge