package classesAndObjects;

public class Example {
     public static void main(String[] args) {
		Product p1=new Product();
		p1.setProductDetials(101, "Laptop", 100000);
		System.out.println("you have to pay :"+p1.discount());
		
		Product p2=new Product();
		p2.setProductDetials(102, "Mobile", 50000);
		System.out.println("pay: "+p2.discount());
	}
     
     
}

