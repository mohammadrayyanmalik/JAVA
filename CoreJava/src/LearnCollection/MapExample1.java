package LearnCollection;

import java.util.HashMap;
import java.util.Set;

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
		
		System.out.println(students.keySet());
System.out.println("=====================================================");

		Set<Integer> keys=students.keySet();
		
		for (Integer k:keys)
		{
			System.out.println(k+" "+students.get(k));
		}
		
		System.out.println("============================================");
		// containskey return boolean
		System.out.println(students.containsKey(null));
		
		System.out.println(students.containsValue("Qasim"));
		
		
		
		
	}
}

// add methods only collection taki use karenge
// map me add karn eke liye put ka use kkarenge


//collection has three parts
//1) set  2)List  3) queue

//map is not part of collections but its relevant to collections
//map me sari jeezen key, value pairs me hogi
//map me 2 generic dena hota hai
//key always be unique, value can b duplicate
//its sort in asc order
// hashmap me insertion order maintain nahi hote hain
// keySet will return key ka object like key and value se key 

// map me direct iterate nahi kar sakte hain but we can iterate through set and key set is used for this.

//lower and higher ke sath agar hum entry lagain ge to value bhi sath me mil jaiga

//Hashmap does not maintain insertion order while Linked hashMap maintain insertion order
//hashmap and LinkedHashMap has both are similar properties (key should be unique and value can be duplicate)


//1) hashmap(unordered)   2)likedHashmap(ordered)    3)treeHashMap(asc order)
