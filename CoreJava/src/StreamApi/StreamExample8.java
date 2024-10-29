package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StreamExample8 {

	public static void main(String[] args) {
		
//		List<Integer> number=Arrays.asList(10,2,45,767,4);
		List<Integer> number=Arrays.asList();
		
		Optional<Integer> reduce = number.stream().reduce((a,b)->a+b);
		System.out.println(reduce);
		
//		Integer integer = reduce.get();// optional method ke object ke sath agar get lagain ge to value ko print kariga
		//									aur agar value empty hai to exception aaiga but ye excepton readymade hoga
//		System.out.println(integer);
		
		//--------------------------------------------------------------------------------------
		// to give exception we used orElseThrow
		
		
		
		Integer integer2 = reduce.orElseThrow(()->new RuntimeException("List is empty"));
		
		System.out.println(integer2);
		
		
		
	}
	
}

// poore list ko single number me convert karne ke liye hum reduce method ko used karenge
// incase list is empty when we used reduced method on optional, optional bolega i am empty
//optional method ke object ke sath agar get lagain ge to value ko print kariga
// value empty hai to exception aaiga but ye excepton readymade hoga

//to give exception we used orElseThrow