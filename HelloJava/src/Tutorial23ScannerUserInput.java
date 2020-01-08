import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Tutorial23ScannerUserInput {

	public static void main(String[] args) {
		int n = 0;
		System.out.print("Enter a number: ");
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
//		sc.close();    // Don't close System.in in a program if you want to read again from it. Here i need in secondWayReadingInput() and thirdWayReadingInput
		System.out.println(n);
		
		try {
			secondWayReadingInput();
		}
		catch(IOException e)
		{
			System.err.println(e);
		}
		thirdWayReadingInput();
	}
	
	public static void secondWayReadingInput() throws IOException {
		int i;
		System.out.print("Enter a number: ");
		
		// any object created out of java io library is called resource. Any resource we create should be closed. 
		// Else it will block some memory.		
		BufferedReader br= null;
		try {
			
			br = new BufferedReader(new InputStreamReader(System.in));
			i = Integer.parseInt(br.readLine());
			System.out.println(i);
		}
		catch(Exception e) {
			System.err.println(e);
		}
		finally{
			//br.close();// Don't close System.in in a program if you want to read again from it. Here i need in thirdWayReadingInput
		}
		
	}
	
	// From Java 1.7 onward no need to write Finally also. if we create resource within parenthesis after try
	// resource deleted as soon as we are out of try block

	public static void thirdWayReadingInput() {
		int i;
		System.out.print("Enter a number: ");
		// any object created out of java io library is called resource. Any resource we create should be closed. 
		// Else it will block some memory.		
		
		try(BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in))) 
		{
			i = Integer.parseInt(br2.readLine());
			System.out.print(i);
		}
		catch(Exception e) 
		{
			System.err.println(e);
		}
		
	}
}
