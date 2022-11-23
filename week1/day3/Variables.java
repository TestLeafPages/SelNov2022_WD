package week1.day3;

public class Variables {

	//Global/Instance variable: blue color
	
	int num=25;
	char name='d';
	short ch=4;
	
	//local variable
	
	public void add(int a,int b) {
		//System.out.println(a+b);
		int c =a+b;
		System.out.println(c);
		
		System.out.println(name);
	}
	
	public void mul() {
		int c= 6*7;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Variables vara= new Variables();
		
		short ch2 = vara.ch;
		System.out.println("global variables "+ch2);
		
		vara.add(5, 7);
		
		vara.mul();
		
		int nu2 = vara.num;
		System.out.println(nu2);
		
		char name2 = vara.name;
		System.out.println(name2);
	}
}
