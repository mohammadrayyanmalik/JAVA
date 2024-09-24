package staticKeyWord;
class Counter 
{
	static int count=0;
	
	Counter()
	{
		count++;
		 System.out.println("count :"+count);	
	}
}




public class CounterProgram {
	public static void main(String[] args) {
	
		for (int i=1; i<=100; i++)
		{
			new Counter();
		}
	}
	
}
