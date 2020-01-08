/*
 * Abstract Class -> Can Define and declare methods
 * Interface -> can only declare method can not define method.. till Java 1.7
 * From 1.8 onward we can define method also in interface. Now there is not much difference between abstract and Interface
 * In Functional interface we can have only one abstract method.
 * To declare a method in interface use default. 
 * So in Functional interface we can have multiple default methods but only one abstract method
 * We can override the default method in child class
 * If we create a variable inside Interface by default that becomes final. We can not change it in the child/sub class.
 * But we can create a variable with the same name in child class.
 */

@FunctionalInterface
interface Demo{
	int i=10;	// it is same as final int i=10;
	void show();   // This is abstract method
	default void display() {   
		System.out.println("in show");
	}	
}

class AB implements Demo{
	int i=11;  // Without this defining i inside show gives error. Saying changing final variable from the interface.
	public void show() {
		i = 11;
		System.out.println("hi");
	}
	
	@Override
	public void display() {
		System.out.println("in display");
	}	
}

public class Tutorial18DefaultMethod {

	public static void main(String[] args) {
		Demo obj = new AB();
		obj.show();
		obj.display();

	}
}
