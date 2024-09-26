package Inheritence;

public class PartTimeEmployee extends Employee{
	int bonus;
	
	PartTimeEmployee(int id, String name, double monthlySalary, int bonus)
	{
		super(id,name,monthlySalary);
		this.bonus=bonus;
	}
	
}
