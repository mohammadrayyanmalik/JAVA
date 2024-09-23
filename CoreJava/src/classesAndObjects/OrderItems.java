package classesAndObjects;

public class OrderItems {
	int orderId;
	String orderName;
	int price;
	
	void setOrderDetials(int orderId,String orderName,int price )
	{
		this.orderId=orderId;
		this.orderName=orderName;
		this.price=price;
		
		System.out.println(orderId+" "+orderName+" "+price);
	}
	
	double discount()
	{
		System.out.println(this.price);
		return this.price*9;
		
	 
	}
}
