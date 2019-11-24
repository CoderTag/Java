
public class Tutorial1HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("hello");
		int i =50_00_00;
		double d = 5.5;
		System.out.println(i);
		System.out.println(d);
		i=2;
		switch(i)
		{
		case 1:
			System.out.println("Case I");
			break;
		case 2:
			System.out.println("Case II");
			break;
		default:
			System.out.println("Default");
		}
		String str="abc";  // this support java version +1.6 above 
		switch(str)
		{
		case "abc":
			System.out.println("Case abc");
			break;
		case "bacd":
			System.out.println("Case bcd");
			break;
		default:
			System.out.println("Default");
		}
				
		
		for(i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
