package classesAndObjects;

public class Product {
	int productId;
	String productName;
	int productPrice;

	// setProductDetials(101,"Laptop",50000)
	// this keyword represent jo object call karega woh means current
	// this ke sath hum instance variable ko likhenge
	
	void setProductDetials(int productId,String productName, int productPrice)
	{
		this.productId=productId;
		this.productName=productName;
		this.productPrice=productPrice;
		
		System.out.println(this.productId+" "+this.productName+" "+this.productPrice);
	}
	
	
}
