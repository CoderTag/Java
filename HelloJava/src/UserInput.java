import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int myInt = scan.nextInt();
		System.out.println("Number entered by you is: " + myInt);
		
		System.out.print("Enter a duoble number: ");
		double myDouble = scan.nextDouble();
		System.out.println("Number entered by you is: " + myDouble);
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String myString = scan.nextLine();
		System.out.println("String entered by you is: " + myString);

	}

}
