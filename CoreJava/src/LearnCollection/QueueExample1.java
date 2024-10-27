package LearnCollection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueExample1 {

	
	public static void main(String[] args) {
// syserr red out put show karega
		//System.err.println("Hello");
		
		PriorityQueue<Integer> numbers=new PriorityQueue<Integer>((i1,i2)-> i2-i1);
		
		Iterator<Integer> iterator=numbers.iterator();
		
		for(int i=1;i<=20;i++)
		{
			numbers.add(i);
			
		}
		System.out.println(numbers);
		System.out.println(numbers.poll());
		System.out.println(numbers);
		
		System.out.println("==============================================");
		
			
		
	}
}



// priority: 2classes milte hain jo jizen store kartte hain line me
// Queue:priority Queue jo sabse chota rahega uski priority sab se zyada (By default asc order me rahege)
// priorty queue me insertion order maintain nahi rehta hai but sab se chota elemnet pehle dikhe ga 
//but uske baadd ka element sequence me ho zaroori nahi



// d queue methods jis me start and end dono se element remove kar sakte hain


// pop means lastNumbers and poll means first NUmbers