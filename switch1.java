// its similar to elseifladder something
// in if statement we can give boolean ( true and  false) but in switch we can give string and char.
// break key word agar value true hoti hai to direct case se bahar aane ke liye hum break ka use karte hai
// we can write break  in elseifladder but defult only for switch
import java.util.*;
class switch1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		//		value
		/*switch(21)
		{
			case 1:
				System.out.println("case 1");
				break;
			case 2:
				System.out.println("case 2");
				break;
			case 3:
				System.out.println("case 3");
				break;
			
			default:
				System.out.println("No matching case");
		}	*/
		System.out.println("1:Monday  2:Tuesday  3: Wednesday  4:Thursday  5: friday 6: Satarday  7:Sunday");
			int n=sc.nextInt();
		
		
		switch(n)
		{
			
		case 1:
			System.out.println("moday");
			break;
				case 2:
			System.out.println("tuesday");
			break;
				case 3:
			System.out.println("wednesday ");
			break;
				case 4:
			System.out.println("thursday");
			break;
				case 5:
			System.out.println("friday");
			break;
				case 6:
			System.out.println("satarday ");
			break;
				case 7:
			System.out.println("Sunday");
			break;
		}
		
		
	}
	
}