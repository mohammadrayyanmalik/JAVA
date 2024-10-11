package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example6 {
	public static void main(String[] args) {
		
		try {
		new FileInputStream("Rayyn");
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println("file not found");
		}
		
		
		
		
		
		
	}
}
