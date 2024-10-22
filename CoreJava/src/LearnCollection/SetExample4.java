package LearnCollection;

import java.util.Comparator;
import java.util.TreeSet;

public class SetExample4 {

	public static void main(String[] args) {
	
		
//	Comparator<Integer> c=(o1,o2)-> o2-o1;
//	
////	TreeSet<Integer> treeSet=new TreeSet<Integer>(c);
	TreeSet<Integer> treeSet=new TreeSet<Integer>((o1,o2)->o2-o1);
	
	treeSet.add(10);
	treeSet.add(20);
	treeSet.add(30);
	treeSet.add(10);	
	treeSet.add(10);
	treeSet.add(20);
	System.out.println(treeSet);

	
	}
	
}
// tree set ka parent sorted set and navigable set and these are interfaces
// tree set sort elements in accending order
// linked hashSet, hashSet and tree set all of these are used for uniquness
	
