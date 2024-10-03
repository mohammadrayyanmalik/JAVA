package classesAndObjects;

public class Example2 {
	public static void main(String[] args) {
		OrderItems o1=new OrderItems();
		o1.setOrderDetials(11, "xyz", 1000);
		System.out.println("you have to pay :"+o1.discount());
		
	
		
	}
}
