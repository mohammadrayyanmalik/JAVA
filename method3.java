class Employee
{
	int empId;
	String empName;
	int salary;
	
	void setEmpDetials(int empId,String empName,int salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		
		System.out.println(this.empId+" "+empName+" "+salary);
	}
}


class method3
{
	public static void main(String[]args)
	{
		Employee e1=new Employee();
		e1.setEmpDetials(101,"Rayyan",10000);
		
		Employee e2=new Employee();
		e2.setEmpDetials(102,"Qasim",199999);
		
		
	}
}

// object ke sath hamesha instance variable ko hi likha jaiga
// this keyword ke sath instance variable likhe jate hain
// this keyword works for current object