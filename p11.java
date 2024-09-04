import java.util.Scanner;	
class p11
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		boolean subscribed=false;
		
		System.out.println("Do you want to subscribe ?? (y/N)");
		char decision=sc.next().charAt(0);
		
		if (decision=='Y' || decision=='y')
		{
			subscribed=true;
			
		}
		
		System.out.println("subscribed:"+subscribed);
		
		if (subscribed)
		{
			System.out.println("You are Subscribed");
		}
		else
		{
			System.out.println("You are not subscribed");
		}
	}
}