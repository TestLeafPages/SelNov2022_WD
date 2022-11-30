package week2.day3;

public class MainInheritance {

	public static void main(String[] args) {
		
		ChildInheritance child= new ChildInheritance();
    child.omr();
    child.ooty();
    child.tambaramHouse();
    child.car();
    child.porurHouse();
		
		System.out.println("-------------------------------");
		
		
		
		ParentInheritance parent = new ParentInheritance();
		
		parent.omr();
		parent.ooty();
		parent.car();
		parent.tambaramHouse();
		
		
		Pro1 obj= new Pro1();
		
		obj.add();
		
		
		
//		ChildInheritance obj= new ChildInheritance();
//		
//		obj.car();
//		obj.tambaramHouse();
//		obj.porurHouse();
	}

}
