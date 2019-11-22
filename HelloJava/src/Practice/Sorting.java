package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorting {

	public static void main(String[] args) {
		
		List<Integer> arr1 = new ArrayList<>();
		List<Integer> arr2 = new ArrayList<>();
		Random rd = new Random();

		for(int i=0;i<5;i++) {
			arr1.add(rd.nextInt());
			arr2.add(rd.nextInt());
		}
		
		System.out.println("Before Merge Array1:" + arr1);
		System.out.println("Before Merge Array2:" + arr2);
		arr1 = MergeSort.mergeSortNow(arr1);
		arr2 = MergeSort.mergeSortNow(arr2);
		System.out.println("After MergeSort Array1:" + arr1);
		System.out.println("After MergeSort Array2:" + arr2);
	}

}
