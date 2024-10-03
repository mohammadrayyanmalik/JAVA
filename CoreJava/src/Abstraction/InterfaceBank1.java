package Abstraction;

public class InterfaceBank1 {
	public static void main(String[] args) {
		Bank s1=new HDFC();
		s1.detials();
		s1.address();
	}
}



//parent can hold object of child 
// i have bank, SBI, HDFC
// eg. Bank s1=new SBI/HDFC  <we can write both> (); 