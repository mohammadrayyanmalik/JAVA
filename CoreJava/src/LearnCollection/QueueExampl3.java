package LearnCollection;

import java.util.LinkedList;
import java.util.List;

public class QueueExampl3 {

	public static void main(String[] args) {
		
		List<Integer> list=new LinkedList<Integer>();
		
		
		list.addLast(200);
		for(int i=1; i<=10; i++)
		{
			list.add(i);
		}
		System.out.println(list);
//		list.addLast(200);
		
		list.addFirst(null);
		System.out.println(list);
		
		
		System.out.println("==================================================================");
		
		list.removeFirst();
		System.out.println(list);
		
		list.removeLast();
		System.out.println(list);
		
		System.out.println("==================================================================");
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		
	}
	
}