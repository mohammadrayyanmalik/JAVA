package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;




public class StreamExample9 {

	public static void main(String[] args) {
		
//		List<Integer> numbers=Arrays.asList(11,21,34,553);
		List<Integer> numbers=Arrays.asList();
		Optional<Integer> first = numbers.stream().findFirst();
		System.out.println(first);
		
//		Integer integer = first.get();
//		System.out.println(integer);
	
		Integer i = first.orElseThrow(()->new ArithmeticException("list is empty"));
		System.out.println(i);
	}
	
}
