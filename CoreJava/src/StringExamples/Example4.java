package StringExamples;

public class Example4 {
	public static void main(String[] args) {
		
		String s1="hello ";
		String s2;
		s2=s1.concat("world");
		System.out.println(s2);
		
		
		
		System.out.println("========================================");
		
		// trim is a method which is remove spaces from start and end beecj ke space count honge
		
		System.out.println("He                   ll        o         ".trim()+"world");
		
		System.out.println("========================================");
		// length method is used to count the length of words
		// return type int
		System.out.println("Rayyan".length());
		
		
		
		System.out.println("========================================");
		// charAt find out the latter from a specific words
		// return type char
		System.out.println("Qasim".charAt(2));
		
		System.out.println("========================================");
		// indexOf find
		// indexOf retun type int
		System.out.println("PineApple".indexOf('p',3));
		
		
		
		
		System.out.println("========================================");
		// startWith to check the jo aap ne mention kiya hai string woh usi se start hua hai ki nahi
		
		System.out.println("Laptop".startsWith("L"));
		
		
		System.out.println("========================================");
		// toCharArray convert the string into array
		
		String s="Mouse";
		char arr[]=s.toCharArray();
		
		for(char ch:arr)
		{
			System.out.println(ch);
		}
		
		
		System.out.println("========================================");

		
		
	}
}

// concat method belongs to string class
// concat method used to combine to or more words 
// 


// trim