 import java.util.*;
 class elseifladder
 {
	 public static void main(String[]args)
	 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("1:Marathi  2: hindi   3:arabic");
	 
	 int n=sc.nextInt();
	 
	 if(n==1)
	 {
	 System.out.println("Marathi language is selected");
	 }
	else if(n==2)
	 {
	 System.out.println("Hindi language is selected");
	 }
	 else if(n==3)
	 {
	 System.out.println("Arabic language is selected");
	 }
	  else
	 {
	 System.out.println("You have given invalid input");
	 }
	 }
 }