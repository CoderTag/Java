package Practice;

public class FindMissingNumberInSeq {

	public static void main(String[] args) {
		int ar[] = {1,2,3,4,5,6,8}; // need to find 7 is missing
		int expected_sum = ((ar[ar.length-1])*(ar[ar.length-1] + 1))/2;  // n(n+1)/2 
		int sum=0;
		for (int i=0;i<ar.length;i++)
		{
			sum = sum + ar[i];
		}
		System.out.println("missing nmber: " + (expected_sum -sum));
	}

}
