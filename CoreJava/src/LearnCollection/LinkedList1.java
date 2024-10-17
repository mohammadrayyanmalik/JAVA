package LearnCollection;

import java.util.LinkedList;
import java.util.function.Predicate;
public class LinkedList1 {
	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		
		
		//add method only provide element
		list.add(12);
		list.add(93);
		list.add(22);
		list.add(43);
		
		System.out.println(list);
		
		System.out.println("=====================================");
		for (Integer i:list)
		{
			System.out.println(i);
		}
		
		System.out.println("=====================================");
		
		list.remove(0);
		System.out.println(list);
		
		System.out.println("=====================================");

		//add method is used to set new values with index defining
		// add method with index and elements
		list.add(2, 100);
		System.out.println(list);
		
		System.out.println("=====================================");

		Integer i=list.get(1);
		System.out.println(i);
		System.out.println(list.get(3));
		
		
		System.out.println("=====================================");

		// set method is used to replaced elements and its used with index and elements
		
		list.set(2, i);
		System.out.println(list);
		
		
		System.out.println("=====================================");

//		Predicate<Integer> even=(num)->num%2==0;
//		list.removeIf(even);
//		System.out.println(list);
		
		list.removeIf((num)-> num%2==1);
		System.out.println(list);
		
	}
}
