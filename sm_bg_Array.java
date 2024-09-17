import java.util.*;
class sm_bg_Array
{						
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	
	int numbers[]={11,2,34,3,23,230,281};
	
	int smallest=numbers[0];
	int biggest=numbers[0];
	
	for (int n:numbers)
	{
		if (smallest>n)
			smallest=n;
		
		if (biggest<n)
			biggest=n;
		
	}
	
	System.out.println(smallest);
	System.out.println(biggest);
	
	
	}
}