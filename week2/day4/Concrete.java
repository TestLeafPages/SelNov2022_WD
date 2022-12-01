package week2.day4;

public class Concrete extends House implements Architec,Design {

	public static void main(String[] args) {
		Concrete obj= new Concrete();
		obj.bikeParking();
		obj.carParking();
		obj.design2();
		obj.doc2();
		obj.document();
		obj.rooms();
		
		
		
		
	}

	@Override
	public void bikeParking() {
		System.out.println(" i need 3 bike parking");
		
	}

	public void document() {
		System.out.println("1st design");
		
	}

	public void design2() {
		System.out.println("design2");
		
	}

	public void doc2() {
		System.out.println("doc2");
		
	}

}
