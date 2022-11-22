package week1.day2;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=11;
		int firstnum=0;
		int secondnum=1;
		int fib=0;
		
		System.out.println(firstnum);
		
		System.out.println(secondnum);
		
		for (int i = 0; i <num ; i++) {
			fib=firstnum+secondnum;
			
			firstnum=secondnum;
			secondnum=fib;
			
			System.out.println(fib);
			
		}
	}

}
