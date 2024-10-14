package Encapsulation;

public class Student {
	
	private int id;
	private String name;
	private int age;
	
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public int getId(String password)
	{	
		if (password.equals("123"))
		return this.id;
		else 
		return 0;
		
	}
	
	
	
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
//	public String toString()
//	{
//		return this.id+"";
//	}
	
}

