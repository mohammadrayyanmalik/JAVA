package Inheritence;
	
	class C
	{
		void methodC()
		{
			System.out.println("method of C class");
		}
	}
	
	
	class D extends C
	{
		void methodD()
		{
			System.out.println("method of D class");
		}
	}
	
	
	class E extends D
	{
		void methodE()
		{
			System.out.println("method of E class");
		}
	}
	
	
	class F extends E
	{
		void methodF()
		{
			System.out.println("method of F class");
		}
	}



public class MultiLevelInheritence {
	public static void main(String[] args) {
		F obj=new F();
		
		// hum class ka object banate hain
		// hum object banane ke baad ek ek method ko call kar sakte hain
		
		obj.methodC();
		obj.methodD();
		obj.methodE();
		obj.methodF();
		System.out.println("=========================================");
		
		D d1=new D();
		d1.methodC();
		d1.methodD();
		
	}
}



//multilevel inheritence
//in MI have number of classes
//e.g. b inherit A ,c inherit b, d inherit c etc.
//same package me same class repeat nahi ho sakte
