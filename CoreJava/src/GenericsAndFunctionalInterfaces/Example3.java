package GenericsAndFunctionalInterfaces;

import java.util.function.Predicate;

import Encapsulation.Student;
public class Example3 {
	public static void main(String[] args) {
		
	 Predicate<Student> checkAge=new Predicate<Student>() {

		@Override
		public boolean test(Student t) {
			// TODO Auto-generated method stub
			return t.getAge()>=0;
		}
			
	 };
	 Student student=new Student(101,"Rayyan",19);
	 
	boolean ans=checkAge.test(student);
	 System.out.println(ans);
	}
}
