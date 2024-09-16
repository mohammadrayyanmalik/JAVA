class typecasting
{
	public static void main(String[]args)
	{
	// Tpye casting means change the datatype 
	//widening typecasting means samll container put in big container in this case comiler does  comile the code it does not give error  eg.
	 int a=10;     
	long b=a;
	
	System.out.println(b);
	

	
	
	// narrowing typecasting means big container put in smalll container in this case doesmcomiile the code it give the error eg.
	
	int c=100;
	byte d=(byte)c; // int to byte conversion
	
	
	System.out.println(d);
	
	
	
	System.out.println("==========================================================================");
	
	
	// int to char
	
	int n=65;
	char ch=(char)n;
	System.out.println(ch);
	
	System.out.println((char)n);
	
			System.out.println("================================");
	
	
	for (int i=65; i<=90; i++)
		{
			if (i==89)
			{
			System.out.println((char)i);
			}
		}
		
			System.out.println("================================");
		
		
		// small a to z 
		
		for (int i=97; i<=97+25;  i++)
		{
			
			System.out.println((char)i);
			
		}
	
	
	
	
	
	
	}
}