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
		for(int i=sc.nextInt(); i<=21; i++)
		{
			System.out.print(i+" ");
			
		}
		for(int i=sc.nextInt(); i>=13; i--)
		{
			System.out.print(i+" ");
			
		}
	}
}