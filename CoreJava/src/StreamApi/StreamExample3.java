package StreamApi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample3 {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(12,23,454,122,12,11,22,33,3);
		list.stream().filter((n)->n%2==0).forEach((n)->System.out.println(n));
		
		
	

		
	}
	
}
