package StringExamples;

public class Example2 {
	public static void main(String[] args) {
		String a="Hello";
		String b="HELLO";
		
		System.out.println(a.equals(b));
		System.out.println(a.equals("Hello"));
		System.out.println(a.equals("HELLO"));
		
		System.out.println("================================================");
// equals ignore case
		System.out.println(a.equalsIgnoreCase(b));
		
		System.out.println("================================================");

		String c="A";
		String d="a";
		
		System.out.println(c.compareTo(d));
		
		System.out.println("================================================");
		System.out.println("================================================");

		
		String s="INDIA";
		s=s.toLowerCase();
		System.out.println(s);
		
		
	}
}

// String ka compairision hum  equals method ke sath karen ge
// equals ignore case method agar case ko ignore karne hai aur sirf value check karni hai to hum equal ingnore case ka use karen ge


// compair to method
// if both string are equal then return 0
// if string 1 > Sting 2 then return positive value
// if  String 1 < String 2 then rreturn negative vales 


// toLower case convert into lower Case all the content