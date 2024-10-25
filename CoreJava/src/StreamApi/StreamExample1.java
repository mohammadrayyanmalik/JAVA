package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();

		for (int i=1; i<=20; i++)
		{
			list.add(i);
		}
		
		System.out.println(list);
		
		System.out.println("========================================================================");
		
			Stream<Integer> stream=list.stream();
			
//			Consumer<Integer> c=(i)->System.out.println(i);
		stream.forEach((i)->System.out.println(i)); // both can be used
		
		System.out.println("=======================================================");
		
		List<String> names = Arrays.asList("puja", "Amit", "Samir","Rayyan","Qasim");
		
		Stream<String>  streamName=names.stream();
		
		streamName.forEach((name)->System.out.println(name+" "+name.length()));
		
	
			
		
	}
	
}
// Stream Api JAva 8 ka feature hai
//stream is a faster than enhance for loop
//jab her ek elements per one by one operation perform karna ho to hum (Map ) use karenge
//filter 
//forEach Method consumer ka object hi used karenge
//for each Method belongs to Stream class
//Stream is nothing but pipe line of data 

// jo list ka type hoga whai stream ke object ka type



