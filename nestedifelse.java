
class nestedifelse
{
	public static void main(String[]args)
	{
		// if ke underr agar koii bhi ifelse lagai to usko nested ifelse kahen ge
		
		int n=13;
		
		if(n%3==0)
		{
			System.out.println(n+" is multiple of 3");
			
			if(n%2==0)
			{
				System.out.println(n+" is even no.");
				
			}
			else
			{
				System.out.println(n+" is odd no.");
			}
		}
		else
		{
			System.out.println(n+" is not multiple of 3");
		}
	}
}