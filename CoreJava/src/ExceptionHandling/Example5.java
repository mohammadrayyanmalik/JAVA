package ExceptionHandling;

public class Example5 {
	public static void main(String[] args) {
		
		try
		{
			System.out.println(5/0);
		}
		
//		catch (ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println();
//		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handled");
		}
		
		finally
		{
			System.out.println("Finally block");
		}
	}
}

// finally block execute every time chahe exception handle ho ya nahi
// finally code me connect ko close karne wala code likhenge 


// compile time exceprtion 