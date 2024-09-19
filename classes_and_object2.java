class Employee
{	// instance variable
	int id;
	String name;
	String add;
	String email;
	
	void employeeDetials()
	{
		System.out.println(id);
	}
	
	
}




class classes_and_object2
{
	public static void main(String[]args)
	{
	Employee e1=new Employee();
	Employee e2=new Employee();
	Employee e3=new Employee();
	
	
	
	
	
	e1.employeeDetials();
	
	e1.id=1;
	e1.name="Rayyan";
	e1.add="xzy";
	e1.email="mrr@gmail.com";
	
	e1.employeeDetials();
	
	System.out.println(e1.id);
	System.out.println(e1.name);
	System.out.println(e1.add);
	System.out.println(e1.email);
	
	System.out.println("================================");
	
	e2.employeeDetials();
	
	e2.id=2;
	e2.name="Asrar";
	e2.add="abc";
	
	System.out.println(e2.id);
	System.out.println(e2.name);
	System.out.println(e2.add);
	
	System.out.println("================================");
	
	e3.employeeDetials();
	
	e3.id=3;
	e3.name="Amit";
	e3.add="qrf";
	
	System.out.println(e3.id);
	System.out.println(e3.name);
	System.out.println(e3.add);
	
	
	}
}