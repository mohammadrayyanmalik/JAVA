package Inheritence;

public class Programmer extends FullTimeEmployee
{
	String programmingLanguage;

	public Programmer(int id, String name, double monthlySalary, int noOfLeaves, int insuranceNumber,
			String programmingLanguage)
	{
		super(id, name, monthlySalary, noOfLeaves, insuranceNumber);
		this.programmingLanguage = programmingLanguage;
	}
	
	
	
}
