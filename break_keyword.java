import java.util.*;
class break_keyword
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		for (int i=1; i<=5; i++)
		{
				System.out.println(i);
			if(i==3)
			break; 
		
		}
		
		
		int sum=0;
		for (int i=1; i<=5; i++)
		{
			int n=sc.nextInt();
			if(n<=0)
			break;
			sum=sum+n;
			
			 
		}
		
		System.out.println("sum is "+sum);
	}
	
}