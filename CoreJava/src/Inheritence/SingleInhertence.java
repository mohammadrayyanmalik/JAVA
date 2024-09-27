package Inheritence;
	class A
	{
		int add(int a, int b)
		{
			return a+b;
		}
		
		A()
		{
			System.out.println("constructor A ");
		}
		
		A(String value)
		{
			System.out.println("parametarized constructor A:");
		}
		
		
	}
	class B extends A
	{
		int sub(int a, int b)
		{
			return a-b;
		}
		
		B()
		{
			System.out.println("constructor B ");
		}
		
		B(String value)
		{
			super(value);
			System.out.println("Parametarized constructor B:");
		}
	}


	
public class SingleInhertence {
	public static void main(String[] args) {
		
		B obj=new B("Rayyan");
		
		
		System.out.println("==================================================");
		int subs=obj.sub(10,19);
		System.out.println("subs is :"+subs);
		
		System.out.println("Add is :"+obj.add(100, 11));
		
	
		
	}
}

// types of inheritence 
//single
//multilevel
// heirerchichal 
//hybrid
// multiple 




//inheritence is used to borrow of another class property
//1) single inheritence means one parents one child
//	clas_b extendes <class_a>
// void type ke object  ko hum sysout me nahi likh sakte 
// agar hum child ka object banain ge to parent ka bhi constructor call hoga
// in case of parametarized and non parametarized constructor when we create child object then it called parent object also
// child ke constroctor ke through kuch parent ke constructor ko value deni ho to hum "Super " keyword ka use karenge
// inheritence use in frame work because us me hume readymade clases milte hain
