package week3.day4;

public class LearnConstructor {

	//default constructor
	
	int stuid;
	String stuname;
	boolean stuStatus;
	
	
	//default constructor
	LearnConstructor(){
		
		System.out.println("default constructor");
		
		stuid=1091;
		stuname="Dilip";
		stuStatus=true;
		
		
	}
	
	//paramterized constructor
	LearnConstructor(int stuid,String stuname,boolean stuStatus){
		this.stuid=stuid;
		this.stuname=stuname;
		this.stuStatus= stuStatus;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnConstructor obj= new LearnConstructor(100, "Dilip", true);
		
		System.out.println(obj.stuid);
		System.out.println(obj.stuname);
		System.out.println(obj.stuStatus);
		 
//		  
//		LearnConstructor obj1= new LearnConstructor(101,"test",true);
//		System.out.println(obj1.stuid);
//		System.out.println(obj1.stuname);
//		
//		System.out.println(obj1.stuStatus);
		
	}

}
