package Patterns;

public class Pattern4 {
	
	public static void main(String[] args) {
		
		System.out.println("A");
		
		int n=4;
		for(int i=1; i<=n;i++)
		{
			
			for (int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
		System.out.println("===================================================");
		
		
		System.out.println("B");
		
		
		for(int i=1; i<=n;i++)
		{
			
			for (int j=1; j<=i; j++)
			{
				System.out.print(i);
			}
			
			System.out.println();
		}
		
		System.out.println("=========================================");
		System.out.println("C");
		
		
		for(int i=1; i<=n;i++)
		{
			
			for (int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			
			System.out.println();
		}
		
		System.out.println("=========================================");
		System.out.println("D");
		
		
		for(int i=1; i<=n;i++)
		{
			
			for (int j=1; j<=i; j++)
			{
				if (i==3)
				{
					System.out.print(i);
				}
				else 
				{
				System.out.print(j);
				}
			}
			
			
			System.out.println();
		}
		
	System.out.println("=========================================");
	System.out.println("E");
	
	
	
		for(int i=1; i<=n;i++)
		{
			
			for (int j=1; j<=i; j++)
			{
				if (i%2!=0)
				System.out.print("*");
				else 
				{
					System.out.print(i);
				}
			}
			
			System.out.println();
			
		}
		
		
	System.out.println("=========================================");
	System.out.println("F");
	
	
		for(int i=1; i<=n;i++)
		{
			
			for (int j=1; j<=i; j++)
			{
				if(i%2!=0)
				System.out.print(j);
				
				else 
				{
				System.out.print("*");
				}
			}
			
			System.out.println();
		}
		
		
		
	System.out.println("=========================================");
	System.out.println("G");	
	
	
		for(int i=1; i<=n;i++)
		{
			
			for (int j=1; j<=i; j++)
			{
				if (i%2!=0) 
				{
					System.out.print("1");
				}
				else 
				{
					System.out.print("0");
				}
				
			}
			System.out.println();
		}
			
	System.out.println("===================================================");
	System.out.println("H");	
	
		for(int i=1; i<=n;i++)
		{
			
			for (int j=1; j<=i; j++)
			{
				if ((i+j)%2==0)
				System.out.print("1");
				else 
				{
					System.out.print("0");
				}
			}
			
			System.out.println();
		}	
			
		System.out.println("=================================================");
		System.out.println("I");
		
		for (int i=1; i<=n; i++)
		{
			for (int j=1; j<=n; j++)
			{
				
			}
		}
		
		
		
	}
}
