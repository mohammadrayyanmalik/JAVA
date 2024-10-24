package LearnCollection;

import java.util.TreeMap;

public class MapExample4 {

	
	public static void main(String[] args) {
		
		TreeMap<Integer, String> map=
						new TreeMap<Integer, String>();
		
		map.put(101, "A");
		map.put(102, "B");
		map.put(201, "C");
		map.put(222, "D");
		map.put(119, "E");
		map.put(911, "F");
		map.put(106, "G");
		
		
		System.out.println(map);
		
		System.out.println(map.keySet());
		System.out.println(map.higherKey(101));
		System.out.println(map.higherEntry(101));
	}
}
