/*
 * Final block will always be executed even we hit exception.
 * Multiple catch can be executed using pipe. It is introduced in 1.7 onward. We can not use it with 1.6.
 * But multiple catch is useful as we can print different message.
 */

// Defining own Exception
class MiluException extends Exception{
	public MiluException(String msg) {
		super(msg);
	}
}

public class Tutorial21ExceptionHandling {

	public static void main(String[] args) throws InterruptedException {
		int i = abc();
		Thread.sleep(100);
		bcd();
	}
	
	public static int abc() {
		try {
			int a=10;
			int s = a/0;
			return 1; 				
		}
		catch(ArithmeticException | NullPointerException e) {
			System.out.println(e);		// If I use err instead of out it will be printed in red.
			System.err.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("This line will be printed irrespective of exception or no exception");
		}
		return 0;
	}
	
	// Throw your own Exception
	public static void bcd() {
		int i = 8;
		int j=9;
		int d = i/j;
		System.out.println(d);
		try
		{
		if (d == 0)throw new Exception();
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		
		// Will not throw default exception rather create own exception
		try
		{
		if (d == 0)throw new MiluException("This is not possible");
		}
		catch(MiluException e)
		{
			System.err.println("My Error Msg: " + e.getMessage());
		}
		
	}

}
