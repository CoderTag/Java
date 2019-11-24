import java.util.Arrays;

public class Tutorial2ArrayDemo {

	public static void main(String[] args) {
		
		// One dimensional array
		int arr[] = new int[3];
		arr[0] = 0;
		arr[1] = 1;
		int arr2[] = {4,5,64,34,23,89,6};
			
		for (int k : arr2)
		{
			System.out.print(k + " ");
		}
		System.out.println();
		
		int[] arr3 = Arrays.copyOfRange(arr2, 0, 2);
		for (int k : arr3)
		{
			System.out.print(k + " ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(arr3));
		
		
		//2D array
		int twoD[][] = {
				{1,2,3,4},
				{4,5,6,7},
				{8,9,3,4}
		};
		
		System.out.println(twoD[0]);
		System.out.println(twoD[0][0]);
		
		//Jagged array
				int jagged[][] = {
						{1,2,3,4},
						{4,5,6},
						{8,9,3,4,5}
				};
				
		for (int i=0;i<jagged.length;i++)
		{
			for(int j=0; j<jagged[i].length;j++)
			{
				System.out.print(jagged[i][j]);
			}
			System.out.println();
		}
		System.out.println("####### OR ###########");
		for(int k[]: jagged)
		{
			for(int m: k)
			{
				System.out.print(m);
			}
			System.out.println();
		}

	}

}
