class logicaloperator
{
		public static void main(String[]args)
		{
		// logical value also declare the answer in true and false
		// we can write direct statement otherthan if statement such
		// true  && true
		
			int amit=12;
			int samir=10;
					
			// and (&&) operator
			// && operator ke dono statement should be true
			// its always used between two operator
			
			System.out.println(amit!=samir &&  amit>samir);
			System.out.println(amit>100 && samir<amit);
			
			// or (||)operator
			// or operator ke ek statement min true hona chahiye
			System.out.println(amit>100 || samir%2==amit);
			System.out.println(amit!=100 || samir%2==amit);
			
			
			// not(!) operator (it is called unary operator also) bucuse its deal with single statement
			System.out.println(!(amit!=100 || samir%2==amit));
		}

}