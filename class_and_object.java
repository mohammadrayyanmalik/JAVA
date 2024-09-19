/*
// classes  means blueprint 
// class name always start with capital latter
// eg ClassName

// Syntex of class
	class ClassName
	{
	// variable 
	// methods
	}

// object means copy
*/

class Student
{
	// instance varible means variable only
	int rollNo;
	String name;
}


class classes_and_object1
{
	public static void main(String[]args)
	{
// datatype	    variable		object 
		Student s1=new Student();
		Student s2=new Student();
	
	s1.rollNo=101;
	s1.name="Rayyan";
	
	System.out.println(s1.rollNo);
	System.out.println(s1.name);
	
	System.out.println("=================================");
	
	s2.rollNo=102;
	s2.name="Asrar";
	
	System.out.println(s2.rollNo);
	System.out.println(s2.name);
	
	
	}
}