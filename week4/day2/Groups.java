package week4.day2;

import org.testng.annotations.Test;

public class Groups {

	@Test(groups= {"dilip"})
	public void createLead() {
		// TODO Auto-generated method stub
System.out.println("createLead");
	}
	
	@Test(groups= {"dilip"})
	public void editLead() {
		// TODO Auto-generated method stub
		System.out.println("editLead");

	}
	@Test(groups= {"priyadharshini"})
	public void deleteLead() {
		// TODO Auto-generated method stub
		System.out.println("deleteLead");

	}
	@Test(groups= {"dilip","priyadharshini"})
	public void deletelead() {
		// TODO Auto-generated method stub
		System.out.println("deletelead");

	}
	
	@Test(groups= {"test"})
	public void duplicLead() {
		// TODO Auto-generated method stub
		System.out.println("duplicLead");

	}
	
	@Test(groups= {"test"})
	public void Lead() {
		// TODO Auto-generated method stub
		System.out.println("Lead");

	}
	@Test(groups= {"dilip"})
	public void Lead1() {
		// TODO Auto-generated method stub
		System.out.println("Lead1");

	}
}
