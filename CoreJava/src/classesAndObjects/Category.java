package classesAndObjects;

public class Category {
	int categoryId;
	String categoryName;
	
	
	//with this it is default constructor
	Category()
	{
		System.out.println("Category object created");
	}
	
	
	Category(int categoryId,String categoryName)
	{
		this.categoryId=categoryId;
		this.categoryName=categoryName;
	}
	
}



