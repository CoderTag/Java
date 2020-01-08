/*
 * Both Interface having same default method "abc". As we know Java doesn't support multiple inheritance.
 * But in case of Interface it can implements multple Interfaces. It can also create confusion which method to call in the case of
 * duplicate name. How to resolve this? one way is override the method in sub/child class. 2nd way is use super
 */

@FunctionalInterface
interface Kool{
	void faka();
	default void abc() {
		System.out.println("In Kool");
	}
}

@FunctionalInterface
interface Tool{
	void kaka();
	default void abc() {
		System.out.println("In Tool");
	}
}

class Vhikuli implements Kool,Tool{
	public void kaka() {}
	public void faka() {}
	
	@Override
	public void abc() {
		Kool.super.abc();
	}
	
}

public class Tutorial19MultipleInterfaceSameMethod {

	public static void main(String[] args) {
		Kool obj = new Vhikuli();
		obj.abc();
	}

}
