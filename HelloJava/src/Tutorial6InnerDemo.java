/*
 *	Three Types of Inner class: 
 * 	Member Class : We need object of outer class to call Member Class
 *  Static Class : We can directly call the outer class.Check the accessing of static and inner class. 
 *  For static class use Class name for member class use outer class obj
 *  Anonymous Class :
 *  When we compile the java source it creates class file for each class. For outer class one. For inner class one class.
 */

class Outer{
	int a;
	void display() {
		System.out.println("Outer");
	}
	
	class Inner{		
		void show() {
			System.out.println("I am in Inner class");
		}
	}
	
	static class Inner2{
		void show2() {
			System.out.println("2nd Inner class");
		}
	}
}


public class Tutorial6InnerDemo {

	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.display();
		
		// Point to be noted here. for creating object of inner class we need outer class object
		// To access Inner class we need to have Outer class name.
		// When we create an object of a class. First class gets loaded in memory by loader function in JVM.
		// Then create multiple object out of this class. Object gets memory from heap memory. 
		
		// Member Class
		Outer.Inner obj2 = obj.new Inner();
		obj2.show();
		
		// Static Class (check the difference in Object creation)
		Outer.Inner2 obj3 = new Outer.Inner2();
		obj3.show2();
	}

}
