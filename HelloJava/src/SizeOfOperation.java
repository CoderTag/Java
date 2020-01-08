
public class SizeOfOperation {

	public static void main(String[] args) {
		System.out.println(Integer.SIZE);
		System.out.println(sizeofInt());
		System.out.println(sizeofChar());

	}
	
	public static int sizeofInt() {
	    int i = 1, j = 0;
	    while (i != 0) {
	        i = (i<<1); j++;
	    }
	    return j;
	}
	
	public static int sizeofChar() {
	    char i = 1, j = 0;
	    while (i != 0) {
	        i = (char) (i<<1); j++;
	    }
	    return j;
	}

}
