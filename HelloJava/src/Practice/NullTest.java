package Practice;

public class NullTest {

	public static void main(String[] args) {
		System.out.println(args.length);
		String arNull[] = null;
		System.out.println(arNull.length); // Null array gives NullPointer Exception
		
		String arEmpty[] = {};
		System.out.println(arEmpty.length); // Empty array gives lenght 0
		
		// It proves args in main is empty not Null.
		
		
//		for(String m : ar) {
//			System.out.println(m);			
//		}
		
	}

}
