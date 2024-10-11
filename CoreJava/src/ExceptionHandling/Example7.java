package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example7 {
	
	public static void FileHandling() throws FileNotFoundException
	{
		new FileInputStream("abc.txt");
	}
	
	public static void main(String[] args) {
		
		System.out.println();
		try
		{
		FileHandling();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Handled exception");
		}
		
	}
}
// compile time exception
//throws keyword methods ke sath likhte hain
// throws keyword exception ke error ko sirf hatane ke liye used karte hain exception handle nahi hoga
// main mehtod ke baad direct java virtual matchine used karta hai

