package week1.day2;

public class LeariningIfCondition {

	public static void main(String[] args) {
		
		//its ---- if-else
		//with number
		int num=5;
		if(num>0) {
			System.out.println("positive number");
		}else {
			System.out.println("not a positive number");
		}

		//with char
		char ch='d';
		
		if(ch=='c') {
			System.out.println("its is chrome");
		}
		else {
			System.out.println("not a chrome but someother tab opened");
		}
			
		//nested if
		
		
char ch1='f';
		
		if(ch1=='c') {
			System.out.println("its is chrome");
		}else if(ch1=='e') {
			System.out.println("edge  is opened");
		}
		else {
			System.out.println("not a chrome but someother tab opened");
		}
	}

}
