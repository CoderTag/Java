// If you want to change behavior of some method of a class you have two options. One you created a child class
// In child override the method. Or you create an anonymous class.
// Usually you can not create obj of interface. But if you use anonymous class you can create object of interface
// SO if you dont want to reuse the class definition it is good to use anonymous class.

interface A13
{
	void showna();
}

class A12
{
	public void show()
	{
		System.out.println("he is good");
	}
}
class B12 extends A12
{
	public void show()
	{
		System.out.println("One way of changing show method behavior");
	}
	
}
public class AnonymousClassDemo {

	public static void main(String[] args) {
		
		B12 obj = new B12();
		obj.show();
		
		A12 obj2 = new A12()
				{
					public void show()
					{
						System.out.println("2nd way of changing show method behavior");
					}
				};
		obj2.show();
		
		A13 obj3 = new A13() {
				public void showna() {
					System.out.println("Can create object of interface");
				}
		};
		obj3.showna();

	}

}
