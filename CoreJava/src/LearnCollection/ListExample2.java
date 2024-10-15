package LearnCollection;

import java.util.ArrayList;

public class ListExample2 {
		public static void main(String[] args) {
			
			ArrayList<Integer> list=new ArrayList<Integer>();
			list.add(12);
			list.add(12);
			list.add(333);
			
			list.add(324);
			
			
			System.out.println(list);
			
			for(Integer i:list)
			{
				System.out.println(i);
			}
			
		}
}
