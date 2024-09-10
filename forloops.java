// for loops syntex
//for(initilizing;condition;inc/dec)
//{}
// when no. of iteration is fixed used forloops
import java.util.*;
class forloops
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		/*System.out.println("13 to 21");
		
		for(int i=sc.nextInt(); i<=21; i++)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("21 to 13");
		
		for(int i=sc.nextInt(); i>=13; i--)
		{
			System.out.print(i+" ");	
		}*/
		
		
		// to print table of 5
		/*int  n=sc.nextInt();
		for (int i=1; i<=10; i++)
		{
			System.out.println(n*i);
		}*/
		
		// sum of no upto n
		int n=sc.nextInt();
		int sum=0;
		for(int i=1; i<=n; i++)
		{
			sum=sum+i;	
		}
		System.out.println(sum);
	}
}