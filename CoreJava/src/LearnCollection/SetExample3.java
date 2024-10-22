package LearnCollection;

import java.util.LinkedHashSet;

public class SetExample3 {

	
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> link=new LinkedHashSet<Integer>();
		
		link.add(10);
		link.add(21);
		link.add(10);
		
		System.out.println(link);
		
	}
}


// linked hash set null vlaue are allowed
// linked hash set give the sequence of insertion