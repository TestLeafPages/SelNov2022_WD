package week4.day2;

import org.testng.annotations.Test;

public class LearnPiority {

	
	@Test(priority=1,enabled=false)
	public void createLead() {
		// TODO Auto-generated method stub
System.out.println("createLead");
	}
	
	@Test(priority=-2)
	public void editLead() {
		// TODO Auto-generated method stub
		System.out.println("editLead");

	}
	@Test
	public void deleteLead() {
		// TODO Auto-generated method stub
		System.out.println("deleteLead");

	}
	@Test
	public void deletelead() {
		// TODO Auto-generated method stub
		System.out.println("deletelead");

	}
	
	@Test(priority=1)
	public void duplicLead() {
		// TODO Auto-generated method stub
		System.out.println("duplicLead");

	}
	
	@Test(priority=1)
	public void Lead() {
		// TODO Auto-generated method stub
		System.out.println("Lead");

	}
	@Test(priority=4)
	public void Lead1() {
		// TODO Auto-generated method stub
		System.out.println("Lead1");

	}
	
}
