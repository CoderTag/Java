class MyCalc
{
	int num1;
	int num2;
	int result;
	
	public MyCalc()
	{
		num1 = 5;
		num2 = 6;
	}
	public MyCalc(int num1)
	{
		this.num1 = num1;
	}
	public MyCalc(double d)
	{
		num1 = (int)d;
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		MyCalc obj = new MyCalc();
		obj.result = 7;
		System.out.println(obj.num1);
		MyCalc obj2 = new MyCalc(6);
		System.out.println(obj2.num1);
		MyCalc obj3 = new MyCalc(8.9);
		System.out.println(obj3.num1);
		System.out.println(obj.result);
		
	}

}
