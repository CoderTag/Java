class Emp
{
	int salary;
	String name;
	static String ceo;
	
	//This will call only once when class load first time. Whenever we create an object of a class.First class get loaded to the memory
	// Then each object get memory from heap memory. Class gets loaded only once using class loader function in JVM
	// So static code loaded only once where as constructor of a class gets call for every object we created.
	// Static variable is the same value or class variable we share across every objects
	
	static
	{
		ceo = "Mudlu";
		System.out.println("I am in static block");
	}
	
	// This will be called every time a new obj gets created
	public Emp(String name,int salary)
	{
		System.out.println("I am in constructor");
		this.salary = salary;
		this.name = name;
		
	}
	
}
public class Tutorial5StaticVariableDemo {

	static int someStaticVar = 2;
	public static void main(String[] args) {
		
		// We can not access non static variable inside static function.
		System.out.println("accessing a static variable inside a static funciton. " + someStaticVar);
		Emp obj1 = new Emp("Mahesh",5000);
		Emp obj2 = new Emp("Suresh",6000);
		
		// static variable can be access using obj or class name. But recommend is to use class name
		System.out.println(obj1.name + " " + obj1.salary + " " + Emp.ceo);
		System.out.println(obj2.name + " " + obj2.salary + " " + obj2.ceo);
	}

}
