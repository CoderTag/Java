
public class Tutorial22TryCatchException {

	public static void main(String[] args) {
		int i=9;
		int j = 0;
		int arr[] = new int[6];		
		
		try {
			int k = i/j;
			arr[6] = 8;
		}
		catch(ArithmeticException e)
		{
			System.err.println("ERROR: Can not divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("ERROR: Array element is beyound limit..");
		}
		// Following excetion should be the last of all exception block. As it is default.
		catch(Exception e)
		{
			System.err.println("Error: I can handle all type of exception");
		}
		finally
		{
			System.out.println("Will be printed irrespective of exception occur or not");
		}

	}

}
