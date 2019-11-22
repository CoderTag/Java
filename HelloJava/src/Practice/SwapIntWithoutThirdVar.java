package Practice;

public class SwapIntWithoutThirdVar {

	public static void main(String[] args) {
		int x =10;
		int y = 20;
		
		//One way
		x = x+y;
		y = x -y;
		x = x - y;
		System.out.println("x :" + x + " y: " + y);
		
		//2nd way
		x = x*y;
		y = x/y;
		x = x/y;
		System.out.println("x :" + x + " y: " + y);
		
		//Third way
		x = x^y;
		y = x^y;
		x = x^y;
		System.out.println("x :" + x + " y: " + y);	

	}

}
