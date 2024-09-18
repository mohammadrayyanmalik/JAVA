class two_dimensional_Array
{
	public static void main(String[]args)
	{
		// one dimensional    multidimesional(two dimensional)
		//  int a[]={}			int a[][]={{48,67,45},{23,22,21}}
			int numbers[][]={{48,67,45},{23,22,21}};
					//		0 position	  1 position
		//System.out.println(numbers[0][2]);
		
		
		//it is done by nested for loops
			for(int i=0; i<numbers.length; i++)
			{
				for (int j=0; j<3; j++)
				{
					System.out.println(numbers[i][j]);
				}
			}
			
		System.out.println("=================================");
			
			// array length count
			// it is done by enhance loops 
			for (int n[]:numbers)
			{
				for (int i:n)
				{
					System.out.println(i);
				}
			}
			
		
		int numbers2[][]={{12,45},{23,33,43},{121,23,345,32}};
		
		// enhance loops eg
		for (int n[]:numbers2)
		{
			System.out.println(n.length);
		}
		
		
		// nested loops
		for (int i=0; i<numbers2.length; i++)
		{
			System.out.println(numbers2[i].length);
		}
		
		System.out.println("=================================");
		
		
		String courses[][]={{"HTML","CSS","BOOTSTRAPE"},
		{"MYSQL","MONGODB"},
		{"CORE JAVA","SPRING BOOT"}};
		
		// enhance for loops
		int total_courses=0;
		for (String c[]:courses)
		{
			// total_courses+=c.length;
			for (String cour:c)
			{
				System.out.println(cour);
				total_courses++;
			}
			
		}
		System.out.println("Total courses is :"+ total_courses);
		
		System.out.println("=================================");
		
			
			// enhance for loops
		int a[][]={{1,3,5},{3,4,8}};
		
		for(int aa[]:a)
		{
			for (int ab:aa)
			{
				System.out.print(ab+" ");
			}
		System.out.println();
		}
		
		System.out.println("=================================");
		
		
		// nested loops
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
				System.out.println();
			
			
		}
		
		
		
			
		
		
		
		
	}
}