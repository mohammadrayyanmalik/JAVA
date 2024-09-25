package Inheritence;

public class Student {
	int rollNo;
	String name;
	int marks;
	
	Student()
	{
		
	}
	
	Student(int rollNo,String name, int marks)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}
	
}

class SportStudent extends Student{
	int graceMarks;
	String sportName;
	
	
	SportStudent(int rollNo,String name,int marks,int graceMarks,String sportName)
	{
		super(rollNo,name, marks);
		this.graceMarks=graceMarks;
		this.sportName=sportName;
	}
	
	
}


