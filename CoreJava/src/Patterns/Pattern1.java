package Patterns;

public class Pattern1 {
	public static void main(String[] args) {
		
		for(int j=1; j<=2; j++)// outer loop always be rows
		{
			
			for (int i=1; i<=2; i++)//  inner loop should be column
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
}
