package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearningSet {

	public static void main(String[] args) {
		
		int[] stud= {10,3,45,67,45,78,89,23,3,56,67,78};
		//declare a set
		
		Set<Integer> unique= new LinkedHashSet<Integer>();
		
		
	for (int i = 0; i < stud.length; i++) {
		unique.add(stud[i]);
	}
		System.out.println(unique);
		//10,3,45,67,78,89,23,56
	}

}
