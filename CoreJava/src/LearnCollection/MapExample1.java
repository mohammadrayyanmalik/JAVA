package LearnCollection;

import java.util.HashMap;

import Inheritence.Student1;

public class MapExample1 {

	
	public static void main(String[] args) {
		
		HashMap<Integer, String> students=new HashMap<Integer, String>();
		
		students.put(101, "Rayyan");
		students.put(103, "Qasim");
		students.put(102, "Samir");
		students.put(null,null);
		students.put(102,null);
		students.put(101, "Asrar");
		
		System.out.println(students);
		System.out.println(students.get(101));// agar koi aisi key pass kiye jo usme hai hi nahi to null aaiga

		System.out.println(students.getOrDefault(1011, "Hello")); // agar key usme nai hai to phir deflult excute hoga
		
		System.out.println("===========================================================");
		
		System.out.println( students.remove(101));
		System.out.println(students);
		
	}
}

// add methods only collection taki use karenge
// map me add karn eke liye purt ka use kkarenge


//collection has three parts
//1) set  2)List  3) queue

//map is not part of collections but its relevant to collections
//map me sari jeezen key, value pairs me hogi
//map me 2 generic dena hota hai
//key always be unique, value can b duplicate
//its sort in asc order


//1) hashmap(unordered)   2)likedHashmap(ordered)    3)treeHashMap(asc order)
