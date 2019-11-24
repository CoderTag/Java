// Final keyword if used with variable it become constant. If used with class that class can not be extended
// if used with method that method can not be override in child class

final class A6
{
	final double PI=3.14;
	
	public A6()
	{
		// PI = 4.5;   can not change variable value with final tag  
	}
}

class B6
{
	double d = 3.14;
	public B6()
	{
		d = 4.5;
	}
	
	public final void show()
	{
		
	}
}

class C extends B6 
{
	//public void show()  can not over ride show() as it is final method 
	
}

// class C extends A can not extend A


public class Tutorial14FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
