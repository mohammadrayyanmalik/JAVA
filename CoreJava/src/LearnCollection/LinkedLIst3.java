package LearnCollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LinkedLIst3 {
	
	public static void main(String[] args) {
		List<Integer> number=Arrays.asList(12,212,21,2,3);
		System.out.println(number);
		
		
		System.out.println("==================================================");
		
		Collections.sort(number);
		System.out.println(number);
			// comparable interface used karenge to hum koi ek variable used kar sakte hain
		//
		System.out.println("Smallest elements: "+number.get(0));
		System.out.println("Largest elements: "+number.get(number.size()-1));
		
		System.out.println("==================================================");

		
		
		
	}
	
}
//comparable interface used karenge to hum koi ek variable used kar sakte hain
