package ExceptionHandling;

public class MainForNegativeNumber {
	// compile time Exception
	public static void checkNumber(int n) throws NegativeNumberException
	{
		if(n>=0)
		{
			System.out.println(n);
		}
		else 
		{
			throw new NegativeNumberException("Number is negative");
		}
	}
	
	public static void main(String[] args) {
		
		try 
		{
			checkNumber(-90);
		}
		catch (NegativeNumberException e)
		{
				System.out.println(e);
		}
	}
	
}
