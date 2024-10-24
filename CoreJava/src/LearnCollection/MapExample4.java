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
		
		System.out.println("======================================================");
		
		System.out.println(map.lowerKey(106));
		System.out.println(map.lowerEntry(201));
		
		
		System.out.println("======================================================");

		System.out.println(map.ceilingKey(110));
		System.out.println(map.ceilingEntry(110));
		
		System.out.println("======================================================");

		
		System.out.println(map.floorKey(110));
		System.out.println(map.floorEntry(20));
		
		System.out.println("======================================================");
		
		System.out.println(map.headMap(201));
		System.out.println(map.headMap(201, true));
		
		
		System.out.println("======================================================");
		
		System.out.println(map.tailMap(106));
		System.out.println(map.tailMap(106,false));
		
		
		System.out.println("======================================================");

	System.out.println(map.subMap(102, 222));
	System.out.println(map.subMap(102, true,119,true));
	
	System.out.println("======================================================");
		System.out.println(map.firstKey()); // first key 
		System.out.println(map.lastKey());
		System.out.println(map.firstEntry());
		System.out.println(map.lastEntry());
	
		
		System.out.println("================================================");
			System.out.println(map.pollFirstEntry());
			System.out.println(map);
			
			System.out.println(map.pollLastEntry());
			System.out.println(map);
	
		
	}
}

// headmap ka return type map hoga
//it show range but first value by default include and last is exclusive