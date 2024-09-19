//ek block of code ko bar bar exicute karna hai to hum method use karenge

// Syntex of declaring methods
//return_type method_name(datatype parameter)
//{
//}


class Book
{
	int bookId;
	String bookName;
	float price;
	
	void bookDetials()
{
	System.out.println("bookDetials");
}
	
}





class method1
{
	public static void main(String[]args)
	{
		Book b1=new Book();
		
		b1.bookDetials();
		
		b1.price=12;
		
		System.out.println(b1.price);
		
	}
}
