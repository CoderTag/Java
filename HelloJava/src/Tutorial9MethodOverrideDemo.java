class A2
{
	public void show()
	{
		System.out.println("In A");
	}
}

class B2 extends A2
{
	// In method over ride sub class method will override parent class method
	@Override
	public void show()
	{
		System.out.println("In B");
	}
	
	// What if you want to call both parent class and sub class method with same name,from sub class . use super	
	public void show2()
	{
		super.show();
		System.out.println("In B show2");		
	}	
}

public class Tutorial9MethodOverrideDemo {

	public static void main(String[] args) {
		B2 obj = new B2();
		obj.show();
		System.out.println("##");
		obj.show2();
	}
}
