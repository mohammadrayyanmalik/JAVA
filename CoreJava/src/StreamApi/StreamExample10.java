package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamExample10 {

	
	public static void main(String[] args) {
			
		List<Integer> numbers=new ArrayList<Integer>();
		for (int i=1;i<=100;i++)
		{
			numbers.add(i);
		}
		System.out.println(numbers);
		
//		numbers.stream().forEach(n->System.out.println(n));
		
		System.out.println("================================================");
		
		
		
		Optional<Integer> any = numbers.parallelStream().findAny();// fid any is not use for single pipe line 
		System.out.println(any);
		
		System.out.println("===============================");
		numbers.parallelStream().forEach((num)->{
			System.out.println(num);
		});
		
		System.out.println("================================================");
		boolean evenMatch = numbers.stream().anyMatch(n->n%2==0);
		System.out.println(evenMatch);
		
		System.out.println("===========================================");
		boolean anyMatch = numbers.stream().anyMatch(n->n==1000);
		System.out.println(anyMatch);
		
		
//		numbers.stream().anyMatch(n->{
//			n==1000
//		});
		System.out.println("===========================================");
		boolean allMatch = numbers.stream().allMatch(n->n%2==0);
		System.out.println(allMatch);
		
		System.out.println("===========================================");
		boolean noneMatch = numbers.stream().noneMatch(n->n>10000);
		System.out.println(noneMatch);
	}
	
}

