package Encapsulation;

public class stdEncapsulaton {
	public static void main(String[] args) {
		
		Student s1=new Student(101,"Samir", 18);
		
		
	System.out.println(s1);
		s1.setId(101);
		System.out.println();
		
		
		s1.setName("Rayyan");
		System.out.println(s1.getName());
		
		int a=20;
		s1.setAge(a);
		
		System.out.println(s1.getAge());
		
	}
}



//encapsulation 
//rules 
//1) private variable  
//2) public methods  dusre class ke through data access kareng/


//security purpose (it set security layer on the class)

//encapsulaton me ek setter and getter hoga set jo value set karega and 
//getter always non parametarized and return any value

//her ek variable ka alag se setter banana pade ga

//setter ka data type always void hona chahiye

// pojo class 
// private variable, getter and setter  mehtods , constructor and to string ;


// jab hum kisi object ko print karenge to  object apne parents class ko dhontta hai agar class ka koi parent
// nahi hai to java ke pass ek object name ka ready made class hota hai jis ke pass ek toString name ka method 
// hota hai jisko over ride karke hum jo chahen woh print kara sakte hain other wise toString method ke pass 
// jo address hai woh print hoga

