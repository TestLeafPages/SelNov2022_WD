package week1.day1;

public class ObjectLearing {

	public void Wheel() {
		System.out.println("4");
	}
	public static void main(String[] args) {
		
		SecondCode obj2= new SecondCode();
		obj2.driveCar();
		obj2.seatBelt();
		int seat = obj2.seat();
		System.out.println(seat);
		
		System.out.println("---------------------");
		
		ObjectLearing obj=new ObjectLearing();
		obj.Wheel();
	}

}
