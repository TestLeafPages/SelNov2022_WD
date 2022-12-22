package learnException;

import java.util.NoSuchElementException;

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int[] num= {1,5,7,8,3,76,89};
//		
//			System.out.println(num[7]);
//			
//			throw new  ArithmeticException("this is array outofbound");
//		
		
		int a=9;
		int b=80;
		if(a>b) {
			System.out.println(a/b);
		}else {
			//throw new ArithmeticException("this is array outofbound");
			
			throw new NoSuchElementException("this is array outofbound");

		}
	}

}
