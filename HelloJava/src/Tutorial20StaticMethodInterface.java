/*
 * We can not create an object out of an interface. To access a method in an Interface, first we need to create a sub class 
 * and implements the interface there. After that create an object of the subclass to access the method in it.
 * From Java 1.8 and onward. We can define a method with static keyword inside an interface. By doing so we can directly
 * call the method using interface name without creating an object. In the following example NewInterface.oldshow() will give error
 * as static is not defined with it. 
 * 
 */

@FunctionalInterface
interface NewInterface{
	int i=10;
	void abc();
	default void oldshow() {
		System.out.println("In old way");
	}
	static void show() {
		System.out.println("New way. Introducted in Java 1.8. Static method");
	}
}
public class Tutorial20StaticMethodInterface {

	public static void main(String[] args) {
		NewInterface.show();
	}

}
