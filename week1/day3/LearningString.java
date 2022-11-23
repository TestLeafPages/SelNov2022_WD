package week1.day3;

public class LearningString {

	public static void main(String[] args) {
/*
		 * STRING LITERAL 
		 * String company ="TestLeaf";
		 */
		
		String name="Test Leaf";
		
		String name1="Test Leaf";
		
		String name3="test";
		
		/*
		 * STRING OBJECT: 
		 * String company=new String("TestLeaf");
		 */
		
		String company=new String("Test Leaf");
		
		String company1= new String("Test Leaf");
		
		//methods 
		
		//1. length()
		
		/*
		 * System.out.println( name.length());
		 * 
		 * //System.out.println(length);
		 * 
		 * int length2 = company.length(); System.out.println(length2);
		 * 
		 * //2. equals
		 * 
		 * boolean equals = name.equals(name1); System.out.println(equals);
		 * 
		 * boolean equals2 = name.equals(company1); System.out.println(equals2);
		 * 
		 * // boolean equals3 = name.equals(company); System.out.println(equals3);
		 * 
		 * 
		 * //3.equalIgnoreCase()
		 * 
		 * 
		 * 
		 * boolean equals4 = name.equalsIgnoreCase(company);
		 * System.out.println(equals4);
		 * 
		 */
		//.equals &  ==
		//== ---memory address
		//str obj&lit
		if(name==company) {
			System.out.println(" true");
		}else {
			System.out.println("false");
		}
		
		
		//str obj
		if(company==company1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//str lit
		if(name==name1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if(name==name3) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
