package string;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		
		String str="Madam";
		String rev= "";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}System.out.println(rev);

		if(str.equalsIgnoreCase(rev)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

}
