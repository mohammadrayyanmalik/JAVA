package MultiThreading;

public class MtExample6 {

	public static void main(String[] args) throws InterruptedException {
		
		Counter1 counter=new Counter1();
		Thread t1=new Thread(()->{
			for(int i=1; i<=500; i++)
			{
				counter.increament();
				
			}
			
		});
		
		
		
	
		Thread t2=new Thread(()->{
			for(int i=1; i<=500; i++)
			{
				counter.increament();
			}
			
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(counter.count);
	}
}
