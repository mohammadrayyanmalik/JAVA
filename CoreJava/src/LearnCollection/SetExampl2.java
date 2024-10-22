package LearnCollection;

import java.util.HashSet;
import java.util.Scanner;

public class SetExampl2 {

	
	public static void main(String[] args) {
		
		HashSet<String> colors=new HashSet<String>();
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=1; i<=5; i++)
		{
			// user input
			String color=sc.next();
			colors.add(color.toLowerCase());// color add used to add elements
		}
		
		System.out.println(colors);
		
		colors.clear();
		System.out.println(colors);
		
	}
}
