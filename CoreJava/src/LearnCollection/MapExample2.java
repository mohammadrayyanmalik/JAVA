package LearnCollection;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class MapExample2 {
		
	public static void main(String[] args) {
		
		LinkedHashMap<String , String> phoneNumber=new LinkedHashMap<String, String>();
		
		phoneNumber.put("amit", "111");
		phoneNumber.put("samir", "333");
		phoneNumber.put("asrar", "222");
		phoneNumber.put("Rayyan", "111");
		
		System.out.println(phoneNumber);
		
		System.out.println("==================================================================");
		
		Scanner sc=new Scanner(System.in);
		
		String name=sc.next();
		
		if (phoneNumber.containsKey(name))
		{
			System.out.println("Phone no is present "+phoneNumber.get(name));
			System.out.println("Do you want to change it (Y/N)");
			char desicion=sc.next().charAt(0);
			if (desicion=='Y')
			{
				String newPhoneNO=sc.next();
				phoneNumber.put(name, newPhoneNO);
			}
			else
			{
				System.out.println("Invalid Keys");
			}
			
		}
		
		else {
			String phoneNo=sc.next();
			phoneNumber.put(name, phoneNo);
		}
		
		
		System.out.println(phoneNumber);
	}
	
}
 
