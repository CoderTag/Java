
public class SingletonDemo {
	/*Singleton class is a class which can have only one object (one instance of the class)
	 * How to design singleton class
	 * 1. make constructor as private
	 * 2. write a public static method (getInstance) that has return type, object of this singleton class.(Lazy initialization) 
	 */
	 
	private static SingletonDemo singleton_instance = null;
	public String str;
	
	// This is a constructor with private tag
	private SingletonDemo(){
		str = "Hello I am in India.";
	}
	
	public static SingletonDemo getInstance() {
		if(singleton_instance == null)
				singleton_instance = new SingletonDemo();
		return singleton_instance;
	}
	
	

	public static void main(String[] args) {
		SingletonDemo x = SingletonDemo.getInstance();
		SingletonDemo y = SingletonDemo.getInstance();
		SingletonDemo z = SingletonDemo.getInstance();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		// If you make changes to the object from one instance it will be reflected in all instances.
		// Which means singleton class can have only one instance at a time. other instance if you create it will point to the first instance
		x.str = (x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

	}

}
