package ExceptionHandling;

	

public class InvalidAgeException extends RuntimeException {
	
	public InvalidAgeException()
	{
		super();
	}
	
	InvalidAgeException(String a)
	{
		super(a);
	}

}
// if you want to create run time exception then inherit run time exception