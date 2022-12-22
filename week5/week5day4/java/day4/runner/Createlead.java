package runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.Loginpage;

public class Createlead extends BaseClass{

	
	@BeforeTest
	public void setValues() {
		datafile="CreateLead";
	}
	
	
	@Test(dataProvider="fetch")
	public void leads(String comName,String Fname,String Lname ) {
		
		Loginpage lp=new Loginpage(driver);
		
		lp.enteruserName("DemoCsr").enterpassword("crmsfa").clickonLoginbutton().verifypage()
		.clickOnCrmsfa().clickLeadsButon().clickonCreateLead()
		.enterCompanyName(comName)
		.enterFirstName(Fname)
		.enterLastName(Lname)
		.clickonCreateButton()
		.checkName();
	}
	
	
	
}
