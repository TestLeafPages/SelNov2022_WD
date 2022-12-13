package week4.day2;

import org.testng.annotations.Test;

public class DependOnMethods {

	@Test(enabled=false)
	public void createLead() {
		System.out.println("createLead");
	}
	
	@Test(dependsOnMethods="createLead")
	public void deleteLead() throws Exception {
		System.out.println("deleteLead");
		throw new Exception("runtime exception");
	}
	
	@Test(dependsOnMethods="createLead",enabled=false)
	public void editLead() {
		System.out.println("editLead");
	}
	
	@Test(dependsOnMethods={"createLead","deleteLead"})
	public void duplLead() {
		System.out.println("duplLead");
	}
}
