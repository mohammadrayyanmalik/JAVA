package Inheritence;

public class HierarchichalInheritence {
	public static void main(String[] args) {
		 FullTimeEmployee fue=new  FullTimeEmployee(101,"Amit",20000,10,1234);
		 System.out.println(fue.monthlySalary);
		 System.out.println(fue.name);
		 
		 
		 PartTimeEmployee pte=new PartTimeEmployee(102,"Gurjeet",100000,20000);
		 System.out.println(pte.monthlySalary);
		 System.out.println(pte.name);
	}
}


// Multiple inhertence is not allow in java throgh classes it can be done by interfaces
// 2 class ki propert ek sath nahi mang sakte hain
