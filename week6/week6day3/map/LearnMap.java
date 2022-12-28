package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {
	/*put()---getting data to add
	 * size()
	 * get
	 * values
	 * keyset
	 * containsValue
	 * containsKey
	 * entrySet()
	 * 
	 * 
	 */
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(101, "Dilip");
		map.put(102, "pavithra");
		map.put(103, "Nandhini");
		map.put(104, "Rahul");
		map.put(105, "Santhosh");
		map.put(106, "preethi");
		map.put(107, "Sofia");
		map.put(108, "Chandra");
		map.put(109, "Amrusha");
		map.put(110, "priya");
		map.put(101, "vijay");
		
		System.out.println("total values in map : "+map.size());
		
		System.out.println(map.get(105));//it will print value
		
		System.out.println(map.values());//it will print all values
		
		System.out.println(map.keySet());//it will print all keys
		
		System.out.println(map.containsValue("Sofia"));
		
		System.out.println(map.containsKey(100));
		
		System.out.println(map.replace(101, "vijay", "Dilip"));
		
		System.out.println(map);
		
		System.out.println(map.entrySet());
		
		
		
		
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
	}

}
