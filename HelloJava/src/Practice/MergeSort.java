package Practice;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;
//import java.util.Random;

public class MergeSort {

//	public static void main(String[] args) {
//		List<Integer> arr1 = new ArrayList<>();
//		List<Integer> arr2 = new ArrayList<>();
//		List<Integer> merged = new ArrayList<>();
//		Random rd = new Random();
//		
//		// Verify Merge
//		for(int i=0;i<5;i++) {
//			arr1.add(rd.nextInt());
//			arr2.add(rd.nextInt());
//		}
////		Collections.sort(arr1);
////		Collections.sort(arr2);		
//		System.out.println("Before Merge Array1:" + arr1);
//		System.out.println("Before Merge Array2:" + arr2);
//		arr1 = mergeSortNow(arr1);
//		arr2 = mergeSortNow(arr2);
//		System.out.println("After MergeSort Array1:" + arr1);
//		System.out.println("After MergeSort Array2:" + arr2);
////		merged=merge(arr1,arr2);
////		System.out.println("After Merge :" + merged);
//		
//		
//
//	}
	
	private static List<Integer> merge(List<Integer> sortedArr1,List<Integer> sortedArr2) {
		List<Integer> merged = new ArrayList<Integer>();
		
		int len1 = sortedArr1.size();
		int len2 = sortedArr2.size();
		int i=0,j=0;
		
		for(int k=0;k<(len1+len2);k++) {			
			if(i>(len1-1)) {
				merged.add(sortedArr2.get(j));
				j++;
			}
			else if(j>(len2-1)) {
				merged.add(sortedArr1.get(i));
				i++;
			}
			else if (sortedArr1.get(i)<sortedArr2.get(j)){
				merged.add(sortedArr1.get(i));				
				i++;
			}
			else {
				merged.add(sortedArr2.get(j));
				j++;
			}
		}
		return merged;
	}
	
	public static List<Integer> mergeSortNow(List<Integer>arr){		
		if(arr.size()==1) {
			return arr;
		}
		int size = arr.size();
		List<Integer>subArr1 = arr.subList(0, size/2);
		List<Integer>subArr2 = arr.subList(size/2,size);
		List<Integer> res = merge(mergeSortNow(subArr1),mergeSortNow(subArr2));
		return res;
	}
	
	

}
