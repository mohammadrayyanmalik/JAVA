package LearnCollection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ListExample4And5 {
		public static void main(String[] args) {
			
			LinkedList<Integer> list=new LinkedList<Integer>();
			
			list.add(33);
			list.add(20);
			list.add(11);
			list.add(90);

//			Collections.sort(list);
//			System.out.println(list);
			
			
			
			// Iterator
			Iterator<Integer> iterator=list.iterator();
			
//			System.out.println(iterator.next());
//			System.out.println(iterator.next());
//			System.out.println(iterator.next());
			
			System.out.println("=============================================================");
			
			
			while(iterator.hasNext())
			{
				System.out.println(iterator.next());
			}
			
			
			
			
		}
}
// collection also provides iteretion
// agar iterate karte karte remove ya add karna hai to hum collection iterate method ko used karenge
// has next method check karti hai ki next elemenent present hai ya nnhi jab tak true mile ga tab tak vlaue return hogi other wise false hoga.
