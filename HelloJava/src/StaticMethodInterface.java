@FunctionalInterface
interface NewInterface{
	void abc();
	default void oldshow() {
		
	}
	static void show() {
		System.out.println("In show");
	}
}
public class StaticMethodInterface {

	public static void main(String[] args) {
		// WE can can not create obj of an interface. So with static keyword we cal call a method in Interface
		NewInterface.show();

	}

}
