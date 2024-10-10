package ExceptionHandling;

import java.util.*;
public class Example3 {
	 public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		
		 
		 try 
		 {
			 
			 System.out.println("Enter First NO");
			 int n=sc.nextInt();
			 
			 System.out.println("Enter Second NO");
			 int n1=sc.nextInt();
			 System.out.println(n/n1);
			 
		 }
		 
		 catch(ArithmeticException e)
		 {
			 System.out.println(e);
		 }
		 
		 catch (InputMismatchException ex)
		 {
			 System.out.println(ex);
		 }
		 
		 
		 System.out.println("code After exception");
		 
	}
}
