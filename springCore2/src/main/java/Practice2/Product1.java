package Practice2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Product1 {

	private int id;
	private String name; 
	private int price;
	
	@Autowired
	@Qualifier("category1")
	private Category1 category;
	
	public Product1(int id, String name, int price, Category1 category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	public Category1 getCategory() {
		return category;
	}
	public void setCategory(Category1 category) {
		this.category = category;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product1 [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	public Product1(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Product1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
