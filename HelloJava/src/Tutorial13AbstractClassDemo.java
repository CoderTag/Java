// If a class is defined as abstract you can not create object of that class. i.e instantiation of that class not possible
// That class can be extended from subclass. If a method in an abstract class is defined as abstract then that method needs to be
// define in child class. If a class is abstract it is not compulsory to have it's method also abstract. 
// But if any method is defined as abstract then the class has to be abstract. i.e a normal class can not have an abstract method

class Printer{
	
	public void show(Number n)  // Here Number is abstract class.Check doc. No need to specify Integer or Double separately. 
	{
		System.out.println(n);
	}
}

abstract class Writer
{
	public abstract void writer();
}

class Pen extends Writer
{
	public void writer()
	{
		System.out.println("I am in Pen");
	}
}

class Pencil extends Writer
{
	public void writer()
	{
		System.out.println("I am in Pencil");
	}
}

class Kit
{
	public void doSomething(Writer p)
	{
		p.writer();
	}
}


public class Tutorial13AbstractClassDemo {

	public static void main(String[] args) {
		
		Printer obj2 = new Printer();
		obj2.show(5);		// I can pass int doble anything to show method. No need to write sepearate methods
		obj2.show(5.5);		// This is the advantage of abstract class. Number is abstract class
		
		Kit k = new Kit();
		Pen P = new Pen();
		Pencil Pe = new Pencil();
		k.doSomething(P);
		k.doSomething(Pe);
		
	}

}
