package Abstraction;
	abstract class Product 
	{
		abstract void detials();
	}
	
	class Mobile extends Product 
	{
		void detials()
		{
			System.out.println("Mobile detials");
		}
	}
	
	class Laptop extends Product 
	{
		void detials()
		{
			System.out.println("Laptop detials");
		}
	}
	
	



public class AbstractionExample2 {
	
public static void main(String[] args) {
	Mobile mobile=new Mobile();
	mobile.detials();

	new Laptop().detials();
	
	// anonymous inner class 
	Product mouse=new Product() {
		void detials()
		{
			System.out.println("Mouse detials");
		}
	};
	
	mouse.detials();
	
	
	Product headphone=new Product()
	{
		void detials()
		{
			System.out.println("Headphone detials");
		}
	};
	
	headphone.detials();
}
}
