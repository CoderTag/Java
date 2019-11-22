
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckedExceptionUserInput {

	public static void main(String[] args) throws Exception
	{
		System.out.print("Enter a number:");
		BufferedReader br= null;
		int n=0;
		try
		{
			br = new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			System.out.println(e);			
		}
		finally
		{
			br.close();
		}
		System.out.println(n);
		
	}

}
