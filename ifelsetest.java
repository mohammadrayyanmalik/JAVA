import java.util.*;
class ifelsetest
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	int  n=sc.nextInt();
	
	if(n%2==0)
	{
		System.out.println(n+" is even");
	}
	else {
		System.out.println(n+" is odd");
		
	}
	
	
	
	if (n%7==0)
	{
		System.out.println(n+" is divided by 7");
	}
	
	else
	{
		System.out.println(n+" is not divided by 7");
		
	}
	
	}
}