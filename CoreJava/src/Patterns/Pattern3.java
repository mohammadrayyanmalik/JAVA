package Patterns;

class Pattern 
{
	public void squareFrame (int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				
				
				if(i==1 || j==1 || i==n || j==n|| i==2 || j==2 || i==(n-1) || j==(n-1))
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

public class Pattern3 {
	public static void main(String[] args) {
		
		Pattern p1=new Pattern();
		
		for (int a=1; a<=5; a++)
		{
			p1.squareFrame(12);
			
			System.out.println();
		}
		
		
		
		
	}
}
