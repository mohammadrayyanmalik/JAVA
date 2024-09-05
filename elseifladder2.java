import java.util.*;
class elseifladder2
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter 2 no");
	
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	System.out.println("1:Add  2:Subs   3:mul  4:div");
	
	int decision=sc.nextInt();
	
	if (decision==1)
	{
		System.out.println("Ans is "+(n1+n2));
	}
	else if (decision==2)
	{
		System.out.println("Ans is "+(n1-n2));
	}
	 else if (decision==3)
	{
		System.out.println("Ans is "+(n1*n2));
	}
	 else if (decision==4)
	{
		System.out.println("Ans is "+(n1/n2));
	}
	
	}
}