package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExample8 {

	public static void main(String[] args) {
		
		List<Integer> number=Arrays.asList(10,2,45,767,4);
		
		Optional<Integer> reduce = number.stream().reduce((a,b)->a+b);
		System.out.println(reduce);
		
		
	}
	
}

// poore list ko single number me conver karne ke liye hum reduce method ko used karenge