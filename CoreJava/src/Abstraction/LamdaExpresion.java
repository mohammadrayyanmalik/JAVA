package Abstraction;
//functionalInterface

	 
	interface Test 
	{
		boolean isEven(int n);
	}


public class LamdaExpresion {
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



// 		string parameter in () then -> then if return anything put value
//Test t1=(n)->n%2==0;


// boolean  ans=t1.isEven(12);
// System.out.println(ans);