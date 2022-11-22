package week1.day2;

public class PrimitiveDataTypes {

	short regno= 3654;
	double pertrolRate= 104.55;
	long addharNo=537768979790L;
	
	public static void main(String[] args) {
	
		PrimitiveDataTypes obj= new PrimitiveDataTypes();
		
		short regno2 = obj.regno;
		System.out.println(regno2);
		
		System.out.println(obj.pertrolRate);

		long addharNo2 = obj.addharNo;
		System.out.println(addharNo2);
	}

}
