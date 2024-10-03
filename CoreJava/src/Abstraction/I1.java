package Abstraction;

public interface I1 {
	// internally 
	// public abstracgt void display();
	void display();
	void square(int n);
	
	int number(int a);
}
//interface ke under all methods are  by default to be public abstract
/// inerface keunnder jitne chaho utne methods use karskate hain
// interface ka objectnahi bana sakte hain 
// interface ko inherit karne ke liye hum implementation keyword ka use karna padega
// interface does not allow normal method but agar hum access modifier ko default kardenge to use karsakte hain
// after java 8 defult method hum interface me use karsakte hain