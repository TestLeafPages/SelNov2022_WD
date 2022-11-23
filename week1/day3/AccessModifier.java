package week1.day3;

public class AccessModifier {

	//public
	public  void add() {
		System.out.println("i am public");
	}
	
	//private
	private void sub() {
		System.out.println("i am private");
	}
	
	//default
	void mul() {
		System.out.println("i am default");
	}
	
	public static void main(String[] args) {
		AccessModifier obj= new AccessModifier();
		obj.add();
		obj.sub();
		obj.mul();
	}
}
