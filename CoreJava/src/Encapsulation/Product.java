package Encapsulation;

public class Product {
	private int id;
	private String name;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String toString()
	{
		return this.id+" "+name;
	}
	
	
}