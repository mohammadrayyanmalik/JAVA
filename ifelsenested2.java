class ifelsenested2
{
	public static void main(String[]args)
	{
	int a=1;
	int b=2;
	int c=3;
	
	if(a>b)
	{
		if(a>c)
		{
		System.out.println("a is gretest");
		}
		else 
		{
		System.out.println("c is greatest");
		}
	}
	else
	{
		if(b>c)
		{
			System.out.println("b is greatest");
		}
		else
		{
		System.out.println("c is gretest");
		}
	}
	}

}