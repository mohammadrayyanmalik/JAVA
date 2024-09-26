package Inheritence;

public class multiLevelInheritence1 {
	public static void main(String[] args) {
		CollegePassOutPerson CPOP=new CollegePassOutPerson(11,"Samir","mahatashtra","MU");
		System.out.println(CPOP.collegeCertificateNO);
		System.out.println(CPOP.name);
		System.out.println(CPOP.schoolCertificateNo);
		
		System.out.println("================================");
		SchoolPassOutPerson SPOP=new SchoolPassOutPerson(12,"Amit","Utterparadesh Board");
		System.out.println(SPOP.id);
		
		System.out.println("================================");
		Person p1=new Person(101,"Gurjeet");
		System.out.println(p1.name);
	
				
		
	}
}



// Hierarchical Inheritence
// one parent multiple children
// jab ek cheez ke multiple type honge tab hum is ko use karege
// jab ek cheez ko multiple class me distribute karna hoga to ise use karege
// e.g. class c and b inherit with class a 