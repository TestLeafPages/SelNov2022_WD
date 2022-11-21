package week1.day1;

public class SecondCode {

	//Accessmodifier Returntype  name()
	 
	public void driveCar() {
		System.out.println("i am drivecar 1");
	}

	public void seatBelt() {
		System.out.println("i put my seatbelt 2");
	}
	
	public int seat() {
		return 5;
		

	}
	
	public static void main(String[] args) {
		
	
//	syntax: classname objectname= new classname();
	
		SecondCode obj= new SecondCode();
		obj.driveCar();
		
		//ctrl+2+l
		 int seat = obj.seat();
		System.out.println(seat);
		obj.seatBelt();
	
	
	}
	
}
