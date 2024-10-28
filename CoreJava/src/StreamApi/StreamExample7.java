package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExample7 {

	public static void main(String[] args) {
		
		List<Integer> number=Arrays.asList(11,22,33,44,55);
		
		Function<Integer,Integer>squreFunction=(n)->n*n;
		List<Integer> square = number.stream()
				.map(squreFunction)
				.collect(Collectors.toList());
		
		System.out.println(square);
		
		System.out.println("=====================================================");
		
		
		List<Integer> multiplyBy10 = number.stream().map(n->n*10).collect(Collectors.toList());
		
		System.out.println(multiplyBy10);
		
		System.out.println("=====================================================");

		
		List<String> names=Arrays.asList("Rayyan","Amit","Asif","Nihal","Naseem");
		
		List<Integer> lenghtOfname = names.stream().map(name->name.length()).collect(Collectors.toList());
//		lenghtOfname.forEach(n->System.out.println(n));
		System.out.println(lenghtOfname);
		
	}
	
}
