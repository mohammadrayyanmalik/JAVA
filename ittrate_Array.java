// vowel ko count karna hai but repeated ko only one time hi print karna hai

class ittrate_Array
{
	public static void main(String[]args)
	{
		
	String weekdays[]={"mon","tue","wed","thu","fri","sat","sun"};
	
	int primeNumber[]={11,23,13,3,5};
	
	System.out.println("weekdays:"+weekdays.length);
	System.out.println("primeNumber:"+primeNumber.length);
	
	
	// Enhance for loops
	
	for(String day:weekdays)
	{
		System.out.println(day);
	}
	
	System.out.println("================================================");
	
	// sum of array prime numbers
	
	
	int sum=0;
	for(int prime:primeNumber)
	{
		sum=sum+prime;
		System.out.println(prime);
	}
	System.out.println("================================================");
	
		System.out.println("sum is:"+sum);
		
	System.out.println("================================================");
		
		
		
		int count=0;
	char ch[]={'a','e','i','o','a','a','u','o'};
		
		for (char c:ch)
		{
			if (c=='a')
			{
				count++;
			}
		}
		System.out.println("count is:"+count);
		
	System.out.println("================================================");
	
	
		
		char vowel[]={'a','e','w','w','o','A'};
		int count_vowel=0;
		int consonanent=0;
		for(char c:vowel){
		switch(c)
		{
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'o':
			case 'O':
			case 'i':
			case 'I':
			case 'u':
			case 'U':
			      count_vowel++;
			      break;
			default:
			     consonanent++;
			
		}
		}
		System.out.println(count_vowel);
		System.out.println(consonanent);
		
	}
}