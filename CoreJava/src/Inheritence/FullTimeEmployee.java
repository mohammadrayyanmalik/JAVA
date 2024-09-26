package Inheritence;

public class FullTimeEmployee extends Employee {
	int noOfLeaves;
	int insuranceNumber;
	
	
	FullTimeEmployee(int id, String name, double monthlySalary,int noOfLeaves,int insuranceNumber )
	{
		super(id,name,monthlySalary);
		this.noOfLeaves=noOfLeaves;
		this.insuranceNumber=insuranceNumber;
	}
}
