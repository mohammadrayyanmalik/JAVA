package MultiThreading;

import java.util.Iterator;

class M1 extends Thread
{
		int n=10;
		
		public void run()
		{
			for (int i=1; i<=10; i++)
			{
				System.out.println(10*i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
}


class M2 extends Thread
{
	int sum=0;
	public void run()
	{
		 for (int i=1; i<=10; i++)
		 {
			 sum=sum+i; 
		 }
		 System.out.println(sum);
		 try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


public class MTExample2 {

	
	public static void main(String[] args) {
		
	M1 m1=new M1();
	m1.start();
	try {
		m1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	M2 m2=new M2();
	m2.start();
	
	}
}
