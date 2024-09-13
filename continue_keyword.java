import java.util.*;
class continue_keyword
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		/*for (int i=1; i<=5; i++)
		{
			if(i==3)
			continue;
				System.out.println(i);
		}	
*/

			int sum=0;
		for (int i=1; i<=5; i++)
		{
			int n=sc.nextInt();
			if(n<=0)
			continue;
			sum=sum+n;
		}
		System.out.println(sum);
		
	}
		
}