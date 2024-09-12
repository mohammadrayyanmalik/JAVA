// jo khud ke aur 1 ke table me aaiga usko prime number boleege
// home work 5 input lena hai aur check karmna hai ki no no prime hai ya nahi


import java.util.*;
class prime_no_nestedloops
{	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		int countprime=0;
		for(int n=1; n<=100; n++)
		{
			
		int count=0;
		for (int i=1; i<=n; i++)
		{
			if (n%i==0)
				{
					count++;
				}
		}
				
			if (count==2)
			{
				System.out.print(n+" ");
				countprime++;
			}
			
		}
				System.out.println();
		
				System.out.println(countprime);
		
	}
}