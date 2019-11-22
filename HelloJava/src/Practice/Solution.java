package Practice;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("add line 1");
		strings.add("add line 2");
		for (String str: strings) {
			System.out.println(str);
		}
		
		int[] input = {4,5,3,0};
		System.out.println(min(input));
	}
	
	// Return the minimum integer from the array
	public static int min(int[] arr) {		
		int min = arr[0];
		for(int i=1;i< arr.length;i++ ) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}

}
