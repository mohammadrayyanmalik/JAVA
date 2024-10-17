package LearnCollection;

import java.util.ArrayList;

public class ListExample2 {
		public static void main(String[] args) {
			
			ArrayList<Integer> list=new ArrayList<Integer>();
			list.add(12);
			list.add(12);
			list.add(333);
			
			list.add(324);
			System.out.println(list.size());
			System.out.println("==================================================================");
			
			System.out.println(list);
			
			for(Integer i:list)
			{
				System.out.println(i);
			}
			System.out.println(list.size());
			
			System.out.println("==================================================================");
			System.out.println("==================================================================");
			System.out.println("==================================================================");

			
			list.remove(list.size()-1);
			System.out.println(list);
			
			System.out.println("==================================================================");

			
			ArrayList<Integer> list1=new ArrayList<Integer>();
			list1.add(101);
			list1.add(102);
			list1.add(103);
			
			//addAll is used to  2 collection into 1 but more than 2 it can't be done
			list.addAll(list1);
			
			System.out.println(list);
			
			System.out.println("==================================================================");

			list.removeAll(list1);
			
			System.out.println(list);
			System.out.println("==================================================================");

			
			list.clear();
			System.out.println(list);
		}
}
