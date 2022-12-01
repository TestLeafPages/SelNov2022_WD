package week2.day4;

import java.util.ArrayList;
import java.util.List;

public class LearningList {

	public static void main(String[] args) {
		
		
		//List<wapper class> objectname= new ArrayList<wapper class>();

		
		List<Integer> values= new ArrayList<Integer>();
		
		
		values.add(89);
		values.add(45);
		values.add(67);
		values.add(67);
		values.add(76);
		values.add(67);
		values.add(64);
		
		System.out.println(values);
		
		
		List<String> name= new ArrayList<String>();
		//add
		name.add("Vidhya");
		name.add("rekha");
		name.add("dillibabu");
		name.add("pavithra");
		name.add("swetha");
		name.add("nandhini");
		name.add("pavithra");
		name.add("preethi");
		
		System.out.println(name);
		
		//get size of the list
		int size = name.size();
		System.out.println(size);
		
		//remove
		 name.remove(4);
		int size2 = name.size();
		System.out.println(size2);
		 
		System.out.println(name);
		
		
		//add again with index values
		name.add(4, "swetha");

		System.out.println("adding again "+name);
		int size3 = name.size();
		System.out.println(size3);
		
		//whether name inside the list 
		boolean contains = name.contains("dillibabu");
		System.out.println(contains);
		
		//clear
		name.clear();
		System.out.println(name);
		
		//isempty
	boolean empty = name.isEmpty();
	System.out.println(empty);
		
		//get
		
		String string = name.get(6);
		System.out.println(string);
		
	}

}
