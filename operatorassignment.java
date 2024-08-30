class operatorassignment
{
	// additionassignment does not write in sysout and wirte in outside like follow mentoned a+=b
	public static void main(String[]args)
	{
		int a=10;
		int b=20;
		// formula is a=a+b
		//a becuse of left hand sight always ko assign kiya jata hai and left and right ko operator ke hisab se add ya subs kardete hain
		a+=b;
		System.out.println(a);
		System.out.println(b);
		
		// substractionassignment does not write in sysout
		
		a-=b;
		System.out.println(a);
		System.out.println(b);
	}
	
}

