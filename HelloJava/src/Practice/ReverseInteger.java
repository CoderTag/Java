package Practice;

public class ReverseInteger {

	public static void main(String[] args) {
		int num = 1234;
		int rev=0;
		
		// One way
		while (num!=0)
		{
			rev = 10*rev + (num%10);
			num = num/10;
		}			
		System.out.println(rev);
		
		
		//2nd way
		num=12345;
		String s = String.valueOf(num);
		System.out.println(s);
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		int j;
		j = Integer.parseInt(sb.toString());
		System.out.println(j);
	}

}
