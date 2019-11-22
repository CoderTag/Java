//Type of Interface
//1. Normal --> This interface is having multiple abstract methods
//2. Single abstract method -> single abstract method. from Java 1.8 onward it is called as Functional Interface. 
//If you know functional interface you can use lamda expression. It is adapted from Scala.
//Lamda expression not possible with normal interface. As it has multiple methods. create confusion for lamda.
//3 Marker Interface  --> No method

@FunctionalInterface   // this line is optional, but better to use it
interface ABC
{
	void show();
}


public class LamdaInterfaceDemo {

	public static void main(String[] args) {
		ABC obj = new ABC() {
			public void show() {
				System.out.println("One way");
			}
		};
		obj.show();
		
		// Above thing can be done in following way as well
		ABC obj2 = ()->System.out.println("2nd way");
		obj2.show();

	}

}
