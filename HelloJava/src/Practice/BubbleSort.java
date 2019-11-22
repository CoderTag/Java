package Practice;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		int[] rands = getRandnums(5);
		// nums before sort
		for(int i: rands) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//nums after sort
		int[] nums = bubbleSort(rands);
		for(int i: nums) {
			System.out.print(i + " ");
		}
		System.out.println();		
	}
	
	private static int[] getRandnums(int length) {
		int[] nums = new int[length];		
		Random rd = new Random();
		
		// Fill array with Random numbers
		for(int i=0;i<nums.length;i++) {
			nums[i]=rd.nextInt();
		}		
		return nums;
	}
	
	private static int[] bubbleSort(int[] nums) {
//		List<Integer> sortedList = new ArrayList<Integer>();
		int temp;
		for(int i=1;i<nums.length;i++) {
			for(int j=0;j<(nums.length-i);j++){
				if(nums[j+1]<nums[j]) {
					temp=nums[j+1];
					nums[j+1]=nums[j];
					nums[j]=temp;
				}
			}			
		}		
		return nums;
		//Converting List to Array
//		Integer[] sorted = sortedList.toArray(new Integer[sortedList.size()]);
//		return sorted;
	}

}
