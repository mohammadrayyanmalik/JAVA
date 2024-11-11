package StringExamples;

public class Example1 {
		public static void main(String[] args) {
//			 ways to createString 
			
			
			
			
//			1) By using String literal
			
			String a="Hello";
			String c="Hello";
			String e="hello";
			
			
			
			
// 			using new keyword
			String b=new String("Hello");
			String d= new String("Hello");
			
			
			System.out.println("========================================================================");
			System.out.println(a==b);
			System.out.println(a==c);
			System.out.println(b==d);
			System.out.println(a==e);

			
			
		}
}


//object created in heap memory
//string is a class in java 
//string a="Hello";     			this is a string literal
//string literal created in string constrants pool memory
// String ki value check nahi ki jati hai balki refrences check kiya jata hai ki heap memory me hai ya string constrant pool memory
// String type ka agar object banai hain to uska comairision nahi kar sakte hain
// String class ko  inherit nahi kar sake hain
// to String method add nahi karen ge to address print hoga usi ko hatane ke liye  