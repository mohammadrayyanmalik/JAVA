package com.learn.springcore.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Category {

	
	@Value("101")
	private int id;
	
	@Value("Electronics")
	private String name;
	
	@Value("100000")
	private int price;
	
	@Value("Best category of all product")
	private String description;
	
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(int id, String name, int price, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description + "]";
	}
	
	
	
	
}
