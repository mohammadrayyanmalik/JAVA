package LearnCollection;

import java.util.Comparator;

public class Product implements Comparator<Product> {

	private int id;
	private String name;
	private  double price;
	
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

//	@Override
//	public int compareTo(Product o) {
////		TODO Auto-generated method stub
////	return this.id-o.id;
////	return o.id-this.id;
//		return this.name.compareTo(o.name);
//		
//	}

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return 0;
	}

//	public int compareTo(Product o) {
//		if(this.price>o.price)
//			return 1;
//		else
//			return -1;
//		
//		
//		
//  }
	
	
	

}


// comparable is used to compare 2 objects
//id ko id se minus karen ge
