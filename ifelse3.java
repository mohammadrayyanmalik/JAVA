
class ifelse3
{
	public static void main(String[]args)
	{
		if (false || true)
		{
			System.out.println(" is multiple of 3");
			if(true && true)
			{
				System.out.println(" a");
			}
			else
			{
				System.out.println(" b");
			}
		}
	
		else
		{
			System.out.println(" is not multiple of 3");
			if(true && true)
			{
				System.out.println(" is multiple of 23");
			}
			else
			{
				System.out.println(" is not multiple of 23");
			}
		}
	
	}
}