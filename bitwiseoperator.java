class bitwiseoperator // its deal with binary no.
					// images ke time per binary me deal kiye jata hai other wise decimal me hi hum mostly deal karte hain
{
	public static void main(String[]args)
	{	
		// bitwise & operator		
		System.out.println(100&9);		//1100100
										//0001001
										//--------
										//0000000
		
		

		
		
		System.out.println(20&9);
		
		// bitwise | operator
		System.out.println(20|9);
									//10100
									//01001
									//------
									//11101
								

		// XOR (^) operator
		// if bits are same then 0
		// if bits are difference then 1
		System.out.println(20^9);//10100
								 //01001
								 //------
								 //11101
								 
								 
		// bitwise not(~)operator
		// it deals with only 1 operand
		// default of binary no is 16 like 09 =9 so i have a answer 110 then we took 0000000000000110 then bit change if its 1 then get 0 and 0 then 1
		// 0000000000000110 
		// 1111111111111001
		
			System.out.println(~6);// 0000000000000110 
								   // 1111111111111001
		
		
	}
}