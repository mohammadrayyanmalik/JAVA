import java.util.*;
class positive_no_while
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=0;
		int count=0;
		
		while(n>=0 && n<=10)
		{
			n=sc.nextInt();
			count++;
		}
		count--;
		System.out.println(count);
	}
}