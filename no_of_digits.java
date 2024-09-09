import java.util.*;
class no_of_digits
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int digitCount=0;
		
		
		while (n!=0)
		{
			n=n/10;
			digitCount++;
			
		
		}
		System.out.println(digitCount);
		
		if (digitCount>4)
				{
					System.out.println("digitCount is too large");
				}
				else 
				{
					System.out.println("digitCount is too less");
					
				}
	}
}