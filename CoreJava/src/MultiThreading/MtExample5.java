package MultiThreading;



public class MtExample5 {

	
	public static void main(String[] args) {
		
		Runnable r1=()->System.out.println("multiThreaing with lamda");
		
		Thread t1=new Thread(r1);
		t1.start();
		
		
		System.out.println("================================================");
		
		Runnable r2=()->System.out.println("multithreading with lamda2");
		Thread t2=new Thread(r2);
		t2.start();
		
		System.out.println("======================================================");
		
		Thread t3=new Thread(()->System.out.println("lamda"));
		t3.start();
		
		
		
		
		
	}
}

