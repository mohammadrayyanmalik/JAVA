package StringExamples;

public class Example6 {
	 public static void main(String[] args) {
		
		 StringBuilder sb=new StringBuilder("Hello");
		 // reverse it reverse the string
		 sb.reverse();
		 System.out.println(sb);
		 
		 sb.reverse();
		 System.out.println(sb);
		 
		 
		 System.out.println("==========================================");
		 // replace method replace the string 
		 // 2 is not inclusive
		 sb.replace(0, 2, "*****");
		 System.out.println(sb);
		 
		 System.out.println("==========================================");
		 // append join karta hai
		 sb.append("world");
		 System.out.println(sb);
		 
		 System.out.println("==========================================");
		 
		 sb.delete(0, 7);
		 System.out.println(sb);
		 
	}
}
