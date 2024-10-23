package LearnCollection;

import java.util.TreeSet;

public class SetExample5 {

	public static void main(String[] args) {
		
		TreeSet<Integer> treeSet=new TreeSet<Integer>();
		
		treeSet.add(10);
		treeSet.add(20);
		treeSet.add(30);
		treeSet.add(40);
		treeSet.add(20);
		treeSet.add(330);
		System.out.println(treeSet);
		System.out.println(treeSet.higher(10));
		
		System.out.println(treeSet.lower(330));
		
		System.out.println("===================================================");
		
		System.out.println(treeSet.ceiling(11));
		System.out.println(treeSet.floor(100));
		
		System.out.println("===================================================");

		System.out.println(treeSet.headSet(40)); 
		System.out.println(treeSet.headSet(330,true));


		System.out.println("===================================================");

		
		System.out.println(treeSet.tailSet(10));
		System.out.println(treeSet.tailSet(10,false));
		
		System.out.println("===================================================");

		System.out.println(treeSet.subSet(10, 330));
		System.out.println(treeSet.subSet(10,false, 330,true));
		
		
	}
	
}
//  methods only for treeSet  otherthan linkedhashsetand hashset
// hiher, lower, ceiling and floor, headset and tailset,sub set,


// higher method give bigger value that we pass in higher
// lower opposite of higher


// ceiling check karta hai ki value jo hum ceiling ke under pass kiye hain woh avilable hai ya nai agar hai
//to wi return kare ga aur agar nahi hai to uske opposite
// floor opposite of ceiling 


// higher methods me jo value denge woh tree set me se usse badi value laiga




// haedset me jo pass karenge ske aage ke sabhi show karege aur agar sath me true likhen ge to woh no nbhi include hoga