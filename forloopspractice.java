// 1- 100 even 
// 1- 100 count of even
// 1- 100 count of multiple of 7
import java.util.*;
class forloopspractice
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=100;
		int digitcount=0;
		for(int i=1; i<=n; i++)
		{
			if(i%2==0)
				
			{
				System.out.print(i+" ");
				digitcount++;
			}
		
		}
		System.out.println();
		System.out.println();
		
		System.out.println(digitcount);
		System.out.println();
		
		int count=0;
		for (int i=1;  i<=100;  i++)
		{
			if (i%7==0)
				{
					System.out.print(i+" ");
					count++;
				}
		}
		System.out.println();
		
		System.out.println(count);
	}
}







