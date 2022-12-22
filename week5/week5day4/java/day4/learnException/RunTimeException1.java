package learnException;

public class RunTimeException1 {
	
public static void main(String[] args)  {
	
int a=10;
int b=4;

int[] num= {1,5,7,8,3,76,89};
try {
	System.out.println(num[7]);
	
	System.out.println(a/b);
}

catch (ArithmeticException e) {
if(b==0) {

	System.out.println(a/10);
}

}
catch(ArrayIndexOutOfBoundsException e) {
	//System.out.println(e);
	System.out.println(num[6]);
}
	
	catch(Exception e){
	
}
finally{
	System.out.println("finally exception");
}
}


}