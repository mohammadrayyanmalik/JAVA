package LearnCollection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetExample3 {

	
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> link=new LinkedHashSet<Integer>();
		
		link.add(10);
		link.add(21);
		link.add(10);
		
		System.out.println(link.size());
		
		System.out.println("==============================================================");
		Iterator<Integer> iterator=link.iterator();
		
//		System.out.println(iterator.next());
		
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println(link.isEmpty());
		
		
		
	}
}


// linked hash set null vlaue are allowed
// linked hash set give the sequence of insertion