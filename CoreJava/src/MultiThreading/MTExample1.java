package MultiThreading;

class T1 extends Thread 
{
	public void run()
	{
		for (int i=1;i<=10; i++) 
		{
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


class T2 extends Thread  
{
	public void run()
	{
		for (int i=1;i<=10; i++) 
		{
			System.out.println("By By");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
}

public class MTExample1 {

	public static void main(String[] args) {

		
//		System.out.println("Main Methods");
			T1 t1=new T1();
			t1.start();
		
			T2 t2=new T2();
			t2.start();
			
			try {
				t1
				.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}// jab tak t2 apna kam finish  nahikarega tab tak main method execute nahi hoga
			
			
			
			System.out.println("main methods");
			
			
			
	}
	
}
//multitheareding jab 1 applicaton me do kam ek sath hon eg.wordfile
//multiprocessing 2 alag application ko ek sath use karne ko bolte hain
//how to create multithreding 
//1) by extending thread class          2) by implementing runnable interface
//start method belongs to thread class and run method belongs to runnable interface
//run method ka implementation provide karenge nut hum run method ko call nahi kar sakte hai
// thread 1 time karne ke baad woh dead ho jati hai
// thread has a capability to stop your programm for some time
// for gap of 1 second write in sleep method 1000   eg.sleep(1000)
// main method is also a thread 


// demon method 
// demon method start method ko call karne se pahle hi batana padega ki thread demon hai
// demon method bolta hai ki jab tab tak main thread chalega tab tak demon thread chalega onluy main thread
//threrad creat karne ke liye setDeamon method ka use karenge