package MultiThreading;

class Thread1 implements Runnable
{

	
	public void run() {
		
		
		System.out.println("Thread 1");
		
	}
	
}

public class MtExample4 {

	public static void main(String[] args) {
		
		Thread t1=new Thread(new Thread1());
		t1.start();
		
		
// anonymous innner class bana kar agar hum multithreding karen ge to hume bar bar alag class banane ki neeed nahi hai

//		Runnable r1= new Runnable() {
//			
//			@Override
//			public void run() {
//				
//				
//				System.out.println("anonymous inner class");
//			}
//		};
//		
//		
//		Thread t2=new Thread(r1);
//		t2.start();
	
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				
				System.out.println("anonymous inner class");
			}
		});
		 t2.start();
		
		 
		 
		 
	}
	
	
	
}
