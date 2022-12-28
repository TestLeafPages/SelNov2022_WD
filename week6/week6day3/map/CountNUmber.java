package map;

import java.util.Map;
import java.util.TreeMap;

public class CountNUmber {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,5,4,3,2,2,1,5,8,9,4,6,7,3};
		
		
		Map<Integer,Integer> tree=new TreeMap<Integer,Integer>();
		
//		for (int i = 0; i < num.length; i++) {
//			if(tree.containsKey(num[i])) {
//				int value= tree.get(num[i]);
//				tree.put(num[i], value+1);
//			}else {
//				tree.put(num[i], 1);
//			}
//		}
//		
//		
//		System.out.println(tree);
		
		for (int i : num) {
			if(tree.containsKey(i)) {
				tree.put(i, tree.get(i)+1);
			}else {
				tree.put(i, 1);
			}
		}
		System.out.println(tree);
	}

}
