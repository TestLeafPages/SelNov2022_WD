package week1.day2;

public class MethodSign {

//public void name(){

//}
	public void add(int a, int b) {
		// int c=a+b;

		System.out.println(a + b);
	}

	public int sub(int b, int c) {
		return b - c;

	}

	public float mul(float a, float b, float c) {
		return a * b * c;

	}

	public String name() {
		return "TestLeaf";

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodSign obj1 = new MethodSign();
		// MethodSign obj2= new MethodSign();

		obj1.add(34, 56);

		System.out.println(obj1.sub(23, 4));
		/*
		 * int sub = obj1.sub(75, 23); System.out.println(sub);
		 */ 
		 float mul =obj1.mul(2.0f, 3.5f, 4.8f);
		 System.out.println(mul); 
		 String name = obj1.name(); 
		 System.out.println(name);
		 
	}

}
