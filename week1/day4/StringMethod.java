package week1.day3;

public class StringMethod {

	public static void main(String[] args) {
		//4.toCharArray()
		
		String companyName="Test Leaf";
		
		String name= new String("test leaf");
		//convert String to character array
		char[] chars = name.toCharArray();
		
		System.out.println(chars);
		
		for (int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]);
		}
			//5.contains--- it will check whether the word 
			//is present or not inside values
			
			String str= new String("it will check whether");
			
			boolean contains = str.contains("checkwhether");
			System.out.println(contains);
		
//6.chartAt---index start with 0
			String name1= "Test ";
		char charAt = name1.charAt(0);
	System.out.println(charAt);
	
	//7.indexOf
	int indexOf = name1.indexOf(' ');
	System.out.println(indexOf);
	
	//8.split---sapreat the words
	
	String str1= new String("Dilip kumar V R");
	String[] split = str1.split(" ");
	
	for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
		}
	
			//{2,7,9,8,0}---i{
	//{6,2,0,4,5}-j{
	//if(a[i]==b[j]){syso(a[i])
	
	
//	{1,2,3,4,6,7,8}
	//for()
	//if(a[i]!=(i+1)//1!=1,2!=2,3!=3,4!=4,6!=5
	//break
	//syso((i+1))
	
	}
	

}
