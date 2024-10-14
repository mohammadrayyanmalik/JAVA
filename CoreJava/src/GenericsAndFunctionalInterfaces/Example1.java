package GenericsAndFunctionalInterfaces;

import java.util.function.Predicate;

public class Example1 {
	
	 public static void main(String[] args) {
		
		 Predicate<Integer> isEven=new Predicate<Integer>() {
			 
			 public boolean test(Integer t)
			 {
				 return t%2==0;
			 }
		 };
		 
		 boolean ans=isEven.test(4);
		 System.out.println(ans);
		 
	}
	
}
//Generics 
//generics ka type is on us
//generics me primitive datatype nahi likh sakte hain
//predicate ko class lagta hai but predicate class nahi banate hain so hum wrapper ka use karen ge
//wrapper class means conversion of datatype
//eg byte  Byte
//short Short 
//int Integer
//char Character 
//long Long 
// boolean Boolean
// float Float


// Predicate
// readymade functional interface

// Autoboxing  (Primitive to Wrapper conversion)