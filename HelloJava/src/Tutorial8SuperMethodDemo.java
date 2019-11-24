/*
 * When we create object of a sub class it call sub class constructor as well as super class constructor super() by default
 * If we pass parameter while creating obj of sub class it will call default constructor of parent class
 * but parameterize constructor of sub class
 */
class A
{
	public A()
	{
		System.out.println("In A");
	}
	public A(int i)
	{
		System.out.println("In int A");
	}
}

class B extends A
{
	public B() 
	{
		//super(5);
		System.out.println("In B");
	}
	
	public B(int i)
	{
		// super();  // It call it by default whether you mention it or not.
		System.out.println("In int B");		
	}
	
}

public class Tutorial8SuperMethodDemo {

	public static void main(String[] args) {
		A obj1 = new A();
		System.out.println("#######");
		B obj2 = new B();
		System.out.println("#######");
		B obj3 = new B(4);
	}

}
