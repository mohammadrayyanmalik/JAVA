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
// UnBoxing (Wrapper to primitive )


// questions prctice 
// consumer ke accept method ko 4 diya to 4 ka table print 
// accept (student obj ) diya to grade batana hai fees batani hai
// accept (product obj )diya product ke 20 % discount dekar print ho

// supplier
// lamda, functional interface, array , anonymous ,generics , predicate , consumer
