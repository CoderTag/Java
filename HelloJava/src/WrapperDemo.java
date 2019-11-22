//int float charecter
//Integer Float Charecter
public class WrapperDemo {

	public static void main(String[] args) {
		int i=5; // primitive datatype
		Integer d = Integer.valueOf(5);  // Integer is wrapper class
		Integer ii = Integer.valueOf(i); // when u use primitive type on creating obj is called Boxing or Wrapping
		int j = ii.intValue();			// Getting the value of Obj into primitive type is called unboxing or unWrapping
				
		Integer k = i;		// Auto Boxing
		int m = k;			// Auto Unboxing
		
		
	// Primitive data type is faster that wrapper classes. Then why wrapper classed?
	// Someframework like Hybernate, connection api only works with wrapper classes
		System.out.println(d);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
		
		String str = "123";
		int n = Integer.parseInt(str);
		System.out.println(n);
	}

}
