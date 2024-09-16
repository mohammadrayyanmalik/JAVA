// jo khud ke aur 1 ke table me aaiga usko prime number boleege

import java.util.*;
class primenumber
{	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		
		for (int i=1; i<=n; i++)
		{
			if (n%i==0)
			{
				System.out.print(i+" ");
				count++;
			}
				
			
		}
				System.out.println(" ");
				System.out.println(count+" ");
				
		if (count==2)
		{
				System.out.println(n+" is prime no. ");
		}
		else 
		{
				System.out.println(n+" is not prime number");
			
		}
		
	}
}