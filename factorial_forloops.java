// factorial means multiplication of  below number among them for example
// 3!      1*2*3
class factorial_forloops
{
	public static void main(String[]args)
	{	int n=10;
		int fact=1;
		for (int i=1; i<=n; i++)
		{
			fact=fact*i;
			System.out.println(fact);
		}
		System.out.println(fact);
	}
}