package MultiThreading;

class T3 extends Thread
{
	public void run ()
	{
		while(true)
		{
			System.out.println("********");
		}
	}
}



public class MtExample3 {

	public static void main(String[] args) {
		
		T3 t3=new T3();
		t3.setDaemon(true);// threrad creat karne ke liye setDeamon method ka use karenge
		t3.start();
		
		try {
			t3.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
