package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyArrayList2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter numebr: ");
		Integer myint = sc.nextInt();
		System.out.println(myint);
		
		List<String> str = new ArrayList<String>(5);
		str.add("Ram");
		str.add("Mohan");
		int size = str.size();		
		System.out.println(size);
		for(String s: str) {
			System.out.println(s);
		}
		
		System.out.print(str);
		sc.close();
	}
	
}