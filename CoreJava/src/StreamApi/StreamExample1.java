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
// for each method used to iterate and perform only print
// collect method used for new list or set while for each method is used for print only


//Stream is nothing but pipe line of data 

// jo list ka type hoga whai stream ke object ka type


//map uses
//ojetc ke conversion karta hai and name denge to alag se length of name ka alag se list mil jai
//map like for each method but map return somethings

//map  belongs to stream

//fillter ka return type stream hai and predicate ka parameter ka type hai
// collect method is used for new list


