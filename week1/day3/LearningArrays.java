package week1.day3;

public class LearningArrays {

	public static void main(String[] args) {
		int[] mark= {23,5,67,89,67,43,56,22,57,78,98,87,45,34,56,78,78,90,78,78,78,89,78,
				67,78};

		//1.
		int length = mark.length;
		System.out.println("total number in the array "+length);
	
	//i need print the first value in the array
		
		System.out.println("my first mark value : "+mark[0]);
	
	//i need print the last value 
		//System.out.println("itsmy last value"+mark[24]);
		
		System.out.println(mark[length-1]);
		
		System.out.println(mark[length-14]);
		
	//find out how many times 78 is available or occurances
	
		//declear the values which you going find
		//loop throught array items
		//if array item matches the expected values
		//increment the count
		
		
	
		int count=0;
		int num=78;
		for (int i = 0; i < mark.length; i++) {
			if(mark[i]==num) {
				count++;
				//System.out.println(count);
			}
			//System.out.println(count);
		}
		System.out.println("i find total number 78 is present :"+count);
		
	}

}
