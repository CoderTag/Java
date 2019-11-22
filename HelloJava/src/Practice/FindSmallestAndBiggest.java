package Practice;

public class FindSmallestAndBiggest {

	public static void main(String[] args) {
		int ar[] = {1,532,235,6,2,64,754,243,24573};
		int small = ar[0];
		int big = ar[0]; 
		
		for(int i: ar) {
			if (i < small) small = i;
			if (i > big) big = i;
		}
		
		System.out.println("Small: " + small + " Big: " + big);
	}

}
