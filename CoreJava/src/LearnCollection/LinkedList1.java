package LearnCollection;

import java.util.LinkedList;
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

		
		// add method with index and elements
		list.add(2, 100);
		System.out.println(list);
		
		System.out.println("=====================================");

		
	}
}
