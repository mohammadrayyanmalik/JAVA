/* hello 10 print 
hello 5 times print
hello user input se karna hai

10 inputs 
count of (multiple of 7)

table of n



sum of no from 1 to n*/

import java.util.Scanner;
class question
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		for(int i=1; i<=10; i++)
		{
			System.out.println("Hello "+i);
		}
		System.out.println("===========================	");
		
		
		
		
		
		
		System.out.println("enter iteration no.");
		int a=sc.nextInt();
		
		
		for(int i=1; i<=a; i++)
		{
			System.out.println("Hello "+i);
		}
		System.out.println("================");
		
		
		
	
		
		
		
		
		
		int n=100;
		 int count=0;
	
		for(int i=1; i<=n; i++)
		{
			
			if (i%7==0)
			{
				
				count++;
			}
		}
		System.out.println(count);
		
		System.out.println("================");
		
		
		
		
		
		
		int m=sc.nextInt();
	
		for(int i=1; i<=10; i++)
		{
			System.out.println(m*i);
		}
		
		
			System.out.println("================");
		
		
		
		int b=10;
		int sum=0;
		for (int i=1;i<=b; i++)
		{
			sum=sum+i;
			System.out.println(sum);
		}
			System.out.println(sum);
		
		
	}
	
}