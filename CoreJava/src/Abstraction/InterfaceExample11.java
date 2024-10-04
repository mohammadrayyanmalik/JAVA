package Abstraction;
	
	@FunctionalInterface
	interface Test 
	{
		boolean isEven(int n);
	}


public class InterfaceExample11 {
	public static void main(String[] args) {
		
		Test t1=(n)->n%2==0;
		boolean  ans=t1.isEven(12);
		System.out.println(ans);
		
		new Test() {
			public boolean isEven(int n)
			{
				return n%2==0;
				
			}
		};
		t1.isEven(11);
		
	}
}
	
	
// functional interface
// a interface which have only one abstract method is known as functional interface
// ()-> lamda expresion syntex 
// lamd expresion ke age hum direct implementatio likh sakte hain
// void type ke method ke liye sysout likhe ge

//Test t1=(n)->n%2==0;


// boolean  ans=t1.isEven(12);
// System.out.println(ans);