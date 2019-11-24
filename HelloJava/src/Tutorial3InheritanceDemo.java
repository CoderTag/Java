// Single and multi level inheritance
// Java doesn't support multiple inheritance
// Is-A Has-A

import java.lang.Math;

class Calculator		// Super, Parent, Base
{
	public int add(int ... n)
	{
		int sum=0;
		for(int i:n)
		{
			sum += i;
		}
		return sum;
	}
}

//Calculator superclass and CalcAdv subclass
class CalcAdv extends Calculator 	// Sub, Child, Derived
{
	public int sub(int num1, int num2)
	{
		return Math.abs(num1 - num2);
	}
}

class CalcVeryAdv extends CalcAdv
{
	public int mul(int n1, int n2)
	{
		return n1 * n2;
	}
}


public class Tutorial3InheritanceDemo {

	public static void main(String[] args) {
		CalcVeryAdv obj = new CalcVeryAdv();
		System.out.println(obj.add(1,2));
		System.out.println(obj.add(1,2,3,4,5,6,7,8,9,10));
		System.out.println(obj.sub(7,9));
		System.out.println(obj.mul(7,9));
	}

}
