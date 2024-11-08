package com.learn.springcore.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Product {

	@Value("101")

	private int id;

//	@Autowired  // it is a field level injection (agar hum kisi bhi variable main autowired lagain ge to woh feild level)
	private Category category;
	
	
	public Product(int id, Category category, String name, int price) {
		super();
		this.id = id;
		this.category = category;
		this.name = name;
		this.price = price;
	}


	public Category getCategory() {
		return category;
	}


//	@Autowired // set method per agar hum autowired lagainge to woh setter method hoga
	public void setCategory(Category category) {
		System.out.println("setter injection");
		this.category = category;
	}

	@Value("Laptop")
	private String name;
	
	@Value("100000")
	private int price;
	
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", category=" + category + ", name=" + name + ", price=" + price + "]";
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
	
	
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	@Autowired // jab hum constructor per autowired constructor lagainge to use constructor injection
	public Product(Category category) {
		super();
		System.out.println("Constructor injection");
		this.category = category;
	}


	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
