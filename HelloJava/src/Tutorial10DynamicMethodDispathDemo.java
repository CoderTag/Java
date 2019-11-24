class A3
{
	public void show()
	{
		System.out.println("In A3");
	}
}

class B3 extends A3
{
	@Override	//Method Overriding
	public void show()
	{
		System.out.println("In B3");
	}
	
}

class C3 extends A3
{
	@Override
	public void show()
	{
		System.out.println("In C3");
	}
	
}

/*
 * There are two type of linking :
 * Compile Time Polymorphism
 * Run Time Polymorphism. Linking happen during run time
 * To have dynamic method dispatch we need to have run time polymorphism
 */

public class Tutorial10DynamicMethodDispathDemo {
	public static void main(String[] args) {
		// obj reference type is A3. But we can create a child obj also and assign to this reference.
		A3 obj = new B3();			// run time Polymorphism
		obj.show();
		System.out.println("##");
		obj = new C3();
		obj.show();				//Dynamic Method Dispatch. As the same object is used to call different methods
	}
}
