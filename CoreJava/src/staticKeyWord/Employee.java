package staticKeyWord;

public class Employee {

	int empId;
	String empName;
	static String ceo="Amit";
	
	Employee(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Employee.ceo="Gurjeet";
		Employee e1=new Employee(101,"Samir");
		Employee e2=new Employee(102,"Rayyan");
		
		System.out.println(e1.empId);
		System.out.println(e2.empId);
		System.out.println(Employee.ceo);
	}
	
}
// static variable ko class name ke sath bhi access kar sake hain