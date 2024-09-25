package Inheritence;
	class a
	{
		int add(int a, int b)
		{
			return a+b;
		}
	}
	class b extends a
	{
		int sub(int a, int b)
		{
			return a-b;
		}
	}


	
public class SingleInhertence {
	public static void main(String[] args) {
		
		b obj=new b();
		int subs=obj.sub(10,19);
		System.out.println(subs);
		
		System.out.println(obj.add(100, 11));
	}
}



//inheritence is used to borrow of another class property
//1) single inheritence means one parents one child
//	clas_b extendes <class_a>
// void type ke object  ko hum sysout me nahi likh sakte 