package StringExamples;

public class Example5 {
	public static void main(String[] args) {
		String s1="Mobiooole";
		
		int count=0;
//		for(int i=s1.length()-1; i>=0; i--)
//		{
//			
//			System.out.print(s1.charAt(i));
//		}
		
		char arr[]=s1.toCharArray();
		for(char ch:arr)
		{
			if (ch=='o' || ch=='O')
			{
				count++;
			}
		}
		System.out.println(count); 
		
		
		


		
		
	}
}

// count no of vowel in a string  laptapo
// palindrom check 
// h 				e			ll			o			
// priti Amit Joel Gurjeet

