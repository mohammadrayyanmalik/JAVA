package LearnCollection;

import java.util.ArrayList;

public class ListExample1 {
	
	public static void main(String[] args) {
		
		//  for list used this
		ArrayList list=new ArrayList<>();
		list.add(12);
		list.add("Rayyan");
		list.add(22.22);
		list.add(null);
		
		System.out.println(list);

		// for single single result used followings
		
		for(Object i:list)
		{
			System.out.println(i);
		}
		
		
		
	}
	
}

// array list store element in contineous form and allows in duplicate values 
// array list ka type object hai bydefault
// add method is a common method for every collection interface and classes
// list is used to  stored differnet type of object in single list

// array list can hold duplicate value
// 
// Array list methods 1) ADD 2)size 3)addall 4) remove 5) remove all 6)clear

// array list and linked list doth are same but only insertion both are different.
// for insertion used linked list and for search operation used Arraylist.


// linked list
// linkedlist allows duplicate values also  and stored elements eg.
// eg 11,12 and 13 but 11 has a address of 12 and 12 has address of 13 and last elememt has null address
// liked list allowes the null values

