// import karna padta hai taki scanner class ko find out karske 
// java has a many class so i should take the import to find out the class which on i work
import java.util.Scanner;
class object 
{
	 public static void main(String[]args)
	 {
		 
		 //		s is object  new is keyword that help to create object and scanner is class
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers");
		
		
		//its a function to used the input(s.nextint bus input leta hai but kahin per store nahi karta hai)
		int n1=s.nextInt();
		int n2=s.nextInt();
		
		System.out.println(n1+n2);
		
		int sq=s.nextInt();
		
		System.out.println(sq*sq);
		
		
		int rt=s.nextInt();
		int rt1=s.nextInt();
		
		System.out.println(rt*rt1);
		
	 
	 }
}
