package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class MedianOfTwoSortedArrays_4program {

	public static void main(String[] args) {
		int num[]= {1,3};
		int num2[]= {2};
		int merge[]=new int[3];
		System.arraycopy(num, 0, merge,0 , num.length);
		System.arraycopy(num2, 0, merge,num.length, num2.length);
		Arrays.sort(merge);
		for(int i=0;i<merge.length;i++) {
			System.out.print(merge[i]);
		}
		
		
		
	}
	
	
}
