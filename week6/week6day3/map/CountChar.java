package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountChar {

	public static void main(String[] args) {
		
		String str="amazon development center";
		//a=2 ,m=2 ,z= ,
		Map<Character,Integer> count= new TreeMap<Character,Integer>();
		
		char[] ch=str.toCharArray();
		
//		
//		for (int i = 0; i < ch.length; i++) {
//			char key=ch[i];
//			//check whether ky is already available in map
//			if(count.containsKey(ch[i])) {
//				Integer existingcount=count.get(key);
//				count.put(ch[i], existingcount+1);
//			}else {
//				count.put(ch[i], 1);
//			}
//		}
//		System.out.println(count);
		
		
		for (char c : ch) {
			if(count.containsKey(c)) {
				count.put(c, count.get(c)+1);
			}else {
				count.put(c, 1);

			}
		}
		
		
		
		System.out.println(count);
		
		
		
	}

}
