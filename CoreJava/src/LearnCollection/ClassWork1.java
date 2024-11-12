package LearnCollection;

import java.util.Arrays;
import java.util.List;

public class ClassWork1 {

	
	public static void main(String[] args) {
		
		List<Integer> number=Arrays.asList(12,45,23,905,345,82);
		
		System.out.println(number);
		
		for(Integer n:number)
		{
			if(n%5==0)
			{
				System.out.println(n);
			}
		}
		
	}
	
	
	
	
}
