class logicaloperator
{
		public static void main(String[]args)
		{
		// logical value also declare the answer in true and false
		// we can write direct statement otherthan if statement such
		// true  && true
		
		// and (&&) operator
			int amit=12;
			int samir=10;
			
			
			System.out.println(amit!=samir &&  amit>samir);
			System.out.println(amit>100 && samir<amit);
			
			// or (||)operator
			System.out.println(amit>100 || samir%2==amit);
			System.out.println(amit!=100 || samir%2==amit);
			
			
			// not(!) operator (it is called unary operator also)
			System.out.println(!(amit!=100 || samir%2==amit));
		}

}