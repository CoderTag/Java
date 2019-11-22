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
		System.out.println("In int B");		
	}
	
}

public class SuperMethodDemo {

	public static void main(String[] args) {
		A obj1 = new A();
		System.out.println("#######");
		B obj2 = new B();
		System.out.println("#######");
		B obj3 = new B(4);
	}

}
