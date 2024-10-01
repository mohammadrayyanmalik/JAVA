package Inheritence;

public class Programmer extends FullTimeEmployee
{
	String programmingLanguage;

	public Programmer(int id, String name, double monthlySalary, int noOfLeaves, int insuranceNumber,
			String programmingLanguage)
	{
		super(id, name, monthlySalary, noOfLeaves, insuranceNumber);
		this.programmingLanguage = programmingLanguage;
	}
	
	
	
}
//alag alag inhertence ko ek sath likhe ge  to use hybrid inheritence


// Access modifier use karte hain control karne ke liye
// access modifier hum class variable method and constroctor per use kar sakte hain

// private access modifier  jis class ke method me lage ga hum sirf usi class ko access kar sakte hain

// default access modifier jis class ke method me lagain ge hum us package ke sare class me usko use/Access kar sakte hain

// protected access modifier jis clas ke method me lagain ge hum us package and dosre package ke bhi class ko use /Access kar sakte hain but agar dosre package me use karna hai to use inherit karna padega jis me protected lagaya hai
// but jis class se access karna hai hum usi class ka object banainge

// public class ko sare package ke class use kar sakte hain with out inhert

// jab hum dosre package se kisi class ko call karna hai to import karna padega





// polymorphism (many form)

// types of polumorphism
// method overloading 
// over riding 

// method overloading 
//same class me kam karna hai
// aapke method ka name same hoga but type of parameter and number of parameter should be different honge 


// method overridng 
// 2 different classes 
// same methods name
// same no of parameter and same type of parameters























