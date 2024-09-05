import java.util.*;
class vowel
// operater hum sirf if statement likh sakte hain switch me nahi kion ki orerator ko true aur false chahiye
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character");
		char ch=sc.next().charAt(1);
		
		switch(ch)
		{
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'o':
			case 'O':
			case 'i':
			case 'I':
			case 'u':
			case 'U':
			System.out.println("it's vowel");
			break;
			
			
			
			
		}
	}
	
}