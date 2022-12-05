package week3.day1;

public class LearningStatic {

	
	int studId;
	String studName;
	static String studColName;
	
	
	public void setvalues(int id, String name, String collegename) {
		
		studId=id;
		studName= name;
		studColName= collegename;	
	}
	public void printvalues()
	{
		System.out.println(studId+ " " +studName+" "+studColName);
	}
	
	
	
	public static void main(String[] args) {
		
		LearningStatic obj=new LearningStatic();
		obj.setvalues(101, "Dilip", "SRM");
		obj.printvalues();
		

		System.out.println("----------------------------------");
		LearningStatic obj2 = new LearningStatic();
		obj2.setvalues(102, "Dinesh", "SVC");
		obj.printvalues();
		
		obj2.printvalues();
		

		System.out.println("----------------------------------");
		LearningStatic obj3 = new LearningStatic();
		obj3.setvalues(103, "aravind", "SIT");
		obj3.printvalues();
        obj.printvalues();
		obj2.printvalues();
	}

}
