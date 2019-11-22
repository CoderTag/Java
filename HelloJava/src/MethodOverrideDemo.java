
class A2
{
	public void show()
	{
		System.out.println("In A");
	}
}

class B2 extends A2
{
	@Override
	public void show()
	{
		System.out.println("In B");
	}
	
	public void show2()
	{
		super.show();
		System.out.println("In B show2");		
	}
	
}

public class MethodOverrideDemo {

	public static void main(String[] args) {
		B2 obj = new B2();
		obj.show();
		System.out.println("##");
		obj.show2();
	}

}
