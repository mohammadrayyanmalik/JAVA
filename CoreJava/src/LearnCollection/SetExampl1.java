package LearnCollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SetExampl1 {

	public static void main(String[] args) {
		
		HashSet<Integer> hashSet=new HashSet<Integer>();
		
		hashSet.add(10);
		hashSet.add(30);
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add(null);
		System.out.println(hashSet);
		
		System.out.println("========================================");
		
		// list object ko set method me convert karna hai
		
		List<Integer> list=Arrays.asList(12,32,43,12,23,33,33);
		
		System.out.println(list);
		
		HashSet<Integer> set=new  HashSet<Integer>(list);
		System.out.println(hashSet);
		
		
	}
	
}
// set is not allows duplicate value
// hashset  doed not follow indexing it means it added elements any index
// it can accept null value