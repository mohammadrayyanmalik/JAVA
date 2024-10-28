package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExample5 {

	public static void main(String[] args) {
		
		List<Integer> number=Arrays.asList(11,12,33,44,53,2);
		
		number.stream().filter((n)->n>20).forEach(n->System.out.println(n));
		
		
		System.out.println("=============================================");
//	 Collector<Object, ?, List<Object>> list = Collectors.toList();
		
		
		List<Integer> Greaterthan20 = number.stream().filter(n->n>20).collect(Collectors.toList());
		
		System.out.println(Greaterthan20);
		
		
		System.out.println("=============================================");
		
		List<String> names=Arrays.asList("Amit","Rayyan","Qasim","Gurjeet","Nisha","Nikita");
		
//		List<String> namesStartWithN = names.stream()
//				.filter(name->name.startsWith("N"))
//				.collect(Collectors.toList());
//		
//		System.out.println(namesStartWithN);
		
		
	}
	
}
//fillter ka return type stream hai and predicate ka parameter ka type hai 