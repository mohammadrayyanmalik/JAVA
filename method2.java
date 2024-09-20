class Calculator
{
	int a;
	int b;
	
	int addition()
	{
		return a+b;
	}
	
	
	int substraction()
	{
		return a-b;
	}
	
	
	void setValues(int n1, int n2)
	{
		a=n1;
		b=n2;
	}
	
}




class method2
{
	public static void main(String []args)
	{
		
		Calculator c1=new Calculator();
		c1.a=12;
		c1.b=10;
		
		int sum=c1.addition();
		
		System.out.println("Addition  is "+ sum);
		
		int sub=c1.substraction();
		System.out.println("substraction  is "+ sub);
	
		Calculator c2=new Calculator();
					// arguments
		c2.setValues(122,2);
		System.out.println(c2.a+" "+c2.b);
		
		
	}
}