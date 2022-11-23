package week1.day3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysSort {

	public static void main(String[] args) {
		
		int[] mark= {10,3,4,6,2,8,11,45,67,44,22,78,89,90,101,67};

		
		//array sort method
		
		//int length = mark.length;
		//System.out.println(length);
		
	Arrays.sort(mark);
		
	
		for (int i = 0; i <mark.length; i++) {
			System.out.println(mark[i]);
			
		}
		
//		for (int i =mark.length-1;i>=0;i--) {
//			System.out.println(mark[i]);
//		}
		
//		System.out.println(mark[0]);
//		System.out.println(mark[length-1]);
	}

}
