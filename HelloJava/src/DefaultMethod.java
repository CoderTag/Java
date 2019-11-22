/*
 * Abstract Class -> Define a method and also declare a method
 * Interface -> can only declare method can not define method.. till Java 1.7
 * From 1.8 onward we can define method also in interface.
 *  
 */

@FunctionalInterface
interface Demo{
	void show();   // This is abstract method
	// We know Functional interface can not have more than one method. But here it is not giving error. Because 
	//In Functional interface we can have multiple default method but only one abstract method
	default void display() {   
		System.out.println("in show");
	}	
}

class AB implements Demo{
	public void show() {
		System.out.println("hi");
	}
	
	public void display() {
		System.out.println("in display");
	}
	
}
public class DefaultMethod {

	public static void main(String[] args) {
		Demo obj = new AB();
		obj.show();
		obj.display();

	}

}
