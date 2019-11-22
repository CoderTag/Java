class emp
{
	int salary;
	String name;
	static String ceo;
	
	//This will call only once when class load first time
	static
	{
		ceo = "Mudlu";
		System.out.println("I am in static block");
	}
	
	// This will be called every time a new obj gets created
	public emp(String name,int salary)
	{
		System.out.println("I am in constructor");
		this.salary = salary;
		this.name = name;
		
	}
	
}
public class staticDemo {

	static int someStaticVar = 2;
	public static void main(String[] args) {
		
		System.out.println("accessing a static variable inside a static funciton. " + someStaticVar);
		emp obj1 = new emp("Mahesh",5000);
		emp obj2 = new emp("Suresh",6000);
		
		// static variable can be access using obj or class name. But recommend is to use class name
		System.out.println(obj1.name + " " + obj1.salary + " " + emp.ceo);
		System.out.println(obj2.name + " " + obj2.salary + " " + obj2.ceo);
	}

}
