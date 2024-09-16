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
	
	
	}
}