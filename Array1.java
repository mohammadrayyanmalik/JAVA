// array jab multiple value store karne hi to hum array ka use karenge
		
		// Array is a collection of similar datatype (only one datatype like int then only) it is ordered (arrange in sequence)
		
		
		
		// indexing tell where exactly element is
		// it is start with 0 numbers
		// arry store only first element value then it by indexes
		
		
		// array banane ke liye "new" keyword ka use karenge
		//Syntex of Array
		//int <variable name>[]= new datatype [size];
import java.util.*;
class Array1
{						
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int number[]=new int[3];
		
		/*number[0]=11;
		number[1]=12;
		number[2]=13;
		
		
		System.out.println(number[0]);
		System.out.println(number[1]);
		System.out.println(number[2]);*/
		
		int numbers[]=new int[5];
		
		for (int i=0; i<5; i++)
		{
			numbers[i]=sc.nextInt();
		
		}
		
		for (int i=0; i<5; i++)
		{
			System.out.println(numbers[i]);
		}
		
		System.out.println("==========================================");
		
		
		String names[]=new String[4];
		
		names[0]="Asif";
		names[1]="Asrar";
		names[2]="Jarjees";
		names[3]="Samir";
		
		
		System.out.println(names[1]);
		System.out.println("=====================================");
	
	// length give lenth of array
	//Syntex array_name.length
	
	
	String weekdays[]={"mon","tue","wed","thu","fri","sat","sun"};
	
	int primeNumber[]={11,23,13,3,5};
	
	System.out.println("weekdays:"=weekdays.length);
	System.out.println("weekdays:"=primeNumber.length);
		
		
		
	}
}