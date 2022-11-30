package week2.day3;

public class LearningMethodOverLoading {

	
	public void add(int a,int b) {
		System.out.println(a+b);

	}
	public int add(int a,int b,int c) {
		return a+b+c;
		
	}
	
	public float add(float a, float b) {
		return a+b;
		
	}
	
	public double add(double c,double d) {
		return c+d;
		
	}
	
	public int mul(int a,int b) {
		return a*b;
		
	}
	
	public int mul(int a,int b,int c) {
		return a*b*c;
		
	}
	
	public static void main(String[] args) {
		
		LearningMethodOverLoading method= new LearningMethodOverLoading();
		
		method.add(6, 9);
		int add = method.add(3, 3, 1);
		System.out.println(add);
		 float add2 = method.add(4.5f, 5.6f);
		System.out.println(add2);
		double add3 = method.add(5.45, 7.56);
		System.out.println(add3);
		int mul = method.mul(5, 5);
		System.out.println(mul);
		int mul2 = method.mul(7, 5, 4);
		System.out.println(mul2);
		
	}
	
}
