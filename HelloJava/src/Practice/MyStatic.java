package Practice;

class ABC {
	static String str;
	public ABC(String str) {
		ABC.str = str;		
	}
	
	public void get() {
		System.out.println(ABC.str);
	}
}


public class MyStatic {

	public static void main(String[] args) {
		ABC.str="B";
		ABC inst = new ABC("R");
		inst.get();
		ABC inst2 = new ABC("R2");
		inst2.get();
		
		inst2.get();
	}

}