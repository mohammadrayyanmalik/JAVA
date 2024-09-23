package classesAndObjects;

public class Practice
{
	
		
		
	void isEven(int numbers )
	{
		if (numbers %2==0)
		{
			System.out.println("number is even");
		}
		else 
		{
			System.out.println("no is odd.");
		}
	}	
	
	
	
	
	void isPrime(int n)
	{
	int count=0;
	
	for (int i=1; i<=n; i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}
	
	if (count==2)
	{
		System.out.println(n+" is prime no");
	}
	
	else 
	{
		System.out.println(n+" is not prime");
	}
	
	}
	
	
	void tableOfN(int n)
	{
		for(int i=1; i<=n; i++)
			
			System.out.println(n*i);
	}
	
	
	void factorial(int n)
	{
		int fact=1;
		for (int i=1; i<=n; i++)
		{
			fact=fact*i;
			System.out.println(fact);
		}
	}
	
	
	
	
}

