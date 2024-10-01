package Abstraction;

	abstract class Electronics 
	{
		abstract void start();
		abstract void stop();
	}
	
	
	class TV extends Electronics
	{
		void start()
		{
			System.out.println("TV started");
		}
		void stop()
		{
			System.out.println("TV stoped");
		}
	}
	
	
	class AC extends Electronics
	{
		void start()
		{
			System.out.println("Ac started");
		}
		
		void stop()
		{
			System.out.println("AC stoped");
		}
	}
 
	
	
public class AbstractionExample1 {
	
	public static void main(String[] args) {
		new TV().start();
		new AC().start();
		new TV().stop();
		new AC().stop();
		
		
		Electronics e1=new Electronics() {
			void start()
			{
				System.out.println("hello electronics detials");
			}
			void stop()
			{
				System.out.println("hello electronic detials");
			}
		};
		
		e1.start();
		e1.stop();
		
	}
}



//abstraction
// method without  implementation known as abstration
//eg. void () without curlibraces <{}> 
// hum abstract class ka object nahi bana sakte hain


//rules 
// rule 1)  method me abstract declare karenge
// rule 2)  normal class can not have abstract method iskeliye hume class ko bhi abstact declare karna padega
//  rule 3)   in abstract class we used normal method
// rule 4)  abstract class ka direct object nahi ban sakte hain



// class ke ander class ko anonyms class