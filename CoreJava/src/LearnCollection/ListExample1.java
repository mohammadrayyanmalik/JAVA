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


// array list ka type object hai bydefault
// add method is a common method for every collection interface and classes
// list is used to  stored differnet type of object in single list

