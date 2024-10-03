package Abstraction;

public class InterfaceBank1 {
	public static void main(String[] args) {
		Bank s1=new HDFC();
		s1.detials();
		s1.address();
		s1.methodBank();
		Bank.staticMethod();
		System.out.println("=========================================================");
		
		Bank Axis=new Bank() {
			public void detials()
			{
				System.out.println("Detials of AXIS bank");

			}
			
			public void address()
			{
				System.out.println("Address of Axis Bank");
			}
			
		};
		Axis.address();
		Axis.detials();
		
		System.out.println("=========================================================");

		
		Bank ICICI=new Bank() {
			public void detials()
			{
				System.out.println("Detials of ICICI bank");
			}
			
			public void address()
			{
				System.out.println("Address of ICICI bank");
			}
		};
		
		ICICI.address();
		ICICI.detials();
		
	}
}



//parent can hold object of child 
// i have bank, SBI, HDFC
// eg. Bank s1=new SBI/HDFC  <we can write both> (); 


// multiple inheritence
// multiple parent one child
// multiple inheritence is not allow through classes
// multiple inheitence is allow through interface