package Practice;

public class StringManupulation {

	public static void main(String[] args) {
		String str = "The rain water harvesting";
		String str2 = "The Rain Water Harvesting";
		String str3 = "The rain water harvesting";
		
		// find a specific charecter in string
		System.out.println(str.charAt(5));
		System.out.println(str.length());
		System.out.println(str.indexOf('r'));
		System.out.println(str.indexOf('r',9));
		System.out.println(str.indexOf('r',str.indexOf('r')+1)); // this and above statement same
		System.out.println(str.indexOf("water"));
		System.out.println(str.indexOf("hello"));
		
		//Compare
		System.out.println(str.equals(str3));
		System.out.println(str.equals(str2));
		System.out.println(str.equalsIgnoreCase(str2));
		
		System.out.println(str.substring(0, 10));
		
		//Split
		String arr[] = str.split(" ");		
		for(String s : arr) {
			System.out.println(s);
		}
		
		//Contact
		String x = "hello";
		String y = "babula";
		int i = 10;
		int j = 20;
		
		System.out.println(x.concat(y));
		System.out.println(x+y+i+j);
		System.out.println(x+y+(i+j));
		
	}

}
