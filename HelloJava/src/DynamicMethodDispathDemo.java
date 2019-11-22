
class A3
{
	public void show()
	{
		System.out.println("In A3");
	}
}

class B3 extends A3
{
	public void show()
	{
		System.out.println("In B3");
	}
	
}

class C3 extends A3
{
	public void show()
	{
		System.out.println("In C3");
	}
	
}


public class DynamicMethodDispathDemo {
	public static void main(String[] args) {
		// obk reference type is A3. But we can create a child obj also and assign to this reference.
		A3 obj = new B3();			// run time Polymorphism
		obj.show();
		System.out.println("##");
		obj = new C3();
		obj.show();				//Dynamic Method Dispatch

	}

}
