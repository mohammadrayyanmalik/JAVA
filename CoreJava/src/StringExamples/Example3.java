package StringExamples;

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String password="X#123";
		System.out.println("Enter password:");

		
		String s=sc.nextLine();
		
		
				//if(s.equals(password))
			if(s.compareTo(password)==0)
		{
			System.out.println("login successful");
		}
		else 
		{
			System.out.println("loin unsuccessful");
		}
		
	}
}
