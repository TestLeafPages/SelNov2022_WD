package week3.day1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StringSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="TestLeaf";
		
		char[] charArray = str.toCharArray();
		
		Set<Character> word= new HashSet<Character>();
		
		//foreach loop
		
		for (Character ch : charArray) {
			word.add(ch);
		}
		System.out.println(word);
	}

}
